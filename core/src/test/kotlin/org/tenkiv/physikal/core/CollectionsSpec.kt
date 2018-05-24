package org.tenkiv.physikal.core

import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec
import tec.uom.se.ComparableQuantity
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