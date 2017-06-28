package org.tenkiv.physikal.core

import tec.uom.se.ComparableQuantity
import javax.measure.Quantity
import javax.measure.Unit

/**
 * Averages a [Collection] of [Quantity]s.
 *
 * @param getValue Function to get value.
 * @return [ComparableQuantity] with average value of the [Collection].
 */
inline fun <E, Q : Quantity<Q>> Collection<E>.average(getValue: (E) -> Quantity<Q>): ComparableQuantity<Q>? {
    var totalValue: ComparableQuantity<Q>? = null

    for (element in this)
        if (totalValue == null)
            totalValue = getValue(element).asComparable()
        else
            totalValue += getValue(element)


    return totalValue?.divide(size)
}

/**
 * Averages a [Collection] of [Quantity]s, eliminating values that do not meet a condition.
 *
 * @param getValue Function to get value.
 * @param condition Condition to be met for a sample to be averaged.
 * @return [ComparableQuantity] with average value of the [Collection].
 */
inline fun <E, Q : Quantity<Q>> Collection<E>.average(getValue: (E) -> Quantity<Q>, condition: (E) -> Boolean):
        ComparableQuantity<Q>? {
    var totalValue: ComparableQuantity<Q>? = null
    var totalElements = 0

    for (element in this)
        if (condition(element)) {
            if (totalValue == null)
                totalValue = getValue(element).asComparable()
            else
                totalValue += getValue(element)

            totalElements++
        }

    return totalValue?.divide(totalElements)
}

/**
 * Averages a [Collection] of [Quantity]s using a specific unit.
 *
 * @param unit Unit to be used while averaging and to be returned.
 * @param getValue Function to get value.
 * @return [ComparableQuantity] with average value of the [Collection].
 */
inline fun <E, Q : Quantity<Q>> Collection<E>.average(unit: Unit<Q>, getValue: (E) -> Quantity<Q>):
        ComparableQuantity<Q> {
    var totalValue: ComparableQuantity<Q> = 0(unit)

    for (element in this)
        totalValue += getValue(element)

    return totalValue / size
}

/**
 * Averages a [Collection] of [Quantity]s using a specific unit, eliminating values that do not meet a condition.
 *
 * @param unit Unit to be used while averaging and to be returned.
 * @param getValue Function to get value.
 * @param condition Condition to be met for a sample to be averaged.
 * @return [ComparableQuantity] with average value of the [Collection].
 */
inline fun <E, Q : Quantity<Q>> Collection<E>.average(unit: Unit<Q>,
                                                      getValue: (E) -> Quantity<Q>,
                                                      condition: (E) -> Boolean): ComparableQuantity<Q> {
    var totalValue: ComparableQuantity<Q> = 0(unit)
    var totalElements = 0

    for (element in this)
        if (condition(element)) {
            totalValue += getValue(element)
            totalElements++
        }

    return totalValue / totalElements
}