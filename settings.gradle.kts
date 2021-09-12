pluginManagement {
    val kotlinVersion: String by settings
    val bmuschkoVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
        id("com.bmuschko.docker-java-application") version bmuschkoVersion
    }
}

rootProject.name = "tanchiki-cc"
