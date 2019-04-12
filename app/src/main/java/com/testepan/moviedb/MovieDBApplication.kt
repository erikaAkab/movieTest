package com.testepan.moviedb

import android.app.Application
import com.testepan.moviedb.di.PresenterModule.presenterModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MovieDBApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MovieDBApplication)
            modules(presenterModule)
        }
    }
}