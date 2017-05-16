package com.cdsf.locman.yzy.application;

import android.app.Application;

/**
 * Created by wuwenliang on 2017/5/10.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("---wuwenliangLLLPPPJJPP::::LocmanApplication init 2222");
    }
}
