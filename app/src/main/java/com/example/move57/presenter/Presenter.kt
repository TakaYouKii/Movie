package com.example.move57.presenter

import android.util.Log
import com.example.move57.model.MovieApi
import com.example.move57.model.MovieModel
import com.example.move57.view.MovieView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Presenter @Inject constructor(private val movieApi: MovieApi) {

    lateinit var movieView: MovieView

    fun getMovieDetail(name: String){
        movieApi.getMovie(name).enqueue(object : Callback<MovieModel>{
            override fun onResponse(call: Call<MovieModel>, response: Response<MovieModel>) {
                Log.e("ololo", "onResponse: ${response.body()}")
                response.body()?.let {
                    movieView.sendMovie(it)
                }

            }

            override fun onFailure(call: Call<MovieModel>, t: Throwable) {
                movieView.showError(t.message.toString())
            }

        })
    }

    fun attachView(movieView: MovieView){
        this.movieView = movieView
    }
}