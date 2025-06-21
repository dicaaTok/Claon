package com.dica.claon.data.mapper

import com.dica.claon.data.model.CountDto
import com.dica.claon.domain.model.Count

fun CountDto.mapData(): Count {
    val a : String = ""
        return Count(
            count = this.count,
            isIncrement = this.isIncrement
        )
    }
