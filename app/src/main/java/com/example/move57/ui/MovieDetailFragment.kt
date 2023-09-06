package com.example.move57.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.move57.R
import com.example.move57.databinding.FragmentMovieDetailBinding


class MovieDetailFragment : Fragment() {

    lateinit var binding: FragmentMovieDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMovieDetailBinding.inflate(layoutInflater)
        return binding.root
    }


}