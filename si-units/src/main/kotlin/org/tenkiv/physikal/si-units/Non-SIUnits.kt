package org.tenkiv.physikal.`si-units`

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import si.uom.NonSI.*
import si.uom.quantity.IonizingRadiation
import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import javax.measure.quantity.*

//For some reason There are public Non-SI Units are included in the SI-Units library,
//so here they are.

val Number.pi: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PI)

val MetricPrefixedNumber.pi: ComparableQuantity<Dimensionless>
    get() = number(PI.transform(prefix.converter))

val Number.atom: ComparableQuantity<AmountOfSubstance>
    get() = Quantities.getQuantity<AmountOfSubstance>(this, ATOM)

val MetricPrefixedNumber.atom: ComparableQuantity<AmountOfSubstance>
    get() = number(ATOM.transform(prefix.converter))

val Number.angstrom: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ANGSTROM)

val MetricPrefixedNumber.angstrom: ComparableQuantity<Length>
    get() = number(ANGSTROM.transform(prefix.converter))

val Number.day_sideral: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, DAY_SIDEREAL)

val MetricPrefixedNumber.day_sideral: ComparableQuantity<Time>
    get() = number(DAY_SIDEREAL.transform(prefix.converter))

val Number.year_calendar: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR_CALENDAR)

val MetricPrefixedNumber.year_calendar: ComparableQuantity<Time>
    get() = number(YEAR_CALENDAR.transform(prefix.converter))

val Number.year_sidereal: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR_SIDEREAL)

val MetricPrefixedNumber.year_sidereal: ComparableQuantity<Time>
    get() = number(YEAR_SIDEREAL.transform(prefix.converter))

val Number.year_julien: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR_JULIEN)

val MetricPrefixedNumber.year_julien: ComparableQuantity<Time>
    get() = number(YEAR_JULIEN.transform(prefix.converter))

val Number.bar: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, BAR)

val MetricPrefixedNumber.bar: ComparableQuantity<Pressure>
    get() = number(BAR.transform(prefix.converter))

val Number.millimetre_of_mercury: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, MILLIMETRE_OF_MERCURY)

val MetricPrefixedNumber.millimetre_of_mercury: ComparableQuantity<Pressure>
    get() = number(MILLIMETRE_OF_MERCURY.transform(prefix.converter))

val Number.inch_of_mercury: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, INCH_OF_MERCURY)

val MetricPrefixedNumber.inch_of_mercury: ComparableQuantity<Pressure>
    get() = number(INCH_OF_MERCURY.transform(prefix.converter))

val Number.rad: ComparableQuantity<RadiationDoseAbsorbed>
    get() = Quantities.getQuantity<RadiationDoseAbsorbed>(this, RAD)

val MetricPrefixedNumber.rad: ComparableQuantity<RadiationDoseAbsorbed>
    get() = number(RAD.transform(prefix.converter))

val Number.rem: ComparableQuantity<RadiationDoseEffective>
    get() = Quantities.getQuantity<RadiationDoseEffective>(this, REM)

val MetricPrefixedNumber.rem: ComparableQuantity<RadiationDoseEffective>
    get() = number(REM.transform(prefix.converter))

val Number.roetgen: ComparableQuantity<IonizingRadiation>
    get() = Quantities.getQuantity<IonizingRadiation>(this, ROENTGEN)

val MetricPrefixedNumber.roetgen: ComparableQuantity<IonizingRadiation>
    get() = number(ROENTGEN.transform(prefix.converter))