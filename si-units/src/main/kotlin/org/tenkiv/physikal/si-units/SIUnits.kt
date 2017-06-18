package org.tenkiv.physikal.`si-units`

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

val Number.metre_per_square_second: ComparableQuantity<Acceleration>
    get() = Quantities.getQuantity<Acceleration>(this, METRE_PER_SQUARE_SECOND)

val MetricPrefixedNumber.metre_per_square_second: ComparableQuantity<Acceleration>
    get() = number(METRE_PER_SQUARE_SECOND.transform(prefix.converter))

val Number.ampere_turn: ComparableQuantity<MagnetomotiveForce>
    get() = Quantities.getQuantity<MagnetomotiveForce>(this, AMPERE_TURN)

val MetricPrefixedNumber.ampere_turn: ComparableQuantity<MagnetomotiveForce>
    get() = number(AMPERE_TURN.transform(prefix.converter))

val Number.joule_second: ComparableQuantity<Action>
    get() = Quantities.getQuantity<Action>(this, JOULE_SECOND)

val MetricPrefixedNumber.joule_second: ComparableQuantity<Action>
    get() = number(JOULE_SECOND.transform(prefix.converter))

val Number.farad_per_metre: ComparableQuantity<ElectricPermittivity>
    get() = Quantities.getQuantity<ElectricPermittivity>(this, FARAD_PER_METRE)

val MetricPrefixedNumber.farad_per_metre: ComparableQuantity<ElectricPermittivity>
    get() = number(FARAD_PER_METRE.transform(prefix.converter))

val Number.newton_per_square_ampre: ComparableQuantity<MagneticPermeability>
    get() = Quantities.getQuantity<MagneticPermeability>(this, NEWTON_PER_SQUARE_AMPERE)

val MetricPrefixedNumber.newton_per_square_ampre: ComparableQuantity<MagneticPermeability>
    get() = number(NEWTON_PER_SQUARE_AMPERE.transform(prefix.converter))

val Number.reciprocal_metre: ComparableQuantity<WaveNumber>
    get() = Quantities.getQuantity<WaveNumber>(this, RECIPROCAL_METRE)

val MetricPrefixedNumber.reciprocal_metre: ComparableQuantity<WaveNumber>
    get() = number(RECIPROCAL_METRE.transform(prefix.converter))

val Number.pascal_second: ComparableQuantity<DynamicViscosity>
    get() = Quantities.getQuantity<DynamicViscosity>(this, PASCAL_SECOND)

val MetricPrefixedNumber.pascal_second: ComparableQuantity<DynamicViscosity>
    get() = number(PASCAL_SECOND.transform(prefix.converter))

val Number.candela_per_square_metre: ComparableQuantity<Luminance>
    get() = Quantities.getQuantity<Luminance>(this, CANDELA_PER_SQUARE_METRE)

val MetricPrefixedNumber.candela_per_square_metre: ComparableQuantity<Luminance>
    get() = number(CANDELA_PER_SQUARE_METRE.transform(prefix.converter))

val Number.square_metre_per_second: ComparableQuantity<KinematicViscosity>
    get() = Quantities.getQuantity<KinematicViscosity>(this, SQUARE_METRE_PER_SECOND)

val MetricPrefixedNumber.square_metre_per_second: ComparableQuantity<KinematicViscosity>
    get() = number(SQUARE_METRE_PER_SECOND.transform(prefix.converter))

val Number.ampere_per_metre: ComparableQuantity<MagneticFieldStrength>
    get() = Quantities.getQuantity<MagneticFieldStrength>(this, AMPERE_PER_METRE)

val MetricPrefixedNumber.ampere_per_metre: ComparableQuantity<MagneticFieldStrength>
    get() = number(AMPERE_PER_METRE.transform(prefix.converter))

val Number.coulomb_per_kilogram: ComparableQuantity<IonizingRadiation>
    get() = Quantities.getQuantity<IonizingRadiation>(this, COULOMB_PER_KILOGRAM)

val MetricPrefixedNumber.coulomb_per_kilogram: ComparableQuantity<IonizingRadiation>
    get() = number(COULOMB_PER_KILOGRAM.transform(prefix.converter))

val Number.watt_per_steradian: ComparableQuantity<RadiantIntensity>
    get() = Quantities.getQuantity<RadiantIntensity>(this, WATT_PER_STERADIAN)

val MetricPrefixedNumber.watt_per_steradian: ComparableQuantity<RadiantIntensity>
    get() = number(WATT_PER_STERADIAN.transform(prefix.converter))

val Number.watt_per_steradian_per_square_metre: ComparableQuantity<Radiance>
    get() = Quantities.getQuantity<Radiance>(this, WATT_PER_STERADIAN_PER_SQUARE_METRE)

val MetricPrefixedNumber.watt_per_steradian_per_square_metre: ComparableQuantity<Radiance>
    get() = number(WATT_PER_STERADIAN_PER_SQUARE_METRE.transform(prefix.converter))

val Number.degree_angle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, DEGREE_ANGLE)

val MetricPrefixedNumber.degree_angle: ComparableQuantity<Angle>
    get() = number(DEGREE_ANGLE.transform(prefix.converter))

val Number.minute_angle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, MINUTE_ANGLE)

val MetricPrefixedNumber.minute_angle: ComparableQuantity<Angle>
    get() = number(MINUTE_ANGLE.transform(prefix.converter))

val Number.second_angle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, SECOND_ANGLE)

val MetricPrefixedNumber.second_angle: ComparableQuantity<Angle>
    get() = number(SECOND_ANGLE.transform(prefix.converter))

val Number.tonne: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, TONNE)

val MetricPrefixedNumber.tonne: ComparableQuantity<Mass>
    get() = number(TONNE.transform(prefix.converter))

val Number.electron_volt: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, ELECTRON_VOLT)

val MetricPrefixedNumber.electron_volt: ComparableQuantity<Energy>
    get() = number(ELECTRON_VOLT.transform(prefix.converter))

val Number.unified_atomic_mass: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, UNIFIED_ATOMIC_MASS)

val MetricPrefixedNumber.unified_atomic_mass: ComparableQuantity<Mass>
    get() = number(UNIFIED_ATOMIC_MASS.transform(prefix.converter))

val Number.astronomical_unit: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ASTRONOMICAL_UNIT)

val MetricPrefixedNumber.astronomical_unit: ComparableQuantity<Length>
    get() = number(ASTRONOMICAL_UNIT.transform(prefix.converter))

val Number.revolution: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, REVOLUTION)

val MetricPrefixedNumber.revolution: ComparableQuantity<Angle>
    get() = number(REVOLUTION.transform(prefix.converter))

val Number.hectare: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, HECTARE)

val MetricPrefixedNumber.hectare: ComparableQuantity<Area>
    get() = number(HECTARE.transform(prefix.converter))