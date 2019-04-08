package com.testepan.domain.di

import com.testepan.domain.usecases.ListMovies
import com.testepan.domain.usecases.ListMoviesImpl
import org.koin.dsl.module

object DomainModule {

    val domainModule = module {

        single<ListMovies> {
            ListMoviesImpl(repository = get())
        }
    }
}