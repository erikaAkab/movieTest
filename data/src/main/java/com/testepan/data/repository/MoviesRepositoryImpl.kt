package com.testepan.data.repository

import com.testepan.data.mapper.MoviesMapper
import com.testepan.domain.business.Movie
import com.testepan.domain.repository.MoviesRepository
import com.testepan.data.service.MovieService
import io.reactivex.Observable

class MoviesRepositoryImpl(val movieService: MovieService): MoviesRepository {
    override fun listPopularMovies(): Observable<List<Movie>> {
        return movieService.getPopularMovies("").map{
            MoviesMapper.mapFrom(it.results)
        }
    }
}