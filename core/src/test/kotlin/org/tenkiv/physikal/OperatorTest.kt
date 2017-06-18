package org.tenkiv.physikal

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.Spec
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.on
import org.tenkiv.physikal.core.*

/**
 * Created by tenkiv on 6/13/17.
 */

class OperatorTest : Spek({

    given("Some Units"){

        var tenGigaWatts = 10.giga.watt

        var fiveGigaWatts = 5.giga.watt

        on("Equals to Int"){
            assert(tenGigaWatts.toInt() == 10)
        }

        on("Equals to Quantity"){
            assert(tenGigaWatts == 10.giga.watt)
        }

        on("Increment") {
            tenGigaWatts++
            assert(tenGigaWatts.toInt() == 11)
        }

        on("Decrement"){
            tenGigaWatts--
            assert(tenGigaWatts.toInt() == 10)
        }

        on("To Float"){
            assert(tenGigaWatts.toFloat() == 10f)
        }

        on("To Short"){
            assert(tenGigaWatts.toShort() == 10.toShort())
        }

        on("To Long"){
            assert(tenGigaWatts.toLong() == 10L)
        }

        on("To Double"){
            assert(tenGigaWatts.toDouble() == 10.0)
        }

        on("Quantity Add"){
            assert((tenGigaWatts + fiveGigaWatts).toInt() == 15)
        }

        on("Quantity Subtract"){
            assert((tenGigaWatts + fiveGigaWatts) == fiveGigaWatts)
        }

        on("Quantity ABS"){
            assert((fiveGigaWatts - tenGigaWatts).abs() == fiveGigaWatts)
        }
    }
})