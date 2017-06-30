package com.androidarchitecture.interfaces;

/**
 * Created by Peter on 29.06.2017.
 */

import android.support.annotation.WorkerThread;

/** Way to work with DataBase that supports caching mechanism */
public interface DataBaseCacheApi {

    /** Clear cached values. Please use closely with BACKGROUND Thread */
    @WorkerThread
    void clearCache();

}
