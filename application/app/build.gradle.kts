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

    signingConfigs {
        register("platform") {
            storeFile = project.file("../keystore/public.keystore")
            storePassword = "android"
            keyAlias = "platform"
            keyPassword = "android"
        }
    }
    buildTypes {
        debug {
            signingConfig = signingConfigs["platform"]
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs["platform"]
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
