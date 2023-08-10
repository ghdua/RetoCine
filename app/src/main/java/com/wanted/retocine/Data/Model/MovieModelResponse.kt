package com.wanted.retocine.Data.Model

import com.google.gson.annotations.SerializedName

data class MovieModelResponse(
    @SerializedName("Movies") var MoviesList: List<MovieModel>
)
