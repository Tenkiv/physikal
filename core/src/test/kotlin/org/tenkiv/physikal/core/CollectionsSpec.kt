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
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec
import tec.units.indriya.ComparableQuantity
import javax.measure.quantity.Pressure

class CollectionsSpec : StringSpec({
    val collection = listOf(100.pascal, 1.kilo.pascal, 200.pascal, 300.pascal, 400.pascal)
    val emptyCollection: List<ComparableQuantity<Pressure>> = emptyList()

    "average collection of quantities" {
        collection.average { it } qeq 400.pascal shouldBe true

        emptyCollection.averageOrNull { it } shouldBe null
        emptyCollection.averageOrDefault { it } shouldBe 0.pascal
        emptyCollection.averageOrDefault(1.pascal) { it } shouldBe 1.pascal
        shouldThrow<ArithmeticException> { emptyCollection.average { it } }
    }

    "average collection of quantities that meat a given condition" {
        collection.average(
            getValue = { it },
            condition = { it < 900.pascal }
        ) qeq 250.pascal shouldBe true
    }
})