package com.dica.claon.di

import com.example.m5lesson1.data.datasource.CounterDataSource
import com.example.m5lesson1.data.repository.CounterRepositoryImpt
import com.example.m5lesson1.domain.repository.CounterRepository
import com.example.m5lesson1.domain.usecase.GetCountUseCase
import org.koin.dsl.module

val appModule = module{
    single { CounterDataSource() }

    factory<CounterRepository> { CounterRepositoryImpt() }

    factory { GetCountUseCase(repository = get()) }
}