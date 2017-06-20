package org.tenkiv.physikal.additional

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import systems.uom.ucum.UCUM
import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import javax.measure.quantity.Temperature

/**
 * Created by tenkiv on 6/19/17.
 */
val Number.rankine: ComparableQuantity<Temperature>
    get() = Quantities.getQuantity<Temperature>(this, UCUM.RANKINE)

val Number.fahrenheit: ComparableQuantity<Temperature>
    get() = Quantities.getQuantity<Temperature>(this, UCUM.FAHRENHEIT)
