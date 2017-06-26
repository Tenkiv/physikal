package org.tenkiv.physikal.core

import tec.uom.se.ComparableQuantity
import javax.measure.Quantity
import javax.measure.Unit


inline fun <E, Q : Quantity<Q>> Collection<E>.average(getValue: (E) -> Quantity<Q>): ComparableQuantity<Q>? {
    var totalValue: ComparableQuantity<Q>? = null

    for (element in this)
        if (totalValue == null)
            totalValue = getValue(element).asComparable()
        else
            totalValue += getValue(element)


    return totalValue?.divide(size)
}

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

inline fun <E, Q : Quantity<Q>> Collection<E>.average(unit: Unit<Q>, getValue: (E) -> Quantity<Q>):
        ComparableQuantity<Q> {
    var totalValue: ComparableQuantity<Q> = 0(unit)

    for (element in this)
        totalValue += getValue(element)

    return totalValue / size
}

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