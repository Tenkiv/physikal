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
import org.spekframework.spek2.style.gherkin.*
import org.spekframework.spek2.style.specification.*
import javax.measure.*
import kotlin.test.*
import org.tenkiv.coral.*

@Suppress("NAME_SHADOWING")
object OperatorsSpec : Spek({

    val tenGigaWatts = 10.giga.watt
    val fiveGigaWatts = 5.giga.watt
    val negativeFiveGigaWatts = -5.giga.watt
    val pressure: Quantity<*> = 1.kilo.pascal
    val mass = 1000.gram

    describe("calling valueToInt() on a Comparable Quantity") {
        it("returns true if valueToInt() is equal to the Comparable Quantity as an Int") {
            assertEquals(true, tenGigaWatts.valueToInt() == 10)
        }
    }

    describe("calling qeq on a Comparable Quantity") {
        it("returns true if Comparable Quantity equals a physical quantity") {
            assertEquals(true, tenGigaWatts qeq 10.giga.watt)
        }
    }

    describe("calling greater than or equal to operator on a Comparable Quantity") {
        it("returns true if Comparable Quantity is greater than or equal to a physical quantity") {
            assertEquals(true, tenGigaWatts >= 10.giga.watt)
        }
    }

    describe("calling lesser than or equal to operator on a Comparable Quantity") {
        it("returns true if Comparable Quantity is lesser than or equal to a physical quantity") {
            assertEquals(true, fiveGigaWatts <= 5.giga.watt)
        }
    }

    describe("calling greater than operator between two Comparable Quantities") {
        it("returns true if Comparable Quantity is greater than other Comparable Quantity") {
            assertEquals(true, tenGigaWatts > fiveGigaWatts)
        }
    }

    describe("calling lesser than operator between two Comparable Quantities") {
        it("returns true if Comparable Quantity is less than other Comparable Quantity") {
            assertEquals(true, fiveGigaWatts < tenGigaWatts)
        }
    }

    describe("calling greater than operator between two Comparable Quantities of different type") {
        it("returns true if Comparable Quantity is greater than other Comparable Quantity of different type") {
            assertEquals(true, tenGigaWatts > 5.watt)
        }
    }

    describe("calling less than operator between two Comparable Quantities of a different type") {
        it("returns true if Comparable Quantity is less than other Comparable Quantity of a different type") {
            assertEquals(true, fiveGigaWatts < 10.peta.watt)
        }
    }

    Feature("Incrementation of a Comparable Quantity") {
        Scenario("Incrementing the Comparable Quantity") {
            var tenGigaWatts = 10.giga.watt

            When("Comparable Quantity is incremented") {
                tenGigaWatts++
            }

            Then("returns true if Comparable Quantity is + 1 of Type") {
                assertEquals(true, tenGigaWatts qeq 11.giga.watt)
            }
        }

        Scenario("Decrementing the Comparable Quantity") {
            var tenGigaWatts = 10.giga.watt

            When("Comparable Quantity is decremented") {
                tenGigaWatts--
            }

            Then("returns true if Comparable Quantity is -1 of Type") {
                assertEquals(true, tenGigaWatts qeq 9.giga.watt)
            }
        }
    }

    describe("calling valueToFloat() on Comparable Quantity") {
        it("returns true if valueToFloat() is equal to the Comparable Quantity as a float") {
            assertEquals(true, tenGigaWatts.valueToFloat() == 10f)
        }
    }

    describe("calling valueToShort() on Comparable Quantity") {
        it("returns true if valueToShort() is equal to the Comparable Quantity as a short") {
            assertEquals(true, tenGigaWatts.valueToShort() == 10.toShort())
        }
    }

    describe("calling valueToLong() on a Comparable Quantity") {
        it("returns true if valueToLong() is equal to the Comparable Quantity as a long") {
            assertEquals(true, tenGigaWatts.valueToLong() == 10L)
        }
    }

    describe("calling valueToDouble() on a Comparable Quantity") {
        it("returns true if valueToDouble() is equal to the Comparable Quantity as a double") {
            assertEquals(true, tenGigaWatts.valueToDouble() == 10.0)
        }
    }

    describe("calling addition operator on two Comparable Quantities of same Type") {
        it("returns true if added Comparable Quantities equal correct amount of same Type") {
            assertEquals(true, tenGigaWatts + fiveGigaWatts qeq 15.giga.watt)
        }
    }

    describe("calling subtract operator on two Comparable Quantities of same Type") {
        it("returns true if subtracted Comparable Quantities equal correct amount of same Type") {
            assertEquals(true, (tenGigaWatts - fiveGigaWatts) qeq fiveGigaWatts)
        }
    }

    describe("calls abs() on Comparable Quantity") {
        it("returns true if abs() of Comparable Quantity is equal to its absolute value") {
            assertEquals(true, negativeFiveGigaWatts.abs() qeq fiveGigaWatts)
        }
    }

    describe("call apeq() on a Comparable Quantity") {
        it("returns true if Comparable Quantity is approximately equal to given Comparable Quantity with " +
                "given range with same Type") {
            assertEquals(true, 10.giga.watt.apeq(11.giga.watt, 1.giga.watt))
        }
        it("returns false if Comparable Quantity is not approximately equal to given Comparable Quantity " +
                "with given range") {
            assertEquals(false, 10.giga.watt.apeq(11.giga.watt, 0.99.giga.watt))
        }
        it("returns true if Comparable Quantity is apprx. equal to given Comparable Quantity with given range " +
                "with Type double") {
            assertEquals(true, 10.giga.watt.apeq(11.giga.watt, 0.1))
        }
        it("returns false if Comparable Quantity is not apprx. equal to given Comparable Quantity with given " +
                "range with Type double") {
            assertEquals(false, 10.giga.watt.apeq(11.giga.watt, 0.099))
        }
    }

    describe("calling toDoubleInSystemUnit() on a Comparable Quantity") {
        it("returns true if Comparable Quantity is converted to system unit & then a Double") {
            assertEquals(true, pressure.toDoubleInSystemUnit() feq 1_000.0)
        }
        it("returns true if Comparable Quantity is converted to system unit & then an Int") {
            assertEquals(true, mass.toIntInSystemUnit() == 1)
        }
    }
})