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
import kotlin.reflect.*

public interface Dimensionless : Quantity<Dimensionless>

@Serializable
@SerialName(One.SYMBOL)
internal class Ones(override val inOwnUnit: Double) : Quantity<Dimensionless> {
    override val unit: PhysicalUnit<Dimensionless> get() = One

    override fun convertToDefaultUnit(): Quantity<Dimensionless> = this
}

public val Double.ones: Quantity<Dimensionless> get() = Ones(this)

@Serializable
@SerialName(One.SYMBOL)
public object One : PhysicalUnit<Dimensionless> {
    public const val SYMBOL: String = "one"

    override val quantityType: KClass<Dimensionless> get() = Dimensionless::class
    override val symbol: String get() = SYMBOL
    override val default: PhysicalUnit<Dimensionless> get() = this

    override fun quantityOf(amount: Double): Quantity<Dimensionless> = amount.ones

    override fun quantityOfInDefaultUnit(amount: Double): Quantity<Dimensionless> = amount.ones
}
