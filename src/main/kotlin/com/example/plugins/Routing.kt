package com.example.plugins

import com.example.route.*
import io.ktor.server.routing.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        englishAllYears()
        mathematicsAllYears()
        accountAllYears()
        agricultureAllYears()
        biologyAllYears()
        chemistryAllYears()
        civicEducationAllYears()
        commerceAllYears()
        economicsAllYears()
        governmentAllYears()
        literatureAllYears()
        physicsAllYears()
        // Static plugin. Try to access `/static/index.html`
        static("/image") {
            resources("static")
        }
    }
}
