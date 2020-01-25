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

buildscript {
    repositories {
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath(group = "org.jetbrains.kotlin", name = "kotlin-serialization", version = Vof.kotlin)
    }

}

repositories {
    mavenCentral()
    jcenter()
    google()
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
}

plugins {
    kotlin("multiplatform") version Vof.kotlin
    id("org.jetbrains.kotlin.plugin.serialization") version Vof.kotlin
    id("org.jetbrains.dokka") version Vof.dokka
    id("maven-publish")
    signing
}

val isRelease = isRelease()
val properties = createPropertiesFromLocal()
setSigningExtrasFromProperties(properties)

kotlin {
    jvm {
        val main by compilations.getting {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                api("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Vof.serialization}")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Vof.serialization}")
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("reflect"))
                implementation(kotlin("test"))
                implementation("org.spekframework.spek2:spek-dsl-jvm:${Vof.spek}")
                runtimeOnly("org.spekframework.spek2:spek-runner-junit5:${Vof.spek}")
                runtimeOnly("org.junit.platform:junit-platform-launcher:${Vof.junitPlatform}")
            }
        }
    }

    tasks {
        registerCommonTasks()
    }

    publishing {
        publications.withType<MavenPublication>().apply {
            val jvm by getting {
                artifact(tasks.getByName("javadocJar"))
            }
        }.forEach {
            it.configureMavenPom(isRelease, project)
            signing { if (isRelease) sign(it) }
        }

        setMavenRepositories(isRelease, properties)
    }
}