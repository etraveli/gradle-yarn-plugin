package com.etraveli.gradle.plugin.yarn.task

import org.junit.Rule
import org.junit.rules.TemporaryFolder
import spock.lang.PendingFeature
import spock.lang.Specification
import util.IntegrationTestRunner

class YarnSetupTaskTest extends Specification {
  @Rule
  final TemporaryFolder temporaryFolder = new TemporaryFolder();

  File projectDir
  IntegrationTestRunner runner

  def setup() {
    projectDir = this.temporaryFolder.root
    runner = new IntegrationTestRunner(projectDir)
  }

  @PendingFeature
  def "executes a request to fetch yarn tarball"() {
    when:
    def result = runner.run(YarnSetupTask.NAME)

    then:
    false
  }

  @PendingFeature
  def "handles successful fetching of tarball"() {
    given:
    // TODO
    when:
    expect:
    false
  }

  @PendingFeature
  def "handles failure fetching of tarball"() {
    given:
    // TODO
    when:
    expect:
    false
  }

  private File createFile(String name) {
    return new File(this.temporaryFolder.getRoot(), name);
  }
}
