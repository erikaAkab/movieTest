package com.testepan.moviedb.di

import com.testepan.moviedb.MainContract
import com.testepan.moviedb.MainPresenter
import org.koin.dsl.module

object PresenterModule {
    val presenterModule = module {
        factory <MainContract.Presenter>{ (view: MainContract.View) -> MainPresenter(
            view = view,
            list = get()
        ) }
    }
}