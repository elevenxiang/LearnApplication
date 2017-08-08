package com.htc.eleven.learnapplication;

import android.app.Application;

/**
 * Created by eleven on 17-8-8.
 */

public class App extends Application {

    private String data = "default";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        System.out.println("Application onCreate() !");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

        System.out.println("Application onTerminate() !");

    }
}
