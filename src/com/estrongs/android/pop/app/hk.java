package com.estrongs.android.pop.app;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class hk
  implements Preference.OnPreferenceChangeListener
{
  hk(PopPreferenceActivity paramPopPreferenceActivity) {}
  
  public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    paramPreference = a.getPackageManager();
    ComponentName localComponentName = new ComponentName(a, UsbMonitorActivity.class);
    if (((Boolean)paramObject).booleanValue())
    {
      paramPreference.setComponentEnabledSetting(localComponentName, 1, 1);
      return true;
    }
    paramPreference.setComponentEnabledSetting(localComponentName, 2, 1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.estrongs.android.pop.app.hk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */