/*
 * Copyright 2019 Tenkiv, Inc.
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
import tec.units.indriya.unit.MetricPrefix
import javax.measure.Quantity
import javax.measure.Unit

// typealiases
typealias ClosedQuantityRange<Q> = ClosedRange<ComparableQuantity<Q>>

// Unit type alias to avoid confusion and import ambiguity with kotlin.Unit
typealias PhysicalUnit<Q> = Unit<Q>

// Unit extensions
/**
 * @throws ClassCastException if the unit is not of the given type.
 */
inline fun <reified Q : Quantity<Q>> PhysicalUnit<*>.asType(): PhysicalUnit<Q> = asType(Q::class.java)

inline fun <reified Q : Quantity<Q>> PhysicalUnit<*>.asTypeOrNull(): PhysicalUnit<Q>? =
    try {
        asType()
    } catch (e: ClassCastException) {
        null
    }

// Quantity extensions
/**
 * Function to get the value of a [Quantity] as a [Double]
 *
 * @return Value as a [Double]
 */
fun Quantity<*>.valueToDouble() = getValue().toDouble()

/**
 * Function to get the value of a [Quantity] as a [Float]
 *
 * @return Value as a [Float]
 */
fun Quantity<*>.valueToFloat() = getValue().toFloat()

/**
 * Function to get the value of a [Quantity] as a [Long]
 *
 * @return Value as a [Long]
 */
fun Quantity<*>.valueToLong() = getValue().toLong()

/**
 * Function to get the value of a [Quantity] as a [Int]
 *
 * @return Value as a [Int]
 */
fun Quantity<*>.valueToInt() = getValue().toInt()

/**
 * Function to get the value of a [Quantity] as a [Short]
 *
 * @return Value as a [Short]
 */
fun Quantity<*>.valueToShort() = getValue().toShort()

/**
 * Function to get the value of a [Quantity] as a [Byte]
 *
 * @return Value as a [Byte]
 */
fun Quantity<*>.valueToByte() = getValue().toByte()

/**
 * Function to get the [Quantity] as a [ComparableQuantity]
 *
 * @return A [ComparableQuantity] of the [Quantity]
 */
fun <Q : Quantity<Q>> Quantity<Q>.toComparable(): ComparableQuantity<Q> =
    this as? ComparableQuantity ?: value(unit)

/**
 * Casts this quantity to a parameterized unit of specified nature or throw a <code>ClassCastException</code> if the
 * dimension of the specified quantity and this measure unit's dimension do not match. For example:
 * <p>
 * <code>
 *     {@literal Quantity<Length>} length = Quantities.getQuantity("2 km").asType(Length.class);
 * </code> or <code>
 *     {@literal Quantity<Speed>} C = length.multiply(299792458).divide(second).asType(Speed.class);
 * </code>
 * </p>
 *
 * @param <T>
 *          The type of the quantity.
 * @return this quantity parameterized with the specified type.
 * @throws ClassCastException
 *           if the dimension of this unit is different from the specified quantity dimension.
 * @throws UnsupportedOperationException
 *           if the specified quantity class does not have a SI unit for the quantity.
 * @see Unit.asType(Class)
 */
inline fun <reified Q : Quantity<Q>> Quantity<*>.asType(): Quantity<Q> = asType(Q::class.java)

/**
 * Function to type a Quantity.
 *
 * @return the [Quantity] with the specified type or null if the provided type conflicts with the actual type.
 */
inline fun <reified Q : Quantity<Q>> Quantity<*>.asTypeOrNull(): Quantity<Q>? =
    try {
        asType()
    } catch (e: ClassCastException) {
        null
    }

// ComparableQuantity extensions
/**
 * @throws ClassCastException if the quantity is not of the given type.
 *
 * Function to type a Quantity.
 *
 * @return the [ComparableQuantity] with the specified type.
 */
inline fun <reified Q : Quantity<Q>> ComparableQuantity<*>.asType(): ComparableQuantity<Q> = asType(Q::class.java)

/**
 * Function to type a Quantity.
 *
 * @return the [Quantity] with the specified type or null if the provided type conflicts with the actual type.
 */
inline fun <reified Q : Quantity<Q>> ComparableQuantity<*>.asTypeOrNull(): ComparableQuantity<Q>? =
    try {
        asType()
    } catch (e: ClassCastException) {
        null
    }

// Builder classes
/**
 * Data class which acts as a builder for all [Unit]s which are allowed [MetricPrefix]s
 *
 * @param number The numeric value of the future [Quantity].
 * @param prefix The [MetricPrefix] of the future [Quantity].
 */
data class MetricPrefixedNumber(val number: Number, val prefix: MetricPrefix)