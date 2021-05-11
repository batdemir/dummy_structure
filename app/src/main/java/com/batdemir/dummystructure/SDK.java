package com.batdemir.dummystructure;

import android.content.Context;

import com.batdemir.dummystructure.di.ApplicationContainer;

public class SDK {
    private static SDK instance = null;

    public static synchronized SDK getInstance(Context context) {
        if (instance == null)
            instance = new SDK(context);
        return instance;
    }

    public static synchronized SDK getInstance() {
        if (instance == null)
            throw new NullPointerException();
        return instance;
    }

    private ApplicationContainer applicationContainer;

    private SDK(Context context) {
        applicationContainer = new ApplicationContainer(context);
    }

    public ApplicationContainer getApplicationContainer() {
        return applicationContainer;
    }
}
