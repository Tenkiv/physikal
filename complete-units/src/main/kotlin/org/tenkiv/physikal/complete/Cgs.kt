package org.tenkiv.physikal.complete

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import si.uom.quantity.DynamicViscosity
import si.uom.quantity.KinematicViscosity
import systems.uom.common.CGS.*
import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import javax.measure.quantity.*

/**
 * Builder method for [ComparableQuantity] with unit [CENTIMETRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.centimetre: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CENTIMETRE)

/**
 * Builder method for [ComparableQuantity] with unit [CENTIMETRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.centimetre: ComparableQuantity<Length>
    get() = number(CENTIMETRE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CENTIMETRE_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.centimetrePerSecond: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, CENTIMETRE_PER_SECOND)

/**
 * Builder method for [ComparableQuantity] with unit [CENTIMETRE_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.centimetrePerSecond: ComparableQuantity<Speed>
    get() = number(CENTIMETRE_PER_SECOND.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [KAYSER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.kayserCgs: ComparableQuantity<KinematicViscosity>
    get() = Quantities.getQuantity<KinematicViscosity>(this, KAYSER)

/**
 * Builder method for [ComparableQuantity] with unit [KAYSER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.kayserCgs: ComparableQuantity<KinematicViscosity>
    get() = number(KAYSER.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [GAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gal: ComparableQuantity<Acceleration>
    get() = Quantities.getQuantity<Acceleration>(this, GAL)

/**
 * Builder method for [ComparableQuantity] with unit [GAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.gal: ComparableQuantity<Acceleration>
    get() = number(GAL.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [DYNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.dyne: ComparableQuantity<Force>
    get() = Quantities.getQuantity<Force>(this, DYNE)

/**
 * Builder method for [ComparableQuantity] with unit [DYNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.dyne: ComparableQuantity<Force>
    get() = number(DYNE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [ERG].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.erg: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, ERG)

/**
 * Builder method for [ComparableQuantity] with unit [ERG].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.erg: ComparableQuantity<Energy>
    get() = number(ERG.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [POISE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.poise: ComparableQuantity<DynamicViscosity>
    get() = Quantities.getQuantity<DynamicViscosity>(this, POISE)

/**
 * Builder method for [ComparableQuantity] with unit [POISE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.poise: ComparableQuantity<DynamicViscosity>
    get() = number(POISE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [ERG_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ergPerSecond: ComparableQuantity<Power>
    get() = Quantities.getQuantity<Power>(this, ERG_PER_SECOND)

/**
 * Builder method for [ComparableQuantity] with unit [ERG_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.ergPerSecond: ComparableQuantity<Power>
    get() = number(ERG_PER_SECOND.transform(prefix.converter))

