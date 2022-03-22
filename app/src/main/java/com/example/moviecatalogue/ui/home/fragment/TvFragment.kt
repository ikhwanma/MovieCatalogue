package com.example.moviecatalogue.ui.home.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviecatalogue.ViewModel.ViewModelFactory
import com.example.moviecatalogue.ui.home.viewmodel.TvShowsViewModel
import com.example.moviecatalogue.adapter.TvShowsAdapter
import com.example.moviecatalogue.databinding.FragmentTvBinding


class TvFragment : Fragment() {
    private lateinit var binding: FragmentTvBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTvBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            val tvShowsAdapter = TvShowsAdapter()
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvShowsViewModel::class.java]
            viewModel.getTvShows().observe(requireActivity(),{
                tvShowsAdapter.setTv(it)
                tvShowsAdapter.notifyDataSetChanged()
                tvShowsAdapter.setTv(it)

                with(binding.rvMovie){
                    layoutManager = LinearLayoutManager(context)
                    setHasFixedSize(true)
                    adapter = tvShowsAdapter
                }
            })
        }
    }
}