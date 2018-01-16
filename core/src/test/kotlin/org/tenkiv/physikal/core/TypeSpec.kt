package org.tenkiv.physikal.core

import io.kotlintest.matchers.shouldBe
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