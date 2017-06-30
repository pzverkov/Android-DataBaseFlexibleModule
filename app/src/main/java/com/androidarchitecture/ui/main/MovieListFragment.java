package com.androidarchitecture.ui.main;

import android.arch.lifecycle.LifecycleFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

import com.androidarchitecture.R;
import com.androidarchitecture.data.local.entity.MovieEntity;
import com.androidarchitecture.databinding.FragmentMovieListBinding;
import com.androidarchitecture.ui.detail.MovieDetailActivity;

public class MovieListFragment extends LifecycleFragment implements MovieListCallback{

    @Inject
    MovieListViewModel movieListViewModel;

    FragmentMovieListBinding binding;

    public static MovieListFragment newInstance() {
        Bundle args = new Bundle();
        MovieListFragment fragment = new MovieListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidSupportInjection.inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMovieListBinding.inflate(inflater, container, false);
        binding.recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        binding.recyclerView.setAdapter(new MovieListAdapter(this));
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        movieListViewModel
                .getPopularMovies()
                .observe(this, listResource -> binding.setResource(listResource));
    }

    @Override
    public void onMovieClicked(MovieEntity movieEntity, View sharedView) {
        ActivityOptionsCompat options = ActivityOptionsCompat.
                makeSceneTransitionAnimation(getActivity(), sharedView, getString(R.string.shared_image));
        startActivity(MovieDetailActivity.newIntent(getActivity(), movieEntity.getId()), options.toBundle());
    }
}
