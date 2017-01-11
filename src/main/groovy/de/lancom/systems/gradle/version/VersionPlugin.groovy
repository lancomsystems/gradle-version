package de.lancom.systems.gradle.version

import org.gradle.api.Plugin
import org.gradle.api.Project

class VersionPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.tasks.create("update-versions", VersionUpdateTask)
    }
}
