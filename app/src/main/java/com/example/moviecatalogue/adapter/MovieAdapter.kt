package com.example.moviecatalogue.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviecatalogue.data.Movie
import com.example.moviecatalogue.databinding.ItemMovieBinding
import com.example.moviecatalogue.ui.detail.DetailActivity

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var listMovie = ArrayList<Movie>()

    fun setMovie(movie: List<Movie>?){
        if (movie == null) return
        this.listMovie.clear()
        this.listMovie.addAll(movie)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovie.size

    class MovieViewHolder (private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie){
            with(binding){
                tvTitle.text = movie.title
                tvDate.text = movie.date
                Glide.with(itemView.context).load(movie.image).into(imgMovie)
                cvItem.setOnClickListener{
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_DATA, movie.title)
                    intent.putExtra(DetailActivity.EXTRA_JENIS, DetailActivity.EXTRA_MOVIE)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}