package com.dica.claon.di

import com.dica.claon.data.remote.CharacterApi
import com.dica.claon.data.repository.CharacterRepositoryImpl
import com.dica.claon.domain.repository.CharacterRepository
import com.dica.claon.domain.usecase.CharacterUseCase
import com.dica.claon.presentation.CharacterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val appModule = module {

    // API
    single<CharacterApi> { get<Retrofit>().create(CharacterApi::class.java) }

    // Repository
    single<CharacterRepository> { CharacterRepositoryImpl(get()) }

    // UseCase
    single { CharacterUseCase(get()) }

    // ViewModel
    viewModel { CharacterViewModel(get()) }
}