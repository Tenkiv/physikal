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
import tec.units.indriya.quantity.Quantities
import javax.measure.Quantity
import javax.measure.Unit

// Number operators
/**
 * Utility function to create a [Quantity] with this number as its value and the given unit as its unit.
 *
 * @return [ComparableQuantity] with [Number] value.
 */
operator fun <Q : Quantity<Q>> Number.invoke(unit: Unit<Q>): ComparableQuantity<Q> =
    Quantities.getQuantity(this, unit)

/**
 * @throws IllegalArgumentException if the given unitSymbol is not valid.
 *
 * Utility function to create a [Quantity] with this number as its value.
 * This function will attempt to parse this number with the provided symbol into a quantity according to
 * [Quantities.getQuantity]
 */
infix fun Number.toQuantityWithSymbol(unitSymbol: CharSequence): ComparableQuantity<*> =
    Quantities.getQuantity("$this $unitSymbol")

// Unit operators
/**
 * Function to call the [Quantity.multiply] function on specified value.
 *
 * @return [Unit] with multiplied value.
 */
operator fun <Q : Quantity<Q>> Unit<Q>.times(multiplier: Double): Unit<Q> = multiply(multiplier)

/**
 * Function to call the [Quantity.multiply] function on specified value.
 *
 * @return [Unit] with multiplied value.
 */
operator fun Unit<*>.times(multiplier: Unit<*>): Unit<*> = multiply(multiplier)

/**
 * Function to call the [Quantity.divide] function on specified value.
 *
 * @return [Unit] with divided value.
 */
operator fun <Q : Quantity<Q>> Unit<Q>.div(divisor: Double): Unit<Q> = divide(divisor)

/**
 * Function to call the [Quantity.divide] function on specified value.
 *
 * @return [Unit] with divided value.
 */
operator fun Unit<*>.div(divisor: Unit<*>): Unit<*> = divide(divisor)

// Quantity operators
/**
 * Function to unary add function on specified value.
 *
 * @return [ComparableQuantity] with added value.
 */
operator fun <Q : Quantity<Q>> Quantity<Q>.unaryPlus(): ComparableQuantity<Q> = (+value.toDouble())(unit)

/**
 * Function to unary minus function on specified value.
 *
 * @return [ComparableQuantity] with subtracted value.
 */
operator fun <Q : Quantity<Q>> Quantity<Q>.unaryMinus(): ComparableQuantity<Q> = (-value.toDouble())(unit)

/**
 * Function to increment specified value.
 *
 * @return [Quantity] with incremented value.
 */
operator fun <Q : Quantity<Q>> Quantity<Q>.inc(): Quantity<Q> = this + 1(unit)

/**
 * Function to decrement specified value.
 *
 * @return [Quantity] with decremented value.
 */
operator fun <Q : Quantity<Q>> Quantity<Q>.dec(): Quantity<Q> = this - 1(unit)

/**
 * Function to add two [Quantity]s.
 *
 * @return [Quantity] with added value.
 */
operator fun <Q : Quantity<Q>> Quantity<Q>.plus(augend: Quantity<Q>): Quantity<Q> = add(augend)

/**
 * Function to subtract two [Quantity]s.
 *
 * @return [Quantity] with subtracted value.
 */
operator fun <Q : Quantity<Q>> Quantity<Q>.minus(subtrahend: Quantity<Q>): Quantity<Q> = subtract(subtrahend)

/**
 * Function to multiply two [Quantity]s.
 *
 * @return [Quantity] with multiplied value.
 */
operator fun Quantity<*>.times(multiplier: Quantity<*>): Quantity<*> = multiply(multiplier)

/**
 * Function to multiply two [Quantity]s.
 *
 * @return [Quantity] with multiplied value.
 */
operator fun <Q : Quantity<Q>> Quantity<Q>.times(multiplier: Number): Quantity<Q> = multiply(multiplier)

/**
 * Function to divide two [Quantity]s.
 *
 * @return [Quantity] with divided value.
 */
