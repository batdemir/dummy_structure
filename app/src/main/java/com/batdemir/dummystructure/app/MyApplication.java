package com.batdemir.dummystructure.app;

import android.app.Application;

import com.batdemir.dummystructure.SDK;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SDK.getInstance(this);
    }
}
