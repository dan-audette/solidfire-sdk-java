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
 * The Request object for the "GetSchedule" API Service call.
 **/
public class GetScheduleRequest  implements Serializable  {

    private static final long serialVersionUID = -381787192L;

    @SerializedName("scheduleID") private final Long scheduleID;

    /**
     * The Request object for the "GetSchedule" API Service call.
     * @param scheduleID [required] Unique ID of the schedule or multiple schedules to display
     * @since 8.0
     **/
    @Since("8.0")
    public GetScheduleRequest(Long scheduleID) {
        this.scheduleID = scheduleID;
    }


    /**
     * Unique ID of the schedule or multiple schedules to display
     **/
    public Long getScheduleID() {
        return this.scheduleID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetScheduleRequest that = (GetScheduleRequest) o;
        

        return Objects.equals( scheduleID , that.scheduleID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) scheduleID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" scheduleID : ").append(scheduleID);
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
        private Long scheduleID;

        private Builder() { }

        public GetScheduleRequest build() {
            return new GetScheduleRequest (
                         this.scheduleID            );
        }

        private GetScheduleRequest.Builder buildFrom(final GetScheduleRequest req) {
            this.scheduleID = req.scheduleID;

            return this;
        }

        public GetScheduleRequest.Builder scheduleID(final Long scheduleID) {
            this.scheduleID = scheduleID;
            return this;
        }

    }

}
