package com.example.moviecatalogue.di

import android.content.Context
import com.example.moviecatalogue.data.source.FilmRepository
import com.example.moviecatalogue.data.source.remote.RemoteDataSource
import com.example.moviecatalogue.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): FilmRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return FilmRepository.getInstance(remoteDataSource)
    }
}