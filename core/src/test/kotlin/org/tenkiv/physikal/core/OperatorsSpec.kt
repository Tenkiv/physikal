/**
 * Copyright 2017 TENKIV, INC.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the
following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
disclaimer in the documentation and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote
products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.tenkiv.physikal.core

import io.kotlintest.specs.StringSpec
import org.tenkiv.physikal.core.*

class OperatorsSpec : StringSpec({


    var tenGigaWatts = 10.giga.watt

    var fiveGigaWatts = 5.giga.watt

    "Equals to Int"{
        assert(tenGigaWatts.toInt() == 10)
    }

    "Equals to Quantity"{
        assert(tenGigaWatts qeq 10.giga.watt)
    }

    "Greater than or Equal"{
        assert(tenGigaWatts >= 10.giga.watt)
    }

    "Less than or Equal"{
        assert(fiveGigaWatts <= 5.giga.watt)
    }

    "Greater than Same"{
        assert(tenGigaWatts > fiveGigaWatts)
    }

    "Less than Same"{
        assert(fiveGigaWatts < tenGigaWatts)
    }

    "Greater than Different"{
        assert(tenGigaWatts > 5.watt)
    }

    "Less than Different"{
        assert(fiveGigaWatts < 10.peta.watt)
    }

    "Increment" {
        tenGigaWatts++
        assert(tenGigaWatts.toInt() == 11)
    }

    "Decrement"{
        tenGigaWatts--
        assert(tenGigaWatts.toInt() == 9)
    }

    "To Float"{
        assert(tenGigaWatts.toFloat() == 10f)
    }

    "To Short"{
        assert(tenGigaWatts.toShort() == 10.toShort())
    }

    "To Long"{
        assert(tenGigaWatts.toLong() == 10L)
    }

    "To Double"{
        assert(tenGigaWatts.toDouble() == 10.0)
    }

    "Quantity Add"{
        assert((tenGigaWatts + fiveGigaWatts).toInt() == 15)
    }

    "Quantity Subtract"{
        assert((tenGigaWatts - fiveGigaWatts) qeq fiveGigaWatts)
    }

    "Quantity ABS"{
        assert((fiveGigaWatts - tenGigaWatts).abs() qeq fiveGigaWatts)
    }
})