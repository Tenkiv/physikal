package org.tenkiv.physikal.additional

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import si.uom.quantity.*
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

val MetricPrefixedNumber.billion: ComparableQuantity<Dimensionless>
    get() = number(BILLIONS.transform(prefix.converter))

val Number.million: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, MILLIONS)

val MetricPrefixedNumber.million: ComparableQuantity<Dimensionless>
    get() = number(MILLIONS.transform(prefix.converter))

val Number.thousand: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, THOUSANDS)

val MetricPrefixedNumber.thousand: ComparableQuantity<Dimensionless>
    get() = number(THOUSANDS.transform(prefix.converter))

val Number.hundred: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, HUNDREDS)

val MetricPrefixedNumber.hundred: ComparableQuantity<Dimensionless>
    get() = number(HUNDREDS.transform(prefix.converter))

val Number.percent: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PERCENT)

val MetricPrefixedNumber.percent: ComparableQuantity<Dimensionless>
    get() = number(PERCENT.transform(prefix.converter))

val Number.per_thousand: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_THOUSAND)

val MetricPrefixedNumber.per_thousand: ComparableQuantity<Dimensionless>
    get() = number(PER_THOUSAND.transform(prefix.converter))

val Number.per_million: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_MILLION)

val MetricPrefixedNumber.per_million: ComparableQuantity<Dimensionless>
    get() = number(PER_MILLION.transform(prefix.converter))

val Number.per_billion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_BILLION)

val MetricPrefixedNumber.per_billion: ComparableQuantity<Dimensionless>
    get() = number(PER_BILLION.transform(prefix.converter))

val Number.per_trillion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_TRILLION)

val MetricPrefixedNumber.per_trillion: ComparableQuantity<Dimensionless>
    get() = number(PER_TRILLION.transform(prefix.converter))

val Number.month_synodal: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MONTH_SYNODAL)

val MetricPrefixedNumber.month_synodal: ComparableQuantity<Time>
    get() = number(MONTH_SYNODAL.transform(prefix.converter))

val Number.month_julian: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MONTH_JULIAN)

val MetricPrefixedNumber.month_julian: ComparableQuantity<Time>
    get() = number(MONTH_JULIAN.transform(prefix.converter))

val Number.month_gregorian: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MONTH_GREGORIAN)

val MetricPrefixedNumber.month_gregorian: ComparableQuantity<Time>
    get() = number(MONTH_GREGORIAN.transform(prefix.converter))

val Number.velocity_of_light: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, VELOCITY_OF_LIGHT)

val MetricPrefixedNumber.velocity_of_light: ComparableQuantity<Speed>
    get() = number(VELOCITY_OF_LIGHT.transform(prefix.converter))

val Number.plank: ComparableQuantity<Action>
    get() = Quantities.getQuantity<Action>(this, PLANCK)

val MetricPrefixedNumber.plank: ComparableQuantity<Action>
    get() = number(PLANCK.transform(prefix.converter))

val Number.boltzman: ComparableQuantity<*>
    get() = Quantities.getQuantity<Action>(this, BOLTZMAN)

val MetricPrefixedNumber.boltzman: ComparableQuantity<*>
    get() = number(BOLTZMAN.transform(prefix.converter))

val Number.permittivity_of_vacuum: ComparableQuantity<ElectricPermittivity>
    get() = Quantities.getQuantity<ElectricPermittivity>(this, PERMITTIVITY_OF_VACUUM)

val MetricPrefixedNumber.permittivity_of_vacuum: ComparableQuantity<ElectricPermittivity>
    get() = number(PERMITTIVITY_OF_VACUUM.transform(prefix.converter))

val Number.permeability_of_vacuum: ComparableQuantity<MagneticPermeability>
    get() = Quantities.getQuantity<MagneticPermeability>(this, PERMEABILITY_OF_VACUUM)

val MetricPrefixedNumber.permeability_of_vacuum: ComparableQuantity<MagneticPermeability>
    get() = number(PERMEABILITY_OF_VACUUM.transform(prefix.converter))

val Number.elementary_charge: ComparableQuantity<ElectricCharge>
    get() = Quantities.getQuantity<ElectricCharge>(this, ELEMENTARY_CHARGE)

