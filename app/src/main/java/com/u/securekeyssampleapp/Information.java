package com.u.securekeyssampleapp;

import android.support.annotation.NonNull;

import com.u.securekeys.SecureEnvironment;

/**
 * Created by saguilera on 9/16/17.
 */
public abstract class Information {

    @NonNull
    public String getInformation() {
        return SecureEnvironment.getString(getSecureKeysKey());
    }

    @NonNull
    protected abstract String getSecureKeysKey();

}
