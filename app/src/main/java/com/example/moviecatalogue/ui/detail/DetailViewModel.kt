package com.example.moviecatalogue.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.moviecatalogue.data.Movie
import com.example.moviecatalogue.data.TvShows
import com.example.moviecatalogue.data.source.FilmRepository

class DetailViewModel(private val filmRepository: FilmRepository): ViewModel() {
    private lateinit var title: String

    fun setDetail(title:String){
        this.title = title
    }
    fun getDetailMovie() : LiveData<Movie> {
        return filmRepository.getDetailMovie(title)
    }
    fun getDetailTvShows(): LiveData<TvShows>{
        return filmRepository.getDetailTvShows(title)
    }
}