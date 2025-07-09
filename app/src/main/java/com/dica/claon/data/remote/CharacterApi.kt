package com.dica.claon.data.remote

import com.dica.claon.data.model.CharacterDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterApi {

    @GET("characters")
    suspend fun getCharacters(): List<CharacterDto>

    @GET("characters/{id}")
    suspend fun getCharacterById(@Path("id") id: Int): CharacterDto
}