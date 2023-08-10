package com.wanted.retocine.Domain

import com.wanted.retocine.Data.Model.MovieModelResponse
import com.wanted.retocine.Data.Repository.MoviesRepository

class GetMoviesDataUseCase {
    private val Repository = MoviesRepository()
    suspend operator fun invoke(): MovieModelResponse = Repository.GetAllMovies()
}