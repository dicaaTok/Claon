package com.dica.claon.data.model

import com.dica.claon.domain.model.Character

data class CharacterDto(
    val id: Int,
    val name: String,
    val image: String
)

fun CharacterDto.toDomain(): Character {
    return Character(
        id = id,
        name = name,
        image = image
    )
}