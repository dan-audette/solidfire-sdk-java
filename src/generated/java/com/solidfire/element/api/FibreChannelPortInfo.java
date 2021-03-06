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
 * Fibre Channel Node Port Info object returns information about all Fibre Channel ports on a node, or for one node in the cluster. The same information is returned for all ports or port information for one node. This information is returned with the API method ListNodeFibreChannelPortInfo (in the SolidFire API Guide).
 **/
public class FibreChannelPortInfo  implements Serializable  {

    private static final long serialVersionUID = -1981511491L;

    @SerializedName("firmware") private final String firmware;
    @SerializedName("hbaPort") private final Long hbaPort;
    @SerializedName("model") private final String model;
    @SerializedName("nPortID") private final String nPortID;
    @SerializedName("pciSlot") private final Long pciSlot;
    @SerializedName("serial") private final String serial;
    @SerializedName("speed") private final String speed;
    @SerializedName("state") private final String state;
    @SerializedName("switchWwn") private final String switchWwn;
    @SerializedName("wwnn") private final String wwnn;
    @SerializedName("wwpn") private final String wwpn;

    /**
     * Fibre Channel Node Port Info object returns information about all Fibre Channel ports on a node, or for one node in the cluster. The same information is returned for all ports or port information for one node. This information is returned with the API method ListNodeFibreChannelPortInfo (in the SolidFire API Guide).
     * @param firmware [required] The version of the firmware installed on the Fibre Channel port.
     * @param hbaPort [required] The ID of the individual HBA port.
     * @param model [required] Model of the HBA on the port.
     * @param nPortID [required] Unique SolidFire port node ID.
     * @param pciSlot [required] Slot in which the pci card resides on the Fibre Channel node hardware.
     * @param serial [required] Serial number on the Fibre Channel port.
     * @param speed [required] Speed of the HBA on the port.
     * @param state [required] Possible values:
     * @param switchWwn [required] The World Wide Name of the Fibre Channel switch port.
     * @param wwnn [required] World Wide Node Name of the HBA node.
     * @param wwpn [required] World Wide Port Name assigned to the physical port of the HBA.
     * @since 7.0
     **/
    @Since("7.0")
    public FibreChannelPortInfo(String firmware, Long hbaPort, String model, String nPortID, Long pciSlot, String serial, String speed, String state, String switchWwn, String wwnn, String wwpn) {
        this.serial = serial;
        this.model = model;
        this.state = state;
        this.wwpn = wwpn;
        this.switchWwn = switchWwn;
        this.firmware = firmware;
        this.pciSlot = pciSlot;
        this.nPortID = nPortID;
        this.wwnn = wwnn;
        this.hbaPort = hbaPort;
        this.speed = speed;
    }


    /**
     * The version of the firmware installed on the Fibre Channel port.
     **/
    public String getFirmware() {
        return this.firmware;
    }

    /**
     * The ID of the individual HBA port.
     **/
    public Long getHbaPort() {
        return this.hbaPort;
    }

    /**
     * Model of the HBA on the port.
     **/
    public String getModel() {
        return this.model;
    }

    /**
     * Unique SolidFire port node ID.
     **/
    public String getNPortID() {
        return this.nPortID;
    }

    /**
     * Slot in which the pci card resides on the Fibre Channel node hardware.
     **/
    public Long getPciSlot() {
        return this.pciSlot;
    }

    /**
     * Serial number on the Fibre Channel port.
     **/
    public String getSerial() {
        return this.serial;
    }

    /**
     * Speed of the HBA on the port.
     **/
    public String getSpeed() {
        return this.speed;
    }

    /**
     * Possible values:
     * <br/><br/>
     * <strong>Unknown<br/>NotPresent<br/>Online<br/>Offline<br/>Blocked<br/>Bypassed<br/>Diagnostics<br/>Linkdown<br/>Error<br/>Loopback<br/>Deleted</strong>
     **/
    public String getState() {
        return this.state;
    }

    /**
     * The World Wide Name of the Fibre Channel switch port.
     **/
    public String getSwitchWwn() {
        return this.switchWwn;
    }

    /**
     * World Wide Node Name of the HBA node.
     **/
    public String getWwnn() {
        return this.wwnn;
    }

