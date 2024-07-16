buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2") // Updated to match Gradle 8.x compatibility
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10") // Updated Kotlin version
    }
}

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.10" apply false
    id("com.android.application") version "8.0.2" apply false
}
