package com.dica.claon.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CharacterViewModel(
    private val useCase: CharacterUseCase
) : ViewModel() {

    private val _characters = MutableStateFlow<UiState<List<Character>>>(UiState.Idle)
    val characters: StateFlow<UiState<List<Character>>> = _characters

    private val _character = MutableStateFlow<UiState<Character>>(UiState.Idle)
    val character: StateFlow<UiState<Character>> = _character

    fun fetchCharacters() {
        if (_characters.value == UiState.Loading) return // избегаем повторений

        _characters.value = UiState.Loading
        viewModelScope.launch {
            useCase.getAllCharacters().collect { result ->
                _characters.value = result.fold(
                    { UiState.Error(it.message ?: "Unknown Error") },
                    { UiState.Success(it) }
                )
            }
        }
    }

    fun fetchCharacterById(id: Int) {
        if (_character.value == UiState.Loading) return

        _character.value = UiState.Loading
        viewModelScope.launch {
            useCase.getCharacterById(id).collect { result ->
                _character.value = result.fold(
                    { UiState.Error(it.message ?: "Unknown Error") },
                    { UiState.Success(it) }
                )
            }
        }
    }
}