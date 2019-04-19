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

plugins {
    kotlin("jvm")
    java
    jacoco
}

repositories {
    mavenCentral()
}

dependencies {
    api(group = "tec.units", name = "indriya", version = "1.0")
    implementation(kotlin("stdlib-jdk8"))
    implementation(group = "org.tenkiv.coral" , name = "coral-jvm", version = Vof.coral)

    //test
    testImplementation(gradleTestKit())
    testImplementation(kotlin("reflect", Vof.kotlin))
    testImplementation(kotlin("test", version = Vof.kotlin))
    testImplementation(group = "org.spekframework.spek2", name ="spek-dsl-jvm", version = Vof.spek) {
        exclude(group = "org.jetbrains.kotlin")
    }
    testRuntimeOnly(group = "org.spekframework.spek2", name = "spek-runner-junit5", version = Vof.spek) {
        exclude(group = "org.junit.platform")
        exclude(group = "org.jetbrains.kotlin")
    }
    testRuntimeOnly(group = "org.junit.platform", name = "junit-platform-launcher", version = Vof.junitPlatform)
}

jacoco {
    toolVersion = Vof.jacocoTool
}

tasks {
    val jacocoReport = withType<JacocoReport> {
        reports {
            html.isEnabled = true
            xml.isEnabled = true
            csv.isEnabled = false
        }
    }

    withType(Test::class) {
        outputs.upToDateWhen { false }
        useJUnitPlatform {
            includeEngines("spek2")
        }

        finalizedBy(jacocoReport)
    }
}