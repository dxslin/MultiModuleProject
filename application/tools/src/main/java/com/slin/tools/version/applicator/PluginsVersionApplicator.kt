package com.slin.tools.version.applicator

import com.slin.deps.Versions
import org.gradle.api.Project

internal class PluginsVersionApplicator : Applicator {

    private val pluginIdVersions: List<Pair<String, String>> = listOf(
        "com.android.application" to Versions.agpVersion,
        "com.android.library" to Versions.agpVersion,
        "org.jetbrains.kotlin.android" to Versions.kotlinVersion,
        "org.jetbrains.kotlin.jvm" to Versions.kotlinVersion,
    )

    override fun apply(project: Project) {
//        project.rootProject.gradle.beforeSettings { settings ->
//            settings.pluginManagement { pms ->
//                pms.repositories {
//                    it.maven("https://maven.aliyun.com/repository/central")
//                    it.maven("https://maven.aliyun.com/repository/public")
//                    it.google()
//                    it.gradlePluginPortal()
//                    it.mavenCentral()
//                }
//                pms.plugins { pds ->
//                    pluginIdVersions.forEach {
//                        pds.id(it.first).version(it.second) apply false
//                    }
//                }
//            }
//        }
    }
}
