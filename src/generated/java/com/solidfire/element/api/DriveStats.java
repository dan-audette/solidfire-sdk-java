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
public class DriveStats implements Serializable {

    private static final long serialVersionUID = 1984422277L;

    @SerializedName("activeSessions") private final long activeSessions;
    @SerializedName("failedDieCount") private final long failedDieCount;
    @SerializedName("lifeRemainingPercent") private final long lifeRemainingPercent;
    @SerializedName("lifetimeReadBytes") private final long lifetimeReadBytes;
    @SerializedName("lifetimeWriteBytes") private final long lifetimeWriteBytes;
    @SerializedName("powerOnHours") private final long powerOnHours;
    @SerializedName("readBytes") private final long readBytes;
    @SerializedName("readOps") private final long readOps;
    @SerializedName("reallocatedSectors") private final long reallocatedSectors;
    @SerializedName("reserveCapacityPercent") private final long reserveCapacityPercent;
    @SerializedName("timestamp") private final String timestamp;
    @SerializedName("totalCapacity") private final long totalCapacity;
    @SerializedName("usedCapacity") private final Optional<Long> usedCapacity;
    @SerializedName("usedMemory") private final long usedMemory;
    @SerializedName("writeBytes") private final long writeBytes;
    @SerializedName("writeOps") private final long writeOps;

    /**
     * 
     * @param activeSessions [required] 
     * @param failedDieCount [required] 
     * @param lifeRemainingPercent [required] 
     * @param lifetimeReadBytes [required] 
     * @param lifetimeWriteBytes [required] 
     * @param powerOnHours [required] 
     * @param readBytes [required] 
     * @param readOps [required] 
     * @param reallocatedSectors [required] 
     * @param reserveCapacityPercent [required] 
     * @param timestamp [required] 
     * @param totalCapacity [required] 
     * @param usedCapacity (optional) 
     * @param usedMemory [required] 
     * @param writeBytes [required] 
     * @param writeOps [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public DriveStats(long activeSessions, long failedDieCount, long lifeRemainingPercent, long lifetimeReadBytes, long lifetimeWriteBytes, long powerOnHours, long readBytes, long readOps, long reallocatedSectors, long reserveCapacityPercent, String timestamp, long totalCapacity, Optional<Long> usedCapacity, long usedMemory, long writeBytes, long writeOps) {
        this.writeOps = writeOps;
        this.activeSessions = activeSessions;
        this.reallocatedSectors = reallocatedSectors;
        this.timestamp = timestamp;
        this.usedMemory = usedMemory;
        this.lifetimeWriteBytes = lifetimeWriteBytes;
        this.readOps = readOps;
        this.failedDieCount = failedDieCount;
        this.writeBytes = writeBytes;
        this.totalCapacity = totalCapacity;
        this.readBytes = readBytes;
        this.reserveCapacityPercent = reserveCapacityPercent;
        this.lifetimeReadBytes = lifetimeReadBytes;
        this.lifeRemainingPercent = lifeRemainingPercent;
        this.usedCapacity = (usedCapacity == null) ? Optional.<Long>empty() : usedCapacity;
        this.powerOnHours = powerOnHours;
    }

    public long getActiveSessions() {
        return this.activeSessions;
    }
    public long getFailedDieCount() {
        return this.failedDieCount;
    }
    public long getLifeRemainingPercent() {
        return this.lifeRemainingPercent;
    }
    public long getLifetimeReadBytes() {
        return this.lifetimeReadBytes;
    }
    public long getLifetimeWriteBytes() {
        return this.lifetimeWriteBytes;
    }
    public long getPowerOnHours() {
        return this.powerOnHours;
    }
    public long getReadBytes() {
        return this.readBytes;
    }
    public long getReadOps() {
        return this.readOps;
    }
    public long getReallocatedSectors() {
        return this.reallocatedSectors;
    }
    public long getReserveCapacityPercent() {
        return this.reserveCapacityPercent;
    }
    public String getTimestamp() {
        return this.timestamp;
    }
    public long getTotalCapacity() {
        return this.totalCapacity;
    }
    public Optional<Long> getUsedCapacity() {
        return this.usedCapacity;
    }
    public long getUsedMemory() {
        return this.usedMemory;
    }
    public long getWriteBytes() {
        return this.writeBytes;
    }
    public long getWriteOps() {
        return this.writeOps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriveStats that = (DriveStats) o;
        

        return Objects.equals( activeSessions , that.activeSessions )
            && Objects.equals( failedDieCount , that.failedDieCount )
            && Objects.equals( lifeRemainingPercent , that.lifeRemainingPercent )
            && Objects.equals( lifetimeReadBytes , that.lifetimeReadBytes )
            && Objects.equals( lifetimeWriteBytes , that.lifetimeWriteBytes )
            && Objects.equals( powerOnHours , that.powerOnHours )
            && Objects.equals( readBytes , that.readBytes )
            && Objects.equals( readOps , that.readOps )
            && Objects.equals( reallocatedSectors , that.reallocatedSectors )
            && Objects.equals( reserveCapacityPercent , that.reserveCapacityPercent )
            && Objects.equals( timestamp , that.timestamp )
            && Objects.equals( totalCapacity , that.totalCapacity )
            && Objects.equals( usedCapacity , that.usedCapacity )
            && Objects.equals( usedMemory , that.usedMemory )
            && Objects.equals( writeBytes , that.writeBytes )
            && Objects.equals( writeOps , that.writeOps );
    }

    @Override
    public int hashCode() {
        return Objects.hash( activeSessions, failedDieCount, lifeRemainingPercent, lifetimeReadBytes, lifetimeWriteBytes, powerOnHours, readBytes, readOps, reallocatedSectors, reserveCapacityPercent, timestamp, totalCapacity, usedCapacity, usedMemory, writeBytes, writeOps );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" activeSessions : ").append(activeSessions).append(",");
        sb.append(" failedDieCount : ").append(failedDieCount).append(",");
        sb.append(" lifeRemainingPercent : ").append(lifeRemainingPercent).append(",");
        sb.append(" lifetimeReadBytes : ").append(lifetimeReadBytes).append(",");
        sb.append(" lifetimeWriteBytes : ").append(lifetimeWriteBytes).append(",");
        sb.append(" powerOnHours : ").append(powerOnHours).append(",");
        sb.append(" readBytes : ").append(readBytes).append(",");
        sb.append(" readOps : ").append(readOps).append(",");
        sb.append(" reallocatedSectors : ").append(reallocatedSectors).append(",");
        sb.append(" reserveCapacityPercent : ").append(reserveCapacityPercent).append(",");
        sb.append(" timestamp : ").append(timestamp).append(",");
        sb.append(" totalCapacity : ").append(totalCapacity).append(",");
        if(null != usedCapacity && usedCapacity.isPresent())
            sb.append(" usedCapacity : ").append(usedCapacity.get()).append(",");
        sb.append(" usedMemory : ").append(usedMemory).append(",");
        sb.append(" writeBytes : ").append(writeBytes).append(",");
        sb.append(" writeOps : ").append(writeOps);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
