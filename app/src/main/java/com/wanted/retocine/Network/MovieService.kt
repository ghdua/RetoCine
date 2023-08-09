package com.wanted.retocine.Network

import com.wanted.retocine.Core.RetrofitHelper
import com.wanted.retocine.Model.MovieModelResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
class MovieService {
    private val _Retrofit = RetrofitHelper.GetRetrofit()
    suspend fun GetAllMovies(): MovieModelResponse {
        return withContext(Dispatchers.IO)
        {
            val _Response: Response<MovieModelResponse> = _Retrofit.create(MovieApiClient::class.java).GetAllMovies()
            _Response.body()!!
        }
    }
}