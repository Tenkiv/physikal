import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.bundling.Jar
import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.TaskContainerScope
import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.withType
import java.io.File
import java.io.FileInputStream
import java.net.URI
import java.util.*

/**
 * Check if the project is release based on version name. If it has "SNAPSHOT", it is not a release version.
 */

fun Project.isRelease() = !version.toString().endsWith("SNAPSHOT")

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
    project.extra["signing.keyId"] = properties.getProperty("SIGNING_KEYID")
    project.extra["signing.secretKeyRingFile"] = properties.getProperty("SIGNING_SECRETKEYRINGFILE")
    project.extra["signing.password"] = properties.getProperty("SIGNING_KEYPASSWORD")
}

/**
 * Registers common tasks.
 *
 * Sets universal `Test` task to use Spek2 platform.
 *
 * Registers task named `javadocJar` from `dokka` task.
 */

fun TaskContainerScope.registerCommonTasks() {
    withType<Test> {
        outputs.upToDateWhen { false }
        useJUnitPlatform {
            includeEngines("spek2")
        }
        testLogging.showStandardStreams = true
        maxHeapSize = "1g"
    }

    register<Jar>("javadocJar") {
        archiveClassifier.set("javadoc")
        from(getByName("dokka"))
    }
}

/**
 * Sets up POM for Tenkiv specific projects.
 */

fun MavenPublication.configureMavenPom(isRelease: Boolean, project: Project) {
    version = if (isRelease) project.version.toString() else "${project.version}-SNAPSHOT"

    pom {
        name.set(project.name)
        description.set(Info.pomDescription)
        url.set(if (isRelease) Info.projectUrl else System.getenv("CI_PROJECT_URL"))

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
            connection.set(if (isRelease) Info.projectCloneUrl else System.getenv("CI_REPOSITORY_URL"))
            url.set(if (isRelease) Info.projectUrl else System.getenv("CI_PROJECT_URL"))
        }
    }
}

/**
 * Sets Maven repositories for Tenkiv organization projects.
 */

fun PublishingExtension.setMavenRepositories(isRelease: Boolean, properties: Properties) {
    repositories {
        maven {
            url = URI(if (isRelease) Info.sonatypeReleaseRepoUrl else Info.sonatypeSnapshotRepoUrl)

            credentials {
                username = if (isRelease) properties.getProperty("MAVEN_USER") else System.getenv("MAVEN_REPO_USER")
                password = if (isRelease) properties.getProperty("MAVEN_PASSWORD") else System.getenv("MAVEN_REPO_PASSWORD")
            }
        }
    }
}