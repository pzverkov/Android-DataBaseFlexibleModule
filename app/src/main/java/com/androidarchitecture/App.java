package com.androidarchitecture;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

import com.androidarchitecture.data.local.orm.DaoMaster;
import com.androidarchitecture.data.local.orm.DaoSession;
import com.androidarchitecture.di.DaggerAppComponent;

public class App extends Application implements HasActivityInjector {
    DaoSession daoSession;

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeComponent();
        initGreenDao();
    }

    private void initGreenDao() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "films-db", null);
        daoSession = new DaoMaster(helper.getWritableDatabase()).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    private void initializeComponent() {
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingInjector;
    }
}
