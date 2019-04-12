package com.testepan.data.di

import com.testepan.data.repository.MoviesRepositoryImpl
import com.testepan.domain.repository.MoviesRepository
import org.koin.dsl.module

object DataModule {

    val dataModule = module {
        single<MoviesRepository> {
            MoviesRepositoryImpl(movieService = get())
        }
    }
}