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
package com.solidfire.serialization;

import com.google.gson.GsonBuilder;

/**
 * Responsible for creating a GsonBuilder and registering the DateTimeAdapter, DurationAdapter, and OptionalAdapter adapters.
 */
public class GsonUtil {
    /**
     * Creates a GsonBuilder and registers all the DateTimeAdapter, DurationAdapter, and OptionalAdapter adapters.
     *
     * @return The GsonBuilder instance.
     */
    public static GsonBuilder getDefaultBuilder() {
        return new GsonBuilder()
                .registerTypeAdapter(DateTimeAdapter.serializingClass(), new DateTimeAdapter())
                .registerTypeAdapter(DurationAdapter.serializingClass(), new DurationAdapter())
                .registerTypeAdapter(OptionalAdapter.serializingClass(), new OptionalAdapter());
    }
}
