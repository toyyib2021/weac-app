package com.example.route

import com.example.repository.AllSubjectRepo
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.allQuestions(){
    val questions = AllSubjectRepo()

    get(path = "/all-questions"){

        val allSubject = questions.allSubjectRepo

        try {
            call.respond(message = allSubject, status = HttpStatusCode.OK)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = "question not found", status = HttpStatusCode.NotFound
            )
        }
    }

}