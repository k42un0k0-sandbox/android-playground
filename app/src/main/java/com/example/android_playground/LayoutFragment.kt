package com.example.android_playground

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class LayoutFragment : Fragment() {

    companion object {
        fun newInstance() = LayoutFragment()
    }

    private lateinit var viewModel: LayoutViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProvider(this).get(LayoutViewModel::class.java)

        return inflater.inflate(R.layout.layout_fragment, container, false)
    }

}