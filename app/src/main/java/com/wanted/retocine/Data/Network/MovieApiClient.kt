package com.wanted.retocine.Data.Network

import com.wanted.retocine.Data.Model.MovieModelResponse
import retrofit2.Response
import retrofit2.http.GET

interface MovieApiClient {
    @GET("GetAllMovies")
    suspend fun GetAllMovies(): Response<MovieModelResponse>
}