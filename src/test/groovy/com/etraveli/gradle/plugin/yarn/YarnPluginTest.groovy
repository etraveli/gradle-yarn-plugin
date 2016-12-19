package com.etraveli.gradle.plugin.yarn

import com.etraveli.gradle.plugin.yarn.task.YarnSetupTask
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import spock.lang.Specification

class YarnPluginTest extends Specification {

  @Rule
  final TemporaryFolder temporaryFolder = new TemporaryFolder();

  Project project

  def setup() {
    project = ProjectBuilder
      .builder()
      .withProjectDir(temporaryFolder.root)
      .build()
  }

  def "creates a Yarn extension"() {
    when:
    project.apply plugin: 'com.etraveli.yarn'
    project.evaluate()

    then:
    project.extensions.getByName(YarnExtension.NAME)
  }

  def "correct tasks get applied"() {
    when:
    project.apply plugin: 'com.etraveli.yarn'
    project.evaluate()

    then:
    project.tasks.size() == 1
    project.tasks.getByName(YarnSetupTask.NAME)
  }
}
