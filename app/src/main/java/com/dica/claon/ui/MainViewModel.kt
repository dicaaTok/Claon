package com.dica.claon.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dica.claon.domain.usecase.DecrementUseCase
import com.dica.claon.domain.usecase.GetCountUseCase
import com.dica.claon.domain.usecase.IncrementUseCase

class MainViewModel (

    private val getContUseCase: GetCountUseCase,
    private val incrementUseCase: IncrementUseCase,
    private val decrementUseCase: DecrementUseCase,

    ): ViewModel(){

        private val _countData = MutableLiveData<Int>()
    val countData: LiveData<Int> = _countData

    private val _operationTypeData = MutableLiveData<String>()
    val operationTypeData: LiveData<String> = _operationTypeData

    fun increment() {
        incrementUseCase.increment()
        updateCount()
    }

    }