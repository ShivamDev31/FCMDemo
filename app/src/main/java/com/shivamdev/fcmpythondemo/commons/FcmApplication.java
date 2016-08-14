package com.shivamdev.fcmpythondemo.commons;

import android.app.Application;

/**
 * Created by Shivam on 15-08-2016.
 */
public class FcmApplication extends Application {

    private static final String TAG = FcmApplication.class.getSimpleName();

    private static FcmApplication instance;

    public static FcmApplication getInstance() {
        if(instance == null) {
            instance = new FcmApplication();
        }
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
