package com.guo.glog;

import static com.guo.glog.Utils.checkNotNull;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AndroidGLogAdapter implements GLogAdapter {


    @NonNull
    private final GLogStrategy gLogStrategy;

    public AndroidGLogAdapter() {
        this.gLogStrategy = PrettyFormatStrategy.newBuilder().build();
    }

    public AndroidGLogAdapter(@NonNull GLogStrategy gLogStrategy) {
        this.gLogStrategy = checkNotNull(gLogStrategy);
    }

    @Override
    public boolean isLoggable(int priority, @Nullable String tag) {
        return true;
    }

    @Override
    public void log(int priority, @Nullable String tag, @NonNull String message) {
        gLogStrategy.log(priority, tag, message);
    }

}
