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
}

dependencies {
    api("tec.units:indriya:1.0")
    implementation("org.tenkiv.coral:coral:2.1.2.3-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.20")

    //Test
    testImplementation(kotlin("reflect", Vof.kotlin))
    testImplementation(kotlin("test", Vof.kotlin))

    testImplementation(group = "org.spekframework.spek2", name = "spek-dsl-jvm", version = Vof.spek) {
        exclude(group = "org.jetbrains.kotlin")
    }

    testRuntimeOnly(group = "org.spekframework.spek2", name = "spek-runner-junit5", version = Vof.spek) {
        exclude(group = "org.jetbrains.kotlin")
        exclude(group = "org.junit.platform")
    }

    testRuntimeOnly(group = "org.junit.platform", name = "junit-platform-launcher", version = Vof.junitPlatform) {
        because("Needed to run tests IDEs that bundle an older version")
    }

    testImplementation(gradleTestKit())
}

tasks {
    named<Test>("test") {
        useJUnitPlatform {
            includeEngines("spek2")
            testClassesDirs = sourceSets["test"].output.classesDirs
            classpath = sourceSets["test"].runtimeClasspath
        }
    }
}