val MetricPrefixedNumber.elementary_charge: ComparableQuantity<ElectricCharge>
    get() = number(ELEMENTARY_CHARGE.transform(prefix.converter))

val Number.electron_mass: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, ELECTRON_MASS)

val MetricPrefixedNumber.electron_mass: ComparableQuantity<Mass>
    get() = number(ELECTRON_MASS.transform(prefix.converter))

val Number.proton_mass: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, PROTON_MASS)

val MetricPrefixedNumber.proton_mass: ComparableQuantity<Mass>
    get() = number(PROTON_MASS.transform(prefix.converter))

val Number.newton_constant_gravity: ComparableQuantity<*>
    get() = Quantities.getQuantity<Any?>(this, NEWTON_CONSTANT_OF_GRAVITY)

val MetricPrefixedNumber.newton_constant_gravity: ComparableQuantity<*>
    get() = number(NEWTON_CONSTANT_OF_GRAVITY.transform(prefix.converter))

val Number.accelleration_of_freefall: ComparableQuantity<Acceleration>
    get() = Quantities.getQuantity<Acceleration>(this, ACCELLERATION_OF_FREEFALL)

val MetricPrefixedNumber.accelleration_of_freefall: ComparableQuantity<Acceleration>
    get() = number(ACCELLERATION_OF_FREEFALL.transform(prefix.converter))

val Number.atmosphere: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, ATMOSPHERE)

val MetricPrefixedNumber.atmosphere: ComparableQuantity<Pressure>
    get() = number(ATMOSPHERE.transform(prefix.converter))

val Number.light_year: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LIGHT_YEAR)

val MetricPrefixedNumber.light_year: ComparableQuantity<Length>
    get() = number(LIGHT_YEAR.transform(prefix.converter))

val Number.gram_force: ComparableQuantity<Force>
    get() = Quantities.getQuantity<Force>(this, GRAM_FORCE)

val MetricPrefixedNumber.gram_force: ComparableQuantity<Force>
    get() = number(GRAM_FORCE.transform(prefix.converter))

val Number.kayser: ComparableQuantity<WaveNumber>
    get() = Quantities.getQuantity<WaveNumber>(this, KAYSER)

val MetricPrefixedNumber.kayser: ComparableQuantity<WaveNumber>
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

val Number.rad: ComparableQuantity<RadiationDoseAbsorbed>
    get() = Quantities.getQuantity<RadiationDoseAbsorbed>(this, RAD)

val MetricPrefixedNumber.rad: ComparableQuantity<RadiationDoseAbsorbed>
    get() = number(RAD.transform(prefix.converter))

val Number.rem: ComparableQuantity<RadiationDoseEffective>
    get() = Quantities.getQuantity<RadiationDoseEffective>(this, REM)

val MetricPrefixedNumber.rem: ComparableQuantity<RadiationDoseEffective>
    get() = number(REM.transform(prefix.converter))

val Number.inch_international: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, INCH_INTERNATIONAL)

val MetricPrefixedNumber.inch_international: ComparableQuantity<Length>
    get() = number(INCH_INTERNATIONAL.transform(prefix.converter))

val Number.foot_international: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FOOT_INTERNATIONAL)

val MetricPrefixedNumber.foot_international: ComparableQuantity<Length>
    get() = number(FOOT_INTERNATIONAL.transform(prefix.converter))

val Number.yard_international: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, YARD_INTERNATIONAL)

val MetricPrefixedNumber.yard_international: ComparableQuantity<Length>
    get() = number(YARD_INTERNATIONAL.transform(prefix.converter))

val Number.mile_international: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MILE_INTERNATIONAL)

val MetricPrefixedNumber.mile_international: ComparableQuantity<Length>
    get() = number(MILE_INTERNATIONAL.transform(prefix.converter))

val Number.fathom_international: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FATHOM_INTERNATIONAL)

val MetricPrefixedNumber.fathom_international: ComparableQuantity<Length>
    get() = number(FATHOM_INTERNATIONAL.transform(prefix.converter))

val Number.nautical_mile_international: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, NAUTICAL_MILE_INTERNATIONAL)

val MetricPrefixedNumber.nautical_mile_international: ComparableQuantity<Length>
    get() = number(NAUTICAL_MILE_INTERNATIONAL.transform(prefix.converter))

