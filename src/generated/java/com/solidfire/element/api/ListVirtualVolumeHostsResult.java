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

import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class ListVirtualVolumeHostsResult implements Serializable {

    public static final long serialVersionUID = -8007463979747334133L;
    @SerializedName("hosts") private VirtualVolumeHost[] hosts;

    // empty constructor
    @Since("7.0")
    public ListVirtualVolumeHostsResult() {}

    // parameterized constructor
    @Since("7.0")
    public ListVirtualVolumeHostsResult(
        VirtualVolumeHost[] hosts
    )
    {
        this.hosts = hosts;
    }

    /** 
     * List of known ESX hosts.
     **/
    public VirtualVolumeHost[] getHosts() { return this.hosts; }
    public void setHosts(VirtualVolumeHost[] hosts) { 
        this.hosts = hosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualVolumeHostsResult that = (ListVirtualVolumeHostsResult) o;
        return 
            Objects.equals(hosts, that.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])hosts );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("hosts", hosts);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" hosts : ").append(Arrays.toString(hosts)).append(",");
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
        private VirtualVolumeHost[] hosts;

        private Builder() { }

        public ListVirtualVolumeHostsResult build() {
            return new ListVirtualVolumeHostsResult (
                         this.hosts);
        }

        private ListVirtualVolumeHostsResult.Builder buildFrom(final ListVirtualVolumeHostsResult req) {
            this.hosts = req.hosts;

            return this;
        }

        public ListVirtualVolumeHostsResult.Builder hosts(final VirtualVolumeHost[] hosts) {
            this.hosts = hosts;
            return this;
        }

    }
}