package com.example.forcast_review.base;

import android.app.Application;

import com.example.forcast_review.DB.DBManger;

import org.xutils.x;

public class UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        DBManger.initDB(this);
    }
}
