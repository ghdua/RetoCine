package com.wanted.retocine.Domain

import com.wanted.retocine.Model.MovieModelResponse
import com.wanted.retocine.Repository.MoviesRepository

class GetMoviesDataUseCase {
    private val Repository = MoviesRepository()
    suspend operator fun invoke(): MovieModelResponse = Repository.GetAllMovies()
}