package com.dica.claon.domain.usecase

import com.dica.claon.domain.model.Count
import com.dica.claon.domain.repository.CounterRepository

class GetCountUseCase (

    private val repository: CounterRepository

){

    fun getCount(): Count {
        return repository.getCount()
    }

}