import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.50"
    application
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))

    testImplementation("org.assertj", "assertj-core", "3.11.1")
    testImplementation("org.spekframework.spek2", "spek-dsl-jvm", "2.0.6")
    testRuntimeOnly("org.spekframework.spek2", "spek-runner-junit5", "2.0.6")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Test> {
    useJUnitPlatform() {
        includeEngines("junit-jupiter", "spek2")
    }
}

application {
    mainClassName = "projecteuler.kt.AppKt"
}
