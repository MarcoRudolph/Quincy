package com.example.marco.quincy;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Marco on 05.10.2016.
 */

public class SettingsActivity extends PreferenceActivity {

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Define the xml file used for preferences
        addPreferencesFromResource(R.xml.preferences);
    }
}
