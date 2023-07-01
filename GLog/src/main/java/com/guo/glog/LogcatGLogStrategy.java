package com.guo.glog;

import static com.guo.glog.Utils.checkNotNull;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


/**
 * LogCat implementation for {@link GLogStrategy}
 * <p>
 * This simply prints out all logs to Logcat by using standard {@link Log} class.
 */
public class LogcatGLogStrategy implements GLogStrategy {

    static final String DEFAULT_TAG = "NO_TAG";

    @Override
    public void log(int priority, @Nullable String tag, @NonNull String message) {
        checkNotNull(message);

        if (tag == null) {
            tag = DEFAULT_TAG;
        }

        Log.println(priority, tag, message);
    }
}
