package com.u.securekeyssampleapp;

import android.app.Application;

import com.u.securekeys.SecureEnvironment;
import com.u.securekeys.annotation.SecureConfigurations;

/**
 * Created by saguilera on 9/16/17.
 */
@SecureConfigurations(
        useAesRandomly = true
)
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SecureEnvironment.initialize(this);
    }
}
