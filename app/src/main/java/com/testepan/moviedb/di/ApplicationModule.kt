package com.testepan.moviedb.di

import com.testepan.moviedb.BuildConfig
import com.testepan.data.service.MovieService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ApplicationModule {

    val appModule = module {

        single<Retrofit> {
            Retrofit.Builder()
                .baseUrl(BuildConfig.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(buildHttpClient())
                .build()
        }

        single<MovieService> {
            val retrofit: Retrofit = get()
            retrofit.create(MovieService::class.java)
        }
    }

    private fun buildHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addNetworkInterceptor(HttpLoggingInterceptor().apply {
                if (BuildConfig.DEBUG) level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
    }
}
