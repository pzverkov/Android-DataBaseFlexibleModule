package com.androidarchitecture.ui.main;

import android.view.View;

import com.androidarchitecture.data.local.entity.MovieEntity;

public interface MovieListCallback {
    void onMovieClicked(MovieEntity movieEntity, View sharedView);
}
