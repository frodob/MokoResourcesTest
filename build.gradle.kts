buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
        maven(url = "https://dl.bintray.com/icerockdev/plugins")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Deps.Version.gradle}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Deps.Version.kotlin}")
        classpath("org.jetbrains.kotlin:kotlin-serialization:${Deps.Version.kotlin}")
        classpath("com.squareup.sqldelight:gradle-plugin:${Deps.Version.sqlDelight}")
        classpath("dev.icerock.moko:resources-generator:${Deps.Version.mokoResources}")

        classpath("com.google.gms:google-services:4.3.4")
    }
}
group = "com.espoto.kmmtest"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    google()
    mavenCentral()
    maven(url = "https://jitpack.io")
    maven(url = "https://dl.bintray.com/icerockdev/moko")

    flatDir {
        dirs("libs/compile")
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
