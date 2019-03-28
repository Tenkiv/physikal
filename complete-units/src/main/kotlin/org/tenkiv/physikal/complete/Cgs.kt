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

package org.tenkiv.physikal.complete

import org.tenkiv.physikal.core.MetricPrefixedNumber
import org.tenkiv.physikal.core.invoke
import si.uom.quantity.DynamicViscosity
import si.uom.quantity.KinematicViscosity
import systems.uom.common.CGS.*
import tec.units.indriya.ComparableQuantity
import tec.units.indriya.quantity.Quantities
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

