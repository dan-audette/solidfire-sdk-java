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

public class ListVirtualVolumeTasksRequest implements Serializable {

    public static final long serialVersionUID = -8824861203375597941L;
    @SerializedName("virtualVolumeTaskIDs") private Optional<UUIDNullable[]> virtualVolumeTaskIDs;
    @SerializedName("callingVirtualVolumeHostID") private Optional<UUIDNullable> callingVirtualVolumeHostID;

    // empty constructor
    @Since("7.0")
    public ListVirtualVolumeTasksRequest() {}

    // parameterized constructor
    @Since("7.0")
    public ListVirtualVolumeTasksRequest(
        Optional<UUIDNullable[]> virtualVolumeTaskIDs,
        Optional<UUIDNullable> callingVirtualVolumeHostID
    )
    {
        this.virtualVolumeTaskIDs = (virtualVolumeTaskIDs == null) ? Optional.<UUIDNullable[]>empty() : virtualVolumeTaskIDs;
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<UUIDNullable>empty() : callingVirtualVolumeHostID;
    }

    /** 
     **/
    public Optional<UUIDNullable[]> getVirtualVolumeTaskIDs() { return this.virtualVolumeTaskIDs; }
    public void setVirtualVolumeTaskIDs(Optional<UUIDNullable[]> virtualVolumeTaskIDs) { 
        this.virtualVolumeTaskIDs = (virtualVolumeTaskIDs == null) ? Optional.<UUIDNullable[]>empty() : virtualVolumeTaskIDs;
    }
    /** 
     **/
    public Optional<UUIDNullable> getCallingVirtualVolumeHostID() { return this.callingVirtualVolumeHostID; }
    public void setCallingVirtualVolumeHostID(Optional<UUIDNullable> callingVirtualVolumeHostID) { 
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<UUIDNullable>empty() : callingVirtualVolumeHostID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualVolumeTasksRequest that = (ListVirtualVolumeTasksRequest) o;
        return 
            Objects.equals(virtualVolumeTaskIDs, that.virtualVolumeTaskIDs) &&
            Objects.equals(callingVirtualVolumeHostID, that.callingVirtualVolumeHostID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeTaskIDs, callingVirtualVolumeHostID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeTaskIDs", virtualVolumeTaskIDs);
        map.put("callingVirtualVolumeHostID", callingVirtualVolumeHostID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != virtualVolumeTaskIDs && virtualVolumeTaskIDs.isPresent()){
            sb.append(" virtualVolumeTaskIDs : ").append(virtualVolumeTaskIDs.get()).append(",");
        }
        if(null != callingVirtualVolumeHostID && callingVirtualVolumeHostID.isPresent()){
            sb.append(" callingVirtualVolumeHostID : ").append(callingVirtualVolumeHostID.get()).append(",");
        }
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
        private Optional<UUIDNullable[]> virtualVolumeTaskIDs;
        private Optional<UUIDNullable> callingVirtualVolumeHostID;

        private Builder() { }

        public ListVirtualVolumeTasksRequest build() {
            return new ListVirtualVolumeTasksRequest (
                         this.virtualVolumeTaskIDs,
                         this.callingVirtualVolumeHostID);
        }

        private ListVirtualVolumeTasksRequest.Builder buildFrom(final ListVirtualVolumeTasksRequest req) {
            this.virtualVolumeTaskIDs = req.virtualVolumeTaskIDs;
            this.callingVirtualVolumeHostID = req.callingVirtualVolumeHostID;

            return this;
        }

        public ListVirtualVolumeTasksRequest.Builder optionalVirtualVolumeTaskIDs(final UUIDNullable[] virtualVolumeTaskIDs) {
            this.virtualVolumeTaskIDs = (virtualVolumeTaskIDs == null) ? Optional.<UUIDNullable[]>empty() : Optional.of(virtualVolumeTaskIDs);
            return this;
        }

        public ListVirtualVolumeTasksRequest.Builder optionalCallingVirtualVolumeHostID(final UUIDNullable callingVirtualVolumeHostID) {
            this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<UUIDNullable>empty() : Optional.of(callingVirtualVolumeHostID);
            return this;
        }

    }
}