package com.example.android.camera2video;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class SettingsActivity extends AppCompatActivity {

    public static final String KEY_PREF_COUNTDOWN = "option_countdown";
    public static final String KEY_PREF_COUNTDOWN_VAL = "option_countdown_val";
    public static final String KEY_PREF_FIXED_LENGTH = "option_fixed";
    public static final String KEY_PREF_FIXED_LENGTH_VAL = "option_fixed_val";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        //setup toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.sub_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //insert settings fragment
        getFragmentManager().beginTransaction()
                .replace(android.R.id.list, new SettingsFragment())
                .commit();
    }
}
