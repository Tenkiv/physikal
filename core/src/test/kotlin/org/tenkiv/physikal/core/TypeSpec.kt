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
import tec.units.indriya.unit.*
import javax.measure.quantity.*
import kotlin.test.*

object TypeSpec : Spek({
    describe("calling asTypeOrNull() on a physical quantity") {
        it("returns null if returned type conflicts with the Comparable Quantity type") {
            assertEquals(null, 1.watt.asTypeOrNull<Pressure>())
        }
        it("returns a physical quantity if the specified Type does not conflict with the Comparable Quantity" +
                " type") {
            assertEquals(1.watt, 1.watt.asTypeOrNull<Power>())
        }
    }

    describe("calling asTypeOrNull() on a Unit") {
        it("returns null if returned type conflicts with the Comparable Quantity type") {
            assertEquals(null, Units.WATT.asTypeOrNull<Pressure>())
        }
        it("returns a Unit if the specified Type does not conflict with the Comparable Quantity type") {
            assertEquals(Units.WATT, Units.WATT.asTypeOrNull<Power>())
        }
    }
})