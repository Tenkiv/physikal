package org.tenkiv.physikal.core

import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import javax.measure.Quantity
import javax.measure.Unit

// Number operators
operator fun <Q : Quantity<Q>> Number.invoke(unit: Unit<Q>): ComparableQuantity<Q> =
        Quantities.getQuantity(this, unit)

// Unit operators
operator fun <Q : Quantity<Q>> Unit<Q>.times(multiplier: Double): Unit<Q> = multiply(multiplier)

operator fun Unit<*>.times(multiplier: Unit<*>): Unit<*> = multiply(multiplier)

operator fun <Q : Quantity<Q>> Unit<Q>.div(divisor: Double): Unit<Q> = divide(divisor)

operator fun Unit<*>.div(divisor: Unit<*>): Unit<*> = divide(divisor)

// Quantity operators
operator fun <Q : Quantity<Q>> Quantity<Q>.unaryPlus(): ComparableQuantity<Q> = (+value.toDouble())(unit)

operator fun <Q : Quantity<Q>> Quantity<Q>.unaryMinus(): ComparableQuantity<Q> = (-value.toDouble())(unit)

operator fun <Q : Quantity<Q>> Quantity<Q>.inc(): Quantity<Q> = this + 1(unit)

operator fun <Q : Quantity<Q>> Quantity<Q>.dec(): Quantity<Q> = this - 1(unit)

operator fun <Q : Quantity<Q>> Quantity<Q>.plus(augend: Quantity<Q>): Quantity<Q> = add(augend)

operator fun <Q : Quantity<Q>> Quantity<Q>.minus(subtrahend: Quantity<Q>): Quantity<Q> = subtract(subtrahend)

operator fun Quantity<*>.times(multiplier: Quantity<*>): Quantity<*> = multiply(multiplier)

operator fun <Q : Quantity<Q>> Quantity<Q>.times(multiplier: Number): Quantity<Q> = multiply(multiplier)

operator fun Quantity<*>.div(divisor: Quantity<*>): Quantity<*> = divide(divisor)

operator fun <Q : Quantity<Q>> Quantity<Q>.div(divisor: Number): Quantity<Q> = divide(divisor)

infix fun <Q : Quantity<Q>> Quantity<Q>.tu(unit: Unit<Q>): Quantity<Q> = to(unit)

infix fun <Q : Quantity<Q>> Quantity<Q>.toDoubleIn(unit: Unit<Q>) = to(unit).toDouble()

infix fun <Q : Quantity<Q>> Quantity<Q>.toFloatIn(unit: Unit<Q>) = to(unit).toFloat()

infix fun <Q : Quantity<Q>> Quantity<Q>.toLongIn(unit: Unit<Q>) = to(unit).toLong()

infix fun <Q : Quantity<Q>> Quantity<Q>.toIntIn(unit: Unit<Q>) = to(unit).toInt()

infix fun <Q : Quantity<Q>> Quantity<Q>.toShortIn(unit: Unit<Q>) = to(unit).toShort()

infix fun <Q : Quantity<Q>> Quantity<Q>.toByteIn(unit: Unit<Q>) = to(unit).toByte()

// ComparableQuantity operators
operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.inc(): ComparableQuantity<Q> = this + 1(unit)

operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.dec(): ComparableQuantity<Q> = this - 1(unit)

operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.plus(augend: Quantity<Q>): ComparableQuantity<Q> = add(augend)

operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.minus(subtrahend: Quantity<Q>): ComparableQuantity<Q> =
        subtract(subtrahend)

operator fun ComparableQuantity<*>.times(multiplier: Quantity<*>): ComparableQuantity<*> = multiply(multiplier)

operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.times(multiplier: Number): ComparableQuantity<Q> =
        multiply(multiplier)

operator fun ComparableQuantity<*>.div(divisor: Quantity<*>): ComparableQuantity<*> = divide(divisor)

operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.div(divisor: Number): ComparableQuantity<Q> = divide(divisor)

infix fun <Q : Quantity<Q>> ComparableQuantity<Q>.tu(unit: Unit<Q>): ComparableQuantity<Q> = to(unit)

fun <Q : Quantity<Q>> ComparableQuantity<Q>.abs(): ComparableQuantity<Q> = if (this < 0(unit)) -this else this

/**
 * Checks if the physical quantity represented by two Quantity objects is the same.
 * qeq stands for 'quantity equality'
 */
infix fun <Q : Quantity<Q>> ComparableQuantity<Q>.qeq(comparate: Quantity<Q>) = isEquivalentTo(comparate)

fun <Q : Quantity<Q>> ComparableQuantity<Q>.apeq(comparate: Quantity<Q>, plusOrMinus: ComparableQuantity<Q>) =
        (this - comparate).abs() <= plusOrMinus

//TODO: Consider using ComparableQuantity<Dimensionless> with Percent instead of Double for the plusOrMinusRatio
fun <Q : Quantity<Q>> ComparableQuantity<Q>.apeq(comparate: ComparableQuantity<Q>,
                                                 plusOrMinusRatio: Double): Boolean {
    val plusOrMinus: ComparableQuantity<Q> =
            if (this < comparate)
                (this * plusOrMinusRatio)
            else
                (comparate * plusOrMinusRatio)
    return apeq(this, plusOrMinus)
}

