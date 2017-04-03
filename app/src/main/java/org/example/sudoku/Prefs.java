package org.example.sudoku;

import android.os.Bundle;
import android.preference.PreferenceActivity;



/**
 * Created by Huzaifa on 12-Jan-16.
 */

public class Prefs extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}