val Number.knot_international: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, KNOT_INTERNATIONAL)

val MetricPrefixedNumber.knot_international: ComparableQuantity<Speed>
    get() = number(KNOT_INTERNATIONAL.transform(prefix.converter))

val Number.square_inch_international: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_INCH_INTERNATIONAL)

val MetricPrefixedNumber.square_inch_international: ComparableQuantity<Area>
    get() = number(SQUARE_INCH_INTERNATIONAL.transform(prefix.converter))

val Number.square_foot_international: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_FOOT_INTERNATIONAL)

val MetricPrefixedNumber.square_foot_international: ComparableQuantity<Area>
    get() = number(SQUARE_FOOT_INTERNATIONAL.transform(prefix.converter))

val Number.square_yard_international: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_YARD_INTERNATIONAL)

val MetricPrefixedNumber.square_yard_international: ComparableQuantity<Area>
    get() = number(SQUARE_YARD_INTERNATIONAL.transform(prefix.converter))

val Number.cubic_inch_international: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_INCH_INTERNATIONAL)

val MetricPrefixedNumber.cubic_inch_international: ComparableQuantity<Volume>
    get() = number(CUBIC_INCH_INTERNATIONAL.transform(prefix.converter))

val Number.cubic_foot_international: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_FOOT_INTERNATIONAL)

val MetricPrefixedNumber.cubic_foot_international: ComparableQuantity<Volume>
    get() = number(CUBIC_FOOT_INTERNATIONAL.transform(prefix.converter))

val Number.cubic_yard_international: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_YARD_INTERNATIONAL)

val MetricPrefixedNumber.cubic_yard_international: ComparableQuantity<Volume>
    get() = number(CUBIC_YARD_INTERNATIONAL.transform(prefix.converter))

val Number.board_foot_international: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BOARD_FOOT_INTERNATIONAL)

val MetricPrefixedNumber.board_foot_international: ComparableQuantity<Volume>
    get() = number(BOARD_FOOT_INTERNATIONAL.transform(prefix.converter))

val Number.cord_international: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CORD_INTERNATIONAL)

val MetricPrefixedNumber.cord_international: ComparableQuantity<Volume>
    get() = number(CORD_INTERNATIONAL.transform(prefix.converter))

val Number.mil_international: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MIL_INTERNATIONAL)

val MetricPrefixedNumber.mil_international: ComparableQuantity<Length>
    get() = number(MIL_INTERNATIONAL.transform(prefix.converter))

val Number.circular_mil_international: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, CIRCULAR_MIL_INTERNATIONAL)

val MetricPrefixedNumber.circular_mil_international: ComparableQuantity<Area>
    get() = number(CIRCULAR_MIL_INTERNATIONAL.transform(prefix.converter))

val Number.hand_international: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, HAND_INTERNATIONAL)

val MetricPrefixedNumber.hand_international: ComparableQuantity<Length>
    get() = number(HAND_INTERNATIONAL.transform(prefix.converter))

val Number.foot_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FOOT_US_SURVEY)

val MetricPrefixedNumber.foot_us_survey: ComparableQuantity<Length>
    get() = number(FOOT_US_SURVEY.transform(prefix.converter))

val Number.yard_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, YARD_US_SURVEY)

val MetricPrefixedNumber.yard_us_survey: ComparableQuantity<Length>
    get() = number(YARD_US_SURVEY.transform(prefix.converter))

val Number.inch_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, INCH_US_SURVEY)

val MetricPrefixedNumber.inch_us_survey: ComparableQuantity<Length>
    get() = number(INCH_US_SURVEY.transform(prefix.converter))

val Number.rod_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ROD_US_SURVEY)

val MetricPrefixedNumber.rod_us_survey: ComparableQuantity<Length>
    get() = number(ROD_US_SURVEY.transform(prefix.converter))

val Number.chain_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CHAIN_US_SURVEY)

val MetricPrefixedNumber.chain_us_survey: ComparableQuantity<Length>
    get() = number(CHAIN_US_SURVEY.transform(prefix.converter))

val Number.link_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LINK_US_SURVEY)

