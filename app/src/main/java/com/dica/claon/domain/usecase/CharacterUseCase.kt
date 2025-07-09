package com.dica.claon.domain.usecase

import com.dica.claon.domain.model.Character
import com.dica.claon.domain.repository.CharacterRepository
import com.dica.claon.utils.Either
import com.dica.claon.utils.Failure
import kotlinx.coroutines.flow.Flow

class CharacterUseCase(
    private val repository: CharacterRepository
) {
    fun getAllCharacters(): Flow<Either<Failure, List<Character>>> =
        repository.getAllCharacters()

    fun getCharacterById(id: Int): Flow<Either<Failure, Character>> =
        repository.getCharacterById(id)
}