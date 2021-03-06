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
 * Schedule is an object containing information about each schedule created to autonomously make a snapshot of a volume. The return object includes information for all schedules. If scheduleID is used to identify a specific schedule then only information for that scheduleID is returned. Schedules information is returned with the API method, see ListSchedules on the SolidFire API guide page 245.
 **/
public class Schedule  implements Serializable  {

    private static final long serialVersionUID = -517757647L;

    @SerializedName("frequency") private final Frequency frequency;
    @SerializedName("hasError") private final Optional<Boolean> hasError;
    @SerializedName("lastRunStatus") private final String lastRunStatus;
    @SerializedName("lastRunTimeStart") private final String lastRunTimeStart;
    @SerializedName("paused") private final Optional<Boolean> paused;
    @SerializedName("recurring") private final Optional<Boolean> recurring;
    @SerializedName("runNextInterval") private final Optional<Boolean> runNextInterval;
    @SerializedName("scheduleID") private final Optional<Long> scheduleID;
    @SerializedName("scheduleInfo") private final ScheduleInfo scheduleInfo;
    @SerializedName("name") private final String name;
    @SerializedName("startingDate") private final String startingDate;
    @SerializedName("toBeDeleted") private final Optional<Boolean> toBeDeleted;

    /**
     * Schedule is an object containing information about each schedule created to autonomously make a snapshot of a volume. The return object includes information for all schedules. If scheduleID is used to identify a specific schedule then only information for that scheduleID is returned. Schedules information is returned with the API method, see ListSchedules on the SolidFire API guide page 245.
     * @param frequency [required] Indicates the frequency of the schedule occurrence. Set this to a type that inherits from Frequency.<br/>
     * @param hasError (optional) Indicates whether or not the schedule has errors.
     * @param lastRunStatus [required] Indicates the status of the last scheduled snapshot.<br/>
     * @param lastRunTimeStart [required] Indicates the last time the schedule started n ISO 8601 date string.
     * @param paused (optional) Indicates whether or not the schedule is paused.
     * @param recurring (optional) Indicates whether or not the schedule is recurring.
     * @param runNextInterval (optional) Indicates whether or not the schedule will run the next time the scheduler is active. When set to "true", the schedule will run the next time the scheduler is active and then reset back to "false".
     * @param scheduleID (optional) Unique ID of the schedule
     * @param scheduleInfo [required] Includes the unique name given to the schedule, the retention period for the snapshot that was created, and the volume ID of the volume from which the snapshot was created.
     * @param name [required] Unique name assigned to the schedule.
     * @param startingDate [required] Indicates the date the first time the schedule began of will begin. Formatted in UTC time.
     * @param toBeDeleted (optional) Indicates if the schedule is marked for deletion.
     * @since 7.0
     **/
    @Since("7.0")
    public Schedule(Frequency frequency, Optional<Boolean> hasError, String lastRunStatus, String lastRunTimeStart, Optional<Boolean> paused, Optional<Boolean> recurring, Optional<Boolean> runNextInterval, Optional<Long> scheduleID, ScheduleInfo scheduleInfo, String name, String startingDate, Optional<Boolean> toBeDeleted) {
        this.name = name;
        this.scheduleID = (scheduleID == null) ? Optional.<Long>empty() : scheduleID;
        this.lastRunStatus = lastRunStatus;
        this.scheduleInfo = scheduleInfo;
        this.recurring = (recurring == null) ? Optional.<Boolean>empty() : recurring;
        this.paused = (paused == null) ? Optional.<Boolean>empty() : paused;
        this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : runNextInterval;
        this.startingDate = startingDate;
        this.lastRunTimeStart = lastRunTimeStart;
        this.frequency = frequency;
        this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : toBeDeleted;
        this.hasError = (hasError == null) ? Optional.<Boolean>empty() : hasError;
    }


    /**
     * Indicates the frequency of the schedule occurrence. Set this to a type that inherits from Frequency.<br/>
     * Valid types are:<br/>
     * DayOfWeekFrequency<br/>
     * DayOfMonthFrequency<br/>
     * TimeIntervalFrequency
     **/
    public Frequency getFrequency() {
        return this.frequency;
    }

    /**
     * Indicates whether or not the schedule has errors.
     **/
    public Optional<Boolean> getHasError() {
        return this.hasError;
    }

    /**
     * Indicates the status of the last scheduled snapshot.<br/>
     * Valid values are:<br/>
     * Success<br/>
     * Failed
     **/
    public String getLastRunStatus() {
        return this.lastRunStatus;
    }

    /**
     * Indicates the last time the schedule started n ISO 8601 date string.
     * Valid values are:<br/>
     * Success<br/>
     * Failed
     **/
    public String getLastRunTimeStart() {
        return this.lastRunTimeStart;
    }

    /**
     * Indicates whether or not the schedule is paused.
     **/
    public Optional<Boolean> getPaused() {
        return this.paused;
    }

    /**
     * Indicates whether or not the schedule is recurring.
     **/
    public Optional<Boolean> getRecurring() {
        return this.recurring;
    }

    /**
     * Indicates whether or not the schedule will run the next time the scheduler is active. When set to "true", the schedule will run the next time the scheduler is active and then reset back to "false".
     **/
    public Optional<Boolean> getRunNextInterval() {
        return this.runNextInterval;
    }

    /**
     * Unique ID of the schedule
     **/
    public Optional<Long> getScheduleID() {
        return this.scheduleID;
    }

    /**
     * Includes the unique name given to the schedule, the retention period for the snapshot that was created, and the volume ID of the volume from which the snapshot was created.
     **/
    public ScheduleInfo getScheduleInfo() {
        return this.scheduleInfo;
    }

