rootProject.name = "kotlintraining"

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
    }
}

include("m1l1-hello")
include("vacancy-acceptance")

