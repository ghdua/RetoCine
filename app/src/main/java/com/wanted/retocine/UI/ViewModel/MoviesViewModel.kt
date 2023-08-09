package com.wanted.retocine.UI.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wanted.retocine.Domain.GetMoviesDataUseCase
import com.wanted.retocine.Model.MovieModelResponse
import kotlinx.coroutines.launch

class MoviesViewModel: ViewModel() {
    val MoviesModel = MutableLiveData<MovieModelResponse?>()
    val IsLoading = MutableLiveData<Boolean>()
    lateinit var _GetMoviesDataUseCase: GetMoviesDataUseCase
    fun onCreate(){
        viewModelScope.launch {
            IsLoading.postValue(true)
            _GetMoviesDataUseCase = GetMoviesDataUseCase()
            val _Result: MovieModelResponse = _GetMoviesDataUseCase.invoke()
            if(_Result!=null) {
                //println("caca " + _Result.size.toString())
                //if (_Result.isNotEmpty())
                MoviesModel.postValue(_Result)
                IsLoading.postValue(false)
            }
            /*else
                MoviesModel.postValue(null)*/
        }
    }
}