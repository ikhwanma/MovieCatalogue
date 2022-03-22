package com.example.moviecatalogue.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviecatalogue.data.TvShows
import com.example.moviecatalogue.databinding.ItemMovieBinding
import com.example.moviecatalogue.ui.detail.DetailActivity

class TvShowsAdapter: RecyclerView.Adapter<TvShowsAdapter.TvShowsViewHolder>() {

    private var listTvShow = ArrayList<TvShows>()

    fun setTv(tvShows: List<TvShows>?){
        if (tvShows == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tvShows)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TvShowsViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TvShowsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TvShowsViewHolder, position: Int) {
        val tvShows = listTvShow[position]
        holder.bind(tvShows)
    }

    override fun getItemCount(): Int = listTvShow.size

    class TvShowsViewHolder (private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShows: TvShows){
            with(binding){
                tvTitle.text = tvShows.title
                tvDate.text = tvShows.date
                Glide.with(itemView.context).load(tvShows.image).into(imgMovie)
                cvItem.setOnClickListener{
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_DATA, tvShows.title)
                    intent.putExtra(DetailActivity.EXTRA_JENIS, DetailActivity.EXTRA_TV)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}