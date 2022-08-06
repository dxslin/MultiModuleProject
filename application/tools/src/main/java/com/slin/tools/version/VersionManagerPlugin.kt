package com.slin.tools.version

import com.slin.tools.version.applicator.MavenApplicator
import com.slin.tools.version.applicator.PluginsVersionApplicator
import com.slin.tools.version.log.logd
import org.gradle.api.Plugin
import org.gradle.api.Project

class VersionManagerPlugin : Plugin<Project> {

    private val applicators = listOf(MavenApplicator(), PluginsVersionApplicator())

    override fun apply(target: Project) {
        logd { "VersionManagerPlugin.apply: ${target.name}" }
        applicators.forEach {
            it.apply(target)
        }
    }
}
