package com.example.moviecatalogue.ui.home.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.moviecatalogue.data.Movie
import com.example.moviecatalogue.data.source.FilmRepository
import com.example.moviecatalogue.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest  {
    private lateinit var viewModel: MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var observer: Observer<List<Movie>>

    @Before
    fun setup(){
        viewModel = MovieViewModel(filmRepository)
    }

    @Test
    fun getMovie(){
        val dummyMovie = DataDummy.generateDummyMovie()
        val movies = MutableLiveData<List<Movie>>()
        movies.value = dummyMovie

        `when`(filmRepository.getAllMovie()).thenReturn(movies)
        val movie = viewModel.getMovie().value
        verify(filmRepository).getAllMovie()
        assertNotNull(movie)
        assertEquals(10, movie?.size)

        viewModel.getMovie().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }
}