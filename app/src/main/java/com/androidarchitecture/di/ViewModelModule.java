package com.androidarchitecture.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import com.androidarchitecture.ui.detail.MovieDetailViewModel;
import com.androidarchitecture.ui.main.MovieListViewModel;
import com.androidarchitecture.viewmodel.MovieViewModelFactory;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MovieListViewModel.class)
    abstract ViewModel bindsMovieListViewModel(MovieListViewModel movieListViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(MovieDetailViewModel.class)
    abstract  ViewModel bindsMovieDetailViewModel(MovieDetailViewModel movieDetailViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindsViewModelFactory(MovieViewModelFactory movieViewModelFactory);
}
