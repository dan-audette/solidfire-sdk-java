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
/*
 * DO NOT EDIT THIS CODE BY HAND! It has been generated with jsvcgen.
 */
package com.solidfire.element.api;

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The Request object for the "GetAsyncResult" API Service call.
 **/
public class GetAsyncResultRequest  implements Serializable  {

    private static final long serialVersionUID = 543540889L;

    @SerializedName("asyncHandle") private final Long asyncHandle;

    /**
     * The Request object for the "GetAsyncResult" API Service call.
     * @param asyncHandle [required] A value that was returned from the original asynchronous method call.
     * @since 7.0
     **/
    @Since("7.0")
    public GetAsyncResultRequest(Long asyncHandle) {
        this.asyncHandle = asyncHandle;
    }


    /**
     * A value that was returned from the original asynchronous method call.
     **/
    public Long getAsyncHandle() {
        return this.asyncHandle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetAsyncResultRequest that = (GetAsyncResultRequest) o;
        

        return Objects.equals( asyncHandle , that.asyncHandle );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) asyncHandle );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" asyncHandle : ").append(asyncHandle);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Long asyncHandle;

        private Builder() { }

        public GetAsyncResultRequest build() {
            return new GetAsyncResultRequest (
                         this.asyncHandle            );
        }

        private GetAsyncResultRequest.Builder buildFrom(final GetAsyncResultRequest req) {
            this.asyncHandle = req.asyncHandle;

            return this;
        }

        public GetAsyncResultRequest.Builder asyncHandle(final Long asyncHandle) {
            this.asyncHandle = asyncHandle;
            return this;
        }

    }

}
