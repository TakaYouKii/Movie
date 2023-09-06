package com.example.move57.view

import com.example.move57.model.MovieModel

interface MovieView {
    fun showMovie(movieModel: MovieModel)
    fun sendMovie(movieModel: MovieModel)

    fun showError(message: String)

}