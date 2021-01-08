package com.github.aderan.intellijplugindemo.services

import com.intellij.openapi.project.Project
import com.github.aderan.intellijplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
