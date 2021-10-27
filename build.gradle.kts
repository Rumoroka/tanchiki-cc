plugins {
    kotlin("jvm") apply false
    id("com.bmuschko.docker-java-application") apply false
}

subprojects {
    group = rootProject.group
    version = rootProject.version

    repositories {
        mavenCentral()
    }
}