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

                api(Deps.Libs.MultiPlatform.mokoResources.common)
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
        ios.deploymentTarget = "13.0"
        summary = "Shared module for Android and iOS"
        homepage = "..."
        // You can change the name of the produced framework.
        // By default, it is the name of the Gradle project.
        frameworkName = "SharedCode"

        // https://youtrack.jetbrains.com/issue/KT-40594
        // https://stackoverflow.com/questions/60126503/how-to-add-thirdparty-ios-pod-library-into-kotlin-native-project-getting-error
//        pod("AppCenter", "~> 3.0.0")
//        pod("CocoaLumberjack", "3.5.3")
//        pod("UnzipKit")
        // -> Exception in thread "main" java.lang.Error: /var/folders/j7/fqrxk_js0sn4r2blxl4kq0fm0000gn/T/12780973100919437403.m:1:9: fatal error: module 'UnzipKit' not found

        // https://kotlinlang.org/docs/native-cocoapods.html#add-a-dependency-on-a-pod-library-from-the-cocoapods-repository
        pod("AFNetworking") {
            version = "~> 4.0.1"
        }
        // -> Exception in thread "main" java.lang.Error: /var/folders/j7/fqrxk_js0sn4r2blxl4kq0fm0000gn/T/18314343980925505998.m:1:9: fatal error: module 'AFNetworking' not found
    }
}

sqldelight {
    database("EspotoDatabase") {
        packageName = "database.generated"
    }
}

multiplatformResources {
    multiplatformResourcesPackage = "resources.generated" // required
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