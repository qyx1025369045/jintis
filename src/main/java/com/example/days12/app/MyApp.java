package com.example.days12.app;

import android.app.Application;

public class MyApp extends Application {

    private static MyApp myApp;

    public void onCreate(){
        super.onCreate();
        myApp = this;
    }

    public static MyApp getInstance(){
        return myApp;
    }

}
