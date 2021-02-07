import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.20"
    application
    id("org.jetbrains.dokka") version "1.4.20"
}

group = "me.aratajczak"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
    mavenLocal()
    maven("https://dl.bintray.com/virtuslab/Inkuire")
}

dependencies {
    dokkaHtmlPlugin("org.virtuslab.inkuire:inkuire-html-extension:0.1.1")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}
