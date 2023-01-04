package com.example.aktor_favorit

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Actors(
    var name: String = "",
    var nationality: String = "",
    var movies: String = "",
    var detail: String = "",
    var photo: Int = 0,
) : Parcelable
