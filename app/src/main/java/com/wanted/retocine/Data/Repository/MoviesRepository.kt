package com.wanted.retocine.Data.Repository

import com.wanted.retocine.Data.DataBase.DAO.MovieDAO
import com.wanted.retocine.Data.Model.MovieDataProvider
import com.wanted.retocine.Data.Model.MovieModel
import com.wanted.retocine.Data.Model.MovieModelResponse
import com.wanted.retocine.Data.Network.MovieService

class MoviesRepository {
    private val Api = MovieService()
    suspend fun GetAllMovies(): MovieModelResponse {
        val _Response = Api.GetAllMovies()
        MovieDataProvider.GetMoviesData = _Response
        return _Response
    }
}