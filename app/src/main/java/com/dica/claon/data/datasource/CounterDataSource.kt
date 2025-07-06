package com.dica.claon.data.datasource

import com.dica.claon.data.model.CharacterDto

class CounterDataSource {

    private var countDto = CharacterDto()
    private var count = 0

    fun increment(){
        countDto = CharacterDto(
            count = count++,
            isIncrement = true,
        )
    }

    fun decrement(){
        countDto = CharacterDto(
            count = count--,
            isIncrement = false,
        )
    }
    fun getCount() = countDto

}
  //  fun getCount() = count
    //fun getCount(): Int {
// return count
// }
