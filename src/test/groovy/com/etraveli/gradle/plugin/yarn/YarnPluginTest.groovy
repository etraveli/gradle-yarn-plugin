package com.etraveli.gradle.plugin.yarn

import util.TestProjectSetup

class YarnPluginTest extends TestProjectSetup {
  def "correct tasks get applied"() {
    when:
    this.project.apply plugin: 'com.etraveli.yarn'
    this.project.evaluate()

    then:
    this.project.tasks.size() == 1
    this.project.tasks.getByName(YarnSetupTask.NAME)
  }
}
