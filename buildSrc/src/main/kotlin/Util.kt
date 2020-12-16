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

import org.gradle.api.*
import org.gradle.api.publish.*
import org.gradle.api.publish.maven.*
import org.gradle.kotlin.dsl.*
import java.io.*
import java.net.*
import java.util.*

/**
 * Check if the project is release based on version name. If it has "SNAPSHOT", it is not a release version.
 */
val Project.isRelease: Boolean
    get()= !version.toString().contains("dev")

/**
 * Creates a properties object from local.properties file.
 */
fun Project.createPropertiesFromLocal(): Properties {
    val properties = Properties()
    val propertiesFile = File(rootDir, "local.properties")
    if (propertiesFile.canRead()) {
        properties.load(FileInputStream(propertiesFile))
    }

    return properties
}

/**
 * Sets Maven OpenPGP signing properties from properties file.
 *
 * These properties **must** be set in every project in order to correctly sign a Maven publication:
 *
 * `signing.keyId` : Public key ID (last 8 symbols). Use `gpg -K` to get it.
 *
 * `signing.password` : Passphrase used to protect the key.
 *
 * `signing.secretKeyRingFile` : The absolute path to the secret key ring file containing your private key.
 *
 * @see <a href="https://docs.gradle.org/current/userguide/signing_plugin.html#sec:signatory_credentials">Signatory Credentials</a>
 */
fun Project.setSigningExtrasFromProperties(properties: Properties) {
    project.apply {
        extra["signing.keyId"] = properties.getProperty("SIGNING_KEYID")
        extra["signing.secretKeyRingFile"] = properties.getProperty("SIGNING_SECRETKEYRINGFILE")
        extra["signing.password"] = properties.getProperty("SIGNING_KEYPASSWORD")
    }
}

/**
 * Sets up POM for Tenkiv specific projects.
 */
fun MavenPublication.configureMavenPom(project: Project) {
    version = project.version.toString()

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
        developers {
            developer {
                email.set(Info.projectDevEmail)
            }
            developer {
                email.set(Info.projectDevEmail2)
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

/**
 * Sets Maven repositories for Tenkiv organization projects.
 */
fun PublishingExtension.setMavenRepositories() {
    repositories {
        maven {
            url = URI("https://maven.pkg.jetbrains.space/tenkiv/p/physikal/physikal-maven-repo")

            credentials {
                username = System.getenv("JB_SPACE_CLIENT_ID")
                password = System.getenv("JB_SPACE_CLIENT_SECRET")
            }
        }
    }
}