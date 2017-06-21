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

val Number.pi: ComparableQuantity<Dimensionless>
    get() = Quantities.getQuantity<Dimensionless>(this, PI)

val Number.atom: ComparableQuantity<AmountOfSubstance>
    get() = Quantities.getQuantity<AmountOfSubstance>(this, ATOM)

val MetricPrefixedNumber.atom: ComparableQuantity<AmountOfSubstance>
    get() = number(ATOM.transform(prefix.converter))

val Number.angstrom: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, ANGSTROM)

val MetricPrefixedNumber.angstrom: ComparableQuantity<Length>
    get() = number(ANGSTROM.transform(prefix.converter))

val Number.daySideral: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, DAY_SIDEREAL)

val Number.yearCalendar: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR_CALENDAR)

val Number.yearSidereal: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR_SIDEREAL)

val Number.yearJulien: ComparableQuantity<Time>
    get() = Quantities.getQuantity<Time>(this, YEAR_JULIEN)

val Number.bar: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, BAR)

val MetricPrefixedNumber.bar: ComparableQuantity<Pressure>
    get() = number(BAR.transform(prefix.converter))

val Number.millimetreOfMercury: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, MILLIMETRE_OF_MERCURY)

val MetricPrefixedNumber.millimetreOfMercury: ComparableQuantity<Pressure>
    get() = number(MILLIMETRE_OF_MERCURY.transform(prefix.converter))

val Number.inchOfMercury: ComparableQuantity<Pressure>
    get() = Quantities.getQuantity<Pressure>(this, INCH_OF_MERCURY)

val Number.rad: ComparableQuantity<RadiationDoseAbsorbed>
    get() = Quantities.getQuantity<RadiationDoseAbsorbed>(this, RAD)

val MetricPrefixedNumber.rad: ComparableQuantity<RadiationDoseAbsorbed>
    get() = number(RAD.transform(prefix.converter))

val Number.rem: ComparableQuantity<RadiationDoseEffective>
    get() = Quantities.getQuantity<RadiationDoseEffective>(this, REM)

val MetricPrefixedNumber.rem: ComparableQuantity<RadiationDoseEffective>
    get() = number(REM.transform(prefix.converter))

val Number.roentgen: ComparableQuantity<IonizingRadiation>
    get() = Quantities.getQuantity<IonizingRadiation>(this, ROENTGEN)

val MetricPrefixedNumber.roentgen: ComparableQuantity<IonizingRadiation>
    get() = number(ROENTGEN.transform(prefix.converter))