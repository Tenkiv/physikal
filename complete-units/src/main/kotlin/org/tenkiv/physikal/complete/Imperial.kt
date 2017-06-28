package org.tenkiv.physikal.complete

import systems.uom.ucum.UCUM
import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import javax.measure.quantity.Temperature

/**
 * Builder method for [ComparableQuantity] with unit [UCUM.RANKINE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.rankine: ComparableQuantity<Temperature>
    get() = Quantities.getQuantity<Temperature>(this, UCUM.RANKINE)

/**
 * Builder method for [ComparableQuantity] with unit [UCUM.FAHRENHEIT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.fahrenheit: ComparableQuantity<Temperature>
    get() = Quantities.getQuantity<Temperature>(this, UCUM.FAHRENHEIT)
