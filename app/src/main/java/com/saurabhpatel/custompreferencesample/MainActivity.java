package com.saurabhpatel.custompreferencesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
                          .replace(R.id.main_container, new SettingsFragment(), "settings_fragment")
                          .commit();
    }
  }
}