operator fun Quantity<*>.div(divisor: Quantity<*>): Quantity<*> = divide(divisor)

/**
 * Function to divide two [Quantity]s.
 *
 * @return [Quantity] with divided value.
 */
operator fun <Q : Quantity<Q>> Quantity<Q>.div(divisor: Number): Quantity<Q> = divide(divisor)

/**
 * Function to convert a [Quantity] to a different [Unit].
 *
 * @return [Quantity] with updated [Unit].
 */
infix fun <Q : Quantity<Q>> Quantity<Q>.convertTo(unit: Unit<Q>): Quantity<Q> = to(unit)

/**
 * Function to convert a [Quantity] to a different [Unit] and return the value after conversion as a [Number].
 */
infix fun <Q : Quantity<Q>> Quantity<Q>.toNumberIn(unit: Unit<Q>) = to(unit).value

/**
 * Function to convert a [Quantity] to a different [Unit] and return the value after conversion as a [Double].
 */
infix fun <Q : Quantity<Q>> Quantity<Q>.toDoubleIn(unit: Unit<Q>) = to(unit).valueToDouble()

/**
 * Function to convert a [Quantity] to a different [Unit] and return the value after conversion as a [Float].
 */
infix fun <Q : Quantity<Q>> Quantity<Q>.toFloatIn(unit: Unit<Q>) = to(unit).valueToFloat()

/**
 * Function to convert a [Quantity] to a different [Unit] and return the value after conversion as a [Long].
 */
infix fun <Q : Quantity<Q>> Quantity<Q>.toLongIn(unit: Unit<Q>) = to(unit).valueToLong()

/**
 * Function to convert a [Quantity] to a different [Unit] and return the value after conversion as a [Int].
 */
infix fun <Q : Quantity<Q>> Quantity<Q>.toIntIn(unit: Unit<Q>) = to(unit).valueToInt()

/**
 * Function to convert a [Quantity] to a different [Unit] and return the value after conversion as a [Short].
 */
infix fun <Q : Quantity<Q>> Quantity<Q>.toShortIn(unit: Unit<Q>) = to(unit).valueToShort()

/**
 * Function to convert a [Quantity] to a different [Unit] and return the value after conversion as a [Byte].
 */
infix fun <Q : Quantity<Q>> Quantity<Q>.toByteIn(unit: Unit<Q>) = to(unit).valueToByte()

/**
 * Function to convert a [Quantity] to the system [Unit] and return the value after conversion as a [Number].
 */
fun Quantity<*>.toNumberInSystemUnit(): Number =
    this.getUnit().getConverterToAny(this.getUnit().getSystemUnit()).convert(this.getValue())

/**
 * Function to convert a [Quantity] to the system [Unit] and return the value after conversion as a [Double].
 */
fun Quantity<*>.toDoubleInSystemUnit() = toNumberInSystemUnit().toDouble()

/**
 * Function to convert a [Quantity] to the system [Unit] and return the value after conversion as a [Float].
 */
fun Quantity<*>.toFloatInSystemUnit() = toNumberInSystemUnit().toFloat()

/**
 * Function to convert a [Quantity] to the system [Unit] and return the value after conversion as a [Long].
 */
fun Quantity<*>.toLongInSystemUnit() = toNumberInSystemUnit().toLong()

/**
 * Function to convert a [Quantity] to the system [Unit] and return the value after conversion as a [Int].
 */
fun Quantity<*>.toIntInSystemUnit() = toNumberInSystemUnit().toInt()

/**
 * Function to convert a [Quantity] to the system [Unit] and return the value after conversion as a [Short].
 */
fun Quantity<*>.toShortInSystemUnit() = toNumberInSystemUnit().toShort()

/**
 * Function to convert a [Quantity] to the system [Unit] and return the value after conversion as a [Byte].
 */
fun Quantity<*>.toByteInSystemUnit() = toNumberInSystemUnit().toByte()


