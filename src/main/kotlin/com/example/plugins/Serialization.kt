package com.example.plugins

import com.example.model.Character
import com.example.model.CharacterRepository
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
    val characters = CharacterRepository()
    routing {
        get("/characters") {

            val list = characters.getCharacters()

            call.respond(list) // Responde con la lista de personajes
        }

        get("/characters/{id}"){
            val id = call.parameters["id"]?.toInt()
            val character = characters.getCharacter(id!!)
            call.respond(character)
        }
    }
}
