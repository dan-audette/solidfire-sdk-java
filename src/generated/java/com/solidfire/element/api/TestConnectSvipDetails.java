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
 * 
 **/
public class TestConnectSvipDetails  implements Serializable  {

    private static final long serialVersionUID = -1095999738L;

    @SerializedName("pingBytes") private final Object pingBytes;
    @SerializedName("svip") private final String svip;
    @SerializedName("connected") private final Boolean connected;

    /**
     * 
     * @param pingBytes [required] Details of the ping tests with 56 Bytes and 1500 Bytes.
     * @param svip [required] The SVIP tested against.
     * @param connected [required] Whether the test could connect to the MVIP.
     * @since 7.0
     **/
    @Since("7.0")
    public TestConnectSvipDetails(Object pingBytes, String svip, Boolean connected) {
        this.pingBytes = pingBytes;
        this.svip = svip;
        this.connected = connected;
    }


    /**
     * Details of the ping tests with 56 Bytes and 1500 Bytes.
     **/
    public Object getPingBytes() {
        return this.pingBytes;
    }

    /**
     * The SVIP tested against.
     **/
    public String getSvip() {
        return this.svip;
    }

    /**
     * Whether the test could connect to the MVIP.
     **/
    public Boolean getConnected() {
        return this.connected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestConnectSvipDetails that = (TestConnectSvipDetails) o;
        

        return Objects.equals( pingBytes , that.pingBytes )
            && Objects.equals( svip , that.svip )
            && Objects.equals( connected , that.connected );
    }

    @Override
    public int hashCode() {
        return Objects.hash( pingBytes, svip, connected );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" pingBytes : ").append(pingBytes).append(",");
        sb.append(" svip : ").append(svip).append(",");
        sb.append(" connected : ").append(connected);
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
        private Object pingBytes;
        private String svip;
        private Boolean connected;

        private Builder() { }

        public TestConnectSvipDetails build() {
            return new TestConnectSvipDetails (
                         this.pingBytes,
                         this.svip,
                         this.connected            );
        }

        private TestConnectSvipDetails.Builder buildFrom(final TestConnectSvipDetails req) {
            this.pingBytes = req.pingBytes;
            this.svip = req.svip;
            this.connected = req.connected;

            return this;
        }

        public TestConnectSvipDetails.Builder pingBytes(final Object pingBytes) {
            this.pingBytes = pingBytes;
            return this;
        }

        public TestConnectSvipDetails.Builder svip(final String svip) {
            this.svip = svip;
            return this;
        }

        public TestConnectSvipDetails.Builder connected(final Boolean connected) {
            this.connected = connected;
            return this;
        }

    }

}
