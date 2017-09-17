package com.u.securekeyssampleapp;

import android.support.annotation.NonNull;

import com.u.securekeys.annotation.SecureKey;

/**
 * Created by saguilera on 9/16/17.
 */
@SecureKey(key = "HomeInformation", value = "HomeSecureValue")
public class HomeInformation extends Information {

    @NonNull
    @Override
    protected String getSecureKeysKey() {
        return "HomeInformation";
    }

}
