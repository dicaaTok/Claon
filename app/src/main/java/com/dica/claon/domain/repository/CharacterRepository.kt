package com.dica.claon.domain.repository

import com.dica.claon.data.model.CharacterDto
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    fun getCharacters(): Flow<List<CharacterDto>>
}