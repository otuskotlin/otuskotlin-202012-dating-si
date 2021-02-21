plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation(kotlin("test-common"))
    implementation(kotlin("test-annotations-common"))
    implementation(kotlin("test-junit"))

    implementation(project(":dating-common"))
}