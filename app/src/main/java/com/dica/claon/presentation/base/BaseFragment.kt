package com.dica.claon.presentation.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.dica.claon.presentation.model.UiState
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

abstract class BaseFragment : Fragment() {

    protected fun <T> collectUiState(
        stateFlow: StateFlow<UiState<T>>,
        onLoading: () -> Unit = {},
        onSuccess: (T) -> Unit,
        onError: (String) -> Unit = {}
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                stateFlow.collect { state ->
                    when (state) {
                        is UiState.Loading -> onLoading()
                        is UiState.Success -> onSuccess(state.data)
                        is UiState.Error -> onError(state.message)
                        else -> { // Idle — ничего не делаем
                         }
                    }
                }
            }
        }
    }
}