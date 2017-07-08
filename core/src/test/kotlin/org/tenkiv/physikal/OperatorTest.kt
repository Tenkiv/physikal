/**
 * Copyright 2017 TENKIV, INC.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
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