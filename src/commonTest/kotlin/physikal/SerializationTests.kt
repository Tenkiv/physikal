/*
 * Copyright 2020 Tenkiv, Inc.
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

package physikal

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import physikal.types.*
import kotlin.test.*

class SerializationTests {

    private val json = Json {
        serializersModule = physikalSerialModule
    }

    //===== Quantity Serializers =====
    @Test
    fun serialize_kelvin_temperature() {
        val kelvinTemperature = 1.0.kelvins

        val deserializedKelvin = json.decodeFromString(
            Kelvins.serializer(),
            json.encodeToString(kelvinTemperature)
        )

        assertFeqAndLog(deserializedKelvin, kelvinTemperature)
    }

    @Test
    fun serialize_degrees_celsius_temperature() {
        val degreesCelsius = 1.0.degreesCelsius

        val deserializedDegreesCelsius = json.decodeFromString(
            DegreesCelsius.serializer(),
            json.encodeToString(degreesCelsius)
        )

        assertFeqAndLog(deserializedDegreesCelsius, degreesCelsius)
    }

    @Test
    fun serialize_seconds() {
        val second = 1.0.secondsQuantity

        val deserializedSecond = json.decodeFromString(
            Seconds.serializer(),
            json.encodeToString(second)
        )

        assertFeqAndLog(deserializedSecond, second)
    }

    private fun <T: Quantity<out T>> assertFeqAndLog(deserializedValue: T, original: T) {
        println("Deserialized quantity: $deserializedValue, original quantity: $original")
        assertTrue(deserializedValue feq original)
    }
}