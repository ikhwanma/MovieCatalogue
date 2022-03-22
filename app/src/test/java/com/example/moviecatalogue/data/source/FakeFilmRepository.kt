package com.example.moviecatalogue.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.moviecatalogue.data.Movie
import com.example.moviecatalogue.data.TvShows
import com.example.moviecatalogue.data.source.remote.RemoteDataSource
import com.example.moviecatalogue.data.source.remote.response.MovieResponse
import com.example.moviecatalogue.data.source.remote.response.TvShowsResponse

class FakeFilmRepository (private val remoteDataSource: RemoteDataSource) : FilmDataSource{

    override fun getAllMovie(): LiveData<List<Movie>> {
        val movieResult = MutableLiveData<List<Movie>>()
        remoteDataSource.getAllMovie(object : RemoteDataSource.LoadMovieCallback{
            override fun onAllMovieReceived(movieResponses: List<MovieResponse>) {
                val movieList = ArrayList<Movie>()
                for (response in movieResponses){
                    val movie = Movie(
                        response.title,
                        response.image,
                        response.date,
                        response.description,
                        response.pemain,
                        response.genre,
                        response.url
                    )
                    movieList.add(movie)
                }
                movieResult.postValue(movieList)
            }

        })

        return movieResult
    }

    override fun getAllTvShows(): LiveData<List<TvShows>> {
        val tvShowsResult = MutableLiveData<List<TvShows>>()
        remoteDataSource.getAllTvShows(object : RemoteDataSource.LoadTvShowsCallback{
            override fun onAllTvShowsReceived(tvShowsResponses: List<TvShowsResponse>) {
                val tvShowsList = ArrayList<TvShows>()
                for (response in tvShowsResponses){
                    val tvShows = TvShows(
                        response.title,
                        response.image,
                        response.date,
                        response.description,
                        response.pemain,
                        response.genre,
                        response.url
                    )
                    tvShowsList.add(tvShows)
                }
                tvShowsResult.postValue(tvShowsList)
            }
        })
        return tvShowsResult
    }

    override fun getDetailMovie(title:String): LiveData<Movie> {
        val movieResult = MutableLiveData<Movie>()
        remoteDataSource.getAllMovie(object : RemoteDataSource.LoadMovieCallback{
            override fun onAllMovieReceived(movieResponses: List<MovieResponse>) {
                lateinit var movie:Movie
                for (response in movieResponses){
                    if (response.title == title){
                        movie = Movie(
                            response.title,
                            response.image,
                            response.date,
                            response.description,
                            response.pemain,
                            response.genre,
                            response.url
                        )
                    }
                }
                movieResult.postValue(movie)
            }
        })
        return movieResult
    }

    override fun getDetailTvShows(title:String): LiveData<TvShows> {
        val tvShowsResult = MutableLiveData<TvShows>()
        remoteDataSource.getAllTvShows(object : RemoteDataSource.LoadTvShowsCallback{
            override fun onAllTvShowsReceived(tvShowsResponses: List<TvShowsResponse>) {
                lateinit var tvShows: TvShows
                for (response in tvShowsResponses){
                    if (response.title == title){
                        tvShows = TvShows(
                            response.title,
                            response.image,
                            response.date,
                            response.description,
                            response.pemain,
                            response.genre,
                            response.url
                        )
                    }
                }
                tvShowsResult.postValue(tvShows)
            }
        })
        return tvShowsResult
    }

}