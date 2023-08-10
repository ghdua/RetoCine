package com.wanted.retocine.Data.Model

import com.google.gson.annotations.SerializedName

data class MovieModel(
    @SerializedName("Name") var MovieModelName: String,
    @SerializedName("ReleaseDate") var MovieModelReleaseDate: String,
    @SerializedName("VoteAverage") var MovieModelVoteAverage: String,
    @SerializedName("Synopsis") var MovieModelSynopsis: String,
    @SerializedName("Country") var MovieModelCountry: String,
    @SerializedName("Director") var MovieModelDirector: String,
    @SerializedName("Photo") var MovieModelPhoto: String
)
