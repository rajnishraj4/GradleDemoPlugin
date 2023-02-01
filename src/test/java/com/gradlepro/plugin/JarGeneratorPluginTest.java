package com.gradlepro.plugin;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JarGeneratorPluginTest {

    @Test
    public void testPlugin() {
        Project project = ProjectBuilder.builder().build();
        project.getPluginManager().apply("com.gradlepro.jarcreator");
        Assertions.assertTrue(project.getPluginManager().hasPlugin("com.gradlepro.jarcreator"));
        Assertions.assertNotNull(project.getTasks().getByName("generatejar"));
    }
}
