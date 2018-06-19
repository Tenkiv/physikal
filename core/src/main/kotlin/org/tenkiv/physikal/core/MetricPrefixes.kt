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