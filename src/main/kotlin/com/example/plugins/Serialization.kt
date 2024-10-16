package com.example.plugins

import com.example.model.Character
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
    routing {
        get("/characters") {
            val characters =
                listOf(
                    Character(
                        id = 1,
                        name = "Trailblazer",
                        rarity = 5,
                        path =  "Destruction",
                        element =  "Physical",
                        release =  "2023-04-26T00:00:00.000Z",
                        introduction = "A boy/girl who boarded the Astral Express. They chose to travel with the Astral Express to eliminate the dangers posed by the Stellaron.",
                        img = "https://static.wikia.nocookie.net/houkai-star-rail/images/c/cc/Character_Trailblazer_Splash_Art.png"
                    ),
                    Character(
                        id = 8,
                        name = "Seele",
                        rarity = 5,
                        path = "Hunt",
                        element = "Quantum",
                        release = "2023-04-26T00:00:00.000Z",
                        introduction = "A resident of the Underworld and the backbone of Wildfire. She goes by the alias \"Babochka.\" She has a frank personality, but there is a delicate and sensitive hidden side to her deep in her heart.",
                        img = "https://static.wikia.nocookie.net/houkai-star-rail/images/5/58/Character_Seele_Splash_Art.png/revision/latest/scale-to-width-down/1000?cb=20230706032216"
                    ),

                )

            call.respond(characters) // Responde con la lista de personajes
        }
    }
}
