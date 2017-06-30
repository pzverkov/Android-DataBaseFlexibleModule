package com.androidarchitecture.interfaces;

import java.util.concurrent.Future;

/**
 * Created by Peter on 30.06.2017.
 */

public interface ThreadApi {
    Future executeInBackground(Runnable task);
    boolean executeInMainThread(Runnable task);
    boolean executeInMainThread(Runnable task, long delay);
}
