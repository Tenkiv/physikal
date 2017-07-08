/**
 * Copyright 2017 TENKIV, INC.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.tenkiv.physikal.complete

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import si.uom.quantity.DynamicViscosity
import si.uom.quantity.KinematicViscosity
import systems.uom.common.CGS.*
import tec.uom.se.ComparableQuantity
import tec.uom.se.quantity.Quantities
import javax.measure.quantity.*

/**
 * Builder method for [ComparableQuantity] with unit [CENTIMETRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.centimetre: ComparableQuantity<Length>
    get() = Quantities.getQuantity<Length>(this, CENTIMETRE)

/**
 * Builder method for [ComparableQuantity] with unit [CENTIMETRE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.centimetre: ComparableQuantity<Length>
    get() = number(CENTIMETRE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [CENTIMETRE_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.centimetrePerSecond: ComparableQuantity<Speed>
    get() = Quantities.getQuantity<Speed>(this, CENTIMETRE_PER_SECOND)

/**
 * Builder method for [ComparableQuantity] with unit [CENTIMETRE_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.centimetrePerSecond: ComparableQuantity<Speed>
    get() = number(CENTIMETRE_PER_SECOND.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [KAYSER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.kayserCgs: ComparableQuantity<KinematicViscosity>
    get() = Quantities.getQuantity<KinematicViscosity>(this, KAYSER)

/**
 * Builder method for [ComparableQuantity] with unit [KAYSER].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.kayserCgs: ComparableQuantity<KinematicViscosity>
    get() = number(KAYSER.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [GAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.gal: ComparableQuantity<Acceleration>
    get() = Quantities.getQuantity<Acceleration>(this, GAL)

/**
 * Builder method for [ComparableQuantity] with unit [GAL].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.gal: ComparableQuantity<Acceleration>
    get() = number(GAL.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [DYNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.dyne: ComparableQuantity<Force>
    get() = Quantities.getQuantity<Force>(this, DYNE)

/**
 * Builder method for [ComparableQuantity] with unit [DYNE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.dyne: ComparableQuantity<Force>
    get() = number(DYNE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [ERG].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.erg: ComparableQuantity<Energy>
    get() = Quantities.getQuantity<Energy>(this, ERG)

/**
 * Builder method for [ComparableQuantity] with unit [ERG].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.erg: ComparableQuantity<Energy>
    get() = number(ERG.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [POISE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.poise: ComparableQuantity<DynamicViscosity>
    get() = Quantities.getQuantity<DynamicViscosity>(this, POISE)

/**
 * Builder method for [ComparableQuantity] with unit [POISE].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.poise: ComparableQuantity<DynamicViscosity>
    get() = number(POISE.transform(prefix.converter))

/**
 * Builder method for [ComparableQuantity] with unit [ERG_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val Number.ergPerSecond: ComparableQuantity<Power>
    get() = Quantities.getQuantity<Power>(this, ERG_PER_SECOND)

/**
 * Builder method for [ComparableQuantity] with unit [ERG_PER_SECOND].
 *
 * @return A [ComparableQuantity] with specified value.
 */
val MetricPrefixedNumber.ergPerSecond: ComparableQuantity<Power>
    get() = number(ERG_PER_SECOND.transform(prefix.converter))

