package com.dica.claon.data.mapping

import com.dica.claon.data.model.CharacterDto
import com.dica.claon.domain.model.Count

fun CharacterDto.toDomain(): Count {
    return Count(
        count = count,
        isIncrement = isIncrement,
    )
}