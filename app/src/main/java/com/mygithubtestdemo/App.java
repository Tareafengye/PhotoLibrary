package com.mygithubtestdemo;

import android.app.Application;

import com.liu.photolibrary.util.Awen;

public class App extends Application{
    private static App app;
    public static App getInstance() {
        return app;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        Awen.init(this);
    }
}
