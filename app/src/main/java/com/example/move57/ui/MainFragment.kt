package com.example.move57.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.move57.R
import com.example.move57.databinding.FragmentMainBinding
import com.example.move57.databinding.FragmentMovieDetailBinding
import com.example.move57.model.MovieModel
import com.example.move57.presenter.Presenter
import com.example.move57.view.MovieView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment(), MovieView {

    lateinit var binding: FragmentMainBinding

    @Inject
    lateinit var presenter: Presenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        binding.btnSend.setOnClickListener{
            presenter.getMovieDetail(binding.etTitle.text.toString())

        }
    }


    override fun sendMovie(movieModel: MovieModel) {
        findNavController().navigate(R.id.movieDetailFragment, bundleOf("key" to movieModel))
    }

    override fun showError(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

}