val MetricPrefixedNumber.link_us_survey: ComparableQuantity<Length>
    get() = number(LINK_US_SURVEY.transform(prefix.converter))

val Number.ramden_chain_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, RAMDEN_CHAIN_US_SURVEY)

val MetricPrefixedNumber.ramden_chain_us_survey: ComparableQuantity<Length>
    get() = number(RAMDEN_CHAIN_US_SURVEY.transform(prefix.converter))

val Number.ramden_link_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, RAMDEN_LINK_US_SURVEY)

val MetricPrefixedNumber.ramden_link_us_survey: ComparableQuantity<Length>
    get() = number(RAMDEN_LINK_US_SURVEY.transform(prefix.converter))

val Number.fathom_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FATHOM_US_SURVEY)

val MetricPrefixedNumber.fathom_us_survey: ComparableQuantity<Length>
    get() = number(FATHOM_US_SURVEY.transform(prefix.converter))

val Number.furlong_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FURLONG_US_SURVEY)

val MetricPrefixedNumber.furlong_us_survey: ComparableQuantity<Length>
    get() = number(FURLONG_US_SURVEY.transform(prefix.converter))

val Number.mile_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FURLONG_US_SURVEY)

val MetricPrefixedNumber.mile_us_survey: ComparableQuantity<Length>
    get() = number(FURLONG_US_SURVEY.transform(prefix.converter))

val Number.area_us_survey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, ACRE_US_SURVEY)

val MetricPrefixedNumber.area_us_survey: ComparableQuantity<Area>
    get() = number(ACRE_US_SURVEY.transform(prefix.converter))

val Number.square_rod_us_survey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_ROD_US_SURVEY)

val MetricPrefixedNumber.square_rod_us_survey: ComparableQuantity<Area>
    get() = number(SQUARE_ROD_US_SURVEY.transform(prefix.converter))

val Number.square_mile_us_survey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_MILE_US_SURVEY)

val MetricPrefixedNumber.square_mile_us_survey: ComparableQuantity<Area>
    get() = number(SQUARE_MILE_US_SURVEY.transform(prefix.converter))

val Number.section_us_survey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SECTION_US_SURVEY)

val MetricPrefixedNumber.section_us_survey: ComparableQuantity<Area>
    get() = number(SECTION_US_SURVEY.transform(prefix.converter))

val Number.township_us_survey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, TOWNSHP_US_SURVEY)

val MetricPrefixedNumber.township_us_survey: ComparableQuantity<Area>
    get() = number(TOWNSHP_US_SURVEY.transform(prefix.converter))

val Number.mil_us_survey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MIL_US_SURVEY)

val MetricPrefixedNumber.mil_us_survey: ComparableQuantity<Length>
    get() = number(MIL_US_SURVEY.transform(prefix.converter))

val Number.inch_british: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, INCH_BRITISH)

val MetricPrefixedNumber.inch_british: ComparableQuantity<Length>
    get() = number(INCH_BRITISH.transform(prefix.converter))

val Number.foot_british: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FOOT_BRITISH)

val MetricPrefixedNumber.foot_british: ComparableQuantity<Length>
    get() = number(FOOT_BRITISH.transform(prefix.converter))

val Number.rod_british: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ROD_BRITISH)

val MetricPrefixedNumber.rod_british: ComparableQuantity<Length>
    get() = number(ROD_BRITISH.transform(prefix.converter))

val Number.chain_british: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CHAIN_BRITISH)

val MetricPrefixedNumber.chain_british: ComparableQuantity<Length>
    get() = number(CHAIN_BRITISH.transform(prefix.converter))

val Number.link_british: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LINK_BRITISH)

val MetricPrefixedNumber.link_british: ComparableQuantity<Length>
    get() = number(LINK_BRITISH.transform(prefix.converter))

val Number.fathom_british: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FATHOM_BRITISH)

val MetricPrefixedNumber.fathom_british: ComparableQuantity<Length>
    get() = number(FATHOM_BRITISH.transform(prefix.converter))

val Number.pace_british: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PACE_BRITISH)

val MetricPrefixedNumber.pace_british: ComparableQuantity<Length>
    get() = number(PACE_BRITISH.transform(prefix.converter))

val Number.yard_british: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, YARD_BRITISH)

