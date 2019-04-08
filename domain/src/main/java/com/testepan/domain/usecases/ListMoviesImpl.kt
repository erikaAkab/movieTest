package com.testepan.domain.usecases

import com.testepan.domain.business.Movie
import com.testepan.domain.repository.MoviesRepository
import io.reactivex.Observable
import kotlin.system.measureTimeMillis

class ListMoviesImpl(val repository: MoviesRepository) : ListMovies {
    override fun execute(): Observable<List<Movie>> {
        return repository.listPopularMovies()
    }
}