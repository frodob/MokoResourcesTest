plugins {
    id("com.android.application")
    kotlin("android")
//    id("kotlin-android-extensions")
}
group = "com.mokoresourcestest"
version = "1.0"

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}
android {
    compileSdkVersion(Deps.Android.compileSdk)
    defaultConfig {
        applicationId = "com.mokoresourcestest"
        minSdkVersion(Deps.Android.minSdk)
        targetSdkVersion(Deps.Android.targetSdk)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        viewBinding = true
        // Enables Jetpack Compose for this module
        compose = true
    }

    // Set both the Java and Kotlin compilers to target Java 8.
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Deps.Version.compose
        kotlinCompilerVersion  = Deps.Version.kotlin
    }

    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/*.kotlin_module")
    }
}
dependencies {
//    implementation fileTree (dir: 'libs', include: ['*.jar'])
    implementation(project(":SharedCode"))

    implementation(Deps.Libs.Android.material)
//    implementation("com.google.android.material:material:1.2.0")
    implementation(Deps.Libs.Android.appCompat)
//    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation(Deps.Libs.Android.constraintLayout)
//    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
//    implementation("androidx.core:core-ktx:1.3.1")

    //    // LiveData and ViewModel
//    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0-rc03'
//    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0-rc03'

    // compose
    implementation(Deps.Libs.Android.Compose.ui)
    implementation(Deps.Libs.Android.Compose.uiTooling)
    implementation(Deps.Libs.Android.Compose.uiGraphics)
    implementation(Deps.Libs.Android.Compose.foundationLayout)
    implementation(Deps.Libs.Android.Compose.material)
//    implementation(Deps.Libs.Android.Compose.materialIcons)
//    implementation(Deps.Libs.Android.Compose.materialIconsExtended)
//    implementation(Deps.Libs.Android.Compose.animation)
}
