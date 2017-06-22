package com.saurabhpatel.custompreferencesample;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat {


  @Override
  public void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.app_pref);
  }

  @Override
  public void onCreatePreferences(final Bundle savedInstanceState, final String rootKey) {
    // Load the Preferences from the XML file
  }
}