    /**
     * World Wide Port Name assigned to the physical port of the HBA.
     **/
    public String getWwpn() {
        return this.wwpn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FibreChannelPortInfo that = (FibreChannelPortInfo) o;
        

        return Objects.equals( firmware , that.firmware )
            && Objects.equals( hbaPort , that.hbaPort )
            && Objects.equals( model , that.model )
            && Objects.equals( nPortID , that.nPortID )
            && Objects.equals( pciSlot , that.pciSlot )
            && Objects.equals( serial , that.serial )
            && Objects.equals( speed , that.speed )
            && Objects.equals( state , that.state )
            && Objects.equals( switchWwn , that.switchWwn )
            && Objects.equals( wwnn , that.wwnn )
            && Objects.equals( wwpn , that.wwpn );
    }

    @Override
    public int hashCode() {
        return Objects.hash( firmware, hbaPort, model, nPortID, pciSlot, serial, speed, state, switchWwn, wwnn, wwpn );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" firmware : ").append(firmware).append(",");
        sb.append(" hbaPort : ").append(hbaPort).append(",");
        sb.append(" model : ").append(model).append(",");
        sb.append(" nPortID : ").append(nPortID).append(",");
        sb.append(" pciSlot : ").append(pciSlot).append(",");
        sb.append(" serial : ").append(serial).append(",");
        sb.append(" speed : ").append(speed).append(",");
        sb.append(" state : ").append(state).append(",");
        sb.append(" switchWwn : ").append(switchWwn).append(",");
        sb.append(" wwnn : ").append(wwnn).append(",");
        sb.append(" wwpn : ").append(wwpn);
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
        private String firmware;
        private Long hbaPort;
        private String model;
        private String nPortID;
        private Long pciSlot;
        private String serial;
        private String speed;
        private String state;
        private String switchWwn;
        private String wwnn;
        private String wwpn;

        private Builder() { }

        public FibreChannelPortInfo build() {
            return new FibreChannelPortInfo (
                         this.firmware,
                         this.hbaPort,
                         this.model,
                         this.nPortID,
                         this.pciSlot,
                         this.serial,
                         this.speed,
                         this.state,
                         this.switchWwn,
                         this.wwnn,
                         this.wwpn            );
        }

        private FibreChannelPortInfo.Builder buildFrom(final FibreChannelPortInfo req) {
            this.firmware = req.firmware;
            this.hbaPort = req.hbaPort;
            this.model = req.model;
            this.nPortID = req.nPortID;
            this.pciSlot = req.pciSlot;
            this.serial = req.serial;
            this.speed = req.speed;
            this.state = req.state;
            this.switchWwn = req.switchWwn;
            this.wwnn = req.wwnn;
            this.wwpn = req.wwpn;

            return this;
        }

        public FibreChannelPortInfo.Builder firmware(final String firmware) {
            this.firmware = firmware;
            return this;
        }

        public FibreChannelPortInfo.Builder hbaPort(final Long hbaPort) {
            this.hbaPort = hbaPort;
            return this;
        }

        public FibreChannelPortInfo.Builder model(final String model) {
            this.model = model;
            return this;
        }

        public FibreChannelPortInfo.Builder nPortID(final String nPortID) {
            this.nPortID = nPortID;
            return this;
        }

        public FibreChannelPortInfo.Builder pciSlot(final Long pciSlot) {
            this.pciSlot = pciSlot;
            return this;
        }

        public FibreChannelPortInfo.Builder serial(final String serial) {
            this.serial = serial;
            return this;
        }

        public FibreChannelPortInfo.Builder speed(final String speed) {
            this.speed = speed;
            return this;
        }

        public FibreChannelPortInfo.Builder state(final String state) {
            this.state = state;
            return this;
        }

        public FibreChannelPortInfo.Builder switchWwn(final String switchWwn) {
            this.switchWwn = switchWwn;
            return this;
        }

        public FibreChannelPortInfo.Builder wwnn(final String wwnn) {
            this.wwnn = wwnn;
            return this;
        }

        public FibreChannelPortInfo.Builder wwpn(final String wwpn) {
            this.wwpn = wwpn;
            return this;
        }

    }

}
