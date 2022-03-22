package com.example.moviecatalogue.utils

import android.content.Context
import com.example.moviecatalogue.data.source.remote.response.MovieResponse
import com.example.moviecatalogue.data.source.remote.response.TvShowsResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper (private val context: Context){
    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovie(): List<MovieResponse> {
        val list = ArrayList<MovieResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("Movie.json").toString())
            val listArray = responseObject.getJSONArray("movie")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val title = movie.getString("title")
                val image = movie.getString("image")
                val date = movie.getString("date")
                val description = movie.getString("description")
                val pemain = movie.getString("pemain")
                val genre = movie.getString("genre")
                val url = movie.getString("url")

                val movieResponse = MovieResponse(title, image, date, description, pemain, genre, url)
                list.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }

    fun loadTvShows(): List<TvShowsResponse>{
        val list = ArrayList<TvShowsResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("TvShows.json").toString())
            val listArray = responseObject.getJSONArray("tv_shows")
            for (i in 0 until listArray.length()) {
                val tvShows = listArray.getJSONObject(i)

                val title = tvShows.getString("title")
                val image = tvShows.getString("image")
                val date = tvShows.getString("date")
                val description = tvShows.getString("description")
                val pemain = tvShows.getString("pemain")
                val genre = tvShows.getString("genre")
                val url = tvShows.getString("url")

                val tvShowsResponse = TvShowsResponse(title, image, date, description, pemain, genre, url)
                list.add(tvShowsResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }
}