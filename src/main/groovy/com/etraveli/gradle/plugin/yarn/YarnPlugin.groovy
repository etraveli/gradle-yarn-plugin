package com.etraveli.gradle.plugin.yarn

import com.etraveli.gradle.plugin.yarn.task.YarnSetupTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class YarnPlugin implements Plugin<Project> {

  private YarnExtension config

  @Override
  void apply(Project project) {
    config = project.extensions.create(YarnExtension.NAME, YarnExtension, project)
    addTasks(project)
  }

  private void addTasks(Project project) {
    project.tasks.create(YarnSetupTask.NAME, YarnSetupTask)
  }
}
