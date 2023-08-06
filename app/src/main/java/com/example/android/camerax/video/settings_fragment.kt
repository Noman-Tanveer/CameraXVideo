package com.example.android.camerax.video

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class settings_fragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}