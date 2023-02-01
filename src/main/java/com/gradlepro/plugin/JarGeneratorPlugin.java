package com.gradlepro.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JarGeneratorPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.task("generatejar")
                .doLast(task -> System.out.println("Jar generated"))
                .setGroup("finaljar");
    }
}