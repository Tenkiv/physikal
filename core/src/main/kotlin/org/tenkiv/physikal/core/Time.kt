/*
 * Copyright 2018 Tenkiv, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.tenkiv.physikal.core

import tec.units.indriya.ComparableQuantity
import tec.units.indriya.unit.MetricPrefix.NANO
import tec.units.indriya.unit.Units.SECOND
import java.time.Duration
import java.time.temporal.ChronoUnit
import javax.measure.Quantity
import javax.measure.quantity.Time

/**
 * Get this time quantity as a [Duration].
 */
fun Quantity<Time>.toDuration(): Duration {
    val secondsLong = this toLongIn SECOND
    val nanosLong = (this - secondsLong.second) toLongIn NANO(SECOND)

    return Duration.ofSeconds(secondsLong, nanosLong)
}

/**
 * Get this [Duration] as a time quantity.
 */
fun Duration.toQuantity(): ComparableQuantity<Time> =
    this[ChronoUnit.SECONDS].second + this[ChronoUnit.NANOS].nano.second