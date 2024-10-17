package com.example.plugins

import com.example.model.Character
import com.example.model.CharacterRepository
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {

        // Static plugin. Try to access `/static/index.html`
        staticResources("/static", "static")
        val characters: CharacterRepository = CharacterRepository()

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
