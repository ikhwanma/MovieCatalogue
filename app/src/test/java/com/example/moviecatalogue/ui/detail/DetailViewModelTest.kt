package com.example.moviecatalogue.ui.detail


import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.example.moviecatalogue.data.Movie
import com.example.moviecatalogue.data.TvShows
import com.example.moviecatalogue.data.source.FilmRepository
import com.example.moviecatalogue.utils.DataDummy
import com.nhaarman.mockitokotlin2.verify
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class DetailViewModelTest{
    private lateinit var viewModel: DetailViewModel
    private val dummyFilm = DataDummy.generateDummyMovie()[0]
    private val title = dummyFilm.title.toString()
    private val dummyTv = DataDummy.generateDummyTv()[0]
    private val titleTv = dummyTv.title.toString()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp(){
        viewModel = DetailViewModel(filmRepository)
    }

    @Test
    fun getMovie(){
        viewModel.setDetail(title)
        val movie = MutableLiveData<Movie>()
        movie.value = dummyFilm
        `when`(filmRepository.getDetailMovie(title)).thenReturn(movie)
        val detail = viewModel.getDetailMovie().value as Movie
        verify(filmRepository).getDetailMovie(title)
        assertNotNull(detail)
        assertEquals(detail.date, dummyFilm.date)
        assertEquals(detail.description, dummyFilm.description)
        assertEquals(detail.genre, dummyFilm.genre)
        assertEquals(detail.image, dummyFilm.image)
        assertEquals(detail.pemain, dummyFilm.pemain)
        assertEquals(detail.title, dummyFilm.title)
        assertEquals(detail.url, dummyFilm.url)
    }

    @Test
    fun getTvShows(){
        viewModel.setDetail(titleTv)
        val movie = MutableLiveData<TvShows>()
        movie.value = dummyTv
        `when`(filmRepository.getDetailTvShows(titleTv)).thenReturn(movie)
        val detail = viewModel.getDetailTvShows().value as TvShows
        verify(filmRepository).getDetailTvShows(titleTv)
        assertNotNull(detail)
        assertEquals(detail.date, dummyTv.date)
        assertEquals(detail.description, dummyTv.description)
        assertEquals(detail.genre, dummyTv.genre)
        assertEquals(detail.image, dummyTv.image)
        assertEquals(detail.pemain, dummyTv.pemain)
        assertEquals(detail.title, dummyTv.title)
        assertEquals(detail.url, dummyTv.url)
    }
}