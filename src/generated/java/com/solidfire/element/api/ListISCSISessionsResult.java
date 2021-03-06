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
 * The object returned by the "ListISCSISessions" API Service call.
 **/
public class ListISCSISessionsResult  implements Serializable  {

    private static final long serialVersionUID = 344505827L;

    @SerializedName("sessions") private final ISCSISession[] sessions;

    /**
     * The object returned by the "ListISCSISessions" API Service call.
     * @param sessions [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public ListISCSISessionsResult(ISCSISession[] sessions) {
        this.sessions = sessions;
    }

    public ISCSISession[] getSessions() {
        return this.sessions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListISCSISessionsResult that = (ListISCSISessionsResult) o;
        

        return Objects.deepEquals( sessions , that.sessions );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) sessions );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" sessions : ").append(Arrays.toString(sessions));
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
        private ISCSISession[] sessions;

        private Builder() { }

        public ListISCSISessionsResult build() {
            return new ListISCSISessionsResult (
                         this.sessions            );
        }

        private ListISCSISessionsResult.Builder buildFrom(final ListISCSISessionsResult req) {
            this.sessions = req.sessions;

            return this;
        }

        public ListISCSISessionsResult.Builder sessions(final ISCSISession[] sessions) {
            this.sessions = sessions;
            return this;
        }

    }

}
