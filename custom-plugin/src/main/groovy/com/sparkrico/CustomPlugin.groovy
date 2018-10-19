package com.sparkrico

import org.gradle.api.Project
import org.gradle.api.Plugin

class CustomPlugin implements Plugin<Project> {
    void apply(Project target) {
        println("========================")
        println("hello gradle plugin!")
        println("========================")
    }
}