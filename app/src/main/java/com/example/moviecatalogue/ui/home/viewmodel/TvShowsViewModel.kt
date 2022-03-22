package com.example.moviecatalogue.ui.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.moviecatalogue.data.TvShows
import com.example.moviecatalogue.data.source.FilmRepository


class TvShowsViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    fun getTvShows(): LiveData<List<TvShows>> = filmRepository.getAllTvShows()

}