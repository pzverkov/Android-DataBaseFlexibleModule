package com.androidarchitecture.ui.detail;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

import com.androidarchitecture.data.MovieRepository;
import com.androidarchitecture.data.Resource;
import com.androidarchitecture.data.local.entity.MovieEntity;

public class MovieDetailViewModel extends ViewModel{
    private final LiveData<Resource<MovieEntity>>  movieDetail = new MutableLiveData<>();
    private final MovieRepository movieRepository;

    @Inject
    public MovieDetailViewModel(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public LiveData<MovieEntity> getMovie(int id){
        return movieRepository.getMovie(id);
    }
}
