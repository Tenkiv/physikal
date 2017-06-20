package org.tenkiv.physikal.core

import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import tec.uom.se.unit.Units.*
import javax.measure.quantity.*

val Number.ampere: ComparableQuantity<ElectricCurrent>
    get() = Quantities.getQuantity<ElectricCurrent>(this, AMPERE)

val MetricPrefixedNumber.ampere: ComparableQuantity<ElectricCurrent>
    get() = number(AMPERE.transform(prefix.converter))

val Number.candela: ComparableQuantity<LuminousIntensity>
    get() = Quantities.getQuantity<LuminousIntensity>(this, CANDELA)

val MetricPrefixedNumber.candela: ComparableQuantity<LuminousIntensity>
    get() = number(CANDELA.transform(prefix.converter))

val Number.kelvin: ComparableQuantity<Temperature>
    get() = Quantities.getQuantity<Temperature>(this, KELVIN)

val MetricPrefixedNumber.kelvin: ComparableQuantity<Temperature>
    get() = number(KELVIN.transform(prefix.converter))

val Number.kilogram: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, KILOGRAM)

val MetricPrefixedNumber.kilogram: ComparableQuantity<Mass>
    get() = number(KILOGRAM.transform(prefix.converter))

val Number.gram: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, GRAM)

val MetricPrefixedNumber.gram: ComparableQuantity<Mass>
    get() = number(GRAM.transform(prefix.converter))

val Number.metre: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, METRE)

val MetricPrefixedNumber.metre: ComparableQuantity<Length>
    get() = number(METRE.transform(prefix.converter))

val Number.mole: ComparableQuantity<AmountOfSubstance>
    get() = Quantities.getQuantity<AmountOfSubstance>(this, MOLE)

val MetricPrefixedNumber.mole: ComparableQuantity<AmountOfSubstance>
    get() = number(MOLE.transform(prefix.converter))

val Number.second: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, SECOND)

val Number.radian: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, RADIAN)

val MetricPrefixedNumber.radian: ComparableQuantity<Angle>
    get() = number(RADIAN.transform(prefix.converter))

val Number.steradian: ComparableQuantity<SolidAngle>
    get() = Quantities.getQuantity<SolidAngle>(this, STERADIAN)

val MetricPrefixedNumber.steradian: ComparableQuantity<SolidAngle>
    get() = number(STERADIAN.transform(prefix.converter))

val Number.hertz: ComparableQuantity<Frequency>
    get() = Quantities.getQuantity<Frequency>(this, HERTZ)

val MetricPrefixedNumber.hertz: ComparableQuantity<Frequency>
    get() = number(HERTZ.transform(prefix.converter))

val Number.newton: ComparableQuantity<Force>
    get() = Quantities.getQuantity<Force>(this, NEWTON)

val MetricPrefixedNumber.newton: ComparableQuantity<Force>
    get() = number(NEWTON.transform(prefix.converter))

val Number.pascal: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, PASCAL)

val MetricPrefixedNumber.pascal: ComparableQuantity<Pressure>
    get() = number(PASCAL.transform(prefix.converter))

val Number.joule: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, JOULE)

val MetricPrefixedNumber.joule: ComparableQuantity<Energy>
    get() = number(JOULE.transform(prefix.converter))

val Number.watt: ComparableQuantity<Power>
    get() = Quantities.getQuantity<Power>(this, WATT)

val MetricPrefixedNumber.watt: ComparableQuantity<Power>
    get() = number(WATT.transform(prefix.converter))

val Number.coulomb: ComparableQuantity<ElectricCharge>
    get() = Quantities.getQuantity<ElectricCharge>(this, COULOMB)

val MetricPrefixedNumber.coulomb: ComparableQuantity<ElectricCharge>
    get() = number(COULOMB.transform(prefix.converter))

val Number.volt: ComparableQuantity<ElectricPotential>
    get() = Quantities.getQuantity<ElectricPotential>(this, VOLT)

val MetricPrefixedNumber.volt: ComparableQuantity<ElectricPotential>
    get() = number(VOLT.transform(prefix.converter))

val Number.farad: ComparableQuantity<ElectricCapacitance>
    get() = Quantities.getQuantity<ElectricCapacitance>(this, FARAD)

val MetricPrefixedNumber.farad: ComparableQuantity<ElectricCapacitance>
    get() = number(FARAD.transform(prefix.converter))

val Number.ohm: ComparableQuantity<ElectricResistance>
    get() = Quantities.getQuantity<ElectricResistance>(this, OHM)

val MetricPrefixedNumber.ohm: ComparableQuantity<ElectricResistance>
    get() = number(OHM.transform(prefix.converter))

