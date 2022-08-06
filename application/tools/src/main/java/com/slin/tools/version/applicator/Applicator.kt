package com.slin.tools.version.applicator

import org.gradle.api.Project

interface Applicator {
    fun apply(project: Project)
}
