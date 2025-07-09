package com.dica.claon.presentation.mapper

import com.dica.claon.domain.model.Count
import com.dica.claon.presentation.model.UiCount


fun Count.toUi(): UiCount {
    return UiCount(
        count = this.count,
        operationType = if (this.isIncrement) "Плюс" else "Минус"
    )
}