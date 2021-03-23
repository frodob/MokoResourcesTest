plugins {
    plugin(Deps.Plugins.androidLibrary)
    plugin(Deps.Plugins.kotlinMultiplatform)
    plugin(Deps.Plugins.cocoapods)
    plugin(Deps.Plugins.kotlinSerialization)
    plugin(Deps.Plugins.kotlinAndroidExtensions)
    plugin(Deps.Plugins.sqlDelight)
    plugin(Deps.Plugins.mokoResources)
}

group = "com.espoto"
version = "1.0.0"

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
}

kotlin {
    android()
    ios()
//    val onPhone = System.getenv("SDK_NAME")?.startsWith("iphoneos") ?: false
//    if (onPhone) iosArm64("ios")
//    else iosX64("ios")

    sourceSets {
        val commonMain by getting {
            dependencies {

                // Coroutines
                implementation(Deps.Libs.MultiPlatform.coroutines) {
                    version {
                        strictly(Deps.Version.coroutines)
                    }
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
                api(Deps.Libs.MultiPlatform.mokoGraphics.common)
                api(Deps.Libs.MultiPlatform.mokoParcelize.common)
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
                implementation(Deps.Libs.Android.lifecycle)
                implementation(Deps.Libs.Android.viewModel)
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
        summary = "Shared module for Android and iOS"
        homepage = "..."
        // You can change the name of the produced framework.
        // By default, it is the name of the Gradle project.
        frameworkName = "SharedCode"
        ios.deploymentTarget = "12.0"

        // https://kotlinlang.org/docs/native-cocoapods.html#add-a-dependency-on-a-pod-library-from-the-cocoapods-repository
        // https://kotlinlang.org/docs/native-cocoapods.html
        // https://youtrack.jetbrains.com/issue/KT-40594
        // https://stackoverflow.com/questions/60126503/how-to-add-thirdparty-ios-pod-library-into-kotlin-native-project-getting-error
//        pod("AppCenter", "~> 3.0.0")
//        pod("CocoaLumberjack", "3.5.3")
//        pod("AFNetworking", "~> 4.0.1")
//        pod("Reachability", version = "~> 3.2")
//        pod("UnzipKit")
//        pod("Starscream", "4.0.0")

        // https://stackoverflow.com/questions/34509310/cocoapods-pod-update-installs-old-pods
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
    compileSdkVersion(Deps.Android.compileSdk)
//    buildToolsVersion("29.0.3")

    defaultConfig {
        minSdkVersion(Deps.Android.minSdk)
        targetSdkVersion(Deps.Android.targetSdk)
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