package com.example.moviecatalogue.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.moviecatalogue.data.source.remote.RemoteDataSource
import com.example.moviecatalogue.utils.DataDummy
import com.example.moviecatalogue.utils.LiveDataTestUtil
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.doAnswer
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.mock

class FilmRepositoryTest{
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val filmRepository = FakeFilmRepository(remote)

    private val movieResponses = DataDummy.generateRemoteDummyMovie()
    private val movieTitle = movieResponses[0]
    private val tvShowsResponses = DataDummy.generateRemoteDummyTv()
    private val tvShowsTitle = tvShowsResponses[0]

    @Test
    fun getAllMovie() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMovieCallback)
                .onAllMovieReceived(movieResponses)
            null
        }.`when`(remote).getAllMovie(any())
        val movieEntities = LiveDataTestUtil.getValue(filmRepository.getAllMovie())
        verify(remote).getAllMovie(any())
        assertNotNull(movieEntities)
        assertEquals(movieResponses.size.toLong(), movieEntities.size.toLong())
    }

    @Test
    fun getAllTv() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowsCallback)
                .onAllTvShowsReceived(tvShowsResponses)
            null
        }.`when`(remote).getAllTvShows(any())
        val tvShowsEntities = LiveDataTestUtil.getValue(filmRepository.getAllTvShows())
        verify(remote).getAllTvShows(any())
        assertNotNull(tvShowsEntities)
        assertEquals(tvShowsResponses.size.toLong(), tvShowsEntities.size.toLong())
    }

    @Test
    fun getDetailMovie(){
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMovieCallback)
                .onAllMovieReceived(movieResponses)
            null
        }.`when`(remote).getAllMovie(any())
        val movieEntities = LiveDataTestUtil.getValue(filmRepository.getDetailMovie(movieTitle.title.toString()))
        verify(remote).getAllMovie(any())
        assertNotNull(movieEntities)
        assertEquals(movieTitle.title, movieEntities.title)
        assertEquals(movieTitle.date, movieEntities.date)
        assertEquals(movieTitle.description, movieEntities.description)
        assertEquals(movieTitle.genre, movieEntities.genre)
        assertEquals(movieTitle.image, movieEntities.image)
        assertEquals(movieTitle.pemain, movieEntities.pemain)
        assertEquals(movieTitle.url, movieEntities.url)
    }

    @Test
    fun getDetailTvShows(){
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowsCallback)
                .onAllTvShowsReceived(tvShowsResponses)
            null
        }.`when`(remote).getAllTvShows(any())
        val tvShowsEntities = LiveDataTestUtil.getValue(filmRepository.getDetailTvShows(tvShowsTitle.title.toString()))
        verify(remote).getAllTvShows(any())
        assertNotNull(tvShowsEntities)
        assertEquals(tvShowsTitle.title, tvShowsEntities.title)
        assertEquals(tvShowsTitle.date, tvShowsEntities.date)
        assertEquals(tvShowsTitle.description, tvShowsEntities.description)
        assertEquals(tvShowsTitle.genre, tvShowsEntities.genre)
        assertEquals(tvShowsTitle.image, tvShowsEntities.image)
        assertEquals(tvShowsTitle.pemain, tvShowsEntities.pemain)
        assertEquals(tvShowsTitle.url, tvShowsEntities.url)
    }
}