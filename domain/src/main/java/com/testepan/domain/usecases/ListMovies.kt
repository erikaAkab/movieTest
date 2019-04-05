package com.testepan.domain.usecases

import com.testepan.domain.business.Movie

interface ListMovies : UseCase.WithoutParameter<List<Movie>>