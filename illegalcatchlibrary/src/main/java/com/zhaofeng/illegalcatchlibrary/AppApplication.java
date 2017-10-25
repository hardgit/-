package com.zhaofeng.illegalcatchlibrary;

import android.app.Application;
import android.content.Context;

import com.zhaofeng.illegalcatchlibrary.utils.CrashHandler;

/**
 * 1.类的用途
 * 2.@author 赵丰
 * 3.@date 2017/9/20 19:47
 */

public class AppApplication extends Application {


    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
        CrashHandler.getInstance().init(this);//初始化全局异常管理
    }

    public static Context getContext(){
        return mContext;
    }
}