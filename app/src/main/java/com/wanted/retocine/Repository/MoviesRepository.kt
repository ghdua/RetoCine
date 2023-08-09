package com.wanted.retocine.Repository

import com.wanted.retocine.Model.MovieDataProvider
import com.wanted.retocine.Model.MovieModelResponse
import com.wanted.retocine.Network.MovieService

class MoviesRepository {
    private val Api = MovieService()
    suspend fun GetAllMovies(): MovieModelResponse
    {
        val _Response = Api.GetAllMovies()
        MovieDataProvider.GetMoviesData = _Response
        return _Response
    }
}