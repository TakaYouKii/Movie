package com.example.move57.view

interface MovieDetailView {

    fun showMovieDetail(
        title: String,
        year: String,
        genre: String,
        poster: String,
        awards: String,
    )
}