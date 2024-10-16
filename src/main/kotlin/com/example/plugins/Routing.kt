package com.example.plugins

import com.example.model.Character
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {

        // Static plugin. Try to access `/static/index.html`
        staticResources("/static", "static")

        get("/") {
            call.respond(
                listOf(
                    Character(8,
                        "Seele",
                        5,
                        "Hunt",
                        "Quantum",
                        "2023-04-26T00:00:00.000Z",
                        "A resident of the Underworld and the backbone of Wildfire. She goes by the alias \"Babochka.\" She has a frank personality, but there is a delicate and sensitive hidden side to her deep in her heart.",
                        "https://static.wikia.nocookie.net/houkai-star-rail/images/5/58/Character_Seele_Splash_Art.png/revision/latest/scale-to-width-down/1000?cb=20230706032216")
                )
            )
        }
    }
}
