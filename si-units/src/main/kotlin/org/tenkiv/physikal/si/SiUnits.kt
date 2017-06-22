package org.tenkiv.physikal.si

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import si.uom.SI.*
import si.uom.SI.METRE_PER_SQUARE_SECOND
import si.uom.SI.DEGREE_ANGLE
import si.uom.SI.MINUTE_ANGLE
import si.uom.SI.SECOND_ANGLE
import si.uom.quantity.*
import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import javax.measure.quantity.*

val Number.metrePerSquareSecond: ComparableQuantity<Acceleration>
    get() = Quantities.getQuantity<Acceleration>(this, METRE_PER_SQUARE_SECOND)

val MetricPrefixedNumber.metrePerSquareSecond: ComparableQuantity<Acceleration>
    get() = number(METRE_PER_SQUARE_SECOND.transform(prefix.converter))

val Number.ampereTurn: ComparableQuantity<MagnetomotiveForce>
    get() = Quantities.getQuantity<MagnetomotiveForce>(this, AMPERE_TURN)

val MetricPrefixedNumber.ampereTurn: ComparableQuantity<MagnetomotiveForce>
    get() = number(AMPERE_TURN.transform(prefix.converter))

val Number.jouleSecond: ComparableQuantity<Action>
    get() = Quantities.getQuantity<Action>(this, JOULE_SECOND)

val MetricPrefixedNumber.jouleSecond: ComparableQuantity<Action>
    get() = number(JOULE_SECOND.transform(prefix.converter))

val Number.faradPerMetre: ComparableQuantity<ElectricPermittivity>
    get() = Quantities.getQuantity<ElectricPermittivity>(this, FARAD_PER_METRE)

val MetricPrefixedNumber.faradPerMetre: ComparableQuantity<ElectricPermittivity>
    get() = number(FARAD_PER_METRE.transform(prefix.converter))

val Number.newtonPerSquareAmpre: ComparableQuantity<MagneticPermeability>
    get() = Quantities.getQuantity<MagneticPermeability>(this, NEWTON_PER_SQUARE_AMPERE)

val MetricPrefixedNumber.newtonPerSquareAmpre: ComparableQuantity<MagneticPermeability>
    get() = number(NEWTON_PER_SQUARE_AMPERE.transform(prefix.converter))

val Number.reciprocalMetre: ComparableQuantity<WaveNumber>
    get() = Quantities.getQuantity<WaveNumber>(this, RECIPROCAL_METRE)

val MetricPrefixedNumber.reciprocalMetre: ComparableQuantity<WaveNumber>
    get() = number(RECIPROCAL_METRE.transform(prefix.converter))

val Number.pascalSecond: ComparableQuantity<DynamicViscosity>
    get() = Quantities.getQuantity<DynamicViscosity>(this, PASCAL_SECOND)

val MetricPrefixedNumber.pascalSecond: ComparableQuantity<DynamicViscosity>
    get() = number(PASCAL_SECOND.transform(prefix.converter))

val Number.candelaPerSquareMetre: ComparableQuantity<Luminance>
    get() = Quantities.getQuantity<Luminance>(this, CANDELA_PER_SQUARE_METRE)

val MetricPrefixedNumber.candelaPerSquareMetre: ComparableQuantity<Luminance>
    get() = number(CANDELA_PER_SQUARE_METRE.transform(prefix.converter))

val Number.squareMetrePerSecond: ComparableQuantity<KinematicViscosity>
    get() = Quantities.getQuantity<KinematicViscosity>(this, SQUARE_METRE_PER_SECOND)

val MetricPrefixedNumber.squareMetrePerSecond: ComparableQuantity<KinematicViscosity>
    get() = number(SQUARE_METRE_PER_SECOND.transform(prefix.converter))

val Number.amperePerMetre: ComparableQuantity<MagneticFieldStrength>
    get() = Quantities.getQuantity<MagneticFieldStrength>(this, AMPERE_PER_METRE)

val MetricPrefixedNumber.amperePerMetre: ComparableQuantity<MagneticFieldStrength>
    get() = number(AMPERE_PER_METRE.transform(prefix.converter))

val Number.coulombPerKilogram: ComparableQuantity<IonizingRadiation>
    get() = Quantities.getQuantity<IonizingRadiation>(this, COULOMB_PER_KILOGRAM)

val MetricPrefixedNumber.coulombPerKilogram: ComparableQuantity<IonizingRadiation>
    get() = number(COULOMB_PER_KILOGRAM.transform(prefix.converter))

val Number.wattPerSteradian: ComparableQuantity<RadiantIntensity>
    get() = Quantities.getQuantity<RadiantIntensity>(this, WATT_PER_STERADIAN)

val MetricPrefixedNumber.wattPerSteradian: ComparableQuantity<RadiantIntensity>
    get() = number(WATT_PER_STERADIAN.transform(prefix.converter))

val Number.wattPerSteradianPerSquareMetre: ComparableQuantity<Radiance>
    get() = Quantities.getQuantity<Radiance>(this, WATT_PER_STERADIAN_PER_SQUARE_METRE)

val MetricPrefixedNumber.wattPerSteradianPerSquareMetre: ComparableQuantity<Radiance>
    get() = number(WATT_PER_STERADIAN_PER_SQUARE_METRE.transform(prefix.converter))

val Number.degreeAngle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, DEGREE_ANGLE)

val Number.minuteAngle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, MINUTE_ANGLE)

val Number.secondAngle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, SECOND_ANGLE)

val Number.tonne: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, TONNE)

val MetricPrefixedNumber.tonne: ComparableQuantity<Mass>
    get() = number(TONNE.transform(prefix.converter))

val Number.electronVolt: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, ELECTRON_VOLT)

val MetricPrefixedNumber.electronVolt: ComparableQuantity<Energy>
    get() = number(ELECTRON_VOLT.transform(prefix.converter))

val Number.unifiedAtomicMass: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, UNIFIED_ATOMIC_MASS)

val MetricPrefixedNumber.unifiedAtomicMass: ComparableQuantity<Mass>
    get() = number(UNIFIED_ATOMIC_MASS.transform(prefix.converter))

val Number.astronomicalUnit: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ASTRONOMICAL_UNIT)

val MetricPrefixedNumber.astronomicalUnit: ComparableQuantity<Length>
    get() = number(ASTRONOMICAL_UNIT.transform(prefix.converter))

val Number.revolution: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, REVOLUTION)

val MetricPrefixedNumber.revolution: ComparableQuantity<Angle>
    get() = number(REVOLUTION.transform(prefix.converter))

val Number.hectare: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, HECTARE)

val MetricPrefixedNumber.hectare: ComparableQuantity<Area>
    get() = number(HECTARE.transform(prefix.converter))