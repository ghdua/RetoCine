package com.wanted.retocine.UI.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wanted.retocine.R
import com.wanted.retocine.databinding.ActivityMovieDetailBinding

class MovieDetailActivity : AppCompatActivity() {
    private lateinit var movieDetailActivityBinding: ActivityMovieDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_movie_detail)
        movieDetailActivityBinding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(movieDetailActivityBinding.root)
        supportActionBar!!.hide()
        var itemID = intent.getIntExtra("ItemID", -1)

    }
}