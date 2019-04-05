package com.testepan.repository

import com.testepan.ApiResponse
import com.testepan.MovieResponse
import com.testepan.service.MovieService

class MoviesRepositoryImpl(val movieService: MovieService): MoviesRepository {
    override fun listPopularMovies(): ApiResponse<List<MovieResponse>> {
        return movieService.getPopularMovies("")
    }
}