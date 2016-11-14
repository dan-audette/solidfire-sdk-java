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

public class ISCSISession implements Serializable {

    public static final long serialVersionUID = 1269112409L;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("accountName") private String accountName;
    @SerializedName("driveID") private Long driveID;
    @SerializedName("initiatorIP") private String initiatorIP;
    @SerializedName("initiatorName") private String initiatorName;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("serviceID") private Long serviceID;
    @SerializedName("sessionID") private Long sessionID;
    @SerializedName("targetName") private String targetName;
    @SerializedName("targetIP") private String targetIP;
    @SerializedName("virtualNetworkID") private String virtualNetworkID;
    @SerializedName("volumeID") private Long volumeID;

    // empty constructor
    @Since("7.0")
    public ISCSISession() {}

    // parameterized constructor
    @Since("7.0")
    public ISCSISession(
        Long accountID,
        String accountName,
        Long driveID,
        String initiatorIP,
        String initiatorName,
        Long nodeID,
        Long serviceID,
        Long sessionID,
        String targetName,
        String targetIP,
        String virtualNetworkID,
        Long volumeID
    )
    {
        this.accountID = accountID;
        this.accountName = accountName;
        this.driveID = driveID;
        this.initiatorIP = initiatorIP;
        this.initiatorName = initiatorName;
        this.nodeID = nodeID;
        this.serviceID = serviceID;
        this.sessionID = sessionID;
        this.targetName = targetName;
        this.targetIP = targetIP;
        this.virtualNetworkID = virtualNetworkID;
        this.volumeID = volumeID;
    }

