package org.tenkiv.physikal.core

import org.tenkiv.coral.ValueInstant
import tec.uom.se.ComparableQuantity
import tec.uom.se.unit.MetricPrefix
import javax.measure.Quantity
import javax.measure.Unit

// typealiases
typealias QuantityMeasurement<Q> = ValueInstant<ComparableQuantity<Q>>

typealias ClosedQuantityRange<Q> = ClosedRange<ComparableQuantity<Q>>

// Unit extensions
inline fun <reified Q : Quantity<Q>> Unit<*>.asType(): Unit<Q> = asType(Q::class.java)

// Quantity extensions
fun Quantity<*>.toDouble() = getValue().toDouble()

fun Quantity<*>.toFloat() = getValue().toFloat()

fun Quantity<*>.toLong() = getValue().toLong()

fun Quantity<*>.toInt() = getValue().toInt()

fun Quantity<*>.toShort() = getValue().toShort()

fun Quantity<*>.toByte() = getValue().toByte()

inline fun <reified Q : Quantity<Q>> Quantity<*>.asType(): Quantity<Q> = asType(Q::class.java)

fun <Q : Quantity<Q>> Quantity<Q>.asComparable(): ComparableQuantity<Q> =
        if (this is ComparableQuantity) this else value(unit)

// ComparableQuantity extensions
inline fun <reified Q : Quantity<Q>> ComparableQuantity<*>.asType(): ComparableQuantity<Q> = asType(Q::class.java)

// Builder classes
data class MetricPrefixedNumber(val number: Number, val prefix: MetricPrefix)