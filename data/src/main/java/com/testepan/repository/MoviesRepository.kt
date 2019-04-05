package com.testepan.repository

import com.testepan.ApiResponse
import com.testepan.MovieResponse

interface MoviesRepository {

    fun listPopularMovies(): ApiResponse<List<MovieResponse>>
}