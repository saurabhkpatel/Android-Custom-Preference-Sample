package com.saurabhpatel.custompreferencesample;

import android.content.Context;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceViewHolder;
import android.util.AttributeSet;

public class SampleCustomPreference extends Preference {

  public SampleCustomPreference(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    setWidgetLayoutResource(R.layout.layout_pref);
  }

  public SampleCustomPreference(final Context context, final AttributeSet attrs, final int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    setWidgetLayoutResource(R.layout.layout_pref);
  }

  public SampleCustomPreference(final Context context, final AttributeSet attrs) {
    super(context, attrs);
    setWidgetLayoutResource(R.layout.layout_pref);
  }

  public SampleCustomPreference(final Context context) {
    super(context);
    setWidgetLayoutResource(R.layout.layout_pref);
  }

  @Override
  public void onBindViewHolder(final PreferenceViewHolder holder) {
    super.onBindViewHolder(holder);
    holder.itemView.setClickable(false); // disable parent click
  }
}
