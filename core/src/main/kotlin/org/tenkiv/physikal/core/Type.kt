/**
 * Copyright 2017 TENKIV, INC.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the
following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
disclaimer in the documentation and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote
products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.tenkiv.physikal.core

import tec.uom.se.ComparableQuantity
import tec.uom.se.unit.MetricPrefix
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
 * @throws ClassCastException if the quantity is not of the given type.
 *
 * Function to type a Quantity.
 *
 * @return the [Quantity] with the specified type.
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