package com.wanted.retocine.Data.Model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006)"}, d2 = {"Lcom/wanted/retocine/Data/Model/MovieModel;", "", "MovieModelName", "", "MovieModelReleaseDate", "MovieModelVoteAverage", "MovieModelSynopsis", "MovieModelCountry", "MovieModelDirector", "MovieModelPhoto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMovieModelCountry", "()Ljava/lang/String;", "setMovieModelCountry", "(Ljava/lang/String;)V", "getMovieModelDirector", "setMovieModelDirector", "getMovieModelName", "setMovieModelName", "getMovieModelPhoto", "setMovieModelPhoto", "getMovieModelReleaseDate", "setMovieModelReleaseDate", "getMovieModelSynopsis", "setMovieModelSynopsis", "getMovieModelVoteAverage", "setMovieModelVoteAverage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class MovieModel {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Name")
    private java.lang.String MovieModelName;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "ReleaseDate")
    private java.lang.String MovieModelReleaseDate;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "VoteAverage")
    private java.lang.String MovieModelVoteAverage;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Synopsis")
    private java.lang.String MovieModelSynopsis;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Country")
    private java.lang.String MovieModelCountry;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Director")
    private java.lang.String MovieModelDirector;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Photo")
    private java.lang.String MovieModelPhoto;
    
    @org.jetbrains.annotations.NotNull
    public final com.wanted.retocine.Data.Model.MovieModel copy(@org.jetbrains.annotations.NotNull
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
    
    public MovieModel(@org.jetbrains.annotations.NotNull
    java.lang.String MovieModelName, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelReleaseDate, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelVoteAverage, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelSynopsis, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelCountry, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelDirector, @org.jetbrains.annotations.NotNull
    java.lang.String MovieModelPhoto) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
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
    public final java.lang.String component2() {
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
    public final java.lang.String component3() {
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
    public final java.lang.String component4() {
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
    public final java.lang.String component5() {
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
    public final java.lang.String component6() {
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
    public final java.lang.String component7() {
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