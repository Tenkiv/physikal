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
import org.tenkiv.coral.*
import kotlin.reflect.*

public interface Quantity<QT : Quantity<QT>> : Comparable<Quantity<QT>> {
    /**
     * The [Double] amount of this quantity in this quantities [unit].
     *
     * This property can be dangerous to use. In the majority of cases it should only be used immediately following a
     * call that set the unit of the quantity. Consider using [toDoubleIn] or [inDefaultUnit] instead.
     */
    public val inOwnUnit: Double
    public val unit: PhysicalUnit<QT>
    /**
     * The type of this quantity (e.g. Temperature, Time) represented by the [KClass] for that type.
     */
    public val quantityType: KClass<QT> get() = unit.quantityType

    public fun convertToDefaultUnit(): Quantity<QT>

    public override fun compareTo(other: Quantity<QT>): Int = inDefaultUnit.compareTo(other.inDefaultUnit)

    public companion object {
        private val serializer = PolymorphicSerializer(Quantity::class)

        @Suppress("UNCHECKED_CAST")
        public fun <QT : Quantity<QT>> serializer(): KSerializer<Quantity<QT>> =
            serializer as PolymorphicSerializer<Quantity<QT>>
    }
}

public val Quantity<*>.inDefaultUnit: Double get() = convertToDefaultUnit().inOwnUnit

public operator fun <QT : Quantity<QT>> Quantity<QT>.unaryPlus(): Quantity<QT> = unit.quantityOf(+this.inOwnUnit)

public operator fun <QT : Quantity<QT>> Quantity<QT>.unaryMinus(): Quantity<QT> = unit.quantityOf(-this.inOwnUnit)

public operator fun <QT : Quantity<QT>> Quantity<QT>.inc(): Quantity<QT> =
    unit.quantityOf(this.inOwnUnit + 1)

public operator fun <QT : Quantity<QT>> Quantity<QT>.dec(): Quantity<QT> =
    unit.quantityOf(this.inOwnUnit - 1)

public operator fun <QT : Quantity<QT>> Quantity<QT>.plus(other: Quantity<QT>): Quantity<QT> =
    this.unit.quantityOf(this.inOwnUnit + other.convertTo(this.unit).inOwnUnit)

public operator fun <QT : Quantity<QT>> Quantity<QT>.minus(other: Quantity<QT>): Quantity<QT> =
    this.unit.quantityOf(this.inOwnUnit - other.convertTo(this.unit).inOwnUnit)

public infix fun Quantity<*>.feq(comparate: Quantity<*>): Boolean =
    if (quantityType == comparate.quantityType) inDefaultUnit feq comparate.inDefaultUnit else false

public fun Quantity<*>.feq(comparate: Quantity<*>, maxUlps: Int): Boolean =
    if (quantityType == comparate.quantityType) inDefaultUnit.feq(comparate.inDefaultUnit, maxUlps) else false

public fun Quantity<*>.feq(comparate: Quantity<*>, epsilon: Double): Boolean =
    if (quantityType == comparate.quantityType) inDefaultUnit.feq(comparate.inDefaultUnit, epsilon) else false

public infix fun <QT : Quantity<QT>> Quantity<QT>.convertTo(unit: PhysicalUnit<QT>): Quantity<QT> =
    unit.quantityOfInDefaultUnit(this.inDefaultUnit)

public infix fun <QT : Quantity<QT>> Quantity<QT>.toFloatIn(unit: PhysicalUnit<QT>): Float =
    this.convertTo(unit).inOwnUnit.toFloat()

public infix fun <QT : Quantity<QT>> Quantity<QT>.toDoubleIn(unit: PhysicalUnit<QT>): Double =
    this.convertTo(unit).inOwnUnit

public infix fun <QT : Quantity<QT>> Quantity<QT>.toIntIn(unit: PhysicalUnit<QT>): Int =
    this.convertTo(unit).inOwnUnit.toInt()

public infix fun <QT : Quantity<QT>> Quantity<QT>.toLongIn(unit: PhysicalUnit<QT>): Long =
    this.convertTo(unit).inOwnUnit.toLong()

public inline fun <SQT : Quantity<SQT>, RQT : Quantity<RQT>> Quantity<SQT>.transform(
    fromUnit: PhysicalUnit<SQT>,
    transformation: (Double) -> Quantity<RQT>
): Quantity<RQT> = transformation(this toDoubleIn fromUnit)

public fun <QT : Quantity<QT>> Double.toQuantity(unit: PhysicalUnit<QT>): Quantity<QT> = unit.quantityOf(this)

public interface PhysicalUnit<QT : Quantity<QT>> {
    /**
     * The type of this unit (e.g. Temperature, Time) represented by the [KClass] for that type.
     */
    public val quantityType: KClass<QT>
    public val symbol: String
    /**
     * The default unit for this units quantity type (e.g. the default unit for the Temperature quantity type is Kelvin)
     */
    public val default: PhysicalUnit<QT>

    public fun quantityOf(amount: Double): Quantity<QT>

    public fun quantityOfInDefaultUnit(amount: Double): Quantity<QT>

    public companion object {
        private val serializer = PolymorphicSerializer(PhysicalUnit::class)

        @Suppress("UNCHECKED_CAST")
        public fun <QT : Quantity<QT>> serializer(): KSerializer<PhysicalUnit<QT>> =
            serializer as PolymorphicSerializer<PhysicalUnit<QT>>
    }
}

public val PhysicalUnit<*>.isDefault: Boolean get() = this === default