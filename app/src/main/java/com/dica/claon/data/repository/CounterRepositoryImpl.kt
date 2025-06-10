package com.dica.claon.data.repository

import com.dica.claon.data.datasource.CounterDataSource
import com.dica.claon.data.model.CountDto
import com.dica.claon.domain.model.Count
import com.dica.claon.domain.repository.CounterRepository

class CounterRepositoryImpl : CounterRepository{
    private val db = CounterDataSource()


   override fun increment(){
       db.increment()
   }

   override  fun decrement(){
       db.decrement()
   }

   override fun getCount(): Count {
       val response: CountDto = db.getCount()
      return Count(
          count = response.count,
          isIncrement = response.isIncrement,

      )
   }
}