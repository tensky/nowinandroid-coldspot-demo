/*
 * Copyright 2026 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.feature.foryou.impl

import android.content.Context

/**
 * Does nothing: a debug build has no ColdSpot. The coverage source set's twin, in OpenColdSpot.kt, opens
 * ColdSpot's screen. This file has a name of its own because ColdSpot 0.1.0-alpha01 cannot tell changed files of
 * one name and package apart, and would leave that twin unmeasured.
 */
@Suppress("UNUSED_PARAMETER")
internal fun openColdSpot(context: Context) = Unit
