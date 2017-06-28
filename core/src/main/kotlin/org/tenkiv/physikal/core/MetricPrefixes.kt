package org.tenkiv.physikal.core

import tec.uom.se.unit.MetricPrefix.*

// All builtin prefixes
/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.ZETTA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.zetta get() = MetricPrefixedNumber(this, ZETTA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.EXA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.exa get() = MetricPrefixedNumber(this, EXA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.PETA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.peta get() = MetricPrefixedNumber(this, PETA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.TERA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.tera get() = MetricPrefixedNumber(this, TERA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.GIGA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.giga get() = MetricPrefixedNumber(this, GIGA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.MEGA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.mega get() = MetricPrefixedNumber(this, MEGA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.KILO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.kilo get() = MetricPrefixedNumber(this, KILO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.HECTO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.hecto get() = MetricPrefixedNumber(this, HECTO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.DEKA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.deka get() = MetricPrefixedNumber(this, DEKA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.DECI].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.deci get() = MetricPrefixedNumber(this, DECI)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.CENTI].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.centi get() = MetricPrefixedNumber(this, CENTI)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.MILLI].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.milli get() = MetricPrefixedNumber(this, MILLI)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.MICRO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.micro get() = MetricPrefixedNumber(this, MICRO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.NANO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.nano get() = MetricPrefixedNumber(this, NANO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.PICO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.pico get() = MetricPrefixedNumber(this, PICO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.FEMTO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.femto get() = MetricPrefixedNumber(this, FEMTO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.ATTO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.atto get() = MetricPrefixedNumber(this, ATTO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.ZEPTO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.zepto get() = MetricPrefixedNumber(this, ZEPTO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.uom.se.unit.MetricPrefix.YOCTO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.uom.se.unit.MetricPrefix].
 */
val Number.yocto get() = MetricPrefixedNumber(this, YOCTO)