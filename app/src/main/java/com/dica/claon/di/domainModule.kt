package com.dica.claon.di

import com.dica.claon.domain.usecase.DecrementUseCase
import com.dica.claon.domain.usecase.GetCountUseCase
import com.dica.claon.domain.usecase.IncrementUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { IncrementUseCase(get()) }
    factory { DecrementUseCase(get()) }
    factory { GetCountUseCase(get()) }
}