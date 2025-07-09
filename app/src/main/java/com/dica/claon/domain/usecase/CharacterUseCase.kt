package com.dica.claon.domain.usecase

import com.dica.claon.domain.repository.CharacterRepository
import java.util.concurrent.Flow

class CharacterUseCase(
    private val repository: CharacterRepository
) {
    fun getAllCharacters(): Flow<Either<Failure, List<Character>>> {
        return repository.getAllCharacters()
    }

    fun getCharacterById(id: Int): Flow<Either<Failure, Character>> {
        return repository.getCharacterById(id)
    }
}