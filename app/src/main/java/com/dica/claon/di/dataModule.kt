package com.dica.claon.di

import com.dica.claon.data.repository.CounterRepositoryImpt
import com.dica.claon.domain.repository.CounterRepository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single<ApiService> {
        get<Retrofit>().create(ApiService::class.java)
    }

    single<CounterRepository> {
        CounterRepositoryImpt()
    }
}