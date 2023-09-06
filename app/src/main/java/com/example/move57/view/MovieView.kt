package com.example.move57.view

import com.example.move57.model.MovieModel

interface MovieView {

    fun sendMovie(movieModel: MovieModel)

    fun showError(message: String)

}