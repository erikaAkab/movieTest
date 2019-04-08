package com.testepan.data.mapper

import com.testepan.data.MovieResponse
import com.testepan.domain.business.Movie

object MoviesMapper {

    fun mapFrom(response: List<MovieResponse>) =
        response.map {
            Movie(
                id = it.id,
                imagePath = it.imagePath,
                title = it.title,
                description = it.description

            )
        }
}