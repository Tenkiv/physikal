/*
 * Copyright 2018 Tenkiv, Inc.
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
package org.tenkiv.physikal.core

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import tec.units.indriya.unit.Units
import javax.measure.quantity.Power
import javax.measure.quantity.Pressure

class TypeSpec : StringSpec({
    "type coercion on quantities" {
        1.watt.asTypeOrNull<Pressure>() shouldBe null
        1.watt.asTypeOrNull<Power>() shouldBe 1.watt
    }

    "type coercion on units" {
        Units.WATT.asTypeOrNull<Pressure>() shouldBe null
        Units.WATT.asTypeOrNull<Power>() shouldBe Units.WATT
    }
})