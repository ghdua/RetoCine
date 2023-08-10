package com.wanted.retocine.Data.DataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.wanted.retocine.Data.DataBase.DAO.MovieDAO
import com.wanted.retocine.Data.DataBase.Entities.MovieEntity
@Database(entities = [MovieEntity::class], version = 1)
abstract class MovieDataBase:RoomDatabase() {
    abstract fun movieDAO(): MovieDAO
}