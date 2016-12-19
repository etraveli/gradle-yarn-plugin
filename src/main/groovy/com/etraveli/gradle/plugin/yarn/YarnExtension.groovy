package com.etraveli.gradle.plugin.yarn

import org.gradle.api.Project

class YarnExtension {
  static final String NAME = "yarn"

  String version = 'latest'
  String distBaseUrl = 'https://yarnpkg.com'
  File cacheDir
  File workDir
  File nodeModulesDir

  YarnExtension(Project project) {
    cacheDir = new File(project.projectDir, '.gradle')
    workDir = new File(cacheDir, 'yarn')
    nodeModulesDir = project.projectDir
  }

  static YarnExtension get(Project project) {
    return project.extensions.getByType(YarnExtension)
  }
}
