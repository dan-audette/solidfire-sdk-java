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
public class SnmpTrapRecipient implements Serializable {

    private static final long serialVersionUID = 1079072076L;

    @SerializedName("host") private final String host;
    @SerializedName("community") private final String community;
    @SerializedName("port") private final Long port;

    /**
     * 
     * @param host [required] The IP address or host name of the target network management station.
     * @param community [required] SNMP community string.
     * @param port [required] The UDP port number on the host where the trap is to be sent. Valid range is 1 - 65535. 0 (zero) is not a valid port number. Default is 162.
     * @since 7.0
     **/
    @Since("7.0")
    public SnmpTrapRecipient(String host, String community, Long port) {
        this.host = host;
        this.community = community;
        this.port = port;
    }


    /**
     * The IP address or host name of the target network management station.
     **/
    public String getHost() {
        return this.host;
    }

    /**
     * SNMP community string.
     **/
    public String getCommunity() {
        return this.community;
    }

    /**
     * The UDP port number on the host where the trap is to be sent. Valid range is 1 - 65535. 0 (zero) is not a valid port number. Default is 162.
     **/
    public Long getPort() {
        return this.port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnmpTrapRecipient that = (SnmpTrapRecipient) o;
        

        return Objects.equals( host , that.host )
            && Objects.equals( community , that.community )
            && Objects.equals( port , that.port );
    }

    @Override
    public int hashCode() {
        return Objects.hash( host, community, port );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" host : ").append(host).append(",");
        sb.append(" community : ").append(community).append(",");
        sb.append(" port : ").append(port);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}