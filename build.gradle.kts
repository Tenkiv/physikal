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

import java.io.FileInputStream
import java.util.Properties

plugins {
    kotlin("jvm") version Vof.kotlin apply false
    java
    id("org.jetbrains.dokka") version Vof.dokka apply false
    signing
    `maven-publish`
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
}

val isRelease = !version.toString().endsWith("SNAPSHOT")
val localProperties = Properties()
val propertiesFile = File(rootDir, "local.properties")
if (propertiesFile.canRead()) {
    localProperties.load(FileInputStream(propertiesFile))
}

extra["signing.keyId"] = localProperties.getProperty("SIGNING_KEYID")
extra["signing.secretKeyRingFile"] = localProperties.getProperty("SIGNING_SECRETKEYRINGFILE")
extra["signing.password"] = localProperties.getProperty("SIGNING_KEYPASSWORD")

subprojects {
    apply(plugin = "org.jetbrains.dokka")
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")
    apply(plugin = "signing")

    tasks {
        register<Jar>("sourcesJar") {
            from(project.sourceSets.main.get().allJava)
            archiveClassifier.set("sources")
        }

        register<Jar>("javadocJar") {
            from(getByName("dokka"))
            archiveClassifier.set("javadoc")
        }
    }

    configure<PublishingExtension> {
        publications {
            if (isRelease) {
                println("creating release version...")
                create<MavenPublication>("maven-${project.name}") {
                    groupId = "org.tenkiv.physikal"
                    artifactId = "physikal-${project.name}"
                    version = project.version.toString()

                    from(components["java"])
                    artifact(tasks["sourcesJar"])
                    artifact(tasks["javadocJar"])

                    pom {
                        name.set(project.name)
                        description.set(Info.pomDescription)
                        url.set(Info.projectUrl)
                        licenses {
                            license {
                                name.set(Info.pomLicense)
                                url.set(Info.pomLicenseUrl)
                            }
                        }
                        organization {
                            name.set(Info.pomOrg)
                        }
                        scm {
                            connection.set(Info.projectCloneUrl)
                            url.set(Info.projectUrl)
                        }
                    }
                }
            } else {
                create<MavenPublication>("maven-${project.name}-snapshot") {
                    groupId = "org.tenkiv.physikal"
                    artifactId = "physikal-${project.name}"
                    version = project.version.toString()

                    from(components["java"])
                    artifact(tasks["sourcesJar"])
                    artifact(tasks["javadocJar"])

                    pom {
                        name.set(project.name)
                        description.set(Info.pomDescription)
                        url.set(System.getenv("CI_PROJECT_URL"))
                        licenses {
                            license {
                                name.set(Info.pomLicense)
                                url.set(Info.pomLicenseUrl)
                            }
                        }
                        organization {
                            name.set(Info.pomOrg)
                        }
                        scm {
                            connection.set(System.getenv("CI_REPOSITORY_URL"))
                            url.set(System.getenv("CI_PROJECT_URL"))
                        }
                    }
                }
            }
        }
        repositories {
            maven {
                val releasesRepoUrl = uri(Info.sonatypeReleaseRepoUrl)
                val snapshotsRepoUrl = uri(Info.sonatypeSnapshotRepoUrl)
                url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
                credentials {
                    if (isRelease) {
                        username = localProperties.getProperty("MAVEN_USER")
                        password = localProperties.getProperty("MAVEN_PASSWORD")
                    } else {
                        username = System.getenv("MAVEN_REPO_USER")
                        password = System.getenv("MAVEN_REPO_PASSWORD")
                    }
                }
            }
        }
    }

    signing {
        if (isRelease) {
            sign(publishing.publications["maven-${project.name}"])
        }
    }
}