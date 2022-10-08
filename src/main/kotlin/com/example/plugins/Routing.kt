package com.example.plugins

import com.example.route.englishAllYears
import com.example.route.mathematicsAllYears
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
        // Static plugin. Try to access `/static/index.html`
        static("/image") {
            resources("static")
        }
    }
}
