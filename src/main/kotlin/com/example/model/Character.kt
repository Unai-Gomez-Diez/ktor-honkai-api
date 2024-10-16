package com.example.model

import kotlinx.serialization.Serializable

enum class Priority {
    Low, Medium, High, Vital
}

@Serializable
data class Character(
    val id: Int,
    val name: String,
    val rarity: Int,
    val path: String,
    val element: String,
    val release: String,
    val introduction: String,
    val img: String

)