package com.github.nehapednekar.intellijmusic.services

import com.github.nehapednekar.intellijmusic.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
