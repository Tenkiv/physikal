package org.tenkiv.physikal.additional

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import si.uom.quantity.*
import systems.uom.quantity.*
import systems.uom.ucum.UCUM
import systems.uom.ucum.UCUM.*
import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import tec.uom.se.unit.Units
import javax.measure.quantity.*

/**
 * Created by tenkiv on 6/17/17.
 */

val Number.trillion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, TRILLIONS)

val MetricPrefixedNumber.trillion: ComparableQuantity<Dimensionless>
    get() = number(TRILLIONS.transform(prefix.converter))

val Number.billion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, BILLIONS)

val Number.million: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, MILLIONS)

val Number.thousand: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, THOUSANDS)

val Number.hundred: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, HUNDREDS)

val Number.percent: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PERCENT)

val Number.perThousand: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_THOUSAND)

val Number.perMillion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_MILLION)

val Number.perBillion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_BILLION)

val Number.perTrillion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_TRILLION)

val Number.monthSynodal: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MONTH_SYNODAL)

val Number.monthJulian: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MONTH_JULIAN)

val Number.monthGregorian: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MONTH_GREGORIAN)

val Number.velocityOfLight: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, VELOCITY_OF_LIGHT)

val MetricPrefixedNumber.velocityOfLight: ComparableQuantity<Speed>
    get() = number(VELOCITY_OF_LIGHT.transform(prefix.converter))

val Number.plank: ComparableQuantity<Action>
    get() = Quantities.getQuantity<Action>(this, PLANCK)

val MetricPrefixedNumber.plank: ComparableQuantity<Action>
    get() = number(PLANCK.transform(prefix.converter))

val Number.permittivityOfVacuum: ComparableQuantity<ElectricPermittivity>
    get() = Quantities.getQuantity<ElectricPermittivity>(this, PERMITTIVITY_OF_VACUUM)

val Number.permeabilityOfVacuum: ComparableQuantity<MagneticPermeability>
    get() = Quantities.getQuantity<MagneticPermeability>(this, PERMEABILITY_OF_VACUUM)

val Number.elementaryCharge: ComparableQuantity<ElectricCharge>
    get() = Quantities.getQuantity<ElectricCharge>(this, ELEMENTARY_CHARGE)

val Number.electronMass: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, ELECTRON_MASS)

val MetricPrefixedNumber.electronMass: ComparableQuantity<Mass>
    get() = number(ELECTRON_MASS.transform(prefix.converter))

val Number.protonMass: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, PROTON_MASS)

val MetricPrefixedNumber.protonMass: ComparableQuantity<Mass>
    get() = number(PROTON_MASS.transform(prefix.converter))

val Number.atmosphere: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, ATMOSPHERE)

val MetricPrefixedNumber.atmosphere: ComparableQuantity<Pressure>
    get() = number(ATMOSPHERE.transform(prefix.converter))

val Number.lightYear: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LIGHT_YEAR)

val MetricPrefixedNumber.lightYear: ComparableQuantity<Length>
    get() = number(LIGHT_YEAR.transform(prefix.converter))

val Number.gramForce: ComparableQuantity<Force>
    get() = Quantities.getQuantity<Force>(this, GRAM_FORCE)

val MetricPrefixedNumber.gramForce: ComparableQuantity<Force>
    get() = number(GRAM_FORCE.transform(prefix.converter))

val Number.kayser: ComparableQuantity<WaveNumber>
    get() = Quantities.getQuantity<WaveNumber>(this, KAYSER)

val MetricPrefixedNumber.kayser: ComparableQuantity<WaveNumber>
    get() = number(KAYSER.transform(prefix.converter))

val Number.biot: ComparableQuantity<ElectricCurrent>
    get() = Quantities.getQuantity<ElectricCurrent>(this, BIOT)

val MetricPrefixedNumber.biot: ComparableQuantity<ElectricCurrent>
    get() = number(BIOT.transform(prefix.converter))

val Number.stokes: ComparableQuantity<KinematicViscosity>
    get() = Quantities.getQuantity<KinematicViscosity>(this, STOKES)

val MetricPrefixedNumber.stokes: ComparableQuantity<KinematicViscosity>
    get() = number(STOKES.transform(prefix.converter))

val Number.maxwell: ComparableQuantity<MagneticFlux>
    get() = Quantities.getQuantity<MagneticFlux>(this, MAXWELL)

