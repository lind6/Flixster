package com.example.flixster

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

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
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.i( TAG, "onBindViewHolder position $position")
        val movie = movies[position]
        holder.bind( movie )
    }

    // return number of movies in the movies list
    override fun getItemCount() = movies.size   // inline format

    inner class ViewHolder( itemview:View ) : RecyclerView.ViewHolder( itemview ) {

        private val ivPoster   = itemView.findViewById<ImageView>( R.id.ivPoster )
        private val tvTitle    = itemView.findViewById<TextView>( R.id.tvTitle )
        private val tvOverview = itemView.findViewById<TextView>( R.id.tvOverview )

        fun bind ( movie: Movie ) {
            tvTitle.text    = movie.title
            tvOverview.text = movie.overview
            // import image using Glide library
            Glide.with( context ).load( movie.posterImageUrl ).into( ivPoster )
        }
    }
}
