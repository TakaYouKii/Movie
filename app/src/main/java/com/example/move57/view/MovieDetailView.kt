package com.example.move57.view

import com.example.move57.model.RatingModel

interface MovieDetailView {

    fun showMovieDetail(
        title: String,
        year: String,
        genre: String,
        poster: String,
        awards: String,
        ratingModel: ArrayList<RatingModel>,
    )
}