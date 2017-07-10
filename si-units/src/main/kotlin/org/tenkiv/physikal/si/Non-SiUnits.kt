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
package org.tenkiv.physikal.si

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import si.uom.NonSI.*
import si.uom.quantity.IonizingRadiation
import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import javax.measure.quantity.*

//For some reason There are public Non-SI Units are included in the SI-Units library,
//so here they are.

/**
 * Builder method for [ComparableQuantity] with unit [PI].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.pi: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PI)

/**
 * Builder method for [ComparableQuantity] with unit [ATOM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.atom: ComparableQuantity<AmountOfSubstance>
    get() = Quantities.getQuantity<AmountOfSubstance>(this, ATOM)

/**
 * Builder method for [ComparableQuantity] with unit [ATOM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.atom: ComparableQuantity<AmountOfSubstance>
    get() = number(ATOM.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [ANGSTROM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.angstrom: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ANGSTROM)

/**
 * Builder method for [ComparableQuantity] with unit [ANGSTROM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.angstrom: ComparableQuantity<Length>
    get() = number(ANGSTROM.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [DAY_SIDEREAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.daySideral: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, DAY_SIDEREAL)

/**
 * Builder method for [ComparableQuantity] with unit [YEAR_CALENDAR].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.yearCalendar: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR_CALENDAR)

/**
 * Builder method for [ComparableQuantity] with unit [YEAR_SIDEREAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.yearSidereal: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR_SIDEREAL)

/**
 * Builder method for [ComparableQuantity] with unit [YEAR_JULIEN].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.yearJulien: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR_JULIEN)

/**
 * Builder method for [ComparableQuantity] with unit [BAR].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.bar: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, BAR)

/**
 * Builder method for [ComparableQuantity] with unit [BAR].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.bar: ComparableQuantity<Pressure>
    get() = number(BAR.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [MILLIMETRE_OF_MERCURY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.millimetreOfMercury: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, MILLIMETRE_OF_MERCURY)

/**
 * Builder method for [ComparableQuantity] with unit [MILLIMETRE_OF_MERCURY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.millimetreOfMercury: ComparableQuantity<Pressure>
    get() = number(MILLIMETRE_OF_MERCURY.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [INCH_OF_MERCURY].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.inchOfMercury: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, INCH_OF_MERCURY)

/**
 * Builder method for [ComparableQuantity] with unit [RAD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.rad: ComparableQuantity<RadiationDoseAbsorbed>
    get() = Quantities.getQuantity<RadiationDoseAbsorbed>(this, RAD)

/**
 * Builder method for [ComparableQuantity] with unit [RAD].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.rad: ComparableQuantity<RadiationDoseAbsorbed>
    get() = number(RAD.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [REM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.rem: ComparableQuantity<RadiationDoseEffective>
    get() = Quantities.getQuantity<RadiationDoseEffective>(this, REM)

/**
 * Builder method for [ComparableQuantity] with unit [REM].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.rem: ComparableQuantity<RadiationDoseEffective>
    get() = number(REM.transform(prefix.converter))

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