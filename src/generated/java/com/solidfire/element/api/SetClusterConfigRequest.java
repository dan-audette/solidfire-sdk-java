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
 * The Request object for the "SetClusterConfig" API Service call.
 **/
public class SetClusterConfigRequest  implements Serializable  {

    private static final long serialVersionUID = 1657597185L;

    @SerializedName("cluster") private final ClusterConfig cluster;

    /**
     * The Request object for the "SetClusterConfig" API Service call.
     * @param cluster [required] Objects that are changed for the cluster interface settings. Only the fields you want changed need to be added to this method as objects in the "cluster" parameter.
     * @since 7.0
     **/
    @Since("7.0")
    public SetClusterConfigRequest(ClusterConfig cluster) {
        this.cluster = cluster;
    }


    /**
     * Objects that are changed for the cluster interface settings. Only the fields you want changed need to be added to this method as objects in the "cluster" parameter.
     **/
    public ClusterConfig getCluster() {
        return this.cluster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetClusterConfigRequest that = (SetClusterConfigRequest) o;
        

        return Objects.equals( cluster , that.cluster );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) cluster );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" cluster : ").append(cluster);
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
        private ClusterConfig cluster;

        private Builder() { }

        public SetClusterConfigRequest build() {
            return new SetClusterConfigRequest (
                         this.cluster            );
        }

        private SetClusterConfigRequest.Builder buildFrom(final SetClusterConfigRequest req) {
            this.cluster = req.cluster;

            return this;
        }

        public SetClusterConfigRequest.Builder cluster(final ClusterConfig cluster) {
            this.cluster = cluster;
            return this;
        }

    }

}
