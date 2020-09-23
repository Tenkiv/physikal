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
     * The [Float64] amount of this quantity in this quantities [unit].
     *
     * This property can be dangerous to use. In the majority of cases it should only be used immediately following a
     * call that set the unit of the quantity. Consider using [toFloat64In] or [inDefaultUnit] instead.
     */
    public val inOwnUnit: Float64
    public val unit: PhysicalUnit<QT>

    /**
     * The type of this quantity (e.g. Temperature, Time) represented by the [KClass] for that type.
     */
    public val quantityType: KClass<QT> get() = unit.quantityType

    public fun convertToDefaultUnit(): Quantity<QT>

    public override fun compareTo(other: Quantity<QT>): Int32 = inDefaultUnit.compareTo(other.inDefaultUnit)

    public companion object {
        private val serializer = PolymorphicSerializer(Quantity::class)

        @Suppress("UNCHECKED_CAST")
        public fun <QT : Quantity<QT>> serializer(): KSerializer<Quantity<QT>> =
            serializer as PolymorphicSerializer<Quantity<QT>>
    }
}

private class QuantityRange<QT : Quantity<QT>>(
    override val start: Quantity<QT>,
    override val endInclusive: Quantity<QT>
) : ClosedFloatingPointRange<Quantity<QT>> {

    override fun lessThanOrEquals(a: Quantity<QT>, b: Quantity<QT>): Boolean = a <= b

}

public val Quantity<*>.inDefaultUnit: Float64 get() = convertToDefaultUnit().inOwnUnit

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

public operator fun <QT : Quantity<QT>> Quantity<QT>.times(multiplier: Int32): Quantity<QT> =
    this.unit.quantityOf(this.inOwnUnit * multiplier)

public operator fun <QT : Quantity<QT>> Quantity<QT>.times(multiplier: Int64): Quantity<QT> =
    this.unit.quantityOf(this.inOwnUnit * multiplier)

public operator fun <QT : Quantity<QT>> Quantity<QT>.times(multiplier: Float32): Quantity<QT> =
    this.unit.quantityOf(this.inOwnUnit * multiplier)

public operator fun <QT : Quantity<QT>> Quantity<QT>.times(multiplier: Float64): Quantity<QT> =
    this.unit.quantityOf(this.inOwnUnit * multiplier)

public operator fun <QT : Quantity<QT>> Quantity<QT>.div(divisor: Int32): Quantity<QT> =
    this.unit.quantityOf(this.inOwnUnit / divisor)

public operator fun <QT : Quantity<QT>> Quantity<QT>.div(divisor: Int64): Quantity<QT> =
    this.unit.quantityOf(this.inOwnUnit / divisor)

public operator fun <QT : Quantity<QT>> Quantity<QT>.div(divisor: Float32): Quantity<QT> =
    this.unit.quantityOf(this.inOwnUnit / divisor)

public operator fun <QT : Quantity<QT>> Quantity<QT>.div(divisor: Float64): Quantity<QT> =
    this.unit.quantityOf(this.inOwnUnit / divisor)

public operator fun <QT : Quantity<QT>> Quantity<QT>.rangeTo(that: Quantity<QT>):
        ClosedFloatingPointRange<Quantity<QT>> = QuantityRange(this, that)

public infix fun Quantity<*>.feq(other: Quantity<*>): Boolean =
    if (quantityType == other.quantityType) inDefaultUnit feq other.inDefaultUnit else false

public fun Quantity<*>.feq(other: Quantity<*>, maxUlps: Int32): Boolean =
    if (quantityType == other.quantityType) inDefaultUnit.feq(other.inDefaultUnit, maxUlps) else false

public fun Quantity<*>.feq(other: Quantity<*>, epsilon: Float64): Boolean =
    if (quantityType == other.quantityType) inDefaultUnit.feq(other.inDefaultUnit, epsilon) else false

public infix fun <QT : Quantity<QT>> Quantity<QT>.convertTo(unit: PhysicalUnit<QT>): Quantity<QT> =
    unit.quantityOfInDefaultUnit(this.inDefaultUnit)

public infix fun <QT : Quantity<QT>> Quantity<QT>.toFloat32In(unit: PhysicalUnit<QT>): Float32 =
    this.convertTo(unit).inOwnUnit.toFloat32()

public infix fun <QT : Quantity<QT>> Quantity<QT>.toFloat64In(unit: PhysicalUnit<QT>): Float64 =
    this.convertTo(unit).inOwnUnit

public infix fun <QT : Quantity<QT>> Quantity<QT>.toInt32In(unit: PhysicalUnit<QT>): Int32 =
    this.convertTo(unit).inOwnUnit.toInt32()

public infix fun <QT : Quantity<QT>> Quantity<QT>.toInt64In(unit: PhysicalUnit<QT>): Int64 =
    this.convertTo(unit).inOwnUnit.toInt64()

public inline fun <SQT : Quantity<SQT>, RQT : Quantity<RQT>> Quantity<SQT>.transform(
    fromUnit: PhysicalUnit<SQT>,
    transformation: (Float64) -> Quantity<RQT>
): Quantity<RQT> = transformation(this toFloat64In fromUnit)

public fun <QT : Quantity<QT>> Int32.toQuantity(unit: PhysicalUnit<QT>): Quantity<QT> = unit.quantityOf(this.toFloat64())

public fun <QT : Quantity<QT>> Int64.toQuantity(unit: PhysicalUnit<QT>): Quantity<QT> = unit.quantityOf(this.toFloat64())

public fun <QT : Quantity<QT>> Float32.toQuantity(unit: PhysicalUnit<QT>): Quantity<QT> = unit.quantityOf(this.toFloat64())

public fun <QT : Quantity<QT>> Float64.toQuantity(unit: PhysicalUnit<QT>): Quantity<QT> = unit.quantityOf(this)

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

    public fun quantityOf(amount: Float64): Quantity<QT>

    public fun quantityOfInDefaultUnit(amount: Float64): Quantity<QT>

    public companion object {
        private val serializer = PolymorphicSerializer(PhysicalUnit::class)

        @Suppress("UNCHECKED_CAST")
        public fun <QT : Quantity<QT>> serializer(): KSerializer<PhysicalUnit<QT>> =
            serializer as PolymorphicSerializer<PhysicalUnit<QT>>
    }
}

public val PhysicalUnit<*>.isDefault: Boolean get() = this === default