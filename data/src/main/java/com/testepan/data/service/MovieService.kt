package com.testepan.data.service

import com.testepan.data.ApiResponse
import com.testepan.data.BuildConfig
import com.testepan.data.MovieResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface MovieService {

    @GET("discover/movie?sort_by=popularity.desc&api_key=${BuildConfig.API_KEY}")
    fun getPopularMovies(): Observable<ApiResponse<List<MovieResponse>>>
}