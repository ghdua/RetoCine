package com.wanted.retocine.Model

class MovieDataProvider {
    companion object{
        lateinit var GetMoviesData: MovieModelResponse
        var MoviesListResult = mutableListOf<MovieModelResponse>()
    }
}