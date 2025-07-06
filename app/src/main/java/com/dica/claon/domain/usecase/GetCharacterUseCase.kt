package com.dica.claon.domain.usecase

import com.dica.claon.data.model.CharacterDto
import com.dica.claon.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow

class GetCharactersUseCase(
    private val repository: CharacterRepository
) {

    fun getCharacters(): Flow<List<CharacterDto>> {
        return repository.getCharacters()
    }

}