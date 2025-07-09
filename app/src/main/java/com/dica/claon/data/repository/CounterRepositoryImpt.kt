package com.dica.claon.data.repository

import com.dica.claon.data.datasource.CounterDataSource
import com.dica.claon.domain.repository.CounterRepository
import com.dica.claon.data.mapping.toDomain
import com.dica.claon.domain.model.Count

class CounterRepositoryImpt: CounterRepository {


    private val db = CounterDataSource()

    override fun increment() {
        db.increment()
    }

    override fun decrement() {
        db.decrement()
    }

    override fun getCount(): Count {
        val response = db.getCount().toDomain()
        return response
    }
}