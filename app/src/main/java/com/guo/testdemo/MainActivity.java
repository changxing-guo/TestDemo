package com.guo.testdemo;

import android.os.Bundle;

import com.guo.glog.AndroidGLogAdapter;
import com.guo.glog.GLog;
import com.guo.testdemo.base.BaseActivity;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}