/*
 * Copyright 2019 Tenkiv, Inc.
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

package org.tenkiv.physikal.si

import org.tenkiv.physikal.core.*
import si.uom.NonSI.TONNE
import si.uom.SI.*
import si.uom.quantity.*
import tec.units.indriya.*
import tec.units.indriya.quantity.*
import javax.measure.quantity.*

/**
 * Builder method for [ComparableQuantity] with unit [METRE_PER_SQUARE_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.metrePerSquareSecond: ComparableQuantity<Acceleration>
    get() = Quantities.getQuantity<Acceleration>(this, METRE_PER_SQUARE_SECOND)

/**
 * Builder method for [ComparableQuantity] with unit [METRE_PER_SQUARE_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.metrePerSquareSecond: ComparableQuantity<Acceleration>
    get() = number(METRE_PER_SQUARE_SECOND.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [AMPERE_TURN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ampereTurn: ComparableQuantity<MagnetomotiveForce>
    get() = Quantities.getQuantity<MagnetomotiveForce>(this, AMPERE_TURN)

/**
 * Builder method for [ComparableQuantity] with unit [AMPERE_TURN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.ampereTurn: ComparableQuantity<MagnetomotiveForce>
    get() = number(AMPERE_TURN.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [JOULE_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.jouleSecond: ComparableQuantity<Action>
    get() = Quantities.getQuantity<Action>(this, JOULE_SECOND)

/**
 * Builder method for [ComparableQuantity] with unit [JOULE_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.jouleSecond: ComparableQuantity<Action>
    get() = number(JOULE_SECOND.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [FARAD_PER_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.faradPerMetre: ComparableQuantity<ElectricPermittivity>
    get() = Quantities.getQuantity<ElectricPermittivity>(this, FARAD_PER_METRE)

/**
 * Builder method for [ComparableQuantity] with unit [FARAD_PER_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.faradPerMetre: ComparableQuantity<ElectricPermittivity>
    get() = number(FARAD_PER_METRE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [NEWTON_PER_SQUARE_AMPERE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.newtonPerSquareAmpre: ComparableQuantity<MagneticPermeability>
    get() = Quantities.getQuantity<MagneticPermeability>(this, NEWTON_PER_SQUARE_AMPERE)

/**
 * Builder method for [ComparableQuantity] with unit [NEWTON_PER_SQUARE_AMPERE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.newtonPerSquareAmpre: ComparableQuantity<MagneticPermeability>
    get() = number(NEWTON_PER_SQUARE_AMPERE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [RECIPROCAL_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.reciprocalMetre: ComparableQuantity<WaveNumber>
    get() = Quantities.getQuantity<WaveNumber>(this, RECIPROCAL_METRE)

/**
 * Builder method for [ComparableQuantity] with unit [RECIPROCAL_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.reciprocalMetre: ComparableQuantity<WaveNumber>
    get() = number(RECIPROCAL_METRE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [PASCAL_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.pascalSecond: ComparableQuantity<DynamicViscosity>
    get() = Quantities.getQuantity<DynamicViscosity>(this, PASCAL_SECOND)

/**
 * Builder method for [ComparableQuantity] with unit [PASCAL_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.pascalSecond: ComparableQuantity<DynamicViscosity>
    get() = number(PASCAL_SECOND.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CANDELA_PER_SQUARE_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.candelaPerSquareMetre: ComparableQuantity<Luminance>
    get() = Quantities.getQuantity<Luminance>(this, CANDELA_PER_SQUARE_METRE)

/**
 * Builder method for [ComparableQuantity] with unit [CANDELA_PER_SQUARE_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.candelaPerSquareMetre: ComparableQuantity<Luminance>
    get() = number(CANDELA_PER_SQUARE_METRE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [SQUARE_METRE_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.squareMetrePerSecond: ComparableQuantity<KinematicViscosity>
    get() = Quantities.getQuantity<KinematicViscosity>(this, SQUARE_METRE_PER_SECOND)

/**
 * Builder method for [ComparableQuantity] with unit [SQUARE_METRE_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.squareMetrePerSecond: ComparableQuantity<KinematicViscosity>
    get() = number(SQUARE_METRE_PER_SECOND.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [AMPERE_PER_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.amperePerMetre: ComparableQuantity<MagneticFieldStrength>
    get() = Quantities.getQuantity<MagneticFieldStrength>(this, AMPERE_PER_METRE)

/**
 * Builder method for [ComparableQuantity] with unit [AMPERE_PER_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.amperePerMetre: ComparableQuantity<MagneticFieldStrength>
    get() = number(AMPERE_PER_METRE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [COULOMB_PER_KILOGRAM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.coulombPerKilogram: ComparableQuantity<IonizingRadiation>
    get() = Quantities.getQuantity<IonizingRadiation>(this, COULOMB_PER_KILOGRAM)

/**
 * Builder method for [ComparableQuantity] with unit [COULOMB_PER_KILOGRAM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.coulombPerKilogram: ComparableQuantity<IonizingRadiation>
    get() = number(COULOMB_PER_KILOGRAM.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [WATT_PER_STERADIAN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.wattPerSteradian: ComparableQuantity<RadiantIntensity>
    get() = Quantities.getQuantity<RadiantIntensity>(this, WATT_PER_STERADIAN)

/**
 * Builder method for [ComparableQuantity] with unit [WATT_PER_STERADIAN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.wattPerSteradian: ComparableQuantity<RadiantIntensity>
    get() = number(WATT_PER_STERADIAN.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [WATT_PER_STERADIAN_PER_SQUARE_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.wattPerSteradianPerSquareMetre: ComparableQuantity<Radiance>
    get() = Quantities.getQuantity<Radiance>(this, WATT_PER_STERADIAN_PER_SQUARE_METRE)

/**
 * Builder method for [ComparableQuantity] with unit [WATT_PER_STERADIAN_PER_SQUARE_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.wattPerSteradianPerSquareMetre: ComparableQuantity<Radiance>
    get() = number(WATT_PER_STERADIAN_PER_SQUARE_METRE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [DEGREE_ANGLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.degreeAngle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, DEGREE_ANGLE)

/**
 * Builder method for [ComparableQuantity] with unit [MINUTE_ANGLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.minuteAngle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, MINUTE_ANGLE)

/**
 * Builder method for [ComparableQuantity] with unit [SECOND_ANGLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.secondAngle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, SECOND_ANGLE)

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
 * Builder method for [ComparableQuantity] with unit [ELECTRON_VOLT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.electronVolt: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, ELECTRON_VOLT)

/**
 * Builder method for [ComparableQuantity] with unit [ELECTRON_VOLT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.electronVolt: ComparableQuantity<Energy>
    get() = number(ELECTRON_VOLT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [UNIFIED_ATOMIC_MASS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.unifiedAtomicMass: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, UNIFIED_ATOMIC_MASS)

/**
 * Builder method for [ComparableQuantity] with unit [UNIFIED_ATOMIC_MASS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.unifiedAtomicMass: ComparableQuantity<Mass>
    get() = number(UNIFIED_ATOMIC_MASS.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [ASTRONOMICAL_UNIT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.astronomicalUnit: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ASTRONOMICAL_UNIT)

/**
 * Builder method for [ComparableQuantity] with unit [ASTRONOMICAL_UNIT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.astronomicalUnit: ComparableQuantity<Length>
    get() = number(ASTRONOMICAL_UNIT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [REVOLUTION].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.revolution: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, REVOLUTION)

/**
 * Builder method for [ComparableQuantity] with unit [REVOLUTION].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.revolution: ComparableQuantity<Angle>
    get() = number(REVOLUTION.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [HECTARE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.hectare: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, HECTARE)

/**
 * Builder method for [ComparableQuantity] with unit [HECTARE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.hectare: ComparableQuantity<Area>
    get() = number(HECTARE.transform(prefix.converter))