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
 * The Request object for the "TestConnectMvip" API Service call.
 **/
public class TestConnectMvipRequest  implements Serializable  {

    private static final long serialVersionUID = 1829877805L;

    @SerializedName("mvip") private final Optional<String> mvip;

    /**
     * The Request object for the "TestConnectMvip" API Service call.
     * @param mvip (optional) Optionally, use to test the management connection of a different MVIP. This is not needed to test the connection to the target cluster.
     * @since 7.0
     **/
    @Since("7.0")
    public TestConnectMvipRequest(Optional<String> mvip) {
        this.mvip = (mvip == null) ? Optional.<String>empty() : mvip;
    }


    /**
     * Optionally, use to test the management connection of a different MVIP. This is not needed to test the connection to the target cluster.
     **/
    public Optional<String> getMvip() {
        return this.mvip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestConnectMvipRequest that = (TestConnectMvipRequest) o;
        

        return Objects.equals( mvip , that.mvip );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) mvip );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != mvip && mvip.isPresent())
            sb.append(" mvip : ").append(mvip.get());
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
        private Optional<String> mvip;

        private Builder() { }

        public TestConnectMvipRequest build() {
            return new TestConnectMvipRequest (
                         this.mvip            );
        }

        private TestConnectMvipRequest.Builder buildFrom(final TestConnectMvipRequest req) {
            this.mvip = req.mvip;

            return this;
        }

        public TestConnectMvipRequest.Builder optionalMvip(final String mvip) {
            this.mvip = (mvip == null) ? Optional.<String>empty() : Optional.of(mvip);
            return this;
        }

    }

}
