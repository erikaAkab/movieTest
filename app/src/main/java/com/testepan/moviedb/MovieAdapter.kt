package com.testepan.moviedb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.testepan.domain.business.Movie
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieVH>() {

    var listMovies : List<Movie> = listOf()

    fun populateListMovies(list: List<Movie>){
        listMovies = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return MovieVH(view)
    }

    override fun getItemCount(): Int {
        return listMovies.size
    }

    override fun onBindViewHolder(holder: MovieVH, position: Int) {
        holder.bind(listMovies[position])
    }

    class MovieVH(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Movie) {
            itemView.movieTitle.text = item.title
            itemView.movieDescription.text = item.description
        }
    }
}