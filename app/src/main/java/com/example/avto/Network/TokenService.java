package com.example.avto.Network;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class TokenService {

    public static String getToken(Context context) {

        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);

        return settings.getString("token", ""/*default value*/);
    }

}
