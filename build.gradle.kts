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
    kotlin("jvm") version Vof.kotlin apply false
    jacoco
    `java-library`
}

buildscript {
    repositories {
        mavenCentral()
    }
}

allprojects {
    repositories {
        jcenter()
        mavenCentral()
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
    }

//    jacoco {
//        toolVersion = Vof.jacoco
//    }
//
//    tasks.withType<JacocoReport> {
//        reports {
//            html.isEnabled = false
//            xml.isEnabled = true
//            csv.isEnabled = false
//        }
//    }

//    tasks {
//        test {
//            useJUnitPlatform()
//
//            extensions.configure(JacocoTaskExtension::class) {
//                setDestinationFile(file("$buildDir/jacoco/results/jacocoTest.exec"))
//            }
//        }
//    }
}

//tasks.register<JacocoReport>("jacocoRootReport") {
//    description = "Generates an aggregate report from all subprojects"
//    for (sp in subprojects) {
//        dependsOn(sp.tasks.getByName("test"))
//    }
//
//    reports {
//        html.isEnabled = true
//        xml.isEnabled = true
//    }
//
//    doFirst {
//        executionData.setFrom(files(executionData))
//    }
//}