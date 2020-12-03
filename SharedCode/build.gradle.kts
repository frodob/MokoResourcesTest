plugins {
    plugin(Deps.Plugins.kotlinMultiplatform)
    plugin(Deps.Plugins.kotlinSerialization)
    plugin(Deps.Plugins.androidLibrary)
    plugin(Deps.Plugins.kotlinAndroidExtensions)
    plugin(Deps.Plugins.cocoapods)
    plugin(Deps.Plugins.sqlDelight)
    plugin(Deps.Plugins.mokoResources)
}

group = "com.espoto"
version = "1.0.0"

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}

kotlin {
    android()
    ios()

    sourceSets {
        val commonMain by getting {
            dependencies {

                // Coroutines
                implementation(Deps.Libs.MultiPlatform.coroutines) {
                    isForce = true
                }

                // Ktor
                implementation(Deps.Libs.Ktor.client)
                implementation(Deps.Libs.Ktor.json)
                implementation(Deps.Libs.Ktor.clientLogging)
                api(Deps.Libs.Ktor.serialization)

                // Serialize
                implementation(Deps.Libs.MultiPlatform.kotlinSerialization)

                // SQL Delight
                implementation(Deps.Libs.SqlDelight.runtime)
                implementation(Deps.Libs.SqlDelight.coroutineExtensions)

//        implementation("com.github.florent37:multiplatform-preferences:1.2.0")
                implementation(Deps.Libs.MultiPlatform.uuid)
//        implementation("com.soywiz.korlibs.krypto:krypto:1.11.1")
                implementation(Deps.Libs.MultiPlatform.klock)

                implementation(Deps.Libs.MultiPlatform.mokoResources.common)
               implementation(Deps.Libs.MultiPlatform.mokoGraphics.common)
               implementation(Deps.Libs.MultiPlatform.mokoParcelize.common)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val androidMain by getting {
            dependencies {
                // Coroutines
//                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Deps.Version.coroutines}") {
//                    isForce = true
//                }
                implementation(Deps.Libs.Ktor.androidClient)
                implementation(Deps.Libs.SqlDelight.androidDriver)
            }
        }
        val androidTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.13.1")
            }
        }

        val iosMain by getting {
            dependencies {
                implementation(Deps.Libs.Ktor.iOSClient)
                implementation(Deps.Libs.SqlDelight.nativeDriver)
            }
        }
        val iosTest by getting
    }

    cocoapods {
        summary = "Shared espoto module for Android and iOS"
        homepage = "https://espoto.tabgametest.de"
//        pod("AppCenter", "~> 3.0.0")
//        pod("CocoaLumberjack", "3.5.3")
//        pod("Zip", "~> 1.1")
//        pod("Starscream", "4.0.0")
    }
}

sqldelight {
    database("EspotoDatabase") {
        packageName = "database.generated"
    }
}

multiplatformResources {
    multiplatformResourcesPackage = "com.espoto.resources" // required
//    iosBaseLocalizationRegion = "en" // optional, default "en"
//    multiplatformResourcesSourceSet = "commonClientMain"  // optional, default "commonMain"
}

android {
    compileSdkVersion(29)
//    buildToolsVersion("29.0.3")

    defaultConfig {
        minSdkVersion(19)
        targetSdkVersion(29)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    sourceSets {
        getByName("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            java.srcDirs("src/androidMain/kotlin")
            res.srcDirs("src/androidMain/res")
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

//    lintOptions {
//        isWarningsAsErrors = true
//        isAbortOnError = true
//    }
}