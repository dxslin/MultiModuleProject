pluginManagement {
    repositories {
        maven("https://maven.aliyun.com/repository/central")
        maven("https://maven.aliyun.com/repository/public")
        google()
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }

    plugins {
        kotlin("android").version(extra["kotlin.version"] as String)
        kotlin("jvm").version(extra["kotlin.version"] as String)
        id("com.android.application").version(extra["agp.version"] as String)
        id("com.android.library").version(extra["agp.version"] as String)
    }
}
dependencyResolutionManagement {
    // 设置仓库冲突策略：优先使用项目配置的仓库地址
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "application"
includeBuild("tools")
includeBuild("libs")
includeBuild("module/example")
include(":app")