    /**
     * Unique name assigned to the schedule.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * Indicates the date the first time the schedule began of will begin. Formatted in UTC time.
     **/
    public String getStartingDate() {
        return this.startingDate;
    }

    /**
     * Indicates if the schedule is marked for deletion.
     **/
    public Optional<Boolean> getToBeDeleted() {
        return this.toBeDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule that = (Schedule) o;
        

        return Objects.equals( frequency , that.frequency )
            && Objects.equals( hasError , that.hasError )
            && Objects.equals( lastRunStatus , that.lastRunStatus )
            && Objects.equals( lastRunTimeStart , that.lastRunTimeStart )
            && Objects.equals( paused , that.paused )
            && Objects.equals( recurring , that.recurring )
            && Objects.equals( runNextInterval , that.runNextInterval )
            && Objects.equals( scheduleID , that.scheduleID )
            && Objects.equals( scheduleInfo , that.scheduleInfo )
            && Objects.equals( name , that.name )
            && Objects.equals( startingDate , that.startingDate )
            && Objects.equals( toBeDeleted , that.toBeDeleted );
    }

    @Override
    public int hashCode() {
        return Objects.hash( frequency, hasError, lastRunStatus, lastRunTimeStart, paused, recurring, runNextInterval, scheduleID, scheduleInfo, name, startingDate, toBeDeleted );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" frequency : ").append(frequency).append(",");
        if(null != hasError && hasError.isPresent())
            sb.append(" hasError : ").append(hasError.get()).append(",");
        sb.append(" lastRunStatus : ").append(lastRunStatus).append(",");
        sb.append(" lastRunTimeStart : ").append(lastRunTimeStart).append(",");
        if(null != paused && paused.isPresent())
            sb.append(" paused : ").append(paused.get()).append(",");
        if(null != recurring && recurring.isPresent())
            sb.append(" recurring : ").append(recurring.get()).append(",");
        if(null != runNextInterval && runNextInterval.isPresent())
            sb.append(" runNextInterval : ").append(runNextInterval.get()).append(",");
        if(null != scheduleID && scheduleID.isPresent())
            sb.append(" scheduleID : ").append(scheduleID.get()).append(",");
        sb.append(" scheduleInfo : ").append(scheduleInfo).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" startingDate : ").append(startingDate).append(",");
        if(null != toBeDeleted && toBeDeleted.isPresent())
            sb.append(" toBeDeleted : ").append(toBeDeleted.get());
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
        private Frequency frequency;
        private Optional<Boolean> hasError;
        private String lastRunStatus;
        private String lastRunTimeStart;
        private Optional<Boolean> paused;
        private Optional<Boolean> recurring;
        private Optional<Boolean> runNextInterval;
        private Optional<Long> scheduleID;
        private ScheduleInfo scheduleInfo;
        private String name;
        private String startingDate;
        private Optional<Boolean> toBeDeleted;

        private Builder() { }

        public Schedule build() {
            return new Schedule (
                         this.frequency,
                         this.hasError,
                         this.lastRunStatus,
                         this.lastRunTimeStart,
                         this.paused,
                         this.recurring,
                         this.runNextInterval,
                         this.scheduleID,
                         this.scheduleInfo,
                         this.name,
                         this.startingDate,
                         this.toBeDeleted            );
        }

        private Schedule.Builder buildFrom(final Schedule req) {
            this.frequency = req.frequency;
            this.hasError = req.hasError;
            this.lastRunStatus = req.lastRunStatus;
            this.lastRunTimeStart = req.lastRunTimeStart;
            this.paused = req.paused;
            this.recurring = req.recurring;
            this.runNextInterval = req.runNextInterval;
            this.scheduleID = req.scheduleID;
            this.scheduleInfo = req.scheduleInfo;
            this.name = req.name;
            this.startingDate = req.startingDate;
            this.toBeDeleted = req.toBeDeleted;

            return this;
        }

        public Schedule.Builder frequency(final Frequency frequency) {
            this.frequency = frequency;
            return this;
        }

        public Schedule.Builder optionalHasError(final Boolean hasError) {
            this.hasError = (hasError == null) ? Optional.<Boolean>empty() : Optional.of(hasError);
            return this;
        }

        public Schedule.Builder lastRunStatus(final String lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            return this;
        }

        public Schedule.Builder lastRunTimeStart(final String lastRunTimeStart) {
            this.lastRunTimeStart = lastRunTimeStart;
            return this;
        }

        public Schedule.Builder optionalPaused(final Boolean paused) {
            this.paused = (paused == null) ? Optional.<Boolean>empty() : Optional.of(paused);
            return this;
        }

        public Schedule.Builder optionalRecurring(final Boolean recurring) {
            this.recurring = (recurring == null) ? Optional.<Boolean>empty() : Optional.of(recurring);
            return this;
        }

        public Schedule.Builder optionalRunNextInterval(final Boolean runNextInterval) {
            this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : Optional.of(runNextInterval);
            return this;
        }

        public Schedule.Builder optionalScheduleID(final Long scheduleID) {
            this.scheduleID = (scheduleID == null) ? Optional.<Long>empty() : Optional.of(scheduleID);
            return this;
        }

        public Schedule.Builder scheduleInfo(final ScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }

        public Schedule.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Schedule.Builder startingDate(final String startingDate) {
            this.startingDate = startingDate;
            return this;
        }

        public Schedule.Builder optionalToBeDeleted(final Boolean toBeDeleted) {
            this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : Optional.of(toBeDeleted);
            return this;
        }

    }

}
