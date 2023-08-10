package com.wanted.retocine.UI.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/wanted/retocine/UI/ViewModel/MoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "IsLoading", "Landroidx/lifecycle/MutableLiveData;", "", "getIsLoading", "()Landroidx/lifecycle/MutableLiveData;", "MoviesModel", "Lcom/wanted/retocine/Data/Model/MovieModelResponse;", "getMoviesModel", "_GetMoviesDataUseCase", "Lcom/wanted/retocine/Domain/GetMoviesDataUseCase;", "get_GetMoviesDataUseCase", "()Lcom/wanted/retocine/Domain/GetMoviesDataUseCase;", "set_GetMoviesDataUseCase", "(Lcom/wanted/retocine/Domain/GetMoviesDataUseCase;)V", "onCreate", "", "app_debug"})
public final class MoviesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.wanted.retocine.Data.Model.MovieModelResponse> MoviesModel = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> IsLoading = null;
    public com.wanted.retocine.Domain.GetMoviesDataUseCase _GetMoviesDataUseCase;
    
    public MoviesViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.wanted.retocine.Data.Model.MovieModelResponse> getMoviesModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getIsLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.wanted.retocine.Domain.GetMoviesDataUseCase get_GetMoviesDataUseCase() {
        return null;
    }
    
    public final void set_GetMoviesDataUseCase(@org.jetbrains.annotations.NotNull
    com.wanted.retocine.Domain.GetMoviesDataUseCase p0) {
    }
    
    public final void onCreate() {
    }
}