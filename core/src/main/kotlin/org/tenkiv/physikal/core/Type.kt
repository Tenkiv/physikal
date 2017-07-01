package org.tenkiv.physikal.core

import org.tenkiv.coral.ValueInstant
import tec.uom.se.ComparableQuantity
import tec.uom.se.unit.MetricPrefix
import java.lang.Double
import javax.measure.Quantity
import javax.measure.Unit

// typealiases
typealias ClosedQuantityRange<Q> = ClosedRange<ComparableQuantity<Q>>

// Unit extensions
inline fun <reified Q : Quantity<Q>> Unit<*>.asType(): Unit<Q> = asType(Q::class.java)

// Quantity extensions
/**
 * Function to get the value of a [Quantity] as a [Double]
 *
 * @return Value as a [Double]
 */
fun Quantity<*>.toDouble() = getValue().toDouble()

/**
 * Function to get the value of a [Quantity] as a [Float]
 *
 * @return Value as a [Float]
 */
fun Quantity<*>.toFloat() = getValue().toFloat()

/**
 * Function to get the value of a [Quantity] as a [Long]
 *
 * @return Value as a [Long]
 */
fun Quantity<*>.toLong() = getValue().toLong()

/**
 * Function to get the value of a [Quantity] as a [Int]
 *
 * @return Value as a [Int]
 */
fun Quantity<*>.toInt() = getValue().toInt()

/**
 * Function to get the value of a [Quantity] as a [Short]
 *
 * @return Value as a [Short]
 */
fun Quantity<*>.toShort() = getValue().toShort()

/**
 * Function to get the value of a [Quantity] as a [Byte]
 *
 * @return Value as a [Byte]
 */
fun Quantity<*>.toByte() = getValue().toByte()

/**
 * Function to get the value of a [Quantity] as a specified class
 *
 * @return Value as a some class.
 */
inline fun <reified Q : Quantity<Q>> Quantity<*>.asType(): Quantity<Q> = asType(Q::class.java)

/**
 * Function to get the [Quantity] as a [ComparableQuantity]
 *
 * @return A [ComparableQuantity] of the [Quantity]
 */
fun <Q : Quantity<Q>> Quantity<Q>.asComparable(): ComparableQuantity<Q> =
        if (this is ComparableQuantity) this else value(unit)

// ComparableQuantity extensions
inline fun <reified Q : Quantity<Q>> ComparableQuantity<*>.asType(): ComparableQuantity<Q> = asType(Q::class.java)

// Builder classes
/**
 * Data class which acts as a builder for all [Unit]s which are allowed [MetricPrefix]s
 *
 * @param number The numeric value of the future [Quantity].
 * @param prefix The [MetricPrefix] of the future [Quantity].
 */
data class MetricPrefixedNumber(val number: Number, val prefix: MetricPrefix)