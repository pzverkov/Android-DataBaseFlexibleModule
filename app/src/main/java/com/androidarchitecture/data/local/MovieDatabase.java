package com.androidarchitecture.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.androidarchitecture.data.local.dao.MovieDao;
import com.androidarchitecture.data.local.entity.MovieEntity;

@Database(entities = {MovieEntity.class}, version = 3)
public abstract class MovieDatabase extends RoomDatabase{

    public abstract MovieDao movieDao();
}
