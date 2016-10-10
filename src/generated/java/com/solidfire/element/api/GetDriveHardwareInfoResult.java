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
 * The object returned by the "GetDriveHardwareInfo" API Service call.
 **/
public class GetDriveHardwareInfoResult  implements Serializable  {

    private static final long serialVersionUID = 131670110L;

    @SerializedName("driveHardwareInfo") private final DriveHardwareInfo driveHardwareInfo;

    /**
     * The object returned by the "GetDriveHardwareInfo" API Service call.
     * @param driveHardwareInfo [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public GetDriveHardwareInfoResult(DriveHardwareInfo driveHardwareInfo) {
        this.driveHardwareInfo = driveHardwareInfo;
    }

    public DriveHardwareInfo getDriveHardwareInfo() {
        return this.driveHardwareInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetDriveHardwareInfoResult that = (GetDriveHardwareInfoResult) o;
        

        return Objects.equals( driveHardwareInfo , that.driveHardwareInfo );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) driveHardwareInfo );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" driveHardwareInfo : ").append(driveHardwareInfo);
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
        private DriveHardwareInfo driveHardwareInfo;

        private Builder() { }

        public GetDriveHardwareInfoResult build() {
            return new GetDriveHardwareInfoResult (
                         this.driveHardwareInfo            );
        }

        private GetDriveHardwareInfoResult.Builder buildFrom(final GetDriveHardwareInfoResult req) {
            this.driveHardwareInfo = req.driveHardwareInfo;

            return this;
        }

        public GetDriveHardwareInfoResult.Builder driveHardwareInfo(final DriveHardwareInfo driveHardwareInfo) {
            this.driveHardwareInfo = driveHardwareInfo;
            return this;
        }

    }

}