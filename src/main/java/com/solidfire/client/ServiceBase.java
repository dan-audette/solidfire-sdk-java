/*
 * Copyright &copy 2014-2016 NetApp, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.solidfire.client;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.solidfire.serialization.GsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.solidfire.client.VersioningUtils.*;

/**
 * The base class for SolidFire services.
 */
public class ServiceBase {

    private static final Logger log = LoggerFactory.getLogger(ServiceBase.class);

    static {
        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String s, SSLSession sslSession) {
                return true;
            }
        });
    }

    private static final AtomicLong sessionId = new AtomicLong(0);

    private final RequestDispatcher requestDispatcher;
    private final GsonBuilder gsonBuilder = GsonUtil.getDefaultBuilder();

    {
        gsonBuilder.registerTypeAdapter(ApiServerException.class, new ApiServerExceptionTypeAdapter());
    }

    static {
        LogSplash.logo();
    }

    /**
     * Create a service with the given connection.
     *
     * @param requestDispatcher is the mechanism for sending requests to some location.
     */
    protected ServiceBase(RequestDispatcher requestDispatcher) {
        this.requestDispatcher = requestDispatcher;
    }

    /**
     * Get the communication mechanism of this service.
     */
    public final RequestDispatcher getRequestDispatcher() {
        return requestDispatcher;
    }

    /**
     * Getter for property 'gsonBuilder'.
     *
     * @return Value for property 'gsonBuilder'.
     */
    protected final GsonBuilder getGsonBuilder() {
        return gsonBuilder;
    }

    /**
     * Send the request to the remote system.
     *
     * @param method             the api method name
     * @param requestParams      the object containing the request parameters
     * @param requestParamsClass the class (type) of the request object
     * @param resultParamsClass  the class (type) of the results object
     * @return the result (response) of the the API call
     */
    @SuppressWarnings("unchecked")
    protected <TResult, TRequest> TResult sendRequest(String method,
                                                      TRequest requestParams,
                                                      Class<TRequest> requestParamsClass,
                                                      Class<TResult> resultParamsClass) {

        final Map<String, Constructor<TRequest>> versionConstructorMap = mapConstructorVersions(requestParams);

        if (versionConstructorMap.size() > 1) {
            final Map<Method, Object> valuesOfMethodsWithGreaterVersion = getValuesOfMethodsWithGreaterVersion(requestParams, requestDispatcher.getVersion());
            if (!valuesOfMethodsWithGreaterVersion.isEmpty()) {
                throw new ApiException("The following parameters(s) are not applicable to this version of the API. " + methodParametersToString(valuesOfMethodsWithGreaterVersion.keySet()));
            }
        }

        final String jsonRequest = getRequestJson(method, requestParams, requestParamsClass);
        log.debug("Request: {}", jsonRequest);
        try {
            final String response = getRequestDispatcher().dispatchRequest(jsonRequest);
            return decodeResponseJson(response, resultParamsClass);
        } catch (IOException ioe) {
            throw new ApiException(ioe);
        }
    }

    /**
     * Constructs the JSON-RPC request.
     *
     * @param method             the api method name
     * @param requestParams      the object containing the request parameters
     * @param requestParamsClass the class (type) of the request object
     * @return the request encoded in JSON-RPC format
     */
    protected <TRequest> String getRequestJson(String method,
                                               TRequest requestParams,
                                               Class<TRequest> requestParamsClass) {
        final Gson gson = getGsonBuilder().create();
        final JsonObject requestObj = new JsonObject();
        requestObj.addProperty("id", sessionId.incrementAndGet());
        requestObj.addProperty("method", method);
        requestObj.addProperty("json-rpc", "2.0");
        requestObj.add("params", gson.toJsonTree(requestParams, requestParamsClass));
        return gson.toJson(requestObj);
    }


    /**
     * Decodes the JSON-RPC response.
     *
     * @param response          the JSON encoded response
     * @param resultParamsClass the class (type) of the result object returned
     * @return the result (response) object
     */
    protected <TResult> TResult decodeResponseJson(String response, Class<TResult> resultParamsClass) {
        log.debug("Response: {}", response);

        final Gson gson = getGsonBuilder().create();


        try {
            final JsonReader reader = new JsonReader(new StringReader(response));
            reader.setLenient(true);
            final JsonObject resultObj = gson.fromJson(reader, JsonObject.class);
            if (resultObj.has("error")) {
                throw extractApiError(resultObj.get("error"));
            } else {
                return gson.fromJson(resultObj.get("result"), resultParamsClass);
            }
        } catch (ClassCastException e) {
            final Pattern pattern = Pattern.compile("<p> (.*?)</p>");
            final Matcher matcher = pattern.matcher(response);
            while (matcher.find()) {
                throw new ApiServerException("Not Found", "404", matcher.group(1));
            }
            throw new ApiException(response, e);
        } catch (JsonSyntaxException e) {
            log.debug(response);
            throw new ApiException(response, e);

        }
    }

    /**
     * Decodes the error portion, if it exists, from the JSON-RPC response.
     *
     * @param errorElem the JSON error object
     * @return a ApiServerException with name, code and message
     */
    protected ApiServerException extractApiError(JsonElement errorElem) {
        return getGsonBuilder().create().fromJson(errorElem, ApiServerException.class);
    }


    /**
     * The Type Adapter responsible for transforming JSON error objects into an ApiServierException
     */
    protected static class ApiServerExceptionTypeAdapter extends TypeAdapter<ApiServerException> {

        /**
         * {@inheritDoc}
         */
        @Override
        public void write(JsonWriter out, ApiServerException value) throws IOException {
            throw new UnsupportedOperationException();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ApiServerException read(JsonReader in) throws IOException {

            String name = null;
            String code = null;
            String message = null;

            in.beginObject();
            while (in.hasNext()) {
                if (in.peek() != JsonToken.NAME) {
                    in.skipValue();
                    continue;
                }

                switch (in.nextName()) {
                    case "name":
                        name = in.nextString();
                        break;
                    case "code":
                        code = in.nextString();
                        break;
                    case "message":
                        message = in.nextString();
                        break;
                }
            }
            in.endObject();

            return new ApiServerException(name, code, message);
        }
    }
}

