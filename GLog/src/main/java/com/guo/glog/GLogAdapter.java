package com.guo.glog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface GLogAdapter {

    /**
     * Used to determine whether log should be printed out or not.
     *
     * @param priority is the log level e.g. DEBUG, WARNING
     * @param tag is the given tag for the log message
     *
     * @return is used to determine if log should printed.
     *         If it is true, it will be printed, otherwise it'll be ignored.
     */
    boolean isLoggable(int priority, @Nullable String tag);

    /**
     * Each log will use this pipeline
     *
     * @param priority is the log level e.g. DEBUG, WARNING
     * @param tag is the given tag for the log message.
     * @param message is the given message for the log message.
     */
    void log(int priority, @Nullable String tag, @NonNull String message);
}
