package com.androidarchitecture.ui.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

import com.androidarchitecture.data.MovieRepository;
import com.androidarchitecture.data.Resource;
import com.androidarchitecture.data.local.entity.MovieEntity;

public class MovieListViewModel extends ViewModel {
    private final LiveData<Resource<List<MovieEntity>>> popularMovies;

    @Inject
    public MovieListViewModel(MovieRepository movieRepository) {
        popularMovies = movieRepository.loadPopularMovies();
    }

    LiveData<Resource<List<MovieEntity>>> getPopularMovies() {
        return popularMovies;
    }
}
