package util

import org.gradle.testkit.runner.GradleRunner

class IntegrationTestRunner {

  private final File projectDir

  IntegrationTestRunner(File projectDir) {
    this.projectDir = projectDir
    generateBuildFile()
  }

  def run(String task) {
    GradleRunner
      .create()
      .withProjectDir(projectDir)
      .withArguments(task)
      .withPluginClasspath()
      .build();
  }

  private void generateBuildFile() {
    File buildFile = new File(projectDir, 'build.gradle')
    buildFile << """
            plugins {
              id 'com.etraveli.yarn'
            }
          """
  }
}
