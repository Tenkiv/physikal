package org.tenkiv.physikal.si

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import si.uom.NonSI
import si.uom.NonSI.*
import si.uom.quantity.Luminance
import tec.units.indriya.ComparableQuantity
import tec.units.indriya.quantity.Quantities
import javax.measure.quantity.*

/**
 * Builder method for [ComparableQuantity] with unit [DEGREE_ANGLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.degreeAngle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, NonSI.DEGREE_ANGLE)

/**
 * Builder method for [ComparableQuantity] with unit [MINUTE_ANGLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.minuteAngle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, NonSI.MINUTE_ANGLE)

/**
 * Builder method for [ComparableQuantity] with unit [SECOND_ANGLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.secondAngle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, NonSI.SECOND_ANGLE)

/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.tonne: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, TONNE)

/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.tonne: ComparableQuantity<Mass>
    get() = number(TONNE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.lightYear: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LIGHT_YEAR)

/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.nauticalMile: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, NAUTICAL_MILE)


/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.barn: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, BARN)

/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gal: ComparableQuantity<Acceleration>
    get() = Quantities.getQuantity<Acceleration>(this, GAL)

/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.erg: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, ERG)

/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.stilb: ComparableQuantity<Luminance>
    get() = Quantities.getQuantity<Luminance>(this, STILB)

/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.phot: ComparableQuantity<Illuminance>
    get() = Quantities.getQuantity<Illuminance>(this, PHOT)

/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.maxwell: ComparableQuantity<MagneticFlux>
    get() = Quantities.getQuantity<MagneticFlux>(this, MAXWELL)

/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
/*
val Number.gauss: ComparableQuantity<MagneticFluxDensity>
    get() = Quantities.getQuantity<MagneticFluxDensity>(this, GAUSS)

*/
/**
 * Builder method for [ComparableQuantity] with unit [TONNE].
 *
 * @return A [ComparableQuantity] with specified value.
 *//*

val Number.gauss: ComparableQuantity<MagneticFluxDensity>
    get() = Quantities.getQuantity<MagneticFluxDensity>(this, GAUSS)*/
