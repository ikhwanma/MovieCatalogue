package com.example.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvShowsResponse(
    var title: String? = null,
    var image: String? = null,
    var date: String? = null,
    var description: String? = null,
    var pemain: String? = null,
    var genre: String? = null,
    var url: String? = null,
    var isFavorite: Boolean = false
) : Parcelable
