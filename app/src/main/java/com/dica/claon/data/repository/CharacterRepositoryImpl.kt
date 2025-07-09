package com.dica.claon.data.repository

import com.dica.claon.data.model.CharacterDto
import com.dica.claon.data.remote.ApiService
import com.dica.claon.domain.repository.CharacterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class CharacterRepositoryImpl(
    private val api: CharacterApi
) : CharacterRepository {

    override fun getAllCharacters(): Flow<Either<Failure, List<Character>>> = flow {
        try {
            val response = api.getCharacters()
            emit(Either.Right(response.map { it.toDomain() }))
        } catch (e: Exception) {
            emit(Either.Left(Failure.ServerError))
        }
    }

    override fun getCharacterById(id: Int): Flow<Either<Failure, Character>> = flow {
        try {
            val response = api.getCharacterById(id)
            emit(Either.Right(response.toDomain()))
        } catch (e: Exception) {
            emit(Either.Left(Failure.ServerError))
        }
    }
}