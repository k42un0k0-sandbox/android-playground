package com.example.android_playground

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android_playground.databinding.GalleryFragmentBinding

class GalleryFragment : Fragment() {

    companion object {
        fun newInstance() = GalleryFragment()
    }

    private lateinit var viewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = GalleryFragmentBinding.inflate(inflater,container,false)
        binding.vm = GalleryViewModel()
        val map = mutableMapOf("hello" to "hogehoge")
        binding.unko =  map
        viewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)

        return binding.root
    }

}