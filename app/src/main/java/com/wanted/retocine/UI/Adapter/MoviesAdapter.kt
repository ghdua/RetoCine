package com.wanted.retocine.UI.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wanted.retocine.Data.Model.MovieModel
import com.wanted.retocine.R

class MoviesAdapter(private val movies: List<MovieModel>):
    RecyclerView.Adapter<MoviesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val _LayoutInflater =  LayoutInflater.from(parent.context)
        return MoviesViewHolder(_LayoutInflater.inflate(R.layout.layout_item_movies, parent, false))
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val Item = movies[position]
        holder.ShowAllMovies(Item, position)
    }
}