package com.example.move57.presenter

import com.example.move57.model.MovieModel
import com.example.move57.view.MovieDetailView

class MovieDetailPresenter(private val movieDetailView: MovieDetailView){

    fun getMovieData(movieModel: MovieModel)
    {
        movieDetailView.showMovieDetail(
            movieModel.Title,
            movieModel.Year,
            movieModel.Genre,
            movieModel.Poster,
            movieModel.Awards
        )
    }

}