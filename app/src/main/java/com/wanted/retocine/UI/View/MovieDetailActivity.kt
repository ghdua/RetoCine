package com.wanted.retocine.UI.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import com.wanted.retocine.Data.Model.MovieDataProvider
import com.wanted.retocine.R
import com.wanted.retocine.databinding.ActivityMovieDetailBinding

class MovieDetailActivity : AppCompatActivity() {
    private lateinit var movieDetailActivityBinding: ActivityMovieDetailBinding
    lateinit var movieName: String
    lateinit var movieDirector: String
    lateinit var movieVoteAverage: String
    lateinit var movieReleaseDate: String
    lateinit var movieOverview: String
    lateinit var moviePhoto: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        movieDetailActivityBinding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(movieDetailActivityBinding.root)
        supportActionBar!!.hide()
        var itemID = intent.getIntExtra("ItemID", -1)
        GetDataDetail(itemID)//Carga la data seleccionada en el listado de películas
    }
    private fun GetDataDetail(pItemID: Int) {
        movieName = MovieDataProvider.MoviesListResult.get(pItemID).MoviesList.get(pItemID).MovieModelName
        movieDirector = MovieDataProvider.MoviesListResult.get(pItemID).MoviesList.get(pItemID).MovieModelDirector
        movieReleaseDate = MovieDataProvider.MoviesListResult.get(pItemID).MoviesList.get(pItemID).MovieModelReleaseDate
        movieVoteAverage = MovieDataProvider.MoviesListResult.get(pItemID).MoviesList.get(pItemID).MovieModelVoteAverage
        movieOverview = MovieDataProvider.MoviesListResult.get(pItemID).MoviesList.get(pItemID).MovieModelSynopsis
        moviePhoto = MovieDataProvider.MoviesListResult.get(pItemID).MoviesList.get(pItemID).MovieModelPhoto
        Picasso.get().load(moviePhoto).into(movieDetailActivityBinding.IVPhotoMovieDetail);

        movieDetailActivityBinding.TVNameMovieDetail.text = movieName
        movieDetailActivityBinding.TVDirectorMovieDetail.text = "Dirigido por: " + movieDirector
        movieDetailActivityBinding.TVOverviewMovieDetail.text = movieOverview
        movieDetailActivityBinding.TVReleaseDateMovieDetail.text = "Fecha de estreno: " + movieReleaseDate
        movieDetailActivityBinding.TVVoteAverageMovieDetail.text = "Puntuación: " + movieVoteAverage
    }
}