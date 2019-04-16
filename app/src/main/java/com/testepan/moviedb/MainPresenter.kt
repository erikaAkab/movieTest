package com.testepan.moviedb

import com.testepan.domain.usecases.ListMovies
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.HttpException

class MainPresenter(val view: MainContract.View,
                    val list: ListMovies) : MainContract.Presenter {

    override fun getMovieList() {
       val a = list.execute()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                view.showMovieList(it)
            },{
                if (it is HttpException) {
                    view.showMovieListError()
                }
            })
    }
}