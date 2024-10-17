package com.example.model

import com.example.model.Character

class CharacterRepository {
    private val characters = mutableListOf(
        Character(
            id = 1,
            name = "Trailblazer",
            rarity = 5,
            path =  "Destruction",
            element =  "Physical",
            release =  "2023-04-26T00:00:00.000Z",
            introduction = "A boy/girl who boarded the Astral Express. They chose to travel with the Astral Express to eliminate the dangers posed by the Stellaron.",
            img = "https://static.wikia.nocookie.net/houkai-star-rail/images/6/6f/Character_Trailblazer_%28F%29_Destruction_Splash_Art.png/revision/latest?cb=20230501005741"
        ),
        Character(
            id =  2,
            name =  "March_7th",
            rarity =  4,
            path =  "Preservation",
            element =  "Ice",
            release =  "2023-04-26T00:00:00.000Z",
            introduction =  "A girl who once slumbered in eternal ice and knows nothing about her past. To find out the truth about her origins, she decided to travel with the Astral Express. As of right now, she has prepared about 67 different versions of her life story for herself.",
            img =  "https://static.wikia.nocookie.net/honkai-star-rail/images/6/68/Visualización_de_personaje_Siete_de_Marzo.png/revision/latest?cb=20230516025040&path-prefix=es"
        ),
        Character(
            id =  3,
            name =  "Dan_Heng",
            rarity =  4,
            path =  "Hunt",
            element =  "Wind",
            release =  "2023-04-26T00:00:00.000Z",
            introduction =  "A cold and reserved young man who is reticent about his past. To avoid his kin, he decided to travel with the Astral Express.",
            img =  "https://static.wikia.nocookie.net/houkai-star-rail/images/e/e5/Character_Dan_Heng_Splash_Art.png"
        ),
        Character(
            id =  4,
            name =  "Himeko",
            rarity =  5,
            path =  "Erudition",
            element =  "Fire",
            release =  "2023-04-26T00:00:00.000Z",
            introduction =  "The one who repaired the Astral Express.\nTo witness the vast starry sky, she decided to travel with the Astral Express.\nHer hobby is brewing hand-made coffee.",
            img =  "https://static.wikia.nocookie.net/houkai-star-rail/images/8/8e/Character_Himeko_Splash_Art.png/revision/latest/scale-to-width-down/1000?cb=20230525090036"
        ),
        Character(
            id =  5,
            name =  "Welt",
            rarity =  5,
            path =  "Nihility",
            element =  "Imaginary",
            release =  "2023-04-26T00:00:00.000Z",
            introduction =  "A seasoned member of the Express crew. The passion buried in his heart burns anew as he enjoys this fresh adventure. Occasionally, he would sketch the experiences in a notebook.",
            img =  "https://static.wikia.nocookie.net/houkai-star-rail/images/1/11/Character_Welt_Splash_Art.png/revision/latest/scale-to-width-down/1000?cb=20230525090017"
        ),
        Character(
            id =  6,
            name =  "Sampo",
            rarity =  4,
            path =  "Nihility",
            element =  "Wind",
            release =  "2023-04-26T00:00:00.000Z",
            introduction =  "A merchant who freely travels between the Overworld and the Underworld. He acts like he is everyone's friend, is enthusiastically humorous, and is good at bantering.",
            img =  "https://static.wikia.nocookie.net/houkai-star-rail/images/6/65/Character_Sampo_Splash_Art.png/revision/latest/scale-to-width-down/1000?cb=20230525090046"),
        Character(
            id =  7,
            name =  "Bronya",
            rarity =  5,
            path =  "Harmony",
            element =  "Wind",
            release =  "2023-04-26T00:00:00.000Z",
            introduction =  "Heir apparent to the Supreme Guardian of Belobog.\nShe possesses pride befitting of a princess, but also the determination and integrity of a soldier.",
            img =  "https://static.wikia.nocookie.net/houkai-star-rail/images/7/7c/Character_Bronya_Splash_Art.png/revision/latest/scale-to-width-down/1000?cb=20230706032152"
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
        Character(
            id =  9,
            name =  "Asta",
            rarity =  4,
            path =  "Harmony",
            element =  "Fire",
            release =  "2023-04-26T00:00:00.000Z",
            introduction =  "The lead researcher of Herta Space Station and a lady from a renowned family.\nShe's an astronomer overflowing with curiosity, and excels at managing the disparate staff of the space station.",
            img =  "https://static.wikia.nocookie.net/houkai-star-rail/images/b/bd/Character_Asta_Splash_Art.png/revision/latest/scale-to-width-down/1000?cb=20230216231122"
        ),
        Character(
            id =  10,
            name =  "Clara",
            rarity =  5,
            path =  "Destruction",
            element =  "Physical",
            release =  "2023-04-26T00:00:00.000Z",
            introduction =  "A vagrant girl who lives with robots.\nShe is introverted, gentle, and has a pure heart.\nShe wishes for all Underworlders to become a family.",
            img =  "https://static.wikia.nocookie.net/houkai-star-rail/images/c/c2/Character_Clara_Splash_Art.png/revision/latest/scale-to-width-down/1000?cb=20230216231958"
        ),
        Character(
            id =  11,
            name =  "Gepard",
            rarity =  5,
            path =  "Preservation",
            element =  "Ice",
            release =  "2023-04-26T00:00:00.000Z",
            introduction =  "A captain in the Silvermane Guards and an outstanding warrior of Belobog.\nHe is meticulous and vigilant to the core and is always true to himself.",
            img =  "https://static.wikia.nocookie.net/houkai-star-rail/images/9/96/Character_Gepard_Splash_Art.png/revision/latest/scale-to-width-down/1000?cb=20230216232354"
        )
    )

    fun getCharacters(): List<Character> = characters

    fun getCharacter(id: Int): Character = characters.get(id)

}