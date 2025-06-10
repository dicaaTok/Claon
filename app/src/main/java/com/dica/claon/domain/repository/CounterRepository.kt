package com.dica.claon.domain.repository

import com.dica.claon.domain.model.Count

interface CounterRepository {

    fun increment()

    fun decrement()

    fun getCount(): Count
}