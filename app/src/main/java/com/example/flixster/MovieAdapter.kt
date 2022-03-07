package com.example.flixster

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

const val MOVIE_EXTRA = "MOVIE_EXTRA"
private const val TAG = "MovieAdapter"

class MovieAdapter(private val context: Context, private val movies: List<Movie> )
    : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    // expensive operation: create a view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.i( TAG, "onCreateViewHolder")
        val view = LayoutInflater.from( context ).inflate( R.layout.item_movie, parent, false )
        return ViewHolder( view )
    }

    // efficient: bind data to existing viewholder
    override fun onBindViewHolder( holder: ViewHolder, position: Int ) {
        Log.i( TAG, "onBindViewHolder position $position" )
        val movie = movies[ position ]
        holder.bind( movie )
    }

    // return number of movies in the movies list
    override fun getItemCount() = movies.size   // inline format

    inner class ViewHolder( itemView:View ) : RecyclerView.ViewHolder( itemView ), View.OnClickListener {

        private val ivPoster   = itemView.findViewById<ImageView>( R.id.ivPoster   )
        private val tvTitle    = itemView.findViewById<TextView>(  R.id.tvTitle    )
        private val tvOverview = itemView.findViewById<TextView>(  R.id.tvOverview )

        init {
            itemView.setOnClickListener( this )
        }

        fun bind ( movie: Movie ) {
            tvTitle.text    = movie.title
            tvOverview.text = movie.overview
            // import image using Glide library
            Glide.with( context ).load( movie.posterImageUrl ).into( ivPoster )
        }

        override fun onClick( p0: View? ) {

            // 1. get notified of movie clicked
            val movie = movies[ adapterPosition ]
            // Toast.makeText( context, movie.title, Toast.LENGTH_SHORT ).show()

            // 2. use intent system to navigate to new activity (screen)
            val intent = Intent( context, DetailActivity::class.java )
            // pass key-value pairs to the intent so receiving activity can access them
            // intent.putExtra( "movie_title", movie.title )
            // better option: pass movie object to next activity using Parceable class to package it
            intent.putExtra( MOVIE_EXTRA, movie )
            context.startActivity( intent )
        }
    }
}
