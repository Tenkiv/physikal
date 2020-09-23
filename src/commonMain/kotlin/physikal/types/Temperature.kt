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
import org.tenkiv.coral.*
import physikal.*
import kotlin.reflect.*

public interface Temperature : Quantity<Temperature>

@Serializable
@SerialName(Kelvin.SYMBOL)
public class Kelvins(public override val inOwnUnit: Float64) : Quantity<Temperature> {
    public override val unit: PhysicalUnit<Temperature> get() = Kelvin

    public override fun convertToDefaultUnit(): Quantity<Temperature> = this

    public override fun toString(): String = "$inOwnUnit ${unit.symbol}"
}

public val Float64.kelvins: Kelvins get() = Kelvins(this)

@Serializable
@SerialName(Kelvin.SYMBOL)
public object Kelvin : PhysicalUnit<Temperature> {
    public const val SYMBOL: String = "K"

    public override val quantityType: KClass<Temperature> get() = Temperature::class
    public override val symbol: String get() = SYMBOL
    public override val default: PhysicalUnit<Temperature> get() = this

    public override fun quantityOf(amount: Float64): Quantity<Temperature> = amount.kelvins

    public override fun quantityOfInDefaultUnit(amount: Float64): Quantity<Temperature> = amount.kelvins

    public override fun toString(): String = symbol
}

@Serializable
@SerialName(Celsius.SYMBOL)
public class DegreesCelsius(public override val inOwnUnit: Float64) : Quantity<Temperature> {
    public override val unit: PhysicalUnit<Temperature> get() = Celsius

    public override fun convertToDefaultUnit(): Quantity<Temperature> = (this.inOwnUnit + 273.15).kelvins

    public override fun toString(): String = "$inOwnUnit ${unit.symbol}"
}

public val Float64.degreesCelsius: DegreesCelsius get() = DegreesCelsius(this)

@Serializable
@SerialName(Celsius.SYMBOL)
public object Celsius : PhysicalUnit<Temperature> {
    public const val SYMBOL: String = "°C"

    public override val quantityType: KClass<Temperature> get() = Temperature::class
    public override val symbol: String get() = SYMBOL
    public override val default: PhysicalUnit<Temperature> get() = Kelvin

    public override fun quantityOf(amount: Float64): Quantity<Temperature> = amount.degreesCelsius

    public override fun quantityOfInDefaultUnit(amount: Float64): Quantity<Temperature> = (amount - 273.15).kelvins

    public override fun toString(): String = SYMBOL
}