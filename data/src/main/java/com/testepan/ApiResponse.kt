package com.testepan

import com.google.gson.annotations.SerializedName

data class ApiResponse<T>(
    @SerializedName("results") val results: T

)