// ComparableQuantity operators
/**
 * Function to increment specified value.
 *
 * @return [ComparableQuantity] with incremented value.
 */
operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.inc(): ComparableQuantity<Q> = this + 1(unit)

/**
 * Function to increment specified value.
 *
 * @return [ComparableQuantity] with incremented value.
 */
operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.dec(): ComparableQuantity<Q> = this - 1(unit)

/**
 * Function to add two [ComparableQuantity]s.
 *
 * @return [ComparableQuantity] with added value.
 */
operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.plus(augend: Quantity<Q>): ComparableQuantity<Q> = add(augend)

/**
 * Function to subtract two [ComparableQuantity]s.
 *
 * @return [ComparableQuantity] with subtracted value.
 */
operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.minus(subtrahend: Quantity<Q>): ComparableQuantity<Q> =
    subtract(subtrahend)

/**
 * Function to multiply two [ComparableQuantity]s.
 *
 * @return [ComparableQuantity] with multiplied value.
 */
operator fun ComparableQuantity<*>.times(multiplier: Quantity<*>): ComparableQuantity<*> = multiply(multiplier)

/**
 * Function to multiply two [ComparableQuantity]s.
 *
 * @return [ComparableQuantity] with multiplied value.
 */
operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.times(multiplier: Number): ComparableQuantity<Q> =
    multiply(multiplier)

/**
 * Function to divide two [ComparableQuantity]s.
 *
 * @return [ComparableQuantity] with divided value.
 */
operator fun ComparableQuantity<*>.div(divisor: Quantity<*>): ComparableQuantity<*> = divide(divisor)

/**
 * Function to divide two [ComparableQuantity]s.
 *
 * @return [ComparableQuantity] with divided value.
 */
operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.div(divisor: Number): ComparableQuantity<Q> = divide(divisor)

/**
 * Function to convert a [ComparableQuantity] to a different [Unit].
 *
 * @return [ComparableQuantity] with updated [Unit].
 */
infix fun <Q : Quantity<Q>> ComparableQuantity<Q>.convertTo(unit: Unit<Q>): ComparableQuantity<Q> = to(unit)

/**
 * Function to get the absolute value of a [ComparableQuantity].
 *
 * @return Absolute value of the [ComparableQuantity].
 */
fun <Q : Quantity<Q>> ComparableQuantity<Q>.abs(): ComparableQuantity<Q> = if (this < 0(unit)) -this else this

/**
 * Checks if the physical quantity represented by two Quantity objects is the same.
 * qeq stands for 'quantity equality'
 */
infix fun <Q : Quantity<Q>> ComparableQuantity<Q>.qeq(comparate: Quantity<Q>): Boolean = isEquivalentOf(comparate)
// FIXME this should be isEquivalentTo again after Indriya 1.2
/**
 * Checks if two [Quantity]s are approximately equal to each other.
 *
 * @param plusOrMinus The allowed variance in value.
 * @return If the value falls within allowed variance.
 */
fun <Q : Quantity<Q>> ComparableQuantity<Q>.apeq(comparate: Quantity<Q>, plusOrMinus: ComparableQuantity<Q>): Boolean =
    (this - comparate).abs() <= plusOrMinus

//TODO: Consider using ComparableQuantity<Dimensionless> with Percent instead of Double for the plusOrMinusRatio
/**
 * Checks if two [ComparableQuantity]s are approximately equal to each other as a ratio of the size of the numbers.
 *
 * @param plusOrMinusRatio The allowed variance in value as ratio of whole number.
 * @return If the value falls within allowed variance.
 */
fun <Q : Quantity<Q>> ComparableQuantity<Q>.apeq(
    comparate: ComparableQuantity<Q>,
    plusOrMinusRatio: Double
): Boolean {
    val plusOrMinus: ComparableQuantity<Q> =
        if (this < comparate)
            (this * plusOrMinusRatio)
        else
            (comparate * plusOrMinusRatio)
    return apeq(comparate, plusOrMinus)
}

