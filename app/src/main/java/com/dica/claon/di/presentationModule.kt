package com.dica.claon.di

import com.dica.claon.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        MainViewModel(
            getCountUseCase = get(),
            incrementUseCase = get(),
            decrementUseCase = get()
        )
    }
}