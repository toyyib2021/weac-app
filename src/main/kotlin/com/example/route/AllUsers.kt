package com.example.route

import com.example.repository.account.AccountAllYear
import com.example.repository.agric.AgricultureAllYear
import com.example.repository.biology.BiologyAllYear
import com.example.repository.chemistry.ChemistryAllYear
import com.example.repository.civic.CivicAllYear
import com.example.repository.commerce.CommerceAllYear
import com.example.repository.economics.EconomicsAllYear
import com.example.repository.english.EnglishAllYear
import com.example.repository.government.GovernmentAllYear
import com.example.repository.literture.LiteratureAllYear
import com.example.repository.mathematics.MathsAllYear
import com.example.repository.physics.PhysicsAllYear
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

fun Route.agricultureAllYears(){

    get(path = "/all-agriculture"){

        val agricultureAllYear = AgricultureAllYear()
        try {
            call.respond(message = agricultureAllYear.agricultureAllYear(), status = HttpStatusCode.OK)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = "questions not found", status = HttpStatusCode.NotFound
            )
        }
    }

}

fun Route.biologyAllYears(){

    get(path = "/all-biology"){

        val biologyAllYear = BiologyAllYear()
        try {
            call.respond(message = biologyAllYear.biologyAllYear(), status = HttpStatusCode.OK)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = "questions not found", status = HttpStatusCode.NotFound
            )
        }
    }

}

fun Route.chemistryAllYears(){

    get(path = "/all-chymistry"){

        val chemistryAllYear = ChemistryAllYear()
        try {
            call.respond(message = chemistryAllYear.chemistryAllYear(), status = HttpStatusCode.OK)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = "questions not found", status = HttpStatusCode.NotFound
            )
        }
    }

}

fun Route.civicEducationAllYears(){

    get(path = "/all-civic-education"){

        val civicEducationAllYear = CivicAllYear()
        try {
            call.respond(message = civicEducationAllYear.civicEducationAllYear(), status = HttpStatusCode.OK)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = "questions not found", status = HttpStatusCode.NotFound
            )
        }
    }

}

fun Route.commerceAllYears(){

    get(path = "/all-commerce"){

        val commerceAllYear = CommerceAllYear()
        try {
            call.respond(message = commerceAllYear.commerceAllYear(), status = HttpStatusCode.OK)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = "questions not found", status = HttpStatusCode.NotFound
            )
        }
    }

}

fun Route.economicsAllYears(){

    get(path = "/all-economics"){

        val economicsAllYear = EconomicsAllYear()
        try {
            call.respond(message = economicsAllYear.economicsAllYear(), status = HttpStatusCode.OK)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = "questions not found", status = HttpStatusCode.NotFound
            )
        }
    }

}

fun Route.governmentAllYears(){

    get(path = "/all-government"){

        val governmentAllYear = GovernmentAllYear()
        try {
            call.respond(message = governmentAllYear.governmentAllYear(), status = HttpStatusCode.OK)

        } catch (e:IllegalArgumentException){
            call.respond(
                message = "questions not found", status = HttpStatusCode.NotFound
            )
        }
    }

}

fun Route.literatureAllYears(){

    get(path = "/all-literature"){

        val literatureAllYear = LiteratureAllYear()
        try {
            call.respond(message = literatureAllYear.literatureAllYear(), status = HttpStatusCode.OK)

        } catch (e:IllegalArgumentException){
            call.respond(
                message = "questions not found", status = HttpStatusCode.NotFound
            )
        }
    }

}

fun Route.physicsAllYears(){

    get(path = "/all-physics"){

        val physicsAllYear = PhysicsAllYear()
        try {
            call.respond(message = physicsAllYear.physicsAllYear(), status = HttpStatusCode.OK)

        } catch (e:IllegalArgumentException){
            call.respond(
                message = "questions not found", status = HttpStatusCode.NotFound
            )
        }
    }

}