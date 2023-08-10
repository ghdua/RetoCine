package com.wanted.retocine.Data.Model

class MovieDataProvider {
    companion object{
        lateinit var GetMoviesData: MovieModelResponse
        var MoviesListResult = mutableListOf<MovieModelResponse>()
    }
}