val MetricPrefixedNumber.maxwell: ComparableQuantity<MagneticFlux>
    get() = number(MAXWELL.transform(prefix.converter))

val Number.gauss: ComparableQuantity<MagneticFluxDensity>
    get() = Quantities.getQuantity<MagneticFluxDensity>(this, GAUSS)

val MetricPrefixedNumber.gauss: ComparableQuantity<MagneticFluxDensity>
    get() = number(GAUSS.transform(prefix.converter))

val Number.oersted: ComparableQuantity<MagneticFieldStrength>
    get() = Quantities.getQuantity<MagneticFieldStrength>(this, OERSTED)

val MetricPrefixedNumber.oersted: ComparableQuantity<MagneticFieldStrength>
    get() = number(OERSTED.transform(prefix.converter))

val Number.gilbert: ComparableQuantity<MagnetomotiveForce>
    get() = Quantities.getQuantity<MagnetomotiveForce>(this, GILBERT)

val MetricPrefixedNumber.gilbert: ComparableQuantity<MagnetomotiveForce>
    get() = number(GILBERT.transform(prefix.converter))

val Number.stilb: ComparableQuantity<Luminance>
    get() = Quantities.getQuantity<Luminance>(this, STILB)

val MetricPrefixedNumber.stilb: ComparableQuantity<Luminance>
    get() = number(STILB.transform(prefix.converter))

val Number.lambert: ComparableQuantity<Luminance>
    get() = Quantities.getQuantity<Luminance>(this, LAMBERT)

val MetricPrefixedNumber.lambert: ComparableQuantity<Luminance>
    get() = number(LAMBERT.transform(prefix.converter))

val Number.phot: ComparableQuantity<Illuminance>
    get() = Quantities.getQuantity<Illuminance>(this, PHOT)

val MetricPrefixedNumber.phot: ComparableQuantity<Illuminance>
    get() = number(PHOT.transform(prefix.converter))

val Number.curie: ComparableQuantity<Radioactivity>
    get() = Quantities.getQuantity<Radioactivity>(this, CURIE)

val MetricPrefixedNumber.curie: ComparableQuantity<Radioactivity>
    get() = number(CURIE.transform(prefix.converter))

val Number.roentgen: ComparableQuantity<IonizingRadiation>
    get() = Quantities.getQuantity<IonizingRadiation>(this, ROENTGEN)

val MetricPrefixedNumber.roentgen: ComparableQuantity<IonizingRadiation>
    get() = number(ROENTGEN.transform(prefix.converter))

val Number.inchInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, INCH_INTERNATIONAL)

val Number.footInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FOOT_INTERNATIONAL)

val Number.yardInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, YARD_INTERNATIONAL)

val Number.mileInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MILE_INTERNATIONAL)

val Number.fathomInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FATHOM_INTERNATIONAL)

val Number.nauticalMileInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, NAUTICAL_MILE_INTERNATIONAL)

val Number.knotInternational: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, KNOT_INTERNATIONAL)

val Number.squareInchInternational: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_INCH_INTERNATIONAL)

val Number.squareFootInternational: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_FOOT_INTERNATIONAL)

val MetricPrefixedNumber.squareFootInternational: ComparableQuantity<Area>
    get() = number(SQUARE_FOOT_INTERNATIONAL.transform(prefix.converter))

val Number.squareYardInternational: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_YARD_INTERNATIONAL)

val Number.cubicInchInternational: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_INCH_INTERNATIONAL)

val Number.cubicFootInternational: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_FOOT_INTERNATIONAL)

val Number.cubicYardInternational: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_YARD_INTERNATIONAL)

val Number.boardFootInternational: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BOARD_FOOT_INTERNATIONAL)

val Number.cordInternational: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CORD_INTERNATIONAL)

val Number.milInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MIL_INTERNATIONAL)

val MetricPrefixedNumber.milInternational: ComparableQuantity<Length>
    get() = number(MIL_INTERNATIONAL.transform(prefix.converter))

val Number.circularMilInternational: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, CIRCULAR_MIL_INTERNATIONAL)

val Number.handInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, HAND_INTERNATIONAL)

val MetricPrefixedNumber.handInternational: ComparableQuantity<Length>
    get() = number(HAND_INTERNATIONAL.transform(prefix.converter))

val Number.footUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FOOT_US_SURVEY)

val Number.yardUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, YARD_US_SURVEY)

val Number.inchUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, INCH_US_SURVEY)

val Number.rodUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ROD_US_SURVEY)

val Number.chainUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CHAIN_US_SURVEY)

val Number.linkUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LINK_US_SURVEY)

val Number.ramdenChainUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, RAMDEN_CHAIN_US_SURVEY)

val Number.ramdenLinkUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, RAMDEN_LINK_US_SURVEY)

val Number.fathomUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FATHOM_US_SURVEY)

val Number.furlongUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FURLONG_US_SURVEY)

val Number.mileUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FURLONG_US_SURVEY)

val Number.areaUsSurvey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, ACRE_US_SURVEY)

val Number.squareRodUsSurvey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_ROD_US_SURVEY)

val Number.squareMileUsSurvey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_MILE_US_SURVEY)

val Number.sectionUsSurvey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SECTION_US_SURVEY)

val Number.townshipUsSurvey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, TOWNSHP_US_SURVEY)

val Number.milUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MIL_US_SURVEY)

val Number.inchBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, INCH_BRITISH)

val Number.footBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FOOT_BRITISH)

val Number.rodBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ROD_BRITISH)

val Number.chainBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CHAIN_BRITISH)

val Number.linkBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LINK_BRITISH)

val Number.fathomBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FATHOM_BRITISH)

val Number.paceBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PACE_BRITISH)

val Number.yardBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, YARD_BRITISH)

val Number.mileBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MILE_BRITISH)

val Number.nauticalMileBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, NAUTICAL_MILE_BRITISH)

val Number.knotBritish: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, KNOT_BRITISH)

val Number.acreBritish: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, ACRE_BRITISH)

val Number.gallonUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GALLON_US)

val Number.barrelUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BARREL_US)

val Number.quartUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, QUART_US)

val Number.pintUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PINT_US)

val Number.gillUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GILL_US)

val Number.fluidOunceUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_OUNCE_US)

val Number.fluidDramUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_DRAM_US)

val Number.minumUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, MINIM_US)

val Number.cordUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CORD_US)

val Number.bushelUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BUSHEL_US)

val Number.gallonWinchester: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GALLON_WINCHESTER)

val Number.peckUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PECK_US)

val Number.dryQuartUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, DRY_QUART_US)

val Number.dryPintUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, DRY_PINT_US)

val Number.tablespoonUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, TABLESPOON_US)

val Number.teaspoonUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, TEASPOON_US)

val Number.cupUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUP_US)

val Number.metricFluidOunceUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, METRIC_FLUID_OUNCE_US)

val Number.metricCupUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, METRIC_CUP_US)

val Number.metricTeaspoonCupUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, METRIC_TEASPOON_CUP_US)

val Number.gallonBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GALLON_BRITISH)

val Number.peckBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PECK_BRITISH)

val Number.bushelBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BUSHEL_BRITISH)

val Number.quartBritsh: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, QUART_BRITISH)

val Number.pintBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PINT_BRITISH)

val Number.gillBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GILL_BRITISH)

val Number.fluidOunceBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_OUNCE_BRITISH)

val Number.fluidDramBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_DRAM_BRITISH)

val Number.minimBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, MINIM_BRITISH)

val Number.grain: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, GRAIN)

val Number.pound: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, POUND)

val Number.ounce: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, OUNCE)

val Number.dram: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, DRAM)

val Number.shortHundredweight: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, SHORT_HUNDREDWEIGHT)

val Number.longHundredweight: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, LONG_HUNDREDWEIGHT)

val Number.shortTon: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, SHORT_TON)

val Number.longTon: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, LONG_TON)

val Number.stone: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, STONE)

val Number.poundForce: ComparableQuantity<Force>
    get() = Quantities.getQuantity<Force>(this, POUND_FORCE)

val Number.pennyweightTroy: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, PENNYWEIGHT_TROY)

val Number.ounceTroy: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, OUNCE_TROY)

val Number.poundTroy: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, POUND_TROY)

val Number.scrupleApothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, SCRUPLE_APOTHECARY)

val Number.dramApothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, DRAM_APOTHECARY)

val Number.ounceApothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, OUNCE_APOTHECARY)

val Number.poundApothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, POUND_APOTHECARY)

val Number.metricOunce: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, METRIC_OUNCE)

val MetricPrefixedNumber.metricOunce: ComparableQuantity<Mass>
    get() = number(METRIC_OUNCE.transform(prefix.converter))

val Number.line: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LINE)

val Number.point: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, POINT)

