package com.dica.claon.data.repository

import com.dica.claon.data.model.CharacterDto
import com.dica.claon.data.remote.ApiService
import com.dica.claon.domain.repository.CharacterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class CharacterRepositoryImpl(
    private val api: ApiService
) : CharacterRepository {

    override  fun getCharacters(): Flow<List<CharacterDto>>
    {
        return flow {
            try {
                val response = api.getCharacters()
                if (response.results.isNotEmpty() ==true) {
                    emit(response.results)
                }
            }catch (e: Exception){
                e.printStackTrace()
            }
        }.flowOn(Dispatchers.IO)
    }
}