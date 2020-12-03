/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */
object Deps {
    object Version {
        const val kotlin = "1.4.10"

        const val gradle = "4.1.1"
        const val androidAppCompat = "1.1.0"
        const val material = "1.2.1"
        const val recyclerView = "1.1.0"
        const val swipeRefreshLayout = "1.1.0"
        const val constraintLayout = "2.0.0"
        const val lifecycle = "2.2.0"
        const val glide = "4.9.0"
        const val espressoCore = "3.2.0"
        const val testRunner = "1.2.0"
        const val testExtJunit = "1.1.1"

        const val ktorClient = "1.4.2"              // https://github.com/ktorio/ktor
        const val coroutines = "1.3.9-native-mt"    // https://github.com/Kotlin/kotlinx.coroutines     // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core
        const val kotlinxSerialization = "1.0.0-RC" // https://github.com/Kotlin/kotlinx.serialization  // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-serialization-core
        const val kotlinxDateTime = "0.1.0"         // https://github.com/Kotlin/kotlinx-datetime

        const val sqlDelight = "1.4.4"              // https://github.com/cashapp/sqldelight
        const val klock = "2.0.0-alpha"             // https://github.com/korlibs/klock
        const val uuid = "0.2.2"                    // https://github.com/benasher44/uuid
        const val prefs = "1.2.0"                   // https://github.com/florent37/Multiplatform-Preferences
        const val krypto = "1.12.0"                 // https://github.com/korlibs/krypto  // https://mvnrepository.com/artifact/com.soywiz.korlibs.krypto/krypto

        const val detekt = "1.12.0"

        const val mokoMPP = "0.8.0"
        const val mokoGraphics = "0.4.0"
        const val mokoParcelize = "0.4.0"
        const val mokoResources = "0.13.1"
        const val mokoMvvm = "0.8.0"
        const val mokoErrors = "0.3.0"
        const val mokoNetwork = "0.8.0"
        const val mokoUnits = "0.4.1"
        const val mokoPermissions = "0.6.0"
        const val mokoMedia = "0.5.0"
        const val mokoFields = "0.5.0"

        const val multiplatformSettings = "0.6.1"
        const val napier = "1.4.1"
    }

    object Android {
        const val compileSdk = 29
        const val buildSdk = "29.0.3"
        const val targetSdk = 29
        const val minSdk = 21
    }

    object Plugins {
        val gradle = GradlePlugin(
            id = "org.jetbrains.kotlin:kotlin-gradle-plugin",
            version = Version.kotlin
        )

        val androidApplication = GradlePlugin(id = "com.android.application")
        val androidLibrary = GradlePlugin(id = "com.android.library")
        val kotlinMultiplatform = GradlePlugin(
            id = "org.jetbrains.kotlin.multiplatform",
            module = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
        )
        val kotlinKapt = GradlePlugin(id = "kotlin-kapt")
        val kotlinAndroid = GradlePlugin(id = "kotlin-android")
        val kotlinAndroidExtensions = GradlePlugin(id = "kotlin-android-extensions")
        val kotlinSerialization = GradlePlugin(
            id = "org.jetbrains.kotlin.plugin.serialization",
            module = "org.jetbrains.kotlin:kotlin-serialization:${Version.kotlin}"
        )

        val cocoapods = GradlePlugin(id = "org.jetbrains.kotlin.native.cocoapods")
        val sqlDelight = GradlePlugin(id = "com.squareup.sqldelight")

        val mobileMultiplatform = GradlePlugin(id = "dev.icerock.mobile.multiplatform")
        val iosFramework = GradlePlugin(id = "dev.icerock.mobile.multiplatform.ios-framework")

        val mokoNetwork = GradlePlugin(
            id = "dev.icerock.mobile.multiplatform-network-generator",
            module = "dev.icerock.moko:network-generator:${Version.mokoNetwork}"
        )
        val mokoResources = GradlePlugin(
            id = "dev.icerock.mobile.multiplatform-resources",
            module = "dev.icerock.moko:resources-generator:${Version.mokoResources}"
        )
        val mokoUnits = GradlePlugin(
            id = "dev.icerock.mobile.multiplatform-units",
            module = "dev.icerock.moko:units-generator:${Version.mokoUnits}"
        )

        val detekt = GradlePlugin(
            id = "io.gitlab.arturbosch.detekt",
            version = Version.detekt
        )
    }

    object Libs {
        object Android {
            const val kotlinStd = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
            const val appCompat = "androidx.appcompat:appcompat:${Version.androidAppCompat}"
            const val material = "com.google.android.material:material:${Version.material}"
            const val recyclerView = "androidx.recyclerview:recyclerview:${Version.recyclerView}"
            const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Version.swipeRefreshLayout}"
            const val cardView = "androidx.cardview:cardview:1.0.0"
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
            const val gson = "com.google.api-client:google-api-client-gson:1.30.2"

