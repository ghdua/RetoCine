package com.wanted.retocine.Data.DataBase.Entities;

import java.lang.System;

@androidx.room.Entity(tableName = "Movie_Table")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001J\t\u0010.\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014\u00a8\u0006/"}, d2 = {"Lcom/wanted/retocine/Data/DataBase/Entities/MovieEntity;", "", "MovieID", "", "MovieModelName", "", "MovieModelReleaseDate", "MovieModelVoteAverage", "MovieModelSynopsis", "MovieModelCountry", "MovieModelDirector", "MovieModelPhoto", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMovieID", "()I", "setMovieID", "(I)V", "getMovieModelCountry", "()Ljava/lang/String;", "setMovieModelCountry", "(Ljava/lang/String;)V", "getMovieModelDirector", "setMovieModelDirector", "getMovieModelName", "setMovieModelName", "getMovieModelPhoto", "setMovieModelPhoto", "getMovieModelReleaseDate", "setMovieModelReleaseDate", "getMovieModelSynopsis", "setMovieModelSynopsis", "getMovieModelVoteAverage", "setMovieModelVoteAverage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class MovieEntity {
    @androidx.room.ColumnInfo(name = "MovieID")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int MovieID;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "MovieModelName")
    private java.lang.String MovieModelName;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "MovieModelReleaseDate")
    private java.lang.String MovieModelReleaseDate;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "MovieModelVoteAverage")
    private java.lang.String MovieModelVoteAverage;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "MovieModelSynopsis")
    private java.lang.String MovieModelSynopsis;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "MovieModelCountry")
    private java.lang.String MovieModelCountry;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "MovieModelDirector")
    private java.lang.String MovieModelDirector;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "MovieModelPhoto")
    private java.lang.String MovieModelPhoto;
    
    @org.jetbrains.annotations.NotNull
    public final com.wanted.retocine.Data.DataBase.Entities.MovieEntity copy(int MovieID, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelName, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelReleaseDate, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelVoteAverage, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelSynopsis, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelCountry, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelDirector, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelPhoto) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public MovieEntity(int MovieID, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelName, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelReleaseDate, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelVoteAverage, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelSynopsis, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelCountry, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelDirector, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelPhoto) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getMovieID() {
        return 0;
    }
    
    public final void setMovieID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMovieModelName() {
        return null;
    }
    
    public final void setMovieModelName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMovieModelReleaseDate() {
        return null;
    }
    
    public final void setMovieModelReleaseDate(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMovieModelVoteAverage() {
        return null;
    }
    
    public final void setMovieModelVoteAverage(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMovieModelSynopsis() {
        return null;
    }
    
    public final void setMovieModelSynopsis(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMovieModelCountry() {
        return null;
    }
    
    public final void setMovieModelCountry(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMovieModelDirector() {
        return null;
    }
    
    public final void setMovieModelDirector(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMovieModelPhoto() {
        return null;
    }
    
    public final void setMovieModelPhoto(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}