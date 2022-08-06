// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.slin.tools.version") apply false
    id("com.android.library") apply false
    kotlin("android") apply false
    kotlin("jvm") apply false
}

allprojects {
    apply {
        plugin("com.slin.tools.version")
    }
}

task("clean", Delete::class) {
    delete(rootProject.buildDir)
}
