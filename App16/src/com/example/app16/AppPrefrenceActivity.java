package com.example.app16;

import android.os.*;
import android.preference.*;

public class AppPrefrenceActivity extends PreferenceActivity {
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		PreferenceManager prefMgr=getPreferenceManager();
		prefMgr.setSharedPreferencesName("appPreferences");
		
		//load the preference from an XML file
		addPreferencesFromResource(R.xml.myappprefrence);
		
	}

}
