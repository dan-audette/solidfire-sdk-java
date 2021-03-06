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
 * The Request object for the "AddAccount" API Service call.
 **/
public class AddAccountRequest  implements Serializable , IAccountRequest {

    private static final long serialVersionUID = 461883202L;

    @SerializedName("username") private final String username;
    @SerializedName("initiatorSecret") private final Optional<CHAPSecret> initiatorSecret;
    @SerializedName("targetSecret") private final Optional<CHAPSecret> targetSecret;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "AddAccount" API Service call.
     * @param username [required] Unique username for this account.
     * @param initiatorSecret (optional) CHAP secret to use for the initiator.
     * @param targetSecret (optional) CHAP secret to use for the target (mutual CHAP authentication).
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public AddAccountRequest(String username, Optional<CHAPSecret> initiatorSecret, Optional<CHAPSecret> targetSecret, Optional<java.util.Map<String, Object>> attributes) {
        this.username = username;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }


    /**
     * Unique username for this account.
     * (May be 1 to 64 characters in length).
     **/
    public String getUsername() {
        return this.username;
    }

    /**
     * CHAP secret to use for the initiator.
     * Should be 12-16 characters long and impenetrable.
     * The CHAP initiator secrets must be unique and cannot be the same as the target CHAP secret.
     * <br/><br/>
     * If not specified, a random secret is created.
     **/
    public Optional<CHAPSecret> getInitiatorSecret() {
        return this.initiatorSecret;
    }

    /**
     * CHAP secret to use for the target (mutual CHAP authentication).
     * Should be 12-16 characters long and impenetrable.
     * The CHAP target secrets must be unique and cannot be the same as the initiator CHAP secret.
     * <br/><br/>
     * If not specified, a random secret is created.
     **/
    public Optional<CHAPSecret> getTargetSecret() {
        return this.targetSecret;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddAccountRequest that = (AddAccountRequest) o;
        

        return Objects.equals( username , that.username )
            && Objects.equals( initiatorSecret , that.initiatorSecret )
            && Objects.equals( targetSecret , that.targetSecret )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( username, initiatorSecret, targetSecret, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" username : ").append(username).append(",");
        if(null != initiatorSecret && initiatorSecret.isPresent())
            sb.append(" initiatorSecret : ").append(initiatorSecret.get()).append(",");
        if(null != targetSecret && targetSecret.isPresent())
            sb.append(" targetSecret : ").append(targetSecret.get()).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
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
        private String username;
        private Optional<CHAPSecret> initiatorSecret;
        private Optional<CHAPSecret> targetSecret;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public AddAccountRequest build() {
            return new AddAccountRequest (
                         this.username,
                         this.initiatorSecret,
                         this.targetSecret,
                         this.attributes            );
        }

        private AddAccountRequest.Builder buildFrom(final AddAccountRequest req) {
            this.username = req.username;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;
            this.attributes = req.attributes;

            return this;
        }

        public AddAccountRequest.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public AddAccountRequest.Builder optionalInitiatorSecret(final CHAPSecret initiatorSecret) {
            this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(initiatorSecret);
            return this;
        }

        public AddAccountRequest.Builder optionalTargetSecret(final CHAPSecret targetSecret) {
            this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(targetSecret);
            return this;
        }

        public AddAccountRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
