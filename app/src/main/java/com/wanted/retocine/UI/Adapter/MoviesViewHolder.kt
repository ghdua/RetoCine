package com.wanted.retocine.UI.Adapter

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.wanted.retocine.Data.Model.MovieModel
import com.wanted.retocine.R
import com.wanted.retocine.UI.View.MovieDetailActivity

class MoviesViewHolder(view: View): RecyclerView.ViewHolder(view)  {
    val tvMovieName = view.findViewById<TextView>(R.id.TVMoviewName)
    val tvMovieReleaseDate = view.findViewById<TextView>(R.id.TVMovieReleaseDate)
    val ivMoviePhoto = view.findViewById<ImageView>(R.id.IVMoviePhoto )
    var myView: View = view

    fun ShowAllMovies(movieModel: MovieModel, position: Int)
    {
        tvMovieName.text = movieModel.MovieModelName
        tvMovieReleaseDate.text = "Estreno: " + movieModel.MovieModelReleaseDate.toString()

        Picasso.get().load(movieModel.MovieModelPhoto).into(ivMoviePhoto);

        itemView.setOnClickListener{
            var IActivityDetail  = Intent(myView.context, MovieDetailActivity::class.java)
            IActivityDetail.putExtra("ItemID", position)
            myView.context.startActivity(IActivityDetail)
        }
    }
}