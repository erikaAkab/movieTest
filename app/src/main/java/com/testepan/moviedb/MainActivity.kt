package com.testepan.moviedb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.testepan.domain.business.Movie
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity(), MainContract.View {

    private val presenter by inject<MainContract.Presenter> { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvMovieList?.let {
            it.adapter = MovieAdapter()
            it.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        }

        presenter.getMovieList()
    }

    override fun showMovieList(list: List<Movie>) {
        (rvMovieList.adapter as MovieAdapter).populateListMovies(list)
    }

    override fun showMovieListError() {
        toast(getString(R.string.movie_error))
    }
}