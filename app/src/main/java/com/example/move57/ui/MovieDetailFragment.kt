package com.example.move57.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import coil.load
import com.example.move57.databinding.FragmentMovieDetailBinding
import com.example.move57.model.MovieModel
import com.example.move57.model.RatingModel
import com.example.move57.presenter.MovieDetailPresenter
import com.example.move57.view.MovieDetailView


class MovieDetailFragment : Fragment(), MovieDetailView {

    lateinit var binding: FragmentMovieDetailBinding

    lateinit var movieModel: MovieModel

    lateinit var presenter:MovieDetailPresenter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMovieDetailBinding.inflate(layoutInflater)
        presenter = MovieDetailPresenter(this)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getMovie()
    }

    fun getMovie(){
        movieModel = this.arguments?.getSerializable("key") as MovieModel
        presenter.getMovieData(movieModel)
    }

    override fun showMovieDetail(
        title: String,
        year: String,
        genre: String,
        poster: String,
        awards: String,
        ratingModel: ArrayList<RatingModel>
    ) {
        binding.tvTitle.text = title
        binding.tvYear.text = year
        binding.tvGenre.text = genre
        binding.tvAwards.text = awards
        binding.imgPoster.load(poster)
        binding.tvRatingValue1.text = ratingModel[0].Value
        binding.tvRatingSource1.text = ratingModel[0].Source
        binding.tvRatingValue2.text = ratingModel[1].Value
        binding.tvRatingSource2.text = ratingModel[1].Source
        binding.tvRatingValue3.text = ratingModel[2].Value
        binding.tvRatingSource3.text = ratingModel[2].Source

    }



}