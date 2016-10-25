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
 * The object returned by the "VirtualVolumeTask" API Service call.
 **/
public class VirtualVolumeTaskResult  implements Serializable  {

    private static final long serialVersionUID = 1328398717L;

    @SerializedName("task") private VirtualVolumeTask task;

    /**
     * The object returned by the "VirtualVolumeTask" API Service call.
     * @param task [required] Returns the state of a VVol Async Task.
     * @since 7.0
     **/
    @Since("7.0")
    public VirtualVolumeTaskResult(VirtualVolumeTask task) {
        this.task = task;
    }

    
    /**
     * The object returned by the "VirtualVolumeTask" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public VirtualVolumeTaskResult() {}


    /**
     * Returns the state of a VVol Async Task.
     **/
    public VirtualVolumeTask getTask() {
        return this.task;
    }

    public void setTask(VirtualVolumeTask task) {
        this.task = task;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualVolumeTaskResult that = (VirtualVolumeTaskResult) o;
        

        return Objects.equals( task , that.task );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) task );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" task : ").append(task);
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
        private VirtualVolumeTask task;

        private Builder() { }

        public VirtualVolumeTaskResult build() {
            return new VirtualVolumeTaskResult (
                         this.task            );
        }

        private VirtualVolumeTaskResult.Builder buildFrom(final VirtualVolumeTaskResult req) {
            this.task = req.task;

            return this;
        }

        public VirtualVolumeTaskResult.Builder task(final VirtualVolumeTask task) {
            this.task = task;
            return this;
        }

    }

}
