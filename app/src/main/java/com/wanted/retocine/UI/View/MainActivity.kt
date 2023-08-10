package com.wanted.retocine.UI.View

import android.app.ProgressDialog
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.wanted.retocine.Data.DataBase.Entities.MovieEntity
import com.wanted.retocine.Data.DataBase.MovieDataBase
import com.wanted.retocine.Data.LiveData.InternetConnection
import com.wanted.retocine.Data.Model.MovieDataProvider
import com.wanted.retocine.Data.Model.MovieModel
import com.wanted.retocine.R
import com.wanted.retocine.UI.Adapter.MoviesAdapter
import com.wanted.retocine.UI.ViewModel.MoviesViewModel
import com.wanted.retocine.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mainActivityBinding: ActivityMainBinding
    private val moviesViewModel: MoviesViewModel by viewModels()

    lateinit var dbs: MovieDataBase
    lateinit var movieEntityList: MutableList<MovieEntity>

    private var moviesList: List<MovieModel> = listOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)
        supportActionBar!!.hide()
        mainActivityBinding.IVLogout.setOnClickListener(this)
        LoadMoviesList()
        movieEntityList = mutableListOf()
        CheckInternetConnection()
    }
    private fun LoadMoviesList() {
        moviesViewModel.onCreate()
        moviesViewModel.MoviesModel.observe(this, Observer {
            mainActivityBinding.RVMovies.layoutManager = LinearLayoutManager(this)
            mainActivityBinding.RVMovies.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
            val moviesmodel = it!!.MoviesList
            for(i in 0..moviesmodel.size)
                MovieDataProvider.MoviesListResult.add(it)
            moviesList = moviesmodel
            for(i in 0..moviesList.size-1)
            {
                var movieName = moviesList.get(i).MovieModelName
                var movieDirector = moviesList.get(i).MovieModelDirector
                var movieCountry = moviesList.get(i).MovieModelCountry
                var movieSynopsis = moviesList.get(i).MovieModelSynopsis
                var movieReleaseDate = moviesList.get(i).MovieModelReleaseDate
                var movieVoteAverage = moviesList.get(i).MovieModelVoteAverage
                var moviePhoto = moviesList.get(i).MovieModelPhoto
                var ent:MovieEntity = MovieEntity(0,movieName,movieReleaseDate,movieVoteAverage,movieSynopsis,movieCountry,movieDirector,moviePhoto)
                movieEntityList.add(ent)
            }
            mainActivityBinding.RVMovies.adapter = MoviesAdapter(moviesmodel)
            var moviesEntities: MutableList<MovieEntity> = mutableListOf()
        })
        moviesViewModel.IsLoading.observe(this, Observer {
            mainActivityBinding.PBSearchingData.isVisible = it
        })
    }

    private fun CheckInternetConnection() {
        val InternetConnectionObject = InternetConnection(this)
        InternetConnectionObject.observe(this, Observer {
                IsConnected ->
                    if (!IsConnected)
                        ShowNoInternetConnection()
        })
    }

    fun ShowNoInternetConnection()
    {
        var PDNoInternetConnection: ProgressDialog = ProgressDialog(this)
        PDNoInternetConnection.setCancelable(false)
        PDNoInternetConnection.setIcon(R.drawable.disconnectednetwork)
        PDNoInternetConnection.setTitle(getString(R.string.NoInternetTitleSpa))
        PDNoInternetConnection.setMessage(getString(R.string.NoInternetMessageSpa))
        val NetworkConnectionObject = InternetConnection(this)
        NetworkConnectionObject.observe(this, Observer { IsConnected ->
            if (IsConnected)
                PDNoInternetConnection.dismiss()
            else
                PDNoInternetConnection.show()
        })
    }

    override fun onClick(p0: View?) {
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setTitle("CinemApp")
        builder.setMessage("¿Está seguro que desea cerrar sesión?")
        builder.setPositiveButton("Aceptar") { dialog, which ->
            DeleteLoginData()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        builder.setNegativeButton("Cancelar") { dialog, which ->
        }
        builder.show()
    }

    private fun DeleteLoginData() {
        val loginDeleteSP: SharedPreferences = getSharedPreferences("LOGIN_DATA_SP", MODE_PRIVATE)
        var editor: SharedPreferences.Editor = loginDeleteSP.edit()
        editor.clear()
        editor.commit()
    }
}