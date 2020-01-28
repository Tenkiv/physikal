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

public interface Quantity<QT : Quantity<QT>> : Comparable<Quantity<QT>> {
    public val amountInCurrent: Double
    public val unit: PhysicalUnit<QT>

    public fun convertToDefault(): Quantity<QT>

    public override fun compareTo(other: Quantity<QT>): Int = amountInDefault.compareTo(other.amountInDefault)

    public companion object {
        private val serializer = PolymorphicSerializer(Quantity::class)

        @Suppress("UNCHECKED_CAST")
        public fun <QT : Quantity<QT>> serializer(): PolymorphicSerializer<Quantity<QT>> =
            serializer as PolymorphicSerializer<Quantity<QT>>
    }
}

public val Quantity<*>.amountInDefault: Double get() = convertToDefault().amountInCurrent

public operator fun <QT : Quantity<QT>> Quantity<QT>.unaryPlus(): Quantity<QT> = unit.quantityOf(+this.amountInCurrent)

public operator fun <QT : Quantity<QT>> Quantity<QT>.unaryMinus(): Quantity<QT> = unit.quantityOf(-this.amountInCurrent)

public operator fun <QT : Quantity<QT>> Quantity<QT>.inc(): Quantity<QT> =
    unit.quantityOf(this.amountInCurrent + 1)

public operator fun <QT : Quantity<QT>> Quantity<QT>.dec(): Quantity<QT> =
    unit.quantityOf(this.amountInCurrent - 1)

public operator fun <QT : Quantity<QT>> Quantity<QT>.plus(other: Quantity<QT>): Quantity<QT> =
    this.unit.quantityOf(this.amountInCurrent + other.convertTo(this.unit).amountInCurrent)

public operator fun <QT : Quantity<QT>> Quantity<QT>.minus(other: Quantity<QT>): Quantity<QT> =
    this.unit.quantityOf(this.amountInCurrent - other.convertTo(this.unit).amountInCurrent)

public infix fun <QT : Quantity<QT>> Quantity<QT>.convertTo(unit: PhysicalUnit<QT>): Quantity<QT> =
    unit.quantityOfAmountInDefault(this.amountInDefault)

public interface PhysicalUnit<QT : Quantity<QT>> {
    public val symbol: String
    public val isDefault: Boolean

    public fun quantityOf(amount: Double): Quantity<QT>

    public fun quantityOfAmountInDefault(amount: Double): Quantity<QT>

    public companion object {
        private val serializer = PolymorphicSerializer(PhysicalUnit::class)

        @Suppress("UNCHECKED_CAST")
        public fun <QT : Quantity<QT>> serializer(): PolymorphicSerializer<PhysicalUnit<QT>> =
            serializer as PolymorphicSerializer<PhysicalUnit<QT>>
    }
}