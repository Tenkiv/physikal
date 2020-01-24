/*
 * Copyright 2020 Tenkiv, Inc.
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

package physikal

import kotlinx.serialization.*

interface Temperature : Quantity<Temperature> {
    companion object {
        val quantitySerializer: PolymorphicSerializer<Quantity<Temperature>> = QuantitySerializer()
        val unitSerializer: PolymorphicSerializer<PhysicalUnit<Temperature>> = PhysicalUnitSerializer()
    }
}

@Serializable
@SerialName(Kelvin.SYMBOL)
internal class KelvinQuantity(override val value: Double) : Quantity<Temperature> {
    override val unit: PhysicalUnit<Temperature> get() = Kelvin

    override fun convertToCanonical(): Quantity<Temperature> = this

    override fun toString(): String = "$value ${unit.symbol}"
}

@Serializable
@SerialName(Kelvin.SYMBOL)
object Kelvin : PhysicalUnit<Temperature> {
    const val SYMBOL: String = "K"

    override val symbol: String get() = SYMBOL
    override val isCanonical: Boolean get() = true

    override fun quantityFromValue(value: Double): Quantity<Temperature> = value.kelvin

    override fun quantityFromCanonicalValue(value: Double): Quantity<Temperature> = value.kelvin

    override fun toString(): String = symbol
}

val Double.kelvin: Quantity<Temperature> get() = KelvinQuantity(this)

@Serializable
@SerialName(Celsius.SYMBOL)
internal class CelsiusQuantity(override val value: Double) : Quantity<Temperature> {
    override val unit: PhysicalUnit<Temperature> get() = Celsius

    override fun convertToCanonical(): Quantity<Temperature> = (this.value + 273.15).kelvin

    override fun toString(): String = "$value ${unit.symbol}"
}

@Serializable
@SerialName(Celsius.SYMBOL)
object Celsius : PhysicalUnit<Temperature> {
    const val SYMBOL: String = "°C"

    override val symbol: String get() = SYMBOL
    override val isCanonical: Boolean get() = false

    override fun quantityFromValue(value: Double): Quantity<Temperature> = value.ceslsius

    override fun quantityFromCanonicalValue(value: Double): Quantity<Temperature> = (value - 273.15).kelvin

    override fun toString(): String = Kelvin.symbol
}

val Double.ceslsius: Quantity<Temperature> get() = CelsiusQuantity(this)