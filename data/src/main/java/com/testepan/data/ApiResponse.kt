package com.testepan.data

import com.google.gson.annotations.SerializedName

data class ApiResponse<T>(
    @SerializedName("results") val results: T
)