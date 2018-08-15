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
import org.tenkiv.coral.feq
import javax.measure.Quantity

class OperatorsSpec : StringSpec({

    var tenGigaWatts = 10.giga.watt

    var fiveGigaWatts = 5.giga.watt

    "Equals to Int" {
        assert(tenGigaWatts.valueToInt() == 10)
    }

    "Equals to Quantity" {
        assert(tenGigaWatts qeq 10.giga.watt)
    }

    "Greater than or Equal" {
        assert(tenGigaWatts >= 10.giga.watt)
    }

    "Less than or Equal" {
        assert(fiveGigaWatts <= 5.giga.watt)
    }

    "Greater than Same" {
        assert(tenGigaWatts > fiveGigaWatts)
    }

    "Less than Same" {
        assert(fiveGigaWatts < tenGigaWatts)
    }

    "Greater than Different" {
        assert(tenGigaWatts > 5.watt)
    }

    "Less than Different" {
        assert(fiveGigaWatts < 10.peta.watt)
    }

    "Increment" {
        tenGigaWatts++
        assert(tenGigaWatts.valueToInt() == 11)
    }

    "Decrement" {
        tenGigaWatts--
        assert(tenGigaWatts.valueToInt() == 10)
    }

    "To Float" {
        assert(tenGigaWatts.valueToFloat() == 10f)
    }

    "To Short" {
        assert(tenGigaWatts.valueToShort() == 10.toShort())
    }

    "To Long" {
        assert(tenGigaWatts.valueToLong() == 10L)
    }

    "To Double" {
        assert(tenGigaWatts.valueToDouble() == 10.0)
    }

    "Quantity Add" {
        assert((tenGigaWatts + fiveGigaWatts).valueToInt() == 15)
    }

    "Quantity Subtract" {
        assert((tenGigaWatts - fiveGigaWatts) qeq fiveGigaWatts)
    }

    "Quantity ABS" {
        assert((fiveGigaWatts - tenGigaWatts).abs() qeq fiveGigaWatts)
    }

    "apeq equality evaluation" {

        10.giga.watt.apeq(11.giga.watt, 1.giga.watt) shouldBe true
        10.giga.watt.apeq(11.giga.watt, 0.99.giga.watt) shouldBe false

        10.giga.watt.apeq(11.giga.watt, 0.1) shouldBe true
        10.giga.watt.apeq(11.giga.watt, 0.099) shouldBe false
    }

    "quantity to number in system unit" {
        val pressure: Quantity<*> = 1.kilo.pascal
        pressure.toDoubleInSystemUnit() feq 1_000.0 shouldBe true

        val mass = 1000.gram
        mass.toIntInSystemUnit() shouldBe 1
    }
})