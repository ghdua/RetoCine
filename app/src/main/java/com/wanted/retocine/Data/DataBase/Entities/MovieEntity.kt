package com.wanted.retocine.Data.DataBase.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "Movie_Table")
data class MovieEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "MovieID") var MovieID: Int = 0,
    @ColumnInfo(name = "MovieModelName") var MovieModelName: String,
    @ColumnInfo(name = "MovieModelReleaseDate") var MovieModelReleaseDate: String,
    @ColumnInfo(name = "MovieModelVoteAverage") var MovieModelVoteAverage: String,
    @ColumnInfo(name = "MovieModelSynopsis") var MovieModelSynopsis: String,
    @ColumnInfo(name = "MovieModelCountry") var MovieModelCountry: String,
    @ColumnInfo(name = "MovieModelDirector") var MovieModelDirector: String,
    @ColumnInfo(name = "MovieModelPhoto") var MovieModelPhoto: String
)