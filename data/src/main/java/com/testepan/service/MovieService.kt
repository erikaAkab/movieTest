package com.testepan.service

import com.testepan.ApiResponse
import com.testepan.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("discover/movie?sort_by=popularity.desc&api_key={api_key}")
    fun getPopularMovies(@Query("api_key") key : String) : ApiResponse<List<MovieResponse>>
}