package com.dica.claon.data.datasource

import com.dica.claon.data.model.CountDto

class CounterDataSource {

    private var countDto = CountDto()
    private var count = 0

    fun increment() {
        countDto = CountDto(
        count = count++,
        isIncrement = true,
        )
    }

    fun decrement() {
        countDto = CountDto(
            count = count--,
            isIncrement = false,
        )
    }

    fun getCount() = countDto
  //  fun getCount() = count
    //fun getCount(): Int {
// return count
// }
}