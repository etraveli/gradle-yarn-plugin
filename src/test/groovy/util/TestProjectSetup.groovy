package util

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import spock.lang.Specification


abstract class TestProjectSetup extends Specification {
  @Rule
  final TemporaryFolder temporaryFolder = new TemporaryFolder();

  def Project project
  def File projectDir;

  def setup() {
    this.projectDir = this.temporaryFolder.root;
    this.project = ProjectBuilder.builder()
      .withProjectDir(this.projectDir)
      .build();
  }
}
