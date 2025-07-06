package com.dica.claon.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dica.claon.domain.model.Characters
import com.dica.claon.domain.usecase.DecrementUseCase
import com.dica.claon.domain.usecase.GetCountUseCase
import com.dica.claon.domain.usecase.IncrementUseCase
import com.dica.claon.presentation.mapper.toUi
import com.dica.claon.presentation.model.UiCount
import kotlinx.coroutines.flow.Flow

@Suppress("UNCHECKED_CAST")
class MainViewModel(
    private val getCountUseCase: GetCountUseCase,
    private val incrementUseCase: IncrementUseCase,
    private val decrementUseCase: DecrementUseCase,
): ViewModel() {

    private val _uiCountData = MutableLiveData<UiCount>()
    val uiCountData: LiveData<UiCount> = _uiCountData
    private val _characters = MutableLiveData<List<Characters>>()
    val characters: Flow<List<Characters>> = _characters as Flow<List<Characters>>



    fun increment(){
        incrementUseCase.increment()
        updateCount()
    }

    fun decrement(){
        decrementUseCase.decrement()
        updateCount()
    }

    fun updateCount(){
        val response = getCountUseCase.getCount()
        _uiCountData.value = response.toUi()

    }

}