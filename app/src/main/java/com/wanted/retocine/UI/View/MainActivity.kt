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
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.wanted.retocine.LiveData.InternetConnection
import com.wanted.retocine.Model.MovieDataProvider
import com.wanted.retocine.Model.MovieModel
import com.wanted.retocine.R
import com.wanted.retocine.UI.Adapter.MoviesAdapter
import com.wanted.retocine.UI.ViewModel.MoviesViewModel
import com.wanted.retocine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mainActivityBinding: ActivityMainBinding
    private val moviesViewModel: MoviesViewModel by viewModels()

    private var moviesList: List<MovieModel> = listOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_home)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)
        supportActionBar!!.hide()
        mainActivityBinding.IVLogout.setOnClickListener(this)
        LoadMoviesList()
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
            mainActivityBinding.RVMovies.adapter = MoviesAdapter(moviesmodel)
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