package com.example.moviecatalogue.data.source

import androidx.lifecycle.LiveData
import com.example.moviecatalogue.data.Movie
import com.example.moviecatalogue.data.TvShows

interface FilmDataSource {
    fun getAllMovie(): LiveData<List<Movie>>
    fun getAllTvShows(): LiveData<List<TvShows>>
    fun getDetailMovie(title:String): LiveData<Movie>
    fun getDetailTvShows(title:String): LiveData<TvShows>
}