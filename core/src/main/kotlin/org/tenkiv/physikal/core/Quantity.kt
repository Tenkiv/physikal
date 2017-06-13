package org.tenkiv.physikal.core


import org.tenkiv.coral.ValueInstant
import tec.uom.se.ComparableQuantity
import tec.uom.se.function.MultiplyConverter
import tec.uom.se.quantity.Quantities
import tec.uom.se.unit.AlternateUnit
import tec.uom.se.unit.MetricPrefix
import tec.uom.se.unit.MetricPrefix.*
import tec.uom.se.unit.TransformedUnit
import tec.uom.se.unit.Units.*
import javax.measure.Quantity
import javax.measure.Unit
import javax.measure.quantity.*

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
//   ⎍⎍⎍⎍⎍⎍⎍⎍   ஃ Quantity Type Aliases ஃ   ⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍    //
//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
typealias QuantityMeasurement<Q> = ValueInstant<ComparableQuantity<Q>>

typealias ClosedQuantityRange<Q> = ClosedRange<ComparableQuantity<Q>>

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
//   ⎍⎍⎍⎍⎍⎍⎍⎍   ஃ Additional Units ஃ   ⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍    //
//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
val CUBIC_METRES_PER_SECOND = AlternateUnit<FlowRate>(METRE.pow(3) / SECOND, "m\u00B3/s")
val WATT_PER_SQUARE_METRE = AlternateUnit<Irradiance>(WATT / METRE.pow(2), "W/m\u00B2")
val DEGREE = TransformedUnit<Angle>("deg", RADIAN, MultiplyConverter(Math.PI / 180))

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
//   ⎍⎍⎍⎍⎍⎍⎍⎍   ஃ Quantity Builder Extensions ஃ   ⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍    //
//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
// All builtin units

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

val MetricPrefixedNumber.second: ComparableQuantity<Time>
    get() = number(SECOND.transform(prefix.converter))

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

val MetricPrefixedNumber.celsius: ComparableQuantity<Temperature>
    get() = number(CELSIUS.transform(prefix.converter))

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

val Number.metre_per_second: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, METRE_PER_SECOND)

val MetricPrefixedNumber.metre_per_second: ComparableQuantity<Speed>
    get() = number(METRE_PER_SECOND.transform(prefix.converter))

val Number.metre_per_square_second: ComparableQuantity<Acceleration>
    get() = Quantities.getQuantity<Acceleration>(this, METRE_PER_SQUARE_SECOND)

val MetricPrefixedNumber.metre_per_square_second: ComparableQuantity<Acceleration>
    get() = number(METRE_PER_SQUARE_SECOND.transform(prefix.converter))

val Number.square_metre: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_METRE)

val MetricPrefixedNumber.square_metre: ComparableQuantity<Area>
    get() = number(SQUARE_METRE.transform(prefix.converter))

val Number.cubic_metre: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_METRE)

val MetricPrefixedNumber.cubic_metre: ComparableQuantity<Volume>
    get() = number(CUBIC_METRE.transform(prefix.converter))

val Number.kilometre_per_hour: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, KILOMETRE_PER_HOUR)

val MetricPrefixedNumber.kilometre_per_hour: ComparableQuantity<Speed>
    get() = number(KILOMETRE_PER_HOUR.transform(prefix.converter))

val Number.percent: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PERCENT)

val MetricPrefixedNumber.percent: ComparableQuantity<Dimensionless>
    get() = number(PERCENT.transform(prefix.converter))

val Number.minute: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MINUTE)

val MetricPrefixedNumber.minute: ComparableQuantity<Time>
    get() = number(MINUTE.transform(prefix.converter))

val Number.hour: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, HOUR)

val MetricPrefixedNumber.hour: ComparableQuantity<Time>
    get() = number(HOUR.transform(prefix.converter))

val Number.day: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, DAY)

val MetricPrefixedNumber.day: ComparableQuantity<Time>
    get() = number(DAY.transform(prefix.converter))

val Number.week: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, WEEK)

val MetricPrefixedNumber.week: ComparableQuantity<Time>
    get() = number(WEEK.transform(prefix.converter))

val Number.year: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR)

val MetricPrefixedNumber.year: ComparableQuantity<Time>
    get() = number(YEAR.transform(prefix.converter))

val Number.litre: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, LITRE)

