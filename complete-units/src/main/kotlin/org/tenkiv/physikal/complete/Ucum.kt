/**
 * Copyright 2017 TENKIV, INC.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the
following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
disclaimer in the documentation and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote
products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.tenkiv.physikal.complete

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import si.uom.quantity.*
import systems.uom.quantity.*
import systems.uom.quantity.Level
import systems.uom.ucum.UCUM.*
import tec.units.indriya.ComparableQuantity
import tec.units.indriya.quantity.Quantities
import javax.measure.quantity.*

/**
 * Builder method for [ComparableQuantity] with unit [TRILLIONS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.trillion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, TRILLIONS)

/**
 * Builder method for [ComparableQuantity] with unit [BILLIONS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.billion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, BILLIONS)

/**
 * Builder method for [ComparableQuantity] with unit [MILLIONS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.million: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, MILLIONS)

/**
 * Builder method for [ComparableQuantity] with unit [THOUSANDS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.thousand: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, THOUSANDS)

/**
 * Builder method for [ComparableQuantity] with unit [HUNDREDS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.hundred: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, HUNDREDS)

/**
 * Builder method for [ComparableQuantity] with unit [PERCENT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.percent: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PERCENT)

/**
 * Builder method for [ComparableQuantity] with unit [PER_THOUSAND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.perThousand: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_THOUSAND)

/**
 * Builder method for [ComparableQuantity] with unit [PER_MILLION].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.perMillion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_MILLION)

/**
 * Builder method for [ComparableQuantity] with unit [PER_BILLION].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.perBillion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_BILLION)

/**
 * Builder method for [ComparableQuantity] with unit [PER_TRILLION].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.perTrillion: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PER_TRILLION)

/**
 * Builder method for [ComparableQuantity] with unit [MONTH_SYNODAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.monthSynodal: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MONTH_SYNODAL)

/**
 * Builder method for [ComparableQuantity] with unit [MONTH_JULIAN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.monthJulian: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MONTH_JULIAN)

/**
 * Builder method for [ComparableQuantity] with unit [MONTH_GREGORIAN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.monthGregorian: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, MONTH_GREGORIAN)

/**
 * Builder method for [ComparableQuantity] with unit [VELOCITY_OF_LIGHT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.velocityOfLight: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, VELOCITY_OF_LIGHT)

/**
 * Builder method for [ComparableQuantity] with unit [VELOCITY_OF_LIGHT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.velocityOfLight: ComparableQuantity<Speed>
    get() = number(VELOCITY_OF_LIGHT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [PLANCK].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.plank: ComparableQuantity<Action>
    get() = Quantities.getQuantity<Action>(this, PLANCK)

/**
 * Builder method for [ComparableQuantity] with unit [PLANCK].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.plank: ComparableQuantity<Action>
    get() = number(PLANCK.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [PERMITTIVITY_OF_VACUUM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.permittivityOfVacuum: ComparableQuantity<ElectricPermittivity>
    get() = Quantities.getQuantity<ElectricPermittivity>(this, PERMITTIVITY_OF_VACUUM)

/**
 * Builder method for [ComparableQuantity] with unit [PERMEABILITY_OF_VACUUM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.permeabilityOfVacuum: ComparableQuantity<MagneticPermeability>
    get() = Quantities.getQuantity<MagneticPermeability>(this, PERMEABILITY_OF_VACUUM)

/**
 * Builder method for [ComparableQuantity] with unit [ELEMENTARY_CHARGE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.elementaryCharge: ComparableQuantity<ElectricCharge>
    get() = Quantities.getQuantity<ElectricCharge>(this, ELEMENTARY_CHARGE)

/**
 * Builder method for [ComparableQuantity] with unit [ELECTRON_MASS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.electronMass: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, ELECTRON_MASS)

/**
 * Builder method for [ComparableQuantity] with unit [ELECTRON_MASS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.electronMass: ComparableQuantity<Mass>
    get() = number(ELECTRON_MASS.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [PROTON_MASS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.protonMass: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, PROTON_MASS)

/**
 * Builder method for [ComparableQuantity] with unit [PROTON_MASS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.protonMass: ComparableQuantity<Mass>
    get() = number(PROTON_MASS.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [ATMOSPHERE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.atmosphere: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, ATMOSPHERE)

/**
 * Builder method for [ComparableQuantity] with unit [ATMOSPHERE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.atmosphere: ComparableQuantity<Pressure>
    get() = number(ATMOSPHERE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [LIGHT_YEAR].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.lightYear: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LIGHT_YEAR)

/**
 * Builder method for [ComparableQuantity] with unit [LIGHT_YEAR].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.lightYear: ComparableQuantity<Length>
    get() = number(LIGHT_YEAR.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [GRAM_FORCE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gramForce: ComparableQuantity<Force>
    get() = Quantities.getQuantity<Force>(this, GRAM_FORCE)

/**
 * Builder method for [ComparableQuantity] with unit [GRAM_FORCE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.gramForce: ComparableQuantity<Force>
    get() = number(GRAM_FORCE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [KAYSER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.kayser: ComparableQuantity<WaveNumber>
    get() = Quantities.getQuantity<WaveNumber>(this, KAYSER)

/**
 * Builder method for [ComparableQuantity] with unit [KAYSER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.kayser: ComparableQuantity<WaveNumber>
    get() = number(KAYSER.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BIOT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.biot: ComparableQuantity<ElectricCurrent>
    get() = Quantities.getQuantity<ElectricCurrent>(this, BIOT)

/**
 * Builder method for [ComparableQuantity] with unit [BIOT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.biot: ComparableQuantity<ElectricCurrent>
    get() = number(BIOT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [STOKES].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.stokes: ComparableQuantity<KinematicViscosity>
    get() = Quantities.getQuantity<KinematicViscosity>(this, STOKES)

/**
 * Builder method for [ComparableQuantity] with unit [STOKES].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.stokes: ComparableQuantity<KinematicViscosity>
    get() = number(STOKES.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [MAXWELL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.maxwell: ComparableQuantity<MagneticFlux>
    get() = Quantities.getQuantity<MagneticFlux>(this, MAXWELL)

/**
 * Builder method for [ComparableQuantity] with unit [MAXWELL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.maxwell: ComparableQuantity<MagneticFlux>
    get() = number(MAXWELL.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [GAUSS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gauss: ComparableQuantity<MagneticFluxDensity>
    get() = Quantities.getQuantity<MagneticFluxDensity>(this, GAUSS)

/**
 * Builder method for [ComparableQuantity] with unit [GAUSS].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.gauss: ComparableQuantity<MagneticFluxDensity>
    get() = number(GAUSS.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [OERSTED].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.oersted: ComparableQuantity<MagneticFieldStrength>
    get() = Quantities.getQuantity<MagneticFieldStrength>(this, OERSTED)

/**
 * Builder method for [ComparableQuantity] with unit [OERSTED].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.oersted: ComparableQuantity<MagneticFieldStrength>
    get() = number(OERSTED.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [GILBERT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gilbert: ComparableQuantity<MagnetomotiveForce>
    get() = Quantities.getQuantity<MagnetomotiveForce>(this, GILBERT)

/**
 * Builder method for [ComparableQuantity] with unit [GILBERT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.gilbert: ComparableQuantity<MagnetomotiveForce>
    get() = number(GILBERT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [STILB].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.stilb: ComparableQuantity<Luminance>
    get() = Quantities.getQuantity<Luminance>(this, STILB)

/**
 * Builder method for [ComparableQuantity] with unit [STILB].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.stilb: ComparableQuantity<Luminance>
    get() = number(STILB.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [LAMBERT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.lambert: ComparableQuantity<Luminance>
    get() = Quantities.getQuantity<Luminance>(this, LAMBERT)

/**
 * Builder method for [ComparableQuantity] with unit [LAMBERT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.lambert: ComparableQuantity<Luminance>
    get() = number(LAMBERT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [PHOT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.phot: ComparableQuantity<Illuminance>
    get() = Quantities.getQuantity<Illuminance>(this, PHOT)

/**
 * Builder method for [ComparableQuantity] with unit [PHOT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.phot: ComparableQuantity<Illuminance>
    get() = number(PHOT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CURIE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.curie: ComparableQuantity<Radioactivity>
    get() = Quantities.getQuantity<Radioactivity>(this, CURIE)

/**
 * Builder method for [ComparableQuantity] with unit [CURIE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.curie: ComparableQuantity<Radioactivity>
    get() = number(CURIE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [ROENTGEN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.roentgen: ComparableQuantity<IonizingRadiation>
    get() = Quantities.getQuantity<IonizingRadiation>(this, ROENTGEN)

/**
 * Builder method for [ComparableQuantity] with unit [ROENTGEN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.roentgen: ComparableQuantity<IonizingRadiation>
    get() = number(ROENTGEN.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [INCH_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.inchInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, INCH_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [FOOT_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.footInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FOOT_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [YARD_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.yardInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, YARD_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [MILE_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.mileInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MILE_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [FATHOM_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.fathomInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FATHOM_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [NAUTICAL_MILE_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.nauticalMileInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, NAUTICAL_MILE_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [KNOT_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.knotInternational: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, KNOT_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [SQUARE_INCH_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.squareInchInternational: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_INCH_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [SQUARE_FOOT_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.squareFootInternational: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_FOOT_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [SQUARE_YARD_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.squareYardInternational: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_YARD_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [CUBIC_INCH_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.cubicInchInternational: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_INCH_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [CUBIC_FOOT_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.cubicFootInternational: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_FOOT_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [CUBIC_YARD_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.cubicYardInternational: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUBIC_YARD_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [BOARD_FOOT_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.boardFootInternational: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BOARD_FOOT_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [CORD_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.cordInternational: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CORD_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [MIL_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.milInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MIL_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [MIL_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.milInternational: ComparableQuantity<Length>
    get() = number(MIL_INTERNATIONAL.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CIRCULAR_MIL_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.circularMilInternational: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, CIRCULAR_MIL_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [HAND_INTERNATIONAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.handInternational: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, HAND_INTERNATIONAL)

/**
 * Builder method for [ComparableQuantity] with unit [FOOT_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.footUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FOOT_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [YARD_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.yardUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, YARD_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [INCH_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.inchUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, INCH_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [ROD_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.rodUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ROD_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [CHAIN_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.chainUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CHAIN_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [LINK_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.linkUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LINK_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [RAMDEN_CHAIN_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ramdenChainUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, RAMDEN_CHAIN_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [RAMDEN_LINK_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ramdenLinkUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, RAMDEN_LINK_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [FATHOM_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.fathomUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FATHOM_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [FURLONG_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.furlongUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FURLONG_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [FURLONG_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.mileUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FURLONG_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [ACRE_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.areaUsSurvey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, ACRE_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [SQUARE_ROD_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.squareRodUsSurvey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_ROD_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [SQUARE_MILE_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.squareMileUsSurvey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SQUARE_MILE_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [SECTION_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.sectionUsSurvey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, SECTION_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [TOWNSHP_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.townshipUsSurvey: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, TOWNSHP_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [MIL_US_SURVEY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.milUsSurvey: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MIL_US_SURVEY)

/**
 * Builder method for [ComparableQuantity] with unit [INCH_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.inchBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, INCH_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [FOOT_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.footBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FOOT_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [ROD_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.rodBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ROD_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [CHAIN_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.chainBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CHAIN_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [LINK_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.linkBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LINK_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [FATHOM_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.fathomBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, FATHOM_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [PACE_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.paceBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PACE_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [YARD_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.yardBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, YARD_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [MILE_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.mileBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, MILE_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [NAUTICAL_MILE_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.nauticalMileBritish: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, NAUTICAL_MILE_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [KNOT_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.knotBritish: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, KNOT_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [ACRE_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.acreBritish: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, ACRE_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [GALLON_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gallonUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GALLON_US)

/**
 * Builder method for [ComparableQuantity] with unit [BARREL_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.barrelUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BARREL_US)

/**
 * Builder method for [ComparableQuantity] with unit [QUART_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.quartUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, QUART_US)

/**
 * Builder method for [ComparableQuantity] with unit [PINT_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.pintUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PINT_US)

/**
 * Builder method for [ComparableQuantity] with unit [GILL_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gillUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GILL_US)

/**
 * Builder method for [ComparableQuantity] with unit [FLUID_OUNCE_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.fluidOunceUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_OUNCE_US)

/**
 * Builder method for [ComparableQuantity] with unit [FLUID_DRAM_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.fluidDramUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_DRAM_US)

/**
 * Builder method for [ComparableQuantity] with unit [MINIM_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.minumUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, MINIM_US)

/**
 * Builder method for [ComparableQuantity] with unit [CORD_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.cordUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CORD_US)

/**
 * Builder method for [ComparableQuantity] with unit [BUSHEL_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.bushelUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BUSHEL_US)

/**
 * Builder method for [ComparableQuantity] with unit [GALLON_WINCHESTER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gallonWinchester: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GALLON_WINCHESTER)

/**
 * Builder method for [ComparableQuantity] with unit [PECK_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.peckUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PECK_US)

/**
 * Builder method for [ComparableQuantity] with unit [DRY_QUART_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.dryQuartUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, DRY_QUART_US)

/**
 * Builder method for [ComparableQuantity] with unit [DRY_PINT_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.dryPintUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, DRY_PINT_US)

/**
 * Builder method for [ComparableQuantity] with unit [TABLESPOON_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.tablespoonUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, TABLESPOON_US)

/**
 * Builder method for [ComparableQuantity] with unit [TEASPOON_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.teaspoonUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, TEASPOON_US)

/**
 * Builder method for [ComparableQuantity] with unit [CUP_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.cupUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, CUP_US)

/**
 * Builder method for [ComparableQuantity] with unit [METRIC_FLUID_OUNCE_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.metricFluidOunceUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, METRIC_FLUID_OUNCE_US)

/**
 * Builder method for [ComparableQuantity] with unit [METRIC_CUP_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.metricCupUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, METRIC_CUP_US)

/**
 * Builder method for [ComparableQuantity] with unit [METRIC_TEASPOON_CUP_US].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.metricTeaspoonCupUs: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, METRIC_TEASPOON_CUP_US)

/**
 * Builder method for [ComparableQuantity] with unit [GALLON_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gallonBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GALLON_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [PECK_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.peckBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PECK_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [BUSHEL_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.bushelBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, BUSHEL_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [QUART_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.quartBritsh: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, QUART_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [PINT_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.pintBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, PINT_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [GILL_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gillBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, GILL_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [FLUID_OUNCE_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.fluidOunceBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_OUNCE_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [FLUID_DRAM_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.fluidDramBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, FLUID_DRAM_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [MINIM_BRITISH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.minimBritish: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, MINIM_BRITISH)

/**
 * Builder method for [ComparableQuantity] with unit [GRAIN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.grain: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, GRAIN)

/**
 * Builder method for [ComparableQuantity] with unit [POUND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.pound: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, POUND)

/**
 * Builder method for [ComparableQuantity] with unit [OUNCE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ounce: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, OUNCE)

/**
 * Builder method for [ComparableQuantity] with unit [DRAM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.dram: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, DRAM)

/**
 * Builder method for [ComparableQuantity] with unit [SHORT_HUNDREDWEIGHT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.shortHundredweight: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, SHORT_HUNDREDWEIGHT)

/**
 * Builder method for [ComparableQuantity] with unit [LONG_HUNDREDWEIGHT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.longHundredweight: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, LONG_HUNDREDWEIGHT)

/**
 * Builder method for [ComparableQuantity] with unit [SHORT_TON].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.shortTon: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, SHORT_TON)

/**
 * Builder method for [ComparableQuantity] with unit [LONG_TON].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.longTon: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, LONG_TON)

/**
 * Builder method for [ComparableQuantity] with unit [STONE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.stone: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, STONE)

/**
 * Builder method for [ComparableQuantity] with unit [POUND_FORCE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.poundForce: ComparableQuantity<Force>
    get() = Quantities.getQuantity<Force>(this, POUND_FORCE)

/**
 * Builder method for [ComparableQuantity] with unit [PENNYWEIGHT_TROY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.pennyweightTroy: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, PENNYWEIGHT_TROY)

/**
 * Builder method for [ComparableQuantity] with unit [OUNCE_TROY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ounceTroy: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, OUNCE_TROY)

/**
 * Builder method for [ComparableQuantity] with unit [POUND_TROY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.poundTroy: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, POUND_TROY)

/**
 * Builder method for [ComparableQuantity] with unit [SCRUPLE_APOTHECARY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.scrupleApothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, SCRUPLE_APOTHECARY)

/**
 * Builder method for [ComparableQuantity] with unit [DRAM_APOTHECARY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.dramApothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, DRAM_APOTHECARY)

/**
 * Builder method for [ComparableQuantity] with unit [OUNCE_APOTHECARY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ounceApothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, OUNCE_APOTHECARY)

/**
 * Builder method for [ComparableQuantity] with unit [POUND_APOTHECARY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.poundApothecary: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, POUND_APOTHECARY)

/**
 * Builder method for [ComparableQuantity] with unit [METRIC_OUNCE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.metricOunce: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, METRIC_OUNCE)

/**
 * Builder method for [ComparableQuantity] with unit [METRIC_OUNCE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.metricOunce: ComparableQuantity<Mass>
    get() = number(METRIC_OUNCE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [LINE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.line: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LINE)

/**
 * Builder method for [ComparableQuantity] with unit [POINT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.point: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, POINT)

/**
 * Builder method for [ComparableQuantity] with unit [PICA].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.pica: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PICA)

/**
 * Builder method for [ComparableQuantity] with unit [POINT_PRINTER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.pointPrinter: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, POINT_PRINTER)

/**
 * Builder method for [ComparableQuantity] with unit [PICA_PRINTER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.picaPrinter: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PICA_PRINTER)

/**
 * Builder method for [ComparableQuantity] with unit [PIED].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.pied: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, PIED)

/**
 * Builder method for [ComparableQuantity] with unit [POUCE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.pouce: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, POUCE)

/**
 * Builder method for [ComparableQuantity] with unit [LIGNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ligne: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, LIGNE)

/**
 * Builder method for [ComparableQuantity] with unit [DIDOT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.didot: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, DIDOT)

/**
 * Builder method for [ComparableQuantity] with unit [CICERO].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.cicero: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CICERO)

/**
 * Builder method for [ComparableQuantity] with unit [REAUMUR].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.reaumur: ComparableQuantity<Temperature>
    get() = Quantities.getQuantity<Temperature>(this, REAUMUR)

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_AT_15C].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.calorieAt15C: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_AT_15C)

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_AT_15C].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.calorieAt15C: ComparableQuantity<Energy>
    get() = number(CALORIE_AT_15C.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_AT_20C].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.calorieAt20C: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_AT_20C)

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_AT_20C].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.calorieAt20C: ComparableQuantity<Energy>
    get() = number(CALORIE_AT_20C.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_MEAN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.calorieMean: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_MEAN)

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_MEAN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.calorieMean: ComparableQuantity<Energy>
    get() = number(CALORIE_MEAN.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_INTERNATIONAL_TABLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.calorieInternationalTable: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_INTERNATIONAL_TABLE)

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_INTERNATIONAL_TABLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.calorieInternationalTable: ComparableQuantity<Energy>
    get() = number(CALORIE_INTERNATIONAL_TABLE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_THERMOCHEMICAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.calorieThermochemical: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_THERMOCHEMICAL)

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_THERMOCHEMICAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.calorieThermochemical: ComparableQuantity<Energy>
    get() = number(CALORIE_THERMOCHEMICAL.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.calorie: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE)

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.calorie: ComparableQuantity<Energy>
    get() = number(CALORIE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_FOOD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.calorieFood: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, CALORIE_FOOD)

/**
 * Builder method for [ComparableQuantity] with unit [CALORIE_FOOD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.calorieFood: ComparableQuantity<Energy>
    get() = number(CALORIE_FOOD.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BTU_AT_39F].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.btuAt39F: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_AT_39F)

/**
 * Builder method for [ComparableQuantity] with unit [BTU_AT_59F].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.btuAt59F: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_AT_59F)

/**
 * Builder method for [ComparableQuantity] with unit [BTU_AT_60F].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.btuAt60F: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_AT_60F)

/**
 * Builder method for [ComparableQuantity] with unit [BTU_AT_60F].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.btuAt60F: ComparableQuantity<Energy>
    get() = number(BTU_AT_60F.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BTU_MEAN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.btuMean: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_MEAN)

/**
 * Builder method for [ComparableQuantity] with unit [BTU_INTERNATIONAL_TABLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.btuInternationalTable: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_INTERNATIONAL_TABLE)

/**
 * Builder method for [ComparableQuantity] with unit [BTU_THERMOCHEMICAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.btuThermochemical: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU_THERMOCHEMICAL)

/**
 * Builder method for [ComparableQuantity] with unit [BTU].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.btu: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, BTU)

/**
 * Builder method for [ComparableQuantity] with unit [HORSEPOWER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.horsepower: ComparableQuantity<Power>
    get() = Quantities.getQuantity<Power>(this, HORSEPOWER)

/**
 * Builder method for [ComparableQuantity] with unit [METER_OF_WATER_COLUMN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.meterOfWaterColumn: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, METER_OF_WATER_COLUMN)

/**
 * Builder method for [ComparableQuantity] with unit [METER_OF_WATER_COLUMN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.meterOfWaterColumn: ComparableQuantity<Pressure>
    get() = number(METER_OF_WATER_COLUMN.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [METER_OF_MERCURY_COLUMN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.meterOfMercuryColumn: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, METER_OF_MERCURY_COLUMN)

/**
 * Builder method for [ComparableQuantity] with unit [METER_OF_MERCURY_COLUMN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.meterOfMercuryColumn: ComparableQuantity<Pressure>
    get() = number(METER_OF_MERCURY_COLUMN.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [INCH_OF_WATER_COLUMN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.inchOfWaterColumn: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, INCH_OF_WATER_COLUMN)

/**
 * Builder method for [ComparableQuantity] with unit [INCH_OF_MERCURY_COLUMN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.inchOfMercuryColumn: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, INCH_OF_MERCURY_COLUMN)

/**
 * Builder method for [ComparableQuantity] with unit [DROP].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.drop: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, DROP)

/**
 * Builder method for [ComparableQuantity] with unit [PH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ph: ComparableQuantity<Acidity>
    get() = Quantities.getQuantity<Acidity>(this, PH)

/**
 * Builder method for [ComparableQuantity] with unit [GRAM_PERCENT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gramPercent: ComparableQuantity<Concentration<Mass>>
    get() = Quantities.getQuantity<Concentration<Mass>>(this, GRAM_PERCENT)

/**
 * Builder method for [ComparableQuantity] with unit [GRAM_PERCENT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.gramPercent: ComparableQuantity<Concentration<Mass>>
    get() = number(GRAM_PERCENT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [HIGH_POWER_FIELD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.highPowerFeild: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, HIGH_POWER_FIELD)

/**
 * Builder method for [ComparableQuantity] with unit [LOW_POWER_FIELD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.lowPowerFeild: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, LOW_POWER_FIELD)

/**
 * Builder method for [ComparableQuantity] with unit [NEPER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.neper: ComparableQuantity<Level<Dimensionless>>
    get() = Quantities.getQuantity<Level<Dimensionless>>(this, NEPER)

/**
 * Builder method for [ComparableQuantity] with unit [NEPER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.neper: ComparableQuantity<Level<Dimensionless>>
    get() = number(NEPER.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BEL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.bel: ComparableQuantity<Level<Dimensionless>>
    get() = Quantities.getQuantity<Level<Dimensionless>>(this, BEL)

/**
 * Builder method for [ComparableQuantity] with unit [BEL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.bel: ComparableQuantity<Level<Dimensionless>>
    get() = number(BEL.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BEL_SOUND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.belSound: ComparableQuantity<Level<Pressure>>
    get() = Quantities.getQuantity<Level<Pressure>>(this, BEL_SOUND)

/**
 * Builder method for [ComparableQuantity] with unit [BEL_SOUND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.belSound: ComparableQuantity<Level<Pressure>>
    get() = number(BEL_SOUND.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BEL_VOLT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.belVolt: ComparableQuantity<Level<ElectricPotential>>
    get() = Quantities.getQuantity<Level<ElectricPotential>>(this, BEL_VOLT)

/**
 * Builder method for [ComparableQuantity] with unit [BEL_VOLT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.belVolt: ComparableQuantity<Level<ElectricPotential>>
    get() = number(BEL_VOLT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BEL_10_NANOVOLT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.bel10Nanovolt: ComparableQuantity<Level<ElectricPotential>>
    get() = Quantities.getQuantity<Level<ElectricPotential>>(this, BEL_10_NANOVOLT)

/**
 * Builder method for [ComparableQuantity] with unit [BEL_10_NANOVOLT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.bel10Nanovolt: ComparableQuantity<Level<ElectricPotential>>
    get() = number(BEL_10_NANOVOLT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BEL_WATT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.belWatt: ComparableQuantity<Level<ElectricPotential>>
    get() = Quantities.getQuantity<Level<ElectricPotential>>(this, BEL_WATT)

/**
 * Builder method for [ComparableQuantity] with unit [BEL_WATT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.belWatt: ComparableQuantity<Level<ElectricPotential>>
    get() = number(BEL_WATT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [STERE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.stere: ComparableQuantity<Volume>
    get() = Quantities.getQuantity<Volume>(this, STERE)

/**
 * Builder method for [ComparableQuantity] with unit [STERE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.stere: ComparableQuantity<Volume>
    get() = number(STERE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BARN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.barn: ComparableQuantity<Area>
    get() = Quantities.getQuantity<Area>(this, BARN)

/**
 * Builder method for [ComparableQuantity] with unit [BARN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.barn: ComparableQuantity<Area>
    get() = number(BARN.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [ATMOSPHERE_TECHNICAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.atmosphereTechnical: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, ATMOSPHERE_TECHNICAL)

/**
 * Builder method for [ComparableQuantity] with unit [ATMOSPHERE_TECHNICAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.atmosphereTechnical: ComparableQuantity<Pressure>
    get() = number(ATMOSPHERE_TECHNICAL.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [MHO].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.mho: ComparableQuantity<ElectricConductance>
    get() = Quantities.getQuantity<ElectricConductance>(this, MHO)

/**
 * Builder method for [ComparableQuantity] with unit [MHO].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.mho: ComparableQuantity<ElectricConductance>
    get() = number(MHO.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [POUND_PER_SQUARE_INCH].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.poundPerSquareInch: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, POUND_PER_SQUARE_INCH)

/**
 * Builder method for [ComparableQuantity] with unit [CIRCLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.circle: ComparableQuantity<Angle>
    get() = Quantities.getQuantity<Angle>(this, CIRCLE)

/**
 * Builder method for [ComparableQuantity] with unit [CIRCLE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.circle: ComparableQuantity<Angle>
    get() = number(CIRCLE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [SPHERE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.sphere: ComparableQuantity<SolidAngle>
    get() = Quantities.getQuantity<SolidAngle>(this, SPHERE)

/**
 * Builder method for [ComparableQuantity] with unit [SPHERE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.sphere: ComparableQuantity<SolidAngle>
    get() = number(SPHERE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CARAT_METRIC].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.caratMetric: ComparableQuantity<Mass>
    get() = Quantities.getQuantity<Mass>(this, CARAT_METRIC)

/**
 * Builder method for [ComparableQuantity] with unit [CARAT_METRIC].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.caratMetric: ComparableQuantity<Mass>
    get() = number(CARAT_METRIC.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CARAT_GOLD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.caratGold: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, CARAT_GOLD)

/**
 * Builder method for [ComparableQuantity] with unit [CARAT_GOLD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.caratGold: ComparableQuantity<Dimensionless>
    get() = number(CARAT_GOLD.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [SMOOT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.smoot: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, SMOOT)

/**
 * Builder method for [ComparableQuantity] with unit [SMOOT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.smoot: ComparableQuantity<Length>
    get() = number(SMOOT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BIT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.bit: ComparableQuantity<Information>
    get() = Quantities.getQuantity<Information>(this, BIT)

/**
 * Builder method for [ComparableQuantity] with unit [BIT].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.bit: ComparableQuantity<Information>
    get() = number(BIT.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BYTE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.byte: ComparableQuantity<Information>
    get() = Quantities.getQuantity<Information>(this, BYTE)

/**
 * Builder method for [ComparableQuantity] with unit [BYTE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.byte: ComparableQuantity<Information>
    get() = number(BYTE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [BAUD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.baud: ComparableQuantity<InformationRate>
    get() = Quantities.getQuantity<InformationRate>(this, BAUD)

/**
 * Builder method for [ComparableQuantity] with unit [BAUD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.baud: ComparableQuantity<InformationRate>
    get() = number(BAUD.transform(prefix.converter))