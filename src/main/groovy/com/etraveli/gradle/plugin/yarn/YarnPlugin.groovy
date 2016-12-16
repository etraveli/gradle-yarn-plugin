package com.etraveli.gradle.plugin.yarn

import org.gradle.api.Plugin
import org.gradle.api.Project

class YarnPlugin implements Plugin<Project> {
  @Override
  void apply(Project project) {
    addTasks(project)
  }

  private void addTasks(Project project) {
    project.tasks.create(YarnSetupTask.NAME, YarnSetupTask)
  }
}
