package com.example.move57.model

import java.io.Serializable

data class MovieModel(
    var title: String,
    var year: String,
    var genre: String,
    var awards: String,
    var poster: String,
    var ratings: ArrayList<RatingModel>
):Serializable

data class RatingModel (
    var value: String,
    var source: String,
)
