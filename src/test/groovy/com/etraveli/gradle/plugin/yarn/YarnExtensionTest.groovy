package com.etraveli.gradle.plugin.yarn

import util.TestProjectSetup

class YarnExtensionTest extends TestProjectSetup {
  def "sets correct default values"() {
    when:
    this.project.apply plugin: 'com.etraveli.yarn'
    def config = YarnExtension.get(this.project)

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
