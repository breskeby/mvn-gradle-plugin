package com.breskeby.gradle.mvn

import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project

class MvnPlugin implements Plugin<Project> {

    private Project project

    @Override
    void apply(Project project) {
        this.project = project
        if (this.project != this.project.rootProject) {
            throw new GradleException("mvn plugin must be applied on root level")
        }

        setupMavenDefaults()
    }

    void setupMavenDefaults() {
        project.allprojects { proj ->
            proj.buildDir = proj.file("target")
        }
    }
}