            const val glide = "com.github.bumptech.glide:glide:${Version.glide}"
            const val exif = "androidx.exifinterface:exifinterface:1.1.0"
            const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Version.lifecycle}"
            const val ktorClientOkHttp = "io.ktor:ktor-client-okhttp:${Version.ktorClient}"
            const val volley = "com.android.volley:volley:1.1.1"
            const val jodaTime = "net.danlew:android.joda:2.10.3"

            object Tests {
                const val espressoCore =
                    "androidx.test.espresso:espresso-core:${Version.espressoCore}"
                const val kotlinTestJUnit =
                    "org.jetbrains.kotlin:kotlin-test-junit:${Version.kotlin}"
                const val testCore =
                    "androidx.test:core:1.3.0"
                const val robolectric =
                    "org.robolectric:robolectric:4.3"
                const val testRunner =
                    "androidx.test:runner:${Version.testRunner}"
                const val testRules =
                    "androidx.test:rules:${Version.testRunner}"
                const val testExtJunit =
                    "androidx.test.ext:junit:${Version.testExtJunit}"
            }
        }

        object MultiPlatform {
            const val kotlinSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Version.kotlinxSerialization}"
            const val kotlinxDateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Version.kotlinxDateTime}"
            const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"

            const val klock = "com.soywiz.korlibs.klock:klock:${Version.klock}"
            const val uuid = "com.benasher44:uuid:${Version.uuid}"
            const val prefs = "com.github.florent37:multiplatform-preferences:${Version.prefs}"
            const val krypto = "com.soywiz.korlibs.krypto:krypto:${Version.krypto}"

            val mokoResources = "dev.icerock.moko:resources:${Version.mokoResources}".mpl
            val mokoParcelize = "dev.icerock.moko:parcelize:${Version.mokoParcelize}".mpl
            val mokoGraphics = "dev.icerock.moko:graphics:${Version.mokoGraphics}".mpl
            val mokoMvvm = "dev.icerock.moko:mvvm:${Version.mokoMvvm}".mpl
            val mokoErrors = "dev.icerock.moko:errors:${Version.mokoErrors}".mpl
            val mokoNetwork = "dev.icerock.moko:network:${Version.mokoNetwork}".mpl
            val mokoNetworkErrors = "dev.icerock.moko:network-errors:${Version.mokoNetwork}".mpl
            val mokoPermissions = "dev.icerock.moko:permissions:${Version.mokoPermissions}".mpl
            val mokoMedia = "dev.icerock.moko:media:${Version.mokoMedia}".mpl
            val mokoUnits = "dev.icerock.moko:units:${Version.mokoUnits}".mpl
            val mokoFields = "dev.icerock.moko:fields:${Version.mokoFields}".mpl
            val multiplatformSettings = "com.russhwolf:multiplatform-settings:${Version.multiplatformSettings}".mpl

            val napier = "com.github.aakira:napier:${Version.napier}".mpl

            object Tests {
                const val kotlinTest =
                    "org.jetbrains.kotlin:kotlin-test-common:${Version.kotlin}"
                const val kotlinTestAnnotations =
                    "org.jetbrains.kotlin:kotlin-test-annotations-common:${Version.kotlin}"
            }
        }

        object Ktor {
            const val client = "io.ktor:ktor-client-core:${Version.ktorClient}"
            const val clientLogging = "io.ktor:ktor-client-logging:${Version.ktorClient}"
            const val androidClient = "io.ktor:ktor-client-android:${Version.ktorClient}"
            const val iOSClient = "io.ktor:ktor-client-ios:${Version.ktorClient}"
            const val serialization = "io.ktor:ktor-client-serialization:${Deps.Version.ktorClient}"
            const val json = "io.ktor:ktor-client-json:${Deps.Version.ktorClient}"
        }

        object SqlDelight {
            const val runtime = "com.squareup.sqldelight:runtime:${Version.sqlDelight}"
            const val coroutineExtensions = "com.squareup.sqldelight:coroutines-extensions:${Version.sqlDelight}"

            const val androidDriver = "com.squareup.sqldelight:android-driver:${Version.sqlDelight}"
            const val nativeDriver = "com.squareup.sqldelight:native-driver:${Version.sqlDelight}"
            const val nativeDriverMacos = "com.squareup.sqldelight:native-driver-macosx64:${Version.sqlDelight}"
        }

        object Detekt {
            const val detektFormatting =
                "io.gitlab.arturbosch.detekt:detekt-formatting:${Version.detekt}"
        }
    }

    object Modules {
        val domain = MultiPlatformModule(
            name = ":mpp-library:domain",
            exported = true
        )

        object Feature {
            val config = MultiPlatformModule(
                name = ":mpp-library:feature:config",
                exported = true
            )
            val list = MultiPlatformModule(
                name = ":mpp-library:feature:list",
                exported = true
            )
        }
    }

    private val String.mpl: MultiPlatformLibrary
        get() = MultiPlatformLibrary(
            common = this,
            iosX64 = this.replace(Regex("(.*):(.*):(.*)"), "$1:$2-iosx64:$3"),
            iosArm64 = this.replace(Regex("(.*):(.*):(.*)"), "$1:$2-iosarm64:$3")
        )
}
