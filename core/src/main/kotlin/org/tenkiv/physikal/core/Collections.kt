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
import tec.units.indriya.unit.Units
import javax.measure.Quantity

/**
 * Averages a [Collection] of [Quantity]s.
 *
 * @param getValue Function to get value.
 * @return [ComparableQuantity] with average value of the [Collection] or null if the collection is empty.
 */
inline fun <E, Q : Quantity<Q>> Collection<E>.averageOrNull(getValue: (E) -> Quantity<Q>): ComparableQuantity<Q>? {
    var totalValue: ComparableQuantity<Q>? = null

    for (element in this)
        if (totalValue == null)
            totalValue = getValue(element).toComparable()
        else
            totalValue += getValue(element)

    return totalValue?.divide(size)
}

/**
 * Averages a [Collection] of [Quantity]s, eliminating values that do not meet a condition.
 *
 * @param getValue Function to get value.
 * @param condition Condition to be met for a sample to be averaged.
 * @return [ComparableQuantity] with average value of the [Collection] or null value if no elements match
 * the condition.
 */
inline fun <E, Q : Quantity<Q>> Collection<E>.averageOrNull(getValue: (E) -> Quantity<Q>, condition: (E) -> Boolean):
        ComparableQuantity<Q>? {
    var totalValue: ComparableQuantity<Q>? = null
    var totalElements = 0

    for (element in this)
        if (condition(element)) {
            if (totalValue == null)
                totalValue = getValue(element).toComparable()
            else
                totalValue += getValue(element)

            totalElements++
        }

    return totalValue?.divide(totalElements)
}

/**
 * Averages a [Collection] of [Quantity]s using a specific unit.
 *
 * @param defaultValue The default value if this collection is empty.
 * @param getValue Function to get value.
 * @return [ComparableQuantity] with average value of the [Collection] or a default value if the collection is empty.
 */
inline fun <E, reified Q : Quantity<Q>> Collection<E>.averageOrDefault(
    defaultValue: ComparableQuantity<Q> = 0(Units.getInstance().getUnit(Q::class.java)),
    getValue: (E) -> Quantity<Q>
): ComparableQuantity<Q> {
    var totalValue: ComparableQuantity<Q> = 0(Units.getInstance().getUnit(Q::class.java))

    for (element in this)
        totalValue += getValue(element)

    return if (size > 0) totalValue / size else defaultValue
}

/**
 * Averages a [Collection] of [Quantity]s using a specific unit (uses default unit if none is provided),
 * eliminating values that do not meet a condition.
 *
 * @param defaultValue The default value if this collection is empty.
 * @param getValue Function to get value.
 * @param condition Condition to be met for a sample to be averaged.
 * @return [ComparableQuantity] with average value of the [Collection] or a default value if no elements match
 * the condition.
 */
inline fun <E, reified Q : Quantity<Q>> Collection<E>.averageOrDefault(
    defaultValue: ComparableQuantity<Q> = 0(Units.getInstance().getUnit(Q::class.java)),
    getValue: (E) -> Quantity<Q>,
    condition: (E) -> Boolean
): ComparableQuantity<Q> {
    var totalValue: ComparableQuantity<Q> = 0(Units.getInstance().getUnit(Q::class.java))
    var totalElements = 0

    this.filter { condition(it) }
        .forEach {
            totalValue += getValue(it)
            totalElements++
        }

    return if (size > 0) totalValue / totalElements else defaultValue
}

/**
 * Averages a [Collection] of [Quantity]s using a specific unit.
 *
 * @throws ArithmeticException if the collection is empty (divide by 0).
 *
 * @param getValue Function to get value.
 * @return [ComparableQuantity] with average value of the [Collection].
 */
inline fun <E, reified Q : Quantity<Q>> Collection<E>.average(
    getValue: (E) -> Quantity<Q>
): ComparableQuantity<Q> {
    var totalValue: ComparableQuantity<Q> = 0(Units.getInstance().getUnit(Q::class.java))

    for (element in this)
        totalValue += getValue(element)

    return totalValue / size
}

/**
 * Averages a [Collection] of [Quantity]s using a specific unit (uses default unit if none is provided),
 * eliminating values that do not meet a condition.
 *
 * @throws ArithmeticException if no elements meet the condition (divide by 0).
 *
 * @param getValue Function to get value.
 * @param condition Condition to be met for a sample to be averaged.
 * @return [ComparableQuantity] with average value of the [Collection].
 */
inline fun <E, reified Q : Quantity<Q>> Collection<E>.average(
    getValue: (E) -> Quantity<Q>,
    condition: (E) -> Boolean
): ComparableQuantity<Q> {
    var totalValue: ComparableQuantity<Q> = 0(Units.getInstance().getUnit(Q::class.java))
    var totalElements = 0

    this.filter { condition(it) }
        .forEach {
            totalValue += getValue(it)
            totalElements++
        }

    return totalValue / totalElements
}