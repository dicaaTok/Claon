package com.dica.claon.di

import com.dica.claon.data.datasource.CounterDataSource
import com.dica.claon.data.repository.CounterRepositoryImpt
import com.dica.claon.domain.repository.CounterRepository
import com.dica.claon.domain.usecase.GetCountUseCase
import org.koin.dsl.module

val appModule = module {
    single<CharacterApi> { get<Retrofit>().create(CharacterApi::class.java) }
    single<CharacterRepository> { CharacterRepositoryImpl(get()) }
    single { CharacterUseCase(get()) }
    viewModel { CharacterViewModel(get()) }
}