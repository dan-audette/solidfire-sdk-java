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
 * 
 **/
public class ResetDriveDetails  implements Serializable  {

    private static final long serialVersionUID = 354778296L;

    @SerializedName("drive") private final String drive;
    @SerializedName("returnCode") private final Long returnCode;
    @SerializedName("stderr") private final String stderr;
    @SerializedName("stdout") private final String stdout;

    /**
     * 
     * @param drive [required] Drive name
     * @param returnCode [required] 
     * @param stderr [required] 
     * @param stdout [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public ResetDriveDetails(String drive, Long returnCode, String stderr, String stdout) {
        this.drive = drive;
        this.returnCode = returnCode;
        this.stderr = stderr;
        this.stdout = stdout;
    }


    /**
     * Drive name
     **/
    public String getDrive() {
        return this.drive;
    }
    public Long getReturnCode() {
        return this.returnCode;
    }
    public String getStderr() {
        return this.stderr;
    }
    public String getStdout() {
        return this.stdout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResetDriveDetails that = (ResetDriveDetails) o;
        

        return Objects.equals( drive , that.drive )
            && Objects.equals( returnCode , that.returnCode )
            && Objects.equals( stderr , that.stderr )
            && Objects.equals( stdout , that.stdout );
    }

    @Override
    public int hashCode() {
        return Objects.hash( drive, returnCode, stderr, stdout );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" drive : ").append(drive).append(",");
        sb.append(" returnCode : ").append(returnCode).append(",");
        sb.append(" stderr : ").append(stderr).append(",");
        sb.append(" stdout : ").append(stdout);
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
        private String drive;
        private Long returnCode;
        private String stderr;
        private String stdout;

        private Builder() { }

        public ResetDriveDetails build() {
            return new ResetDriveDetails (
                         this.drive,
                         this.returnCode,
                         this.stderr,
                         this.stdout            );
        }

        private ResetDriveDetails.Builder buildFrom(final ResetDriveDetails req) {
            this.drive = req.drive;
            this.returnCode = req.returnCode;
            this.stderr = req.stderr;
            this.stdout = req.stdout;

            return this;
        }

        public ResetDriveDetails.Builder drive(final String drive) {
            this.drive = drive;
            return this;
        }

        public ResetDriveDetails.Builder returnCode(final Long returnCode) {
            this.returnCode = returnCode;
            return this;
        }

        public ResetDriveDetails.Builder stderr(final String stderr) {
            this.stderr = stderr;
            return this;
        }

        public ResetDriveDetails.Builder stdout(final String stdout) {
            this.stdout = stdout;
            return this;
        }

    }

}
