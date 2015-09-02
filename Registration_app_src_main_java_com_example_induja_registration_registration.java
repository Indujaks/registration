package com.example.induja.registration;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Induja on 01-09-2015.
 */
public class registration extends Application {
    public static final String YOUR_APPLICATION_ID = "bA2jSzNoYuZ5XOdcXzpC8LUhFoOLZvIXiRUlGS4Y";
    public static final String YOUR_CLIENT_KEY = "SUgwli06qEgpFmQob5d56eFZsisbhSyMtdjDiGCD";

    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);

    }

}
