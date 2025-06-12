package com.dica.claon.domain.usecase

import com.dica.claon.domain.repository.CounterRepository

class DecrementUseCase (

    private val repository: CounterRepository

){

    fun decrement(){
        repository.decrement()
    }

}