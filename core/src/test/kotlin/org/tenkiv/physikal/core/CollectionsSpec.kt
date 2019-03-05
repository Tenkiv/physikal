/*
 * Copyright 2019 Tenkiv, Inc.
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

import org.spekframework.spek2.*
import org.spekframework.spek2.style.specification.*
import org.tenkiv.physikal.core.*
import tec.units.indriya.*
import javax.measure.quantity.*
import kotlin.test.*

object CollectionSpec : Spek({
    describe("Collections") {
        val collection = listOf(100.pascal, 1.kilo.pascal, 200.pascal, 300.pascal, 400.pascal)
        val emptyCollection: List<ComparableQuantity<Pressure>> = emptyList()

        describe("using average() on a collection of quantities") {
            it("returns the average of the quantities provided by the collection") {
                assertEquals(true, collection.average { it } qeq 400.pascal)
            }
        }

        describe("using averageOrNull() on an empty collection of quantities") {
            it("returns null") {
                assertEquals(null, emptyCollection.averageOrNull { it })
            }
        }

        describe("using averageOrDefault() on an empty collection") {
            it("returns 0 of the collection's type") {
                assertEquals(0.pascal, emptyCollection.averageOrDefault { it })
            }
        }

        describe("using averageOrDefault() with a custom default value of 1.pascal on an empty collection") {
            it("returns 1.pascal") {
                assertEquals(1.pascal, emptyCollection.averageOrDefault(1.pascal) { it })
            }
        }

        describe("using average() on an empty collection of quantities") {
            it("throws an ArithmeticException") {
                assertFailsWith(ArithmeticException::class) {
                    emptyCollection.average { it }
                }
            }
        }

        describe("using average() on a collection with a condition") {
            it("returns the average of the values that meet the condition in the collection") {
                assertEquals(
                    true,
                    collection.average(getValue = { it }, condition = { it < 900.pascal }) qeq 250.pascal
                )
            }
        }
    }
})