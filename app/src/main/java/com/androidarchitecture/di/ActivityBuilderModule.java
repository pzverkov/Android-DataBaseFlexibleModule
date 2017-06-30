package com.androidarchitecture.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.androidarchitecture.ui.detail.MovieDetailActivity;
import com.androidarchitecture.ui.main.MainActivity;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = FragmentBuilderModule.class)
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector
    abstract MovieDetailActivity movieDetailActivity();
}
