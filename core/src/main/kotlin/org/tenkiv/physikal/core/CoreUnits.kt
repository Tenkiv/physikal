package org.tenkiv.physikal.core

import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import tec.uom.se.unit.Units.*
import javax.measure.quantity.*

/**
 * Builder method for [ComparableQuantity] with unit [AMPERE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ampere: ComparableQuantity<ElectricCurrent>
    get() = Quantities.getQuantity<ElectricCurrent>(this, AMPERE)

/**
 * Builder method for [ComparableQuantity] with unit [AMPERE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.ampere: ComparableQuantity<ElectricCurrent>
    get() = number(AMPERE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CANDELA].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.candela: ComparableQuantity<LuminousIntensity>
    get() = Quantities.getQuantity<LuminousIntensity>(this, CANDELA)

/**
 * Builder method for [ComparableQuantity] with unit [CANDELA].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.candela: ComparableQuantity<LuminousIntensity>
    get() = number(CANDELA.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [KELVIN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.kelvin: ComparableQuantity<Temperature>
    get() = Quantities.getQuantity<Temperature>(this, KELVIN)

/**
 * Builder method for [ComparableQuantity] with unit [KELVIN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.kelvin: ComparableQuantity<Temperature>
    get() = number(KELVIN.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [KILOGRAM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.kilogram: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, KILOGRAM)

/**
 * Builder method for [ComparableQuantity] with unit [KILOGRAM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.kilogram: ComparableQuantity<Mass>
    get() = number(KILOGRAM.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [GRAM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gram: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, GRAM)

/**
 * Builder method for [ComparableQuantity] with unit [GRAM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.gram: ComparableQuantity<Mass>
    get() = number(GRAM.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.metre: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, METRE)

/**
 * Builder method for [ComparableQuantity] with unit [METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.metre: ComparableQuantity<Length>
    get() = number(METRE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [MOLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.mole: ComparableQuantity<AmountOfSubstance>
    get() = Quantities.getQuantity<AmountOfSubstance>(this, MOLE)

/**
 * Builder method for [ComparableQuantity] with unit [MOLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.mole: ComparableQuantity<AmountOfSubstance>
    get() = number(MOLE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.second: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, SECOND)

/**
 * Builder method for [ComparableQuantity] with unit [SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.second: ComparableQuantity<Time>
    get() = number(SECOND.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [RADIAN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.radian: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, RADIAN)

/**
 * Builder method for [ComparableQuantity] with unit [RADIAN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.radian: ComparableQuantity<Angle>
    get() = number(RADIAN.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [STERADIAN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.steradian: ComparableQuantity<SolidAngle>
    get() = Quantities.getQuantity<SolidAngle>(this, STERADIAN)

/**
 * Builder method for [ComparableQuantity] with unit [STERADIAN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.steradian: ComparableQuantity<SolidAngle>
    get() = number(STERADIAN.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [HERTZ].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.hertz: ComparableQuantity<Frequency>
    get() = Quantities.getQuantity<Frequency>(this, HERTZ)

/**
 * Builder method for [ComparableQuantity] with unit [HERTZ].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.hertz: ComparableQuantity<Frequency>
    get() = number(HERTZ.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [NEWTON].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.newton: ComparableQuantity<Force>
    get() = Quantities.getQuantity<Force>(this, NEWTON)

/**
 * Builder method for [ComparableQuantity] with unit [NEWTON].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.newton: ComparableQuantity<Force>
    get() = number(NEWTON.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [PASCAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.pascal: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, PASCAL)

/**
 * Builder method for [ComparableQuantity] with unit [PASCAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.pascal: ComparableQuantity<Pressure>
    get() = number(PASCAL.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [JOULE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.joule: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, JOULE)

/**
 * Builder method for [ComparableQuantity] with unit [JOULE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.joule: ComparableQuantity<Energy>
    get() = number(JOULE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [WATT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.watt: ComparableQuantity<Power>
    get() = Quantities.getQuantity<Power>(this, WATT)

/**
 * Builder method for [ComparableQuantity] with unit [WATT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.watt: ComparableQuantity<Power>
    get() = number(WATT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [COULOMB].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.coulomb: ComparableQuantity<ElectricCharge>
    get() = Quantities.getQuantity<ElectricCharge>(this, COULOMB)

/**
 * Builder method for [ComparableQuantity] with unit [COULOMB].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.coulomb: ComparableQuantity<ElectricCharge>
    get() = number(COULOMB.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [VOLT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.volt: ComparableQuantity<ElectricPotential>
    get() = Quantities.getQuantity<ElectricPotential>(this, VOLT)

/**
 * Builder method for [ComparableQuantity] with unit [VOLT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.volt: ComparableQuantity<ElectricPotential>
    get() = number(VOLT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [FARAD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.farad: ComparableQuantity<ElectricCapacitance>
    get() = Quantities.getQuantity<ElectricCapacitance>(this, FARAD)

/**
 * Builder method for [ComparableQuantity] with unit [FARAD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.farad: ComparableQuantity<ElectricCapacitance>
    get() = number(FARAD.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [OHM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ohm: ComparableQuantity<ElectricResistance>
    get() = Quantities.getQuantity<ElectricResistance>(this, OHM)

/**
 * Builder method for [ComparableQuantity] with unit [OHM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.ohm: ComparableQuantity<ElectricResistance>
    get() = number(OHM.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [SIEMENS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.siemens: ComparableQuantity<ElectricConductance>
    get() = Quantities.getQuantity<ElectricConductance>(this, SIEMENS)

/**
 * Builder method for [ComparableQuantity] with unit [SIEMENS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.siemens: ComparableQuantity<ElectricConductance>
    get() = number(SIEMENS.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [WEBER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.weber: ComparableQuantity<MagneticFlux>
    get() = Quantities.getQuantity<MagneticFlux>(this, WEBER)

/**
 * Builder method for [ComparableQuantity] with unit [WEBER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.weber: ComparableQuantity<MagneticFlux>
    get() = number(WEBER.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [TESLA].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.tesla: ComparableQuantity<MagneticFluxDensity>
    get() = Quantities.getQuantity<MagneticFluxDensity>(this, TESLA)

/**
 * Builder method for [ComparableQuantity] with unit [TESLA].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.tesla: ComparableQuantity<MagneticFluxDensity>
    get() = number(TESLA.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [HENRY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.henry: ComparableQuantity<ElectricInductance>
    get() = Quantities.getQuantity<ElectricInductance>(this, HENRY)

/**
 * Builder method for [ComparableQuantity] with unit [HENRY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.henry: ComparableQuantity<ElectricInductance>
    get() = number(HENRY.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CELSIUS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.celsius: ComparableQuantity<Temperature>
    get() = Quantities.getQuantity<Temperature>(this, CELSIUS)

/**
 * Builder method for [ComparableQuantity] with unit [LUMEN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.lumen: ComparableQuantity<LuminousFlux>
    get() = Quantities.getQuantity<LuminousFlux>(this, LUMEN)

/**
 * Builder method for [ComparableQuantity] with unit [LUMEN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.lumen: ComparableQuantity<LuminousFlux>
    get() = number(LUMEN.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [LUX].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.lux: ComparableQuantity<Illuminance>
    get() = Quantities.getQuantity<Illuminance>(this, LUX)

/**
 * Builder method for [ComparableQuantity] with unit [LUX].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.lux: ComparableQuantity<Illuminance>
    get() = number(LUX.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BECQUEREL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.becquerel: ComparableQuantity<Radioactivity>
    get() = Quantities.getQuantity<Radioactivity>(this, BECQUEREL)

/**
 * Builder method for [ComparableQuantity] with unit [BECQUEREL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.becquerel: ComparableQuantity<Radioactivity>
    get() = number(BECQUEREL.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [GRAY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.grey: ComparableQuantity<RadiationDoseAbsorbed>
    get() = Quantities.getQuantity<RadiationDoseAbsorbed>(this, GRAY)

/**
 * Builder method for [ComparableQuantity] with unit [GRAY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.grey: ComparableQuantity<RadiationDoseAbsorbed>
    get() = number(GRAY.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [SIEVERT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.sievert: ComparableQuantity<RadiationDoseEffective>
    get() = Quantities.getQuantity<RadiationDoseEffective>(this, SIEVERT)

/**
 * Builder method for [ComparableQuantity] with unit [SIEVERT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.sievert: ComparableQuantity<RadiationDoseEffective>
    get() = number(SIEVERT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [KATAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.katal: ComparableQuantity<CatalyticActivity>
    get() = Quantities.getQuantity<CatalyticActivity>(this, KATAL)

/**
 * Builder method for [ComparableQuantity] with unit [KATAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.katal: ComparableQuantity<CatalyticActivity>
    get() = number(KATAL.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [METRE_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.metrePerSecond: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, METRE_PER_SECOND)

/**
 * Builder method for [ComparableQuantity] with unit [METRE_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.metrePerSecond: ComparableQuantity<Speed>
    get() = number(METRE_PER_SECOND.transform(prefix.converter))

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
 * Builder method for [ComparableQuantity] with unit [SQUARE_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.squareMetre: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_METRE)

/**
 * Builder method for [ComparableQuantity] with unit [SQUARE_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.squareMetre: ComparableQuantity<Area>
    get() = number(SQUARE_METRE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CUBIC_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.cubicMetre: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_METRE)

/**
 * Builder method for [ComparableQuantity] with unit [CUBIC_METRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.cubicMetre: ComparableQuantity<Volume>
    get() = number(CUBIC_METRE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [KILOMETRE_PER_HOUR].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.kilometrePerHour: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, KILOMETRE_PER_HOUR)

/**
 * Builder method for [ComparableQuantity] with unit [KILOMETRE_PER_HOUR].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.kilometrePerHour: ComparableQuantity<Speed>
    get() = number(KILOMETRE_PER_HOUR.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [PERCENT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.percent: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PERCENT)

/**
 * Builder method for [ComparableQuantity] with unit [MINUTE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.minute: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MINUTE)

/**
 * Builder method for [ComparableQuantity] with unit [MINUTE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.minute: ComparableQuantity<Time>
    get() = number(MINUTE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [HOUR].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.hour: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, HOUR)

/**
 * Builder method for [ComparableQuantity] with unit [HOUR].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.hour: ComparableQuantity<Time>
    get() = number(HOUR.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [DAY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.day: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, DAY)

/**
 * Builder method for [ComparableQuantity] with unit [WEEK].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.week: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, WEEK)

/**
 * Builder method for [ComparableQuantity] with unit [YEAR].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.year: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR)

/**
 * Builder method for [ComparableQuantity] with unit [LITRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.litre: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, LITRE)

/**
 * Builder method for [ComparableQuantity] with unit [LITRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.litre: ComparableQuantity<Volume>
    get() = number(LITRE.transform(prefix.converter))