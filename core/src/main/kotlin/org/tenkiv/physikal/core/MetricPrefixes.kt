/*
 * Copyright 2019 Tenkiv, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.tenkiv.physikal.core

import tec.units.indriya.unit.MetricPrefix.*

// All builtin prefixes
/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.ZETTA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.zetta get() = MetricPrefixedNumber(this, ZETTA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.EXA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.exa get() = MetricPrefixedNumber(this, EXA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.PETA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.peta get() = MetricPrefixedNumber(this, PETA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.TERA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.tera get() = MetricPrefixedNumber(this, TERA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.GIGA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.giga get() = MetricPrefixedNumber(this, GIGA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.MEGA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.mega get() = MetricPrefixedNumber(this, MEGA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.KILO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.kilo get() = MetricPrefixedNumber(this, KILO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.HECTO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.hecto get() = MetricPrefixedNumber(this, HECTO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.DEKA].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.deka get() = MetricPrefixedNumber(this, DEKA)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.DECI].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.deci get() = MetricPrefixedNumber(this, DECI)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.CENTI].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.centi get() = MetricPrefixedNumber(this, CENTI)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.MILLI].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.milli get() = MetricPrefixedNumber(this, MILLI)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.MICRO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.micro get() = MetricPrefixedNumber(this, MICRO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.NANO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.nano get() = MetricPrefixedNumber(this, NANO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.PICO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.pico get() = MetricPrefixedNumber(this, PICO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.FEMTO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.femto get() = MetricPrefixedNumber(this, FEMTO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.ATTO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.atto get() = MetricPrefixedNumber(this, ATTO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.ZEPTO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.zepto get() = MetricPrefixedNumber(this, ZEPTO)

/**
 * Creates a [MetricPrefixedNumber] for creating [javax.measure.Quantity] with [tec.units.indriya.unit.MetricPrefix.YOCTO].
 *
 * @return [MetricPrefixedNumber] with specified [tec.units.indriya.unit.MetricPrefix].
 */
val Number.yocto get() = MetricPrefixedNumber(this, YOCTO)