package com.wanted.retocine.UI.View;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u0006\u0010 \u001a\u00020\u001dJ\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lcom/wanted/retocine/UI/View/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "dbs", "Lcom/wanted/retocine/Data/DataBase/MovieDataBase;", "getDbs", "()Lcom/wanted/retocine/Data/DataBase/MovieDataBase;", "setDbs", "(Lcom/wanted/retocine/Data/DataBase/MovieDataBase;)V", "mainActivityBinding", "Lcom/wanted/retocine/databinding/ActivityMainBinding;", "movieEntityList", "", "Lcom/wanted/retocine/Data/DataBase/Entities/MovieEntity;", "getMovieEntityList", "()Ljava/util/List;", "setMovieEntityList", "(Ljava/util/List;)V", "moviesList", "", "Lcom/wanted/retocine/Data/Model/MovieModel;", "moviesViewModel", "Lcom/wanted/retocine/UI/ViewModel/MoviesViewModel;", "getMoviesViewModel", "()Lcom/wanted/retocine/UI/ViewModel/MoviesViewModel;", "moviesViewModel$delegate", "Lkotlin/Lazy;", "CheckInternetConnection", "", "DeleteLoginData", "LoadMoviesList", "ShowNoInternetConnection", "onClick", "p0", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private com.wanted.retocine.databinding.ActivityMainBinding mainActivityBinding;
    private final kotlin.Lazy moviesViewModel$delegate = null;
    public com.wanted.retocine.Data.DataBase.MovieDataBase dbs;
    public java.util.List<com.wanted.retocine.Data.DataBase.Entities.MovieEntity> movieEntityList;
    private java.util.List<com.wanted.retocine.Data.Model.MovieModel> moviesList;
    
    public MainActivity() {
        super();
    }
    
    private final com.wanted.retocine.UI.ViewModel.MoviesViewModel getMoviesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.wanted.retocine.Data.DataBase.MovieDataBase getDbs() {
        return null;
    }
    
    public final void setDbs(@org.jetbrains.annotations.NotNull
    com.wanted.retocine.Data.DataBase.MovieDataBase p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.wanted.retocine.Data.DataBase.Entities.MovieEntity> getMovieEntityList() {
        return null;
    }
    
    public final void setMovieEntityList(@org.jetbrains.annotations.NotNull
    java.util.List<com.wanted.retocine.Data.DataBase.Entities.MovieEntity> p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void LoadMoviesList() {
    }
    
    private final void CheckInternetConnection() {
    }
    
    public final void ShowNoInternetConnection() {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View p0) {
    }
    
    private final void DeleteLoginData() {
    }
}