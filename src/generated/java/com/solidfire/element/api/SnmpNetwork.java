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
 * The SNMP network object contains information about SNMP configuration for the cluster nodes. SNMP v3 is supported on SolidFire clusters.
 **/
public class SnmpNetwork  implements Serializable  {

    private static final long serialVersionUID = 1047589412L;

    @SerializedName("access") private final String access;
    @SerializedName("cidr") private final Long cidr;
    @SerializedName("community") private final String community;
    @SerializedName("network") private final String network;

    /**
     * The SNMP network object contains information about SNMP configuration for the cluster nodes. SNMP v3 is supported on SolidFire clusters.
     * @param access [required] <br/><b>ro</b>: read-only access.*
     * @param cidr [required] A CIDR network mask. This network mask must be an integer greater than or equal to 0, and less than or equal to 32. It must also not be equal to 31.
     * @param community [required] SNMP community string.
     * @param network [required] This parameter along with the cidr variable is used to control which network the access and community string apply to. The special value of "default" is used to specify an entry that applies to all networks. The cidr mask is ignored when network value is either a host name or default.
     * @since 7.0
     **/
    @Since("7.0")
    public SnmpNetwork(String access, Long cidr, String community, String network) {
        this.access = access;
        this.cidr = cidr;
        this.community = community;
        this.network = network;
    }


    /**
     * <br/><b>ro</b>: read-only access.*
     * <br/><b>rw</b>: for read-write access.
     * <br/><b>rosys</b>: for read-only access to a restricted set of system information
     * *SolidFire recommends that all networks other than the default "localhost" be set to "ro" access, because all SolidFire MIB objects are read-only.
     **/
    public String getAccess() {
        return this.access;
    }

    /**
     * A CIDR network mask. This network mask must be an integer greater than or equal to 0, and less than or equal to 32. It must also not be equal to 31.
     **/
    public Long getCidr() {
        return this.cidr;
    }

    /**
     * SNMP community string.
     **/
    public String getCommunity() {
        return this.community;
    }

    /**
     * This parameter along with the cidr variable is used to control which network the access and community string apply to. The special value of "default" is used to specify an entry that applies to all networks. The cidr mask is ignored when network value is either a host name or default.
     **/
    public String getNetwork() {
        return this.network;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnmpNetwork that = (SnmpNetwork) o;
        

        return Objects.equals( access , that.access )
            && Objects.equals( cidr , that.cidr )
            && Objects.equals( community , that.community )
            && Objects.equals( network , that.network );
    }

    @Override
    public int hashCode() {
        return Objects.hash( access, cidr, community, network );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" access : ").append(access).append(",");
        sb.append(" cidr : ").append(cidr).append(",");
        sb.append(" community : ").append(community).append(",");
        sb.append(" network : ").append(network);
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
        private String access;
        private Long cidr;
        private String community;
        private String network;

        private Builder() { }

        public SnmpNetwork build() {
            return new SnmpNetwork (
                         this.access,
                         this.cidr,
                         this.community,
                         this.network            );
        }

        private SnmpNetwork.Builder buildFrom(final SnmpNetwork req) {
            this.access = req.access;
            this.cidr = req.cidr;
            this.community = req.community;
            this.network = req.network;

            return this;
        }

        public SnmpNetwork.Builder access(final String access) {
            this.access = access;
            return this;
        }

        public SnmpNetwork.Builder cidr(final Long cidr) {
            this.cidr = cidr;
            return this;
        }

        public SnmpNetwork.Builder community(final String community) {
            this.community = community;
            return this;
        }

        public SnmpNetwork.Builder network(final String network) {
            this.network = network;
            return this;
        }

    }

}
