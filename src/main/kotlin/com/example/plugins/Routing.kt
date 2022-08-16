package com.example.plugins

import com.example.routes.getAllHeroes
import com.example.routes.root
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()

        // Static content path
        // images dir on resources folder (src/main/resources/images)
        // can access from http://localhost:8080/images/{image name}
        static("/images") {
            resources("images")
        }
    }
}