val Number.siemens: ComparableQuantity<ElectricConductance>
    get() = Quantities.getQuantity<ElectricConductance>(this, SIEMENS)

val MetricPrefixedNumber.siemens: ComparableQuantity<ElectricConductance>
    get() = number(SIEMENS.transform(prefix.converter))

val Number.weber: ComparableQuantity<MagneticFlux>
    get() = Quantities.getQuantity<MagneticFlux>(this, WEBER)

val MetricPrefixedNumber.weber: ComparableQuantity<MagneticFlux>
    get() = number(WEBER.transform(prefix.converter))

val Number.tesla: ComparableQuantity<MagneticFluxDensity>
    get() = Quantities.getQuantity<MagneticFluxDensity>(this, TESLA)

val MetricPrefixedNumber.tesla: ComparableQuantity<MagneticFluxDensity>
    get() = number(TESLA.transform(prefix.converter))

val Number.henry: ComparableQuantity<ElectricInductance>
    get() = Quantities.getQuantity<ElectricInductance>(this, HENRY)

val MetricPrefixedNumber.henry: ComparableQuantity<ElectricInductance>
    get() = number(HENRY.transform(prefix.converter))

val Number.celsius: ComparableQuantity<Temperature>
    get() = Quantities.getQuantity<Temperature>(this, CELSIUS)

val Number.lumen: ComparableQuantity<LuminousFlux>
    get() = Quantities.getQuantity<LuminousFlux>(this, LUMEN)

val MetricPrefixedNumber.lumen: ComparableQuantity<LuminousFlux>
    get() = number(LUMEN.transform(prefix.converter))

val Number.lux: ComparableQuantity<Illuminance>
    get() = Quantities.getQuantity<Illuminance>(this, LUX)

val MetricPrefixedNumber.lux: ComparableQuantity<Illuminance>
    get() = number(LUX.transform(prefix.converter))

val Number.becquerel: ComparableQuantity<Radioactivity>
    get() = Quantities.getQuantity<Radioactivity>(this, BECQUEREL)

val MetricPrefixedNumber.becquerel: ComparableQuantity<Radioactivity>
    get() = number(BECQUEREL.transform(prefix.converter))

val Number.grey: ComparableQuantity<RadiationDoseAbsorbed>
    get() = Quantities.getQuantity<RadiationDoseAbsorbed>(this, GRAY)

val MetricPrefixedNumber.grey: ComparableQuantity<RadiationDoseAbsorbed>
    get() = number(GRAY.transform(prefix.converter))

val Number.sievert: ComparableQuantity<RadiationDoseEffective>
    get() = Quantities.getQuantity<RadiationDoseEffective>(this, SIEVERT)

val MetricPrefixedNumber.sievert: ComparableQuantity<RadiationDoseEffective>
    get() = number(SIEVERT.transform(prefix.converter))

val Number.katal: ComparableQuantity<CatalyticActivity>
    get() = Quantities.getQuantity<CatalyticActivity>(this, KATAL)

val MetricPrefixedNumber.katal: ComparableQuantity<CatalyticActivity>
    get() = number(KATAL.transform(prefix.converter))

val Number.metrePerSecond: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, METRE_PER_SECOND)

val MetricPrefixedNumber.metrePerSecond: ComparableQuantity<Speed>
    get() = number(METRE_PER_SECOND.transform(prefix.converter))

val Number.metrePerSquareSecond: ComparableQuantity<Acceleration>
    get() = Quantities.getQuantity<Acceleration>(this, METRE_PER_SQUARE_SECOND)

val MetricPrefixedNumber.metrePerSquareSecond: ComparableQuantity<Acceleration>
    get() = number(METRE_PER_SQUARE_SECOND.transform(prefix.converter))

val Number.squareMetre: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_METRE)

val MetricPrefixedNumber.squareMetre: ComparableQuantity<Area>
    get() = number(SQUARE_METRE.transform(prefix.converter))

val Number.cubicMetre: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_METRE)

val MetricPrefixedNumber.cubicMetre: ComparableQuantity<Volume>
    get() = number(CUBIC_METRE.transform(prefix.converter))

val Number.kilometrePerHour: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, KILOMETRE_PER_HOUR)

val MetricPrefixedNumber.kilometrePerHour: ComparableQuantity<Speed>
    get() = number(KILOMETRE_PER_HOUR.transform(prefix.converter))

val Number.percent: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PERCENT)

val Number.minute: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MINUTE)

val Number.hour: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, HOUR)

val Number.day: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, DAY)

val Number.week: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, WEEK)

val Number.year: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR)

val Number.litre: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, LITRE)

val MetricPrefixedNumber.litre: ComparableQuantity<Volume>
    get() = number(LITRE.transform(prefix.converter))