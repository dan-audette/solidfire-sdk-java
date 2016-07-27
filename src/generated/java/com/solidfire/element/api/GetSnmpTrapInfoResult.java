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
 * The object returned by the "GetSnmpTrapInfo" API Service call.
 **/
public class GetSnmpTrapInfoResult  implements Serializable  {

    private static final long serialVersionUID = 175040222L;

    @SerializedName("trapRecipients") private final SnmpTrapRecipient[] trapRecipients;
    @SerializedName("clusterFaultTrapsEnabled") private final Boolean clusterFaultTrapsEnabled;
    @SerializedName("clusterFaultResolvedTrapsEnabled") private final Boolean clusterFaultResolvedTrapsEnabled;
    @SerializedName("clusterEventTrapsEnabled") private final Boolean clusterEventTrapsEnabled;

    /**
     * The object returned by the "GetSnmpTrapInfo" API Service call.
     * @param trapRecipients [required] List of hosts that are to receive the traps generated by the cluster.
     * @param clusterFaultTrapsEnabled [required] If &quot;true&quot;, when a cluster fault is logged a corresponding solidFireClusterFaultNotification is sent to the configured list of trap recipients.
     * @param clusterFaultResolvedTrapsEnabled [required] If &quot;true&quot;, when a cluster fault is logged a corresponding solidFireClusterFaultResolvedNotification is sent to the configured list of trap recipients.
     * @param clusterEventTrapsEnabled [required] If &quot;true&quot;, when a cluster fault is logged a corresponding solidFireClusterEventNotification is sent to the configured list of trap recipients.
     * @since 7.0
     **/
    @Since("7.0")
    public GetSnmpTrapInfoResult(SnmpTrapRecipient[] trapRecipients, Boolean clusterFaultTrapsEnabled, Boolean clusterFaultResolvedTrapsEnabled, Boolean clusterEventTrapsEnabled) {
        this.trapRecipients = trapRecipients;
        this.clusterFaultTrapsEnabled = clusterFaultTrapsEnabled;
        this.clusterFaultResolvedTrapsEnabled = clusterFaultResolvedTrapsEnabled;
        this.clusterEventTrapsEnabled = clusterEventTrapsEnabled;
    }


    /**
     * List of hosts that are to receive the traps generated by the cluster.
     **/
    public SnmpTrapRecipient[] getTrapRecipients() {
        return this.trapRecipients;
    }

    /**
     * If &quot;true&quot;, when a cluster fault is logged a corresponding solidFireClusterFaultNotification is sent to the configured list of trap recipients.
     **/
    public Boolean getClusterFaultTrapsEnabled() {
        return this.clusterFaultTrapsEnabled;
    }

    /**
     * If &quot;true&quot;, when a cluster fault is logged a corresponding solidFireClusterFaultResolvedNotification is sent to the configured list of trap recipients.
     **/
    public Boolean getClusterFaultResolvedTrapsEnabled() {
        return this.clusterFaultResolvedTrapsEnabled;
    }

    /**
     * If &quot;true&quot;, when a cluster fault is logged a corresponding solidFireClusterEventNotification is sent to the configured list of trap recipients.
     **/
    public Boolean getClusterEventTrapsEnabled() {
        return this.clusterEventTrapsEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSnmpTrapInfoResult that = (GetSnmpTrapInfoResult) o;
        

        return Objects.deepEquals( trapRecipients , that.trapRecipients )
            && Objects.equals( clusterFaultTrapsEnabled , that.clusterFaultTrapsEnabled )
            && Objects.equals( clusterFaultResolvedTrapsEnabled , that.clusterFaultResolvedTrapsEnabled )
            && Objects.equals( clusterEventTrapsEnabled , that.clusterEventTrapsEnabled );
    }

    @Override
    public int hashCode() {
        return Objects.hash( trapRecipients, clusterFaultTrapsEnabled, clusterFaultResolvedTrapsEnabled, clusterEventTrapsEnabled );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" trapRecipients : ").append(Arrays.toString(trapRecipients)).append(",");
        sb.append(" clusterFaultTrapsEnabled : ").append(clusterFaultTrapsEnabled).append(",");
        sb.append(" clusterFaultResolvedTrapsEnabled : ").append(clusterFaultResolvedTrapsEnabled).append(",");
        sb.append(" clusterEventTrapsEnabled : ").append(clusterEventTrapsEnabled);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private SnmpTrapRecipient[] trapRecipients;
        private Boolean clusterFaultTrapsEnabled;
        private Boolean clusterFaultResolvedTrapsEnabled;
        private Boolean clusterEventTrapsEnabled;

        private Builder() { }

        public GetSnmpTrapInfoResult build() {
            return new GetSnmpTrapInfoResult (
                         this.trapRecipients,
                         this.clusterFaultTrapsEnabled,
                         this.clusterFaultResolvedTrapsEnabled,
                         this.clusterEventTrapsEnabled            );
        }

        private GetSnmpTrapInfoResult.Builder buildFrom(final GetSnmpTrapInfoResult req) {
            this.trapRecipients = req.trapRecipients;
            this.clusterFaultTrapsEnabled = req.clusterFaultTrapsEnabled;
            this.clusterFaultResolvedTrapsEnabled = req.clusterFaultResolvedTrapsEnabled;
            this.clusterEventTrapsEnabled = req.clusterEventTrapsEnabled;

            return this;
        }

        public GetSnmpTrapInfoResult.Builder trapRecipients(final SnmpTrapRecipient[] trapRecipients) {
            this.trapRecipients = trapRecipients;
            return this;
        }

        public GetSnmpTrapInfoResult.Builder clusterFaultTrapsEnabled(final Boolean clusterFaultTrapsEnabled) {
            this.clusterFaultTrapsEnabled = clusterFaultTrapsEnabled;
            return this;
        }

        public GetSnmpTrapInfoResult.Builder clusterFaultResolvedTrapsEnabled(final Boolean clusterFaultResolvedTrapsEnabled) {
            this.clusterFaultResolvedTrapsEnabled = clusterFaultResolvedTrapsEnabled;
            return this;
        }

        public GetSnmpTrapInfoResult.Builder clusterEventTrapsEnabled(final Boolean clusterEventTrapsEnabled) {
            this.clusterEventTrapsEnabled = clusterEventTrapsEnabled;
            return this;
        }

    }

}
