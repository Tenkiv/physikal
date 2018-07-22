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