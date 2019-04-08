package com.testepan.data.service

import com.testepan.data.ApiResponse
import com.testepan.data.MovieResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("discover/movie?sort_by=popularity.desc&api_key={api_key}")
    fun getPopularMovies(@Query("api_key") key : String) : Observable<ApiResponse<List<MovieResponse>>>
}