package com.example.moviecatalogue.ui.detail

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.moviecatalogue.ViewModel.ViewModelFactory
import com.example.moviecatalogue.data.Movie
import com.example.moviecatalogue.data.TvShows
import com.example.moviecatalogue.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra(EXTRA_DATA)
        val jenis = intent.getStringExtra(EXTRA_JENIS)


        supportActionBar?.title = title
        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        if (title != null  && jenis != null) {
            viewModel.setDetail(title)
        }
        if (jenis == EXTRA_TV){
            viewModel.getDetailTvShows().observe(this,{
                binding.progressBar.visibility = View.GONE
                populateTvShows(it)
            })
        }else if (jenis == EXTRA_MOVIE){
            viewModel.getDetailMovie().observe(this,{
                binding.progressBar.visibility = View.GONE
                populateMovie(it)
            })
        }


    }

    private fun populateMovie(film: Movie) {
        binding.apply {
            tvGenreMovie.text = film.genre
            tvReleaseDate.text = film.date
            tvNameMovie.text = film.title
            Glide.with(this@DetailActivity).
            load(film.image).
            into(imgMovie)
            tvSinopsis.text = film.description
            tvPemain.text = film.pemain
            btnWebsite.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW , Uri.parse(film.url)))
            }
        }
    }

    private fun populateTvShows(film: TvShows) {
        binding.apply {
            tvGenreMovie.text = film.genre
            tvReleaseDate.text = film.date
            tvNameMovie.text = film.title
            Glide.with(this@DetailActivity).
            load(film.image).
            into(imgMovie)
            tvSinopsis.text = film.description
            tvPemain.text = film.pemain
            btnWebsite.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW , Uri.parse(film.url)))
            }
        }
    }

    companion object{
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_JENIS = "extra_jenis"
        const val EXTRA_TV = "extra_tv"
        const val EXTRA_MOVIE = "extra_movie"
    }
}