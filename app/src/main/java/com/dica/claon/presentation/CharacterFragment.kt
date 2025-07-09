package com.dica.claon.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.dica.Ciaon.R
import com.dica.claon.presentation.base.BaseFragment
import com.dica.claon.presentation.model.UiState
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharacterFragment : BaseFragment(R.layout.fragment_characters) {

    private val viewModel: CharacterViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        collectUiState(
            stateFlow = viewModel.characters,
            onLoading = { showLoading(true) },
            onSuccess = { list ->
                showLoading(false)
                displayList(list)
            },
            onError = { error ->
                showLoading(false)
                showErrorMessage(error)
            }
        )

        viewModel.fetchCharacters()
    }

    private fun showLoading(show: Boolean) {
    }

    private fun displayList(list: List<Character>) {
    }

    private fun showErrorMessage(msg: String) {
    }
}