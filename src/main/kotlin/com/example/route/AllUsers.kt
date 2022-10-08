package com.example.route

import com.example.repository.account.AccountAllYear
import com.example.repository.english.EnglishAllYear
import com.example.repository.mathematics.MathsAllYear
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.englishAllYears(){

    get(path = "/all-english"){

        val englishAllYear = EnglishAllYear()
        try {
            call.respond(message = englishAllYear.englishAllYear(), status = HttpStatusCode.OK)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = "question not found", status = HttpStatusCode.NotFound
            )
        }
    }

}

fun Route.mathematicsAllYears(){

    get(path = "/all-mathematics"){

        val mathsAllYear = MathsAllYear()
        try {
            call.respond(message = mathsAllYear.mathsAllYear(), status = HttpStatusCode.OK)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = "questions not found", status = HttpStatusCode.NotFound
            )
        }
    }

}

fun Route.accountAllYears(){

    get(path = "/all-account"){

        val accountAllYear = AccountAllYear()
        try {
            call.respond(message = accountAllYear.accountAllYear(), status = HttpStatusCode.OK)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = "questions not found", status = HttpStatusCode.NotFound
            )
        }
    }

}