package com.dica.claon.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.dica.claon.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter = CharactersAdapter()


    //    private val viewModel: MainViewModel by viewModels()
    private val viewModel2: CharacterViewmodel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            binding.rvLotti.adapter = adapter

            lifecycleScope.launchWhenStarted {
                viewModel2.characters.collect { list ->
                    adapter.submitList(list)
                }
            }

            viewModel2.loadCharacters()
        }


    }
}