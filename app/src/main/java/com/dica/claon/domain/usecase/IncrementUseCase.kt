package com.dica.claon.domain.usecase

import com.dica.claon.domain.repository.CounterRepository

class IncrementUseCase(
    private val repository : CounterRepository
) {
    fun increment(){
        repository.increment()
    }
}