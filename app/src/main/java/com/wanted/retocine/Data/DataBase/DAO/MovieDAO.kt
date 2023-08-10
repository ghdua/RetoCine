package com.wanted.retocine.Data.DataBase.DAO

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.wanted.retocine.Data.DataBase.Entities.MovieEntity
@Dao
interface MovieDAO {
    @Query("SELECT * FROM Movie_Table")
    fun getAllMovies(): List<MovieEntity>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllMovies(movies:List<MovieEntity>)
}