    /** 
     **/
    public Long getAccountID() { return this.accountID; }
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     **/
    public String getAccountName() { return this.accountName; }
    public void setAccountName(String accountName) { 
        this.accountName = accountName;
    }
    /** 
     **/
    public Long getDriveID() { return this.driveID; }
    public void setDriveID(Long driveID) { 
        this.driveID = driveID;
    }
    /** 
     **/
    public String getInitiatorIP() { return this.initiatorIP; }
    public void setInitiatorIP(String initiatorIP) { 
        this.initiatorIP = initiatorIP;
    }
    /** 
     **/
    public String getInitiatorName() { return this.initiatorName; }
    public void setInitiatorName(String initiatorName) { 
        this.initiatorName = initiatorName;
    }
    /** 
     **/
    public Long getNodeID() { return this.nodeID; }
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     **/
    public Long getServiceID() { return this.serviceID; }
    public void setServiceID(Long serviceID) { 
        this.serviceID = serviceID;
    }
    /** 
     **/
    public Long getSessionID() { return this.sessionID; }
    public void setSessionID(Long sessionID) { 
        this.sessionID = sessionID;
    }
    /** 
     **/
    public String getTargetName() { return this.targetName; }
    public void setTargetName(String targetName) { 
        this.targetName = targetName;
    }
    /** 
     **/
    public String getTargetIP() { return this.targetIP; }
    public void setTargetIP(String targetIP) { 
        this.targetIP = targetIP;
    }
    /** 
     **/
    public String getVirtualNetworkID() { return this.virtualNetworkID; }
    public void setVirtualNetworkID(String virtualNetworkID) { 
        this.virtualNetworkID = virtualNetworkID;
    }
    /** 
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ISCSISession that = (ISCSISession) o;
        return 
            Objects.equals(accountID, that.accountID) &&
            Objects.equals(accountName, that.accountName) &&
            Objects.equals(driveID, that.driveID) &&
            Objects.equals(initiatorIP, that.initiatorIP) &&
            Objects.equals(initiatorName, that.initiatorName) &&
            Objects.equals(nodeID, that.nodeID) &&
            Objects.equals(serviceID, that.serviceID) &&
            Objects.equals(sessionID, that.sessionID) &&
            Objects.equals(targetName, that.targetName) &&
            Objects.equals(targetIP, that.targetIP) &&
            Objects.equals(virtualNetworkID, that.virtualNetworkID) &&
            Objects.equals(volumeID, that.volumeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID, accountName, driveID, initiatorIP, initiatorName, nodeID, serviceID, sessionID, targetName, targetIP, virtualNetworkID, volumeID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountID", accountID);
        map.put("accountName", accountName);
        map.put("driveID", driveID);
        map.put("initiatorIP", initiatorIP);
        map.put("initiatorName", initiatorName);
        map.put("nodeID", nodeID);
        map.put("serviceID", serviceID);
        map.put("sessionID", sessionID);
        map.put("targetName", targetName);
        map.put("targetIP", targetIP);
        map.put("virtualNetworkID", virtualNetworkID);
        map.put("volumeID", volumeID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountID : ").append(accountID).append(",");
        sb.append(" accountName : ").append(accountName).append(",");
        sb.append(" driveID : ").append(driveID).append(",");
        sb.append(" initiatorIP : ").append(initiatorIP).append(",");
        sb.append(" initiatorName : ").append(initiatorName).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" serviceID : ").append(serviceID).append(",");
        sb.append(" sessionID : ").append(sessionID).append(",");
        sb.append(" targetName : ").append(targetName).append(",");
        sb.append(" targetIP : ").append(targetIP).append(",");
        sb.append(" virtualNetworkID : ").append(virtualNetworkID).append(",");
        sb.append(" volumeID : ").append(volumeID).append(",");
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
        private Long accountID;
        private String accountName;
        private Long driveID;
        private String initiatorIP;
        private String initiatorName;
        private Long nodeID;
        private Long serviceID;
        private Long sessionID;
        private String targetName;
        private String targetIP;
        private String virtualNetworkID;
        private Long volumeID;

        private Builder() { }

        public ISCSISession build() {
            return new ISCSISession (
                         this.accountID,
                         this.accountName,
                         this.driveID,
                         this.initiatorIP,
                         this.initiatorName,
                         this.nodeID,
                         this.serviceID,
                         this.sessionID,
                         this.targetName,
                         this.targetIP,
                         this.virtualNetworkID,
                         this.volumeID);
        }

        private ISCSISession.Builder buildFrom(final ISCSISession req) {
            this.accountID = req.accountID;
            this.accountName = req.accountName;
            this.driveID = req.driveID;
            this.initiatorIP = req.initiatorIP;
            this.initiatorName = req.initiatorName;
            this.nodeID = req.nodeID;
            this.serviceID = req.serviceID;
            this.sessionID = req.sessionID;
            this.targetName = req.targetName;
            this.targetIP = req.targetIP;
            this.virtualNetworkID = req.virtualNetworkID;
            this.volumeID = req.volumeID;

            return this;
        }

        public ISCSISession.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public ISCSISession.Builder accountName(final String accountName) {
            this.accountName = accountName;
            return this;
        }

        public ISCSISession.Builder driveID(final Long driveID) {
            this.driveID = driveID;
            return this;
        }

        public ISCSISession.Builder initiatorIP(final String initiatorIP) {
            this.initiatorIP = initiatorIP;
            return this;
        }

        public ISCSISession.Builder initiatorName(final String initiatorName) {
            this.initiatorName = initiatorName;
            return this;
        }

        public ISCSISession.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public ISCSISession.Builder serviceID(final Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        public ISCSISession.Builder sessionID(final Long sessionID) {
            this.sessionID = sessionID;
            return this;
        }

        public ISCSISession.Builder targetName(final String targetName) {
            this.targetName = targetName;
            return this;
        }

        public ISCSISession.Builder targetIP(final String targetIP) {
            this.targetIP = targetIP;
            return this;
        }

        public ISCSISession.Builder virtualNetworkID(final String virtualNetworkID) {
            this.virtualNetworkID = virtualNetworkID;
            return this;
        }

        public ISCSISession.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

    }
}
