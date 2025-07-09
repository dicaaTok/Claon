package com.dica.claon.domain.repository

import com.dica.claon.data.model.CharacterDto
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    fun getAllCharacters(): Flow<Either<Failure, List<Character>>>
    fun getCharacterById(id: Int): Flow<Either<Failure, Character>>
}
