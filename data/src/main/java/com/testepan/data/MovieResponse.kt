package com.testepan.data

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("id") val id : Int,
    @SerializedName("title") val title : String,
    @SerializedName("overview") val description : String
)