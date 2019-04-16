package com.testepan.moviedb

import com.testepan.domain.business.Movie

object MainContract {
    interface View {
        fun showMovieList(list: List<Movie>)
        fun showMovieListError()
    }

    interface Presenter {
        fun getMovieList()
    }
}