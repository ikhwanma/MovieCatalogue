package com.example.moviecatalogue.data

data class TvShows(
    var title: String? = null,
    var image: String? = null,
    var date: String? = null,
    var description: String? = null,
    var pemain: String? = null,
    var genre: String? = null,
    var url: String? = null,
    var isFavorite: Boolean = false
)
