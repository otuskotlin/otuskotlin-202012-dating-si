rootProject.name = "otuskotlin-202012-dating-si"

pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        kotlin("multiplatform") version kotlinVersion
        kotlin("jvm") version kotlinVersion
        kotlin("js") version kotlinVersion
    }
}

include("common", "common-be")