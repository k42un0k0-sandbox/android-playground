package com.example.android_playground

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.android_playground.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {
    private var _binding: HomeFragmentBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomeFragmentBinding.inflate(inflater)
        val navButton = binding.homeNavButton
        navButton.setOnClickListener {view -> this.onClick(view)}

        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        return binding.root
    }

     fun onClick(view: View) {
         val action = HomeFragmentDirections.actionNavHomeToNavGallery()
         view.findNavController().navigate(action)
     }

}