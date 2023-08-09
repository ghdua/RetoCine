package com.wanted.retocine.Network

import com.wanted.retocine.Model.MovieModelResponse
import retrofit2.Response
import retrofit2.http.GET

interface MovieApiClient {
    @GET("GetAllMovies")
    suspend fun GetAllMovies(): Response<MovieModelResponse>
}