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
 * The object returned by the "GetBackupTarget" API Service call.
 **/
public class GetBackupTargetResult  implements Serializable  {

    private static final long serialVersionUID = 1241565753L;

    @SerializedName("backupTarget") private final BackupTarget backupTarget;

    /**
     * The object returned by the "GetBackupTarget" API Service call.
     * @param backupTarget [required] Object returned for backup target.
     * @since 7.0
     **/
    @Since("7.0")
    public GetBackupTargetResult(BackupTarget backupTarget) {
        this.backupTarget = backupTarget;
    }


    /**
     * Object returned for backup target.
     **/
    public BackupTarget getBackupTarget() {
        return this.backupTarget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetBackupTargetResult that = (GetBackupTargetResult) o;
        

        return Objects.equals( backupTarget , that.backupTarget );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) backupTarget );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" backupTarget : ").append(backupTarget);
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
        private BackupTarget backupTarget;

        private Builder() { }

        public GetBackupTargetResult build() {
            return new GetBackupTargetResult (
                         this.backupTarget            );
        }

        private GetBackupTargetResult.Builder buildFrom(final GetBackupTargetResult req) {
            this.backupTarget = req.backupTarget;

            return this;
        }

        public GetBackupTargetResult.Builder backupTarget(final BackupTarget backupTarget) {
            this.backupTarget = backupTarget;
            return this;
        }

    }

}
