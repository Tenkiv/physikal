package org.tenkiv.physikal.core

import tec.uom.se.unit.MetricPrefix.*

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