val MetricPrefixedNumber.yard_british: ComparableQuantity<Length>
    get() = number(YARD_BRITISH.transform(prefix.converter))

val Number.mile_british: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MILE_BRITISH)

val MetricPrefixedNumber.mile_british: ComparableQuantity<Length>
    get() = number(MILE_BRITISH.transform(prefix.converter))

val Number.nautical_mile_british: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, NAUTICAL_MILE_BRITISH)

val MetricPrefixedNumber.nautical_mile_british: ComparableQuantity<Length>
    get() = number(NAUTICAL_MILE_BRITISH.transform(prefix.converter))

val Number.knot_british: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, KNOT_BRITISH)

val MetricPrefixedNumber.knot_british: ComparableQuantity<Speed>
    get() = number(KNOT_BRITISH.transform(prefix.converter))

val Number.acre_british: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, ACRE_BRITISH)

val MetricPrefixedNumber.acre_british: ComparableQuantity<Area>
    get() = number(ACRE_BRITISH.transform(prefix.converter))

val Number.gallon_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GALLON_US)

val MetricPrefixedNumber.gallon_us: ComparableQuantity<Volume>
    get() = number(GALLON_US.transform(prefix.converter))

val Number.barrel_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BARREL_US)

val MetricPrefixedNumber.barrel_us: ComparableQuantity<Volume>
    get() = number(BARREL_US.transform(prefix.converter))

val Number.quart_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, QUART_US)

val MetricPrefixedNumber.quart_us: ComparableQuantity<Volume>
    get() = number(QUART_US.transform(prefix.converter))

val Number.pint_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PINT_US)

val MetricPrefixedNumber.pint_us: ComparableQuantity<Volume>
    get() = number(PINT_US.transform(prefix.converter))

val Number.gill_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GILL_US)

val MetricPrefixedNumber.gill_us: ComparableQuantity<Volume>
    get() = number(GILL_US.transform(prefix.converter))

val Number.fluid_ounce_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_OUNCE_US)

val MetricPrefixedNumber.fluid_ounce_us: ComparableQuantity<Volume>
    get() = number(FLUID_OUNCE_US.transform(prefix.converter))

val Number.fluid_dram_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_DRAM_US)

val MetricPrefixedNumber.fluid_dram_us: ComparableQuantity<Volume>
    get() = number(FLUID_DRAM_US.transform(prefix.converter))

val Number.minum_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, MINIM_US)

val MetricPrefixedNumber.minum_us: ComparableQuantity<Volume>
    get() = number(MINIM_US.transform(prefix.converter))

val Number.cord_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CORD_US)

val MetricPrefixedNumber.cord_us: ComparableQuantity<Volume>
    get() = number(CORD_US.transform(prefix.converter))

val Number.bushel_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BUSHEL_US)

val MetricPrefixedNumber.bushel_us: ComparableQuantity<Volume>
    get() = number(BUSHEL_US.transform(prefix.converter))

val Number.gallon_winchester: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GALLON_WINCHESTER)

val MetricPrefixedNumber.gallon_winchester: ComparableQuantity<Volume>
    get() = number(GALLON_WINCHESTER.transform(prefix.converter))

val Number.peck_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PECK_US)

val MetricPrefixedNumber.peck_us: ComparableQuantity<Volume>
    get() = number(PECK_US.transform(prefix.converter))

val Number.dry_quart_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, DRY_QUART_US)

val MetricPrefixedNumber.dry_quart_us: ComparableQuantity<Volume>
    get() = number(DRY_QUART_US.transform(prefix.converter))

val Number.dry_pint_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, DRY_PINT_US)

val MetricPrefixedNumber.dry_pint_us: ComparableQuantity<Volume>
    get() = number(DRY_PINT_US.transform(prefix.converter))

val Number.tablespoon_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, TABLESPOON_US)

val MetricPrefixedNumber.tablespoon_us: ComparableQuantity<Volume>
    get() = number(TABLESPOON_US.transform(prefix.converter))

val Number.teaspoon_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, TEASPOON_US)

val MetricPrefixedNumber.teaspoon_us: ComparableQuantity<Volume>
    get() = number(TEASPOON_US.transform(prefix.converter))

val Number.cup_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUP_US)

