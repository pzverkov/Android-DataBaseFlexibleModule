package com.androidarchitecture.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.androidarchitecture.ui.main.MovieListFragment;

@Module
public abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract MovieListFragment contributeMovieListFragment();
}
