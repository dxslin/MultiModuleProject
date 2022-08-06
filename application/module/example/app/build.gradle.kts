import com.slin.deps.Libs
import com.slin.deps.Versions

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = Versions.androidSdk

    defaultConfig {
        applicationId = "com.slin.demo.application"
        minSdk = Versions.androidMinSdk
        targetSdk = Versions.androidSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Versions.javaVersion
        targetCompatibility = Versions.javaVersion
    }
    kotlinOptions {
        jvmTarget = Versions.kotlinJvmTarget
    }
}

dependencies {

    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.appcompat)
    implementation(Libs.AndroidX.material)
    implementation(Libs.AndroidX.Weights.ConstraintLayout.constraintLayout)
    testImplementation(Libs.Test.junit)
    androidTestImplementation(Libs.Test.Ext.junit)
    androidTestImplementation(Libs.Test.espressoCore)
}