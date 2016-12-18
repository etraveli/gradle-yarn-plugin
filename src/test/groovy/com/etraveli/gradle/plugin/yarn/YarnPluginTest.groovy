package com.etraveli.gradle.plugin.yarn

import com.etraveli.gradle.plugin.yarn.task.YarnSetupTask
import util.TestProjectSetup

class YarnPluginTest extends TestProjectSetup {
  def "creates a Yarn extension"() {
    when:
    this.project.apply plugin: 'com.etraveli.yarn'
    this.project.evaluate()

    then:
    this.project.extensions.getByName(YarnExtension.NAME)
  }

  def "correct tasks get applied"() {
    when:
    this.project.apply plugin: 'com.etraveli.yarn'
    this.project.evaluate()

    then:
    this.project.tasks.size() == 1
    this.project.tasks.getByName(YarnSetupTask.NAME)
  }
}
