package ru.example.bottomnavigationtest.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.example.bottomnavigationtest.R
import ru.example.bottomnavigationtest.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding: FragmentHomeBinding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
    }

    private fun bind() {
        binding.toAnotherFragment.setOnClickListener { findNavController().navigate(R.id.action_homeFragment2_to_anotherFragment) }
    }
}