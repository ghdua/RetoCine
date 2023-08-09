package com.wanted.retocine.UI.Adapter

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.wanted.retocine.Model.MovieModel
import com.wanted.retocine.R
import com.wanted.retocine.UI.View.MovieDetailActivity

class MoviesViewHolder(view: View): RecyclerView.ViewHolder(view)  {
    val tvMovieName = view.findViewById<TextView>(R.id.TVMoviewName)
    val tvMovieDirection = view.findViewById<TextView>(R.id.TVMovieDirector)
    val ivMoviePhoto = view.findViewById<ImageView>(R.id.IVMoviePhoto )
    var myView: View = view

    fun ShowAllMovies(movieModel: MovieModel, position: Int)
    {
        tvMovieName.text = movieModel.MovieModelName
        tvMovieDirection.text = "Director: " + movieModel.MovieModelDirector.toString()

        Picasso.get().load(movieModel.MovieModelPhoto).into(ivMoviePhoto);

        /*var UtilsObject = Utils()
        var BitmaptImage: Bitmap = UtilsObject.loadBitmap(PMovie.MovieModelPhoto)!!
        _IVMoviePhoto.setImageBitmap(BitmaptImage)*/
        itemView.setOnClickListener{
            //_TVMovieName.text = "Nombraskjfnsakdsajdasjhsd"
            var IActivityDetail  = Intent(myView.context, MovieDetailActivity::class.java)
            IActivityDetail.putExtra("ItemID", position)
            myView.context.startActivity(IActivityDetail)
            //SearchByWantedHash(PWantedDataModel.WantedHash, PActivity, it!!)
            //ShowWantedDetailDialog("")
            //WantedDetailDialogFragment.newInstance("","")
        }
    }
}