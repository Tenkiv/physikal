package org.tenkiv.physikal.additional

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import si.uom.quantity.DynamicViscosity
import si.uom.quantity.KinematicViscosity
import systems.uom.common.CGS.*
import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import javax.measure.quantity.*

/**
 * Created by tenkiv on 6/19/17.
 */
val Number.centimetre: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CENTIMETRE)

val MetricPrefixedNumber.centimetre: ComparableQuantity<Length>
    get() = number(CENTIMETRE.transform(prefix.converter))

val Number.centimetrePerSecond: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, CENTIMETRE_PER_SECOND)

val MetricPrefixedNumber.centimetrePerSecond: ComparableQuantity<Speed>
    get() = number(CENTIMETRE_PER_SECOND.transform(prefix.converter))

val Number.kayserCgs: ComparableQuantity<KinematicViscosity>
    get() = Quantities.getQuantity<KinematicViscosity>(this, KAYSER)

val MetricPrefixedNumber.kayserCgs: ComparableQuantity<KinematicViscosity>
    get() = number(KAYSER.transform(prefix.converter))

val Number.gal: ComparableQuantity<Acceleration>
    get() = Quantities.getQuantity<Acceleration>(this, GAL)

val MetricPrefixedNumber.gal: ComparableQuantity<Acceleration>
    get() = number(GAL.transform(prefix.converter))

val Number.dyne: ComparableQuantity<Force>
    get() = Quantities.getQuantity<Force>(this, DYNE)

val MetricPrefixedNumber.dyne: ComparableQuantity<Force>
    get() = number(DYNE.transform(prefix.converter))

val Number.erg: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, ERG)

val MetricPrefixedNumber.erg: ComparableQuantity<Energy>
    get() = number(ERG.transform(prefix.converter))

val Number.poise: ComparableQuantity<DynamicViscosity>
    get() = Quantities.getQuantity<DynamicViscosity>(this, POISE)

val MetricPrefixedNumber.poise: ComparableQuantity<DynamicViscosity>
    get() = number(POISE.transform(prefix.converter))

val Number.ergPerSecond: ComparableQuantity<Power>
    get() = Quantities.getQuantity<Power>(this, ERG_PER_SECOND)

val MetricPrefixedNumber.ergPerSecond: ComparableQuantity<Power>
    get() = number(ERG_PER_SECOND.transform(prefix.converter))

