package com.slin.tools.version.applicator

import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.artifacts.repositories.MavenArtifactRepository
import org.gradle.kotlin.dsl.repositories
import java.net.URI

/**
 * 添加阿里云仓库地址
 */
internal class MavenApplicator : Applicator {

    private val repositoryUris: List<URI> = listOf(
        URI.create("https://maven.aliyun.com/repository/central"),
        URI.create("https://maven.aliyun.com/repository/public")
    )

    override fun apply(project: Project) {
        project.allprojects {
            for (uri in repositoryUris) {
                it.addRepository(uri)
            }
            it.repositories {
                applyDefaultRepos()
            }
        }
    }

    private fun RepositoryHandler.applyDefaultRepos() {
        google()
        mavenCentral()
    }

    private fun RepositoryHandler.contains(uri: URI): Boolean {
        forEach {
//            logd { "RepositoryHandler.contains: ${if(it is MavenArtifactRepository) it.url else it.name}" }
            if (it is MavenArtifactRepository && it.url == uri) {
                return true
            }
        }
        return false
    }

    private fun Project.addRepository(uri: URI) {
        if (!repositories.contains(uri)) {
            repositories.maven {
                it.url = uri
            }
        }
    }
}
