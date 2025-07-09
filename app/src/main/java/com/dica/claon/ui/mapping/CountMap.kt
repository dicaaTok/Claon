package com.dica.claon.ui.mapping

import com.example.m5lesson1.data.model.CountDto
import com.example.m5lesson1.domain.model.Count

    fun CountDto.toDomain(): Count {
        return Count(
            count = count,
            isIncrement = isIncrement,
        )
    }
