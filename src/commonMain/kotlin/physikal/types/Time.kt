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
import kotlin.time.*

public interface Time : Quantity<Time>

@ExperimentalTime
public fun Duration.toQuantity(): Quantity<Time> = this.inSeconds.secondsQuantity

@ExperimentalTime
public fun Quantity<Time>.toDuration(): Duration = this.inDefaultUnit.seconds

@Serializable
@SerialName(Second.SYMBOL)
public class Seconds(public override val inOwnUnit: Double) : Quantity<Time> {
    public override val unit: PhysicalUnit<Time> get() = Second

    public override fun convertToDefaultUnit(): Quantity<Time> = this

    public override fun toString(): String = "$inOwnUnit ${unit.symbol}"
}

// Name doesn't follow standard convention to avoid conflicts with kotlin.time Duration name.
public val Double.secondsQuantity: Seconds get() = Seconds(this)

@Serializable
@SerialName(Second.SYMBOL)
public object Second : PhysicalUnit<Time> {
    public const val SYMBOL: String = "s"

    public override val quantityType: KClass<Time> get() = Time::class
    public override val symbol: String get() = SYMBOL
    public override val default: PhysicalUnit<Time> get() = this

    public override fun quantityOf(amount: Double): Quantity<Time> = amount.secondsQuantity

    public override fun quantityOfInDefaultUnit(amount: Double): Quantity<Time> = amount.secondsQuantity

    public override fun toString(): String = SYMBOL
}