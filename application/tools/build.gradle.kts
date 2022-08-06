plugins {
    id("java-library")
    id("java-gradle-plugin")
    kotlin("jvm")
    // maven插件，用于上传插件到仓库
    id("maven-publish")
    id("com.diffplug.spotless") version "5.12.5"
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11

    sourceSets {
        named("main") {
            java.srcDir("../buildSrc/src/main/java")
        }
    }
}

kotlin {
    target {
        compilations.all {
            kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
        }
    }
}

dependencies {
    implementation(gradleApi())
    implementation(gradleKotlinDsl())
    implementation(kotlin("stdlib"))
    implementation("com.android.tools.build:gradle:${rootProject.extra["agp.version"]}")
}

group = "com.slin.tools"

gradlePlugin {
    plugins {
        create("version") {
            id = "com.slin.tools.version"
            implementationClass = "com.slin.tools.version.VersionManagerPlugin"
        }
    }
}

// 代码检查工具
spotless {
    kotlin {
        target("**/*.kt")
        targetExclude(".idea/")
        ktlint("0.44.0")
    }
}