val Number.pica: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PICA)

val Number.pointPrinter: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, POINT_PRINTER)

val Number.picaPrinter: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PICA_PRINTER)

val Number.pied: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PIED)

val Number.pouce: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, POUCE)

val Number.ligne: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LIGNE)

val Number.didot: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, DIDOT)

val Number.cicero: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CICERO)

val Number.reaumur: ComparableQuantity<Temperature>
    get() = Quantities.getQuantity<Temperature>(this, REAUMUR)

val Number.calorieAt15C: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_AT_15C)

val MetricPrefixedNumber.calorieAt15C: ComparableQuantity<Energy>
    get() = number(CALORIE_AT_15C.transform(prefix.converter))

val Number.calorieAt20C: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_AT_20C)

val MetricPrefixedNumber.calorieAt20C: ComparableQuantity<Energy>
    get() = number(CALORIE_AT_20C.transform(prefix.converter))

val Number.calorieMean: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_MEAN)

val MetricPrefixedNumber.calorieMean: ComparableQuantity<Energy>
    get() = number(CALORIE_MEAN.transform(prefix.converter))

val Number.calorieInternationalTable: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_INTERNATIONAL_TABLE)

val MetricPrefixedNumber.calorieInternationalTable: ComparableQuantity<Energy>
    get() = number(CALORIE_INTERNATIONAL_TABLE.transform(prefix.converter))

val Number.calorieThermochemical: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_THERMOCHEMICAL)

val MetricPrefixedNumber.calorieThermochemical: ComparableQuantity<Energy>
    get() = number(CALORIE_THERMOCHEMICAL.transform(prefix.converter))

val Number.calorie: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE)

val MetricPrefixedNumber.calorie: ComparableQuantity<Energy>
    get() = number(CALORIE.transform(prefix.converter))

val Number.calorieFood: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_FOOD)

val MetricPrefixedNumber.calorieFood: ComparableQuantity<Energy>
    get() = number(CALORIE_FOOD.transform(prefix.converter))

val Number.btuAt39F: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_AT_39F)

val Number.btuAt59F: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_AT_59F)

val Number.btuAt60F: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_AT_60F)

val MetricPrefixedNumber.btuAt60F: ComparableQuantity<Energy>
    get() = number(BTU_AT_60F.transform(prefix.converter))

val Number.btuMean: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_MEAN)

val Number.btuInternationalTable: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_INTERNATIONAL_TABLE)

val Number.btuThermochemical: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_THERMOCHEMICAL)

val Number.btu: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU)

val Number.horsepower: ComparableQuantity<Power>
    get() = Quantities.getQuantity<Power>(this, HORSEPOWER)

val Number.meterOfWaterColumn: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, METER_OF_WATER_COLUMN)

val MetricPrefixedNumber.meterOfWaterColumn: ComparableQuantity<Pressure>
    get() = number(METER_OF_WATER_COLUMN.transform(prefix.converter))

val Number.meterOfMercuryColumn: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, METER_OF_MERCURY_COLUMN)

val MetricPrefixedNumber.meterOfMercuryColumn: ComparableQuantity<Pressure>
    get() = number(METER_OF_MERCURY_COLUMN.transform(prefix.converter))

val Number.inchOfWaterColumn: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, INCH_OF_WATER_COLUMN)

val Number.inchOfMercuryColumn: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, INCH_OF_MERCURY_COLUMN)

val Number.drop: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, DROP)

val Number.ph: ComparableQuantity<Acidity>
    get() = Quantities.getQuantity<Acidity>(this, PH)

val Number.gramPercent: ComparableQuantity<Concentration<Mass>>
    get() = Quantities.getQuantity<Concentration<Mass>>(this, GRAM_PERCENT)

val MetricPrefixedNumber.gramPercent: ComparableQuantity<Concentration<Mass>>
    get() = number(GRAM_PERCENT.transform(prefix.converter))

val Number.highPowerFeild: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, HIGH_POWER_FIELD)

val Number.lowPowerFeild: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, LOW_POWER_FIELD)

val Number.neper: ComparableQuantity<Level<Dimensionless>>
    get() = Quantities.getQuantity<Level<Dimensionless>>(this, NEPER)

val MetricPrefixedNumber.neper: ComparableQuantity<Level<Dimensionless>>
    get() = number(NEPER.transform(prefix.converter))

val Number.bel: ComparableQuantity<Level<Dimensionless>>
    get() = Quantities.getQuantity<Level<Dimensionless>>(this, BEL)

val MetricPrefixedNumber.bel: ComparableQuantity<Level<Dimensionless>>
    get() = number(BEL.transform(prefix.converter))

val Number.belSound: ComparableQuantity<Level<Pressure>>
    get() = Quantities.getQuantity<Level<Pressure>>(this, BEL_SOUND)

val MetricPrefixedNumber.belSound: ComparableQuantity<Level<Pressure>>
    get() = number(BEL_SOUND.transform(prefix.converter))

val Number.belVolt: ComparableQuantity<Level<ElectricPotential>>
    get() = Quantities.getQuantity<Level<ElectricPotential>>(this, BEL_VOLT)

val MetricPrefixedNumber.belVolt: ComparableQuantity<Level<ElectricPotential>>
    get() = number(BEL_VOLT.transform(prefix.converter))

val Number.bel10Nanovolt: ComparableQuantity<Level<ElectricPotential>>
    get() = Quantities.getQuantity<Level<ElectricPotential>>(this, BEL_10_NANOVOLT)

val MetricPrefixedNumber.bel10Nanovolt: ComparableQuantity<Level<ElectricPotential>>
    get() = number(BEL_10_NANOVOLT.transform(prefix.converter))

val Number.belWatt: ComparableQuantity<Level<ElectricPotential>>
    get() = Quantities.getQuantity<Level<ElectricPotential>>(this, BEL_WATT)

val MetricPrefixedNumber.belWatt: ComparableQuantity<Level<ElectricPotential>>
    get() = number(BEL_WATT.transform(prefix.converter))

val Number.stere: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, STERE)

val MetricPrefixedNumber.stere: ComparableQuantity<Volume>
    get() = number(STERE.transform(prefix.converter))

val Number.barn: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, BARN)

val MetricPrefixedNumber.barn: ComparableQuantity<Area>
    get() = number(BARN.transform(prefix.converter))

val Number.atmosphereTechnical: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, ATMOSPHERE_TECHNICAL)

val MetricPrefixedNumber.atmosphereTechnical: ComparableQuantity<Pressure>
    get() = number(ATMOSPHERE_TECHNICAL.transform(prefix.converter))

val Number.mho: ComparableQuantity<ElectricConductance>
    get() = Quantities.getQuantity<ElectricConductance>(this, MHO)

val MetricPrefixedNumber.mho: ComparableQuantity<ElectricConductance>
    get() = number(MHO.transform(prefix.converter))

val Number.poundPerSquareInch: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, POUND_PER_SQUARE_INCH)

val Number.circle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, CIRCLE)

val MetricPrefixedNumber.circle: ComparableQuantity<Angle>
    get() = number(CIRCLE.transform(prefix.converter))

val Number.sphere: ComparableQuantity<SolidAngle>
    get() = Quantities.getQuantity<SolidAngle>(this, SPHERE)

val MetricPrefixedNumber.sphere: ComparableQuantity<SolidAngle>
    get() = number(SPHERE.transform(prefix.converter))

val Number.caratMetric: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, CARAT_METRIC)

val MetricPrefixedNumber.caratMetric: ComparableQuantity<Mass>
    get() = number(CARAT_METRIC.transform(prefix.converter))

val Number.caratGold: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, CARAT_GOLD)

val MetricPrefixedNumber.caratGold: ComparableQuantity<Dimensionless>
    get() = number(CARAT_GOLD.transform(prefix.converter))

val Number.smoot: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, SMOOT)

val MetricPrefixedNumber.smoot: ComparableQuantity<Length>
    get() = number(SMOOT.transform(prefix.converter))

val Number.bit: ComparableQuantity<Information>
    get() = Quantities.getQuantity<Information>(this, BIT)

val MetricPrefixedNumber.bit: ComparableQuantity<Information>
    get() = number(BIT.transform(prefix.converter))

val Number.byte: ComparableQuantity<Information>
    get() = Quantities.getQuantity<Information>(this, BYTE)

val MetricPrefixedNumber.byte: ComparableQuantity<Information>
    get() = number(BYTE.transform(prefix.converter))

val Number.baud: ComparableQuantity<InformationRate>
    get() = Quantities.getQuantity<InformationRate>(this, BAUD)

val MetricPrefixedNumber.baud: ComparableQuantity<InformationRate>
    get() = number(BAUD.transform(prefix.converter))