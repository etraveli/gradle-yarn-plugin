package com.etraveli.gradle.plugin.yarn

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import spock.lang.Specification

class YarnExtensionTest extends Specification {

  @Rule
  final TemporaryFolder temporaryFolder = new TemporaryFolder();

  Project project

  def setup() {
    project = ProjectBuilder
      .builder()
      .withProjectDir(temporaryFolder.root)
      .build()
  }

  def "sets correct default values"() {
    when:
    project.apply plugin: 'com.etraveli.yarn'
    def config = YarnExtension.get(project)

    then:
    with(config) {
      config != null
      config.version == 'latest'
      config.distBaseUrl == 'https://yarnpkg.com'
      config.cacheDir != null
      config.workDir != null
      config.nodeModulesDir != null
    }
  }
}
