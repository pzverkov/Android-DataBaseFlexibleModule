package com.androidarchitecture.manager;

import android.os.Handler;
import android.os.Looper;

import com.androidarchitecture.interfaces.ThreadApi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Peter on 30.06.2017.
 */

public class ThreadManager implements ThreadApi {
    private ExecutorService backgroundThreadPool;
    private Handler uiCallback;

    public ThreadManager() {
        this.backgroundThreadPool = Executors.newCachedThreadPool();
        this.uiCallback = new Handler(Looper.getMainLooper());
    }

    @Override
    public Future executeInBackground(Runnable task) {
        return backgroundThreadPool.submit(task);
    }

    @Override
    public boolean executeInMainThread(Runnable task) {
        return uiCallback.post(task);
    }

    @Override
    public boolean executeInMainThread(Runnable task, long delay) {
        return uiCallback.postDelayed(task, delay);
    }
}
