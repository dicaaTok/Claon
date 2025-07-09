package com.dica.claon.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dica.claon.domain.model.Characters
import com.dica.claon.domain.usecase.GetCharactersUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CharacterViewmodel(
    private val getCharactersUseCase: GetCharactersUseCase

): ViewModel() {
    private val _characters = MutableStateFlow<List<Characters>>(emptyList())
    val characters: StateFlow<List<Characters>> = _characters

    fun loadCharacters() {
        viewModelScope.launch {
            getCharactersUseCase.getCharacters().collect { list ->
                _characters.value
            }
        }
    }
}