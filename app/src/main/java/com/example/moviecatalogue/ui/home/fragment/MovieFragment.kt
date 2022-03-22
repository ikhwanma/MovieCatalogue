package com.example.moviecatalogue.ui.home.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviecatalogue.ViewModel.ViewModelFactory
import com.example.moviecatalogue.ui.home.viewmodel.MovieViewModel
import com.example.moviecatalogue.adapter.MovieAdapter
import com.example.moviecatalogue.databinding.FragmentMovieBinding


class MovieFragment : Fragment() {
    private lateinit var binding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            val movieAdapter = MovieAdapter()
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]
            viewModel.getMovie().observe(requireActivity(),{
                binding.progressBar.visibility = View.GONE
                movieAdapter.setMovie(it)
                movieAdapter.notifyDataSetChanged()
                with(binding.rvMovie1){
                    layoutManager = LinearLayoutManager(context)
                    setHasFixedSize(true)
                    adapter = movieAdapter
                }
            })
        }
    }

}