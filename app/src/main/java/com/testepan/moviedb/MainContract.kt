package com.testepan.moviedb

object MainContract {
    interface View {
        fun showMovieList(list: String)
    }

    interface Presenter {
        fun getMovieList()
    }
}