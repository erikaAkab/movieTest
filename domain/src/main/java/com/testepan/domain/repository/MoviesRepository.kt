package com.testepan.domain.repository

import com.testepan.domain.business.Movie
import io.reactivex.Observable

interface MoviesRepository {
    fun listPopularMovies(): Observable<List<Movie>>
}