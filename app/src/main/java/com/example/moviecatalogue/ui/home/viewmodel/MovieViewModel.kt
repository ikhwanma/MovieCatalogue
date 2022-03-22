package com.example.moviecatalogue.ui.home.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.moviecatalogue.data.Movie
import com.example.moviecatalogue.data.source.FilmRepository

class MovieViewModel(private val filmRepository: FilmRepository): ViewModel() {

    fun getMovie(): LiveData<List<Movie>> = filmRepository.getAllMovie()

}