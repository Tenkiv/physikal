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
import tec.uom.se.unit.Units
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