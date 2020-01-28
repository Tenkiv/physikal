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

package physikal.types

import kotlinx.serialization.*
import physikal.*

public interface Temperature : Quantity<Temperature>

@Serializable
@SerialName(Kelvin.SYMBOL)
internal class Kelvins(override val inCurrentUnit: Double) : Quantity<Temperature> {
    override val unit: PhysicalUnit<Temperature> get() = Kelvin

    override fun convertToDefaultUnit(): Quantity<Temperature> = this

    override fun toString(): String = "$inCurrentUnit ${unit.symbol}"
}

public val Double.kelvins: Quantity<Temperature> get() = Kelvins(this)

@Serializable
@SerialName(Kelvin.SYMBOL)
public object Kelvin : PhysicalUnit<Temperature> {
    public const val SYMBOL: String = "K"

    public override val symbol: String get() = SYMBOL
    public override val isDefault: Boolean get() = true

    public override fun quantityOf(amount: Double): Quantity<Temperature> = amount.kelvins

    public override fun quantityOfInDefaultUnit(amount: Double): Quantity<Temperature> = amount.kelvins

    public override fun toString(): String = symbol
}

@Serializable
@SerialName(Celsius.SYMBOL)
internal class DegreesCelsius(override val inCurrentUnit: Double) : Quantity<Temperature> {
    override val unit: PhysicalUnit<Temperature> get() = Celsius

    override fun convertToDefaultUnit(): Quantity<Temperature> = (this.inCurrentUnit + 273.15).kelvins

    override fun toString(): String = "$inCurrentUnit ${unit.symbol}"
}

public val Double.degreesCelsius: Quantity<Temperature> get() = DegreesCelsius(this)

@Serializable
@SerialName(Celsius.SYMBOL)
public object Celsius : PhysicalUnit<Temperature> {
    public const val SYMBOL: String = "°C"

    public override val symbol: String get() = SYMBOL
    public override val isDefault: Boolean get() = false

    public override fun quantityOf(amount: Double): Quantity<Temperature> = amount.degreesCelsius

    public override fun quantityOfInDefaultUnit(amount: Double): Quantity<Temperature> = (amount - 273.15).kelvins

    public override fun toString(): String = SYMBOL
}