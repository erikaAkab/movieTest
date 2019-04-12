package com.testepan.moviedb

class MainPresenter(val view: MainContract.View) : MainContract.Presenter {


    override fun getMovieList() {
        view.showMovieList("Funcionou a injeção")
    }
}