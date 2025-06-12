package com.dica.claon.data.mapper

import com.dica.claon.data.model.CountDto
import com.dica.claon.domain.model.Count

object CountMapper {

    fun mapData(response:CountDto): Count {
        return Count(
            count = response.count,
            isIncrement = response.isIncrement
        )
    }
}