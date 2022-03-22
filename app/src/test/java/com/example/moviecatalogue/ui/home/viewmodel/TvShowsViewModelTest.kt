package com.example.moviecatalogue.ui.home.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.moviecatalogue.data.TvShows
import com.example.moviecatalogue.data.source.FilmRepository
import com.example.moviecatalogue.utils.DataDummy
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class TvShowsViewModelTest {
    private lateinit var viewModel: TvShowsViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var observer: Observer<List<TvShows>>

    @Before
    fun setup(){
        viewModel = TvShowsViewModel(filmRepository)
    }

    @Test
    fun getTvShow(){
        val dummyTv = DataDummy.generateDummyTv()
        val tvShows = MutableLiveData<List<TvShows>>()
        tvShows.value = dummyTv

        Mockito.`when`(filmRepository.getAllTvShows()).thenReturn(tvShows)
        val tvShow = viewModel.getTvShows().value
        Mockito.verify(filmRepository).getAllTvShows()
        Assert.assertNotNull(tvShow)
        Assert.assertEquals(10, tvShow?.size)

        viewModel.getTvShows().observeForever(observer)
        Mockito.verify(observer).onChanged(dummyTv)
    }
}