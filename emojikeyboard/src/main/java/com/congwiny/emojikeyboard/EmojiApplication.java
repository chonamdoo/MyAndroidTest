package com.congwiny.emojikeyboard;

import android.app.Application;
import android.os.StrictMode;


public class EmojiApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().build());
        }

    }
}
