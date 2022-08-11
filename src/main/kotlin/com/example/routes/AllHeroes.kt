package com.example.routes

import com.example.models.ApiResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllHeroes() {
    get("/heroes") {
        try {
            // query parameter for page.
            // default page number is 1
            val page = call.request.queryParameters["page"]?.toInt() ?: 1

            // check query parameter for page size is between one and five.
            // if not, throws an IllegalArgumentException
            require(page in 1..5)
            call.respond(message = page)
        } catch (e: NumberFormatException) {

            // when query parameter of page is not able to convert to Int.
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers Allowed"),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {

            // when query parameter of page is not between 1 and 5.
            // returns status code 400, Bad Request
            // with message "Heroes not found"
            call.respond(
                message = ApiResponse(success = false, message = "Heroes not found"),
                status = HttpStatusCode.BadRequest
            )
        }
    }
}
