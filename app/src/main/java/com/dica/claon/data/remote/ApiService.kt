package com.dica.claon.data.remote

import com.dica.claon.data.mapping.CharacterResponseDto
import retrofit2.http.GET

interface ApiService {

    @GET("character")
    fun getCharacters(): CharacterResponseDto
}