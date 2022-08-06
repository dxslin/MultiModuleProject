import com.slin.deps.Libs
import com.slin.deps.Versions

plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = Versions.androidSdk

    defaultConfig {
        minSdk = Versions.androidMinSdk
        targetSdk = Versions.androidSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