val MetricPrefixedNumber.cup_us: ComparableQuantity<Volume>
    get() = number(CUP_US.transform(prefix.converter))

val Number.metric_fluid_ounce_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, METRIC_FLUID_OUNCE_US)

val MetricPrefixedNumber.metric_fluid_ounce_us: ComparableQuantity<Volume>
    get() = number(METRIC_FLUID_OUNCE_US.transform(prefix.converter))

val Number.metric_cup_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, METRIC_CUP_US)

val MetricPrefixedNumber.metric_cup_us: ComparableQuantity<Volume>
    get() = number(METRIC_CUP_US.transform(prefix.converter))

val Number.metric_teaspoon_cup_us: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, METRIC_TEASPOON_CUP_US)

val MetricPrefixedNumber.metric_teaspoon_cup_us: ComparableQuantity<Volume>
    get() = number(METRIC_TEASPOON_CUP_US.transform(prefix.converter))

val Number.gallon_british: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GALLON_BRITISH)

val MetricPrefixedNumber.gallon_british: ComparableQuantity<Volume>
    get() = number(GALLON_BRITISH.transform(prefix.converter))

val Number.peck_british: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PECK_BRITISH)

val MetricPrefixedNumber.peck_british: ComparableQuantity<Volume>
    get() = number(PECK_BRITISH.transform(prefix.converter))

val Number.bushel_british: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BUSHEL_BRITISH)

val MetricPrefixedNumber.bushel_british: ComparableQuantity<Volume>
    get() = number(BUSHEL_BRITISH.transform(prefix.converter))

val Number.quart_britsh: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, QUART_BRITISH)

val MetricPrefixedNumber.quart_britsh: ComparableQuantity<Volume>
    get() = number(QUART_BRITISH.transform(prefix.converter))

val Number.pint_british: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PINT_BRITISH)

val MetricPrefixedNumber.pint_british: ComparableQuantity<Volume>
    get() = number(PINT_BRITISH.transform(prefix.converter))

val Number.gill_british: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GILL_BRITISH)

val MetricPrefixedNumber.gill_british: ComparableQuantity<Volume>
    get() = number(GILL_BRITISH.transform(prefix.converter))

val Number.fluid_ounce_british: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_OUNCE_BRITISH)

val MetricPrefixedNumber.fluid_ounce_british: ComparableQuantity<Volume>
    get() = number(FLUID_OUNCE_BRITISH.transform(prefix.converter))

val Number.fluid_dram_british: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_DRAM_BRITISH)

val MetricPrefixedNumber.fluid_dram_british: ComparableQuantity<Volume>
    get() = number(FLUID_DRAM_BRITISH.transform(prefix.converter))

val Number.minim_british: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, MINIM_BRITISH)

val MetricPrefixedNumber.minim_british: ComparableQuantity<Volume>
    get() = number(MINIM_BRITISH.transform(prefix.converter))

val Number.grain: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, GRAIN)

val MetricPrefixedNumber.grain: ComparableQuantity<Mass>
    get() = number(GRAIN.transform(prefix.converter))

val Number.pound: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, POUND)

val MetricPrefixedNumber.pound: ComparableQuantity<Mass>
    get() = number(POUND.transform(prefix.converter))

val Number.ounce: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, OUNCE)

val MetricPrefixedNumber.ounce: ComparableQuantity<Mass>
    get() = number(OUNCE.transform(prefix.converter))

val Number.dram: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, DRAM)

val MetricPrefixedNumber.dram: ComparableQuantity<Mass>
    get() = number(DRAM.transform(prefix.converter))

val Number.short_hundredweight: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, SHORT_HUNDREDWEIGHT)

val MetricPrefixedNumber.short_hundredweight: ComparableQuantity<Mass>
    get() = number(SHORT_HUNDREDWEIGHT.transform(prefix.converter))

val Number.long_hundredweight: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, LONG_HUNDREDWEIGHT)

val MetricPrefixedNumber.long_hundredweight: ComparableQuantity<Mass>
    get() = number(LONG_HUNDREDWEIGHT.transform(prefix.converter))

val Number.short_ton: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, SHORT_TON)

val MetricPrefixedNumber.short_ton: ComparableQuantity<Mass>
    get() = number(SHORT_TON.transform(prefix.converter))

val Number.long_ton: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, LONG_TON)

val MetricPrefixedNumber.long_ton: ComparableQuantity<Mass>
    get() = number(LONG_TON.transform(prefix.converter))

val Number.stone: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, STONE)

val MetricPrefixedNumber.stone: ComparableQuantity<Mass>
    get() = number(STONE.transform(prefix.converter))

val Number.pound_force: ComparableQuantity<Force>
    get() = Quantities.getQuantity<Force>(this, POUND_FORCE)

val MetricPrefixedNumber.pound_force: ComparableQuantity<Force>
    get() = number(POUND_FORCE.transform(prefix.converter))

val Number.pennyweight_troy: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, PENNYWEIGHT_TROY)

val MetricPrefixedNumber.pennyweight_troy: ComparableQuantity<Mass>
    get() = number(PENNYWEIGHT_TROY.transform(prefix.converter))

val Number.ounce_troy: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, OUNCE_TROY)

val MetricPrefixedNumber.ounce_troy: ComparableQuantity<Mass>
    get() = number(OUNCE_TROY.transform(prefix.converter))

val Number.pound_troy: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, POUND_TROY)

val MetricPrefixedNumber.pound_troy: ComparableQuantity<Mass>
    get() = number(POUND_TROY.transform(prefix.converter))

val Number.scruple_apothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, SCRUPLE_APOTHECARY)

val MetricPrefixedNumber.scruple_apothecary: ComparableQuantity<Mass>
    get() = number(SCRUPLE_APOTHECARY.transform(prefix.converter))

val Number.dram_apothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, DRAM_APOTHECARY)

val MetricPrefixedNumber.dram_apothecary: ComparableQuantity<Mass>
    get() = number(DRAM_APOTHECARY.transform(prefix.converter))

val Number.ounce_apothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, OUNCE_APOTHECARY)

val MetricPrefixedNumber.ounce_apothecary: ComparableQuantity<Mass>
    get() = number(OUNCE_APOTHECARY.transform(prefix.converter))

val Number.pound_apothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, POUND_APOTHECARY)

val MetricPrefixedNumber.pound_apothecary: ComparableQuantity<Mass>
    get() = number(POUND_APOTHECARY.transform(prefix.converter))

val Number.metric_ounce: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, METRIC_OUNCE)

val MetricPrefixedNumber.metric_ounce: ComparableQuantity<Mass>
    get() = number(METRIC_OUNCE.transform(prefix.converter))

val Number.line: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LINE)

val MetricPrefixedNumber.line: ComparableQuantity<Length>
    get() = number(LINE.transform(prefix.converter))

val Number.point: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, POINT)

val MetricPrefixedNumber.point: ComparableQuantity<Length>
    get() = number(POINT.transform(prefix.converter))

val Number.pica: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PICA)

val MetricPrefixedNumber.pica: ComparableQuantity<Length>
    get() = number(PICA.transform(prefix.converter))

val Number.point_printer: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, POINT_PRINTER)

val MetricPrefixedNumber.point_printer: ComparableQuantity<Length>
    get() = number(POINT_PRINTER.transform(prefix.converter))

val Number.pica_printer: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PICA_PRINTER)

val MetricPrefixedNumber.pica_printer: ComparableQuantity<Length>
    get() = number(PICA_PRINTER.transform(prefix.converter))

val Number.pied: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PIED)

val MetricPrefixedNumber.pied: ComparableQuantity<Length>
    get() = number(PIED.transform(prefix.converter))

val Number.pouce: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, POUCE)

val MetricPrefixedNumber.pouce: ComparableQuantity<Length>
    get() = number(POUCE.transform(prefix.converter))

val Number.ligne: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LIGNE)

val MetricPrefixedNumber.ligne: ComparableQuantity<Length>
    get() = number(LIGNE.transform(prefix.converter))

val Number.didot: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, DIDOT)

val MetricPrefixedNumber.didot: ComparableQuantity<Length>
    get() = number(DIDOT.transform(prefix.converter))

val Number.cicero: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CICERO)

val MetricPrefixedNumber.cicero: ComparableQuantity<Length>
    get() = number(CICERO.transform(prefix.converter))