val MetricPrefixedNumber.litre: ComparableQuantity<Volume>
    get() = number(LITRE.transform(prefix.converter))


// All builtin prefixes
val Number.zetta get() = MetricPrefixedNumber(this, ZETTA)

val Number.exa get() = MetricPrefixedNumber(this, EXA)

val Number.peta get() = MetricPrefixedNumber(this, PETA)

val Number.tera get() = MetricPrefixedNumber(this, TERA)

val Number.giga get() = MetricPrefixedNumber(this, GIGA)

val Number.mega get() = MetricPrefixedNumber(this, MEGA)

val Number.kilo get() = MetricPrefixedNumber(this, KILO)

val Number.hecto get() = MetricPrefixedNumber(this, HECTO)

val Number.deka get() = MetricPrefixedNumber(this, DEKA)

val Number.deci get() = MetricPrefixedNumber(this, DECI)

val Number.centi get() = MetricPrefixedNumber(this, CENTI)

val Number.milli get() = MetricPrefixedNumber(this, MILLI)

val Number.micro get() = MetricPrefixedNumber(this, MICRO)

val Number.nano get() = MetricPrefixedNumber(this, NANO)

val Number.pico get() = MetricPrefixedNumber(this, PICO)

val Number.femto get() = MetricPrefixedNumber(this, FEMTO)

val Number.atto get() = MetricPrefixedNumber(this, ATTO)

val Number.zepto get() = MetricPrefixedNumber(this, ZEPTO)

val Number.yocto get() = MetricPrefixedNumber(this, YOCTO)

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
//   ⎍⎍⎍⎍⎍⎍⎍⎍   ஃ Number Extension Functions ஃ   ⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍    //
//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
operator fun <Q : Quantity<Q>> Number.invoke(unit: Unit<Q>): ComparableQuantity<Q> =
        Quantities.getQuantity(this, unit)

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
//   ⎍⎍⎍⎍⎍⎍⎍⎍   ஃ Unit Extension Functions ஃ   ⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍    //
//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
operator fun <Q : Quantity<Q>> Unit<Q>.times(multiplier: Double): Unit<Q> = multiply(multiplier)

operator fun Unit<*>.times(multiplier: Unit<*>): Unit<*> = multiply(multiplier)

operator fun <Q : Quantity<Q>> Unit<Q>.div(divisor: Double): Unit<Q> = divide(divisor)

operator fun Unit<*>.div(divisor: Unit<*>): Unit<*> = divide(divisor)

inline fun <reified Q : Quantity<Q>> Unit<*>.asType(): Unit<Q> = asType(Q::class.java)

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
//   ⎍⎍⎍⎍⎍⎍⎍⎍   ஃ Quantity Extension Functions ஃ   ⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍    //
//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
// Quantity extensions
inline fun <reified Q : Quantity<Q>> Quantity<*>.asType(): Quantity<Q> = asType(Q::class.java)

fun <Q : Quantity<Q>> Quantity<Q>.asComparable(): ComparableQuantity<Q> =
        if (this is ComparableQuantity) this else value(unit)

operator fun <Q : Quantity<Q>> Quantity<Q>.unaryPlus(): ComparableQuantity<Q> = (+value.toDouble())(unit)

operator fun <Q : Quantity<Q>> Quantity<Q>.unaryMinus(): ComparableQuantity<Q> = (-value.toDouble())(unit)

operator fun <Q : Quantity<Q>> Quantity<Q>.inc(): Quantity<Q> = this + 1(unit)

operator fun <Q : Quantity<Q>> Quantity<Q>.dec(): Quantity<Q> = this - 1(unit)

operator fun <Q : Quantity<Q>> Quantity<Q>.plus(augend: Quantity<Q>): Quantity<Q> = add(augend)

operator fun <Q : Quantity<Q>> Quantity<Q>.minus(subtrahend: Quantity<Q>): Quantity<Q> = subtract(subtrahend)

operator fun Quantity<*>.times(multiplier: Quantity<*>): Quantity<*> = multiply(multiplier)

operator fun <Q : Quantity<Q>> Quantity<Q>.times(multiplier: Number): Quantity<Q> = multiply(multiplier)

operator fun Quantity<*>.div(divisor: Quantity<*>): Quantity<*> = divide(divisor)

operator fun <Q : Quantity<Q>> Quantity<Q>.div(divisor: Number): Quantity<Q> = divide(divisor)

infix fun <Q : Quantity<Q>> Quantity<Q>.tu(unit: Unit<Q>): Quantity<Q> = to(unit)

fun Quantity<*>.toDouble() = getValue().toDouble()

fun Quantity<*>.toFloat() = getValue().toFloat()

fun Quantity<*>.toLong() = getValue().toLong()

fun Quantity<*>.toInt() = getValue().toInt()

fun Quantity<*>.toShort() = getValue().toShort()

fun Quantity<*>.toByte() = getValue().toByte()

fun <Q : Quantity<Q>> Quantity<Q>.toDoubleIn(unit: Unit<Q>) = to(unit).toDouble()

fun <Q : Quantity<Q>> Quantity<Q>.toFloatIn(unit: Unit<Q>) = to(unit).toFloat()

fun <Q : Quantity<Q>> Quantity<Q>.toLongIn(unit: Unit<Q>) = to(unit).toLong()

fun <Q : Quantity<Q>> Quantity<Q>.toIntIn(unit: Unit<Q>) = to(unit).toInt()

fun <Q : Quantity<Q>> Quantity<Q>.toShortIn(unit: Unit<Q>) = to(unit).toShort()

fun <Q : Quantity<Q>> Quantity<Q>.toByteIn(unit: Unit<Q>) = to(unit).toByte()

// ComparableQuantity extensions
inline fun <reified Q : Quantity<Q>> ComparableQuantity<*>.asType(): ComparableQuantity<Q> = asType(Q::class.java)

operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.inc(): ComparableQuantity<Q> = this + 1(unit)

operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.dec(): ComparableQuantity<Q> = this - 1(unit)

operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.plus(augend: Quantity<Q>): ComparableQuantity<Q> = add(augend)

operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.minus(subtrahend: Quantity<Q>): ComparableQuantity<Q> =
        subtract(subtrahend)

operator fun ComparableQuantity<*>.times(multiplier: Quantity<*>): ComparableQuantity<*> = multiply(multiplier)

operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.times(multiplier: Number): ComparableQuantity<Q> =
        multiply(multiplier)

operator fun ComparableQuantity<*>.div(divisor: Quantity<*>): ComparableQuantity<*> = divide(divisor)

operator fun <Q : Quantity<Q>> ComparableQuantity<Q>.div(divisor: Number): ComparableQuantity<Q> = divide(divisor)

infix fun <Q : Quantity<Q>> ComparableQuantity<Q>.tu(unit: Unit<Q>): ComparableQuantity<Q> = to(unit)

fun <Q : Quantity<Q>> ComparableQuantity<Q>.abs(): ComparableQuantity<Q> = if (this < 0(unit)) -this else this

/**
 * Checks if the physical quantity represented by two Quantity objects is the same.
 * qeq stands for 'quantity equality'
 */
infix fun <Q : Quantity<Q>> ComparableQuantity<Q>.qeq(comparate: Quantity<Q>) = isEquivalentTo(comparate)

fun <Q : Quantity<Q>> ComparableQuantity<Q>.apeq(comparate: Quantity<Q>, plusOrMinus: ComparableQuantity<Q>) =
        (this - comparate).abs() <= plusOrMinus

//TODO: Consider using ComparableQuantity<Dimensionless> with Percent instead of Double for the plusOrMinusRatio
fun <Q : Quantity<Q>> ComparableQuantity<Q>.apeq(comparate: ComparableQuantity<Q>,
                                                 plusOrMinusRatio: Double): Boolean {
    val plusOrMinus: ComparableQuantity<Q> =
            if (this < comparate)
                (this * plusOrMinusRatio)
            else
                (comparate * plusOrMinusRatio)
    return apeq(this, plusOrMinus)
}

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
//   ⎍⎍⎍⎍⎍⎍⎍⎍   ஃ Additional Unit Types ஃ   ⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍    //
//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
interface FlowRate : Quantity<FlowRate>

interface Irradiance : Quantity<Irradiance>

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
//   ⎍⎍⎍⎍⎍⎍⎍⎍   ஃ Other Classes & Interfaces ஃ   ⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍⎍    //
//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬//
data class MetricPrefixedNumber(val number: Number, val prefix: MetricPrefix)

class ValueOutOfRangeException(message: String? = null,
                               cause: Throwable? = null) : Throwable(message, cause)