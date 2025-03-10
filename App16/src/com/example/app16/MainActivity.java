package com.example.app16;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onClickLoad(View v)
	{
		Intent i=new Intent(this, AppPrefrenceActivity.class);
		startActivity(i);
	}
	
	public void onClickDisplay(View v)
	{ 
		SharedPreferences appPrefs=getSharedPreferences("appPreferences", MODE_PRIVATE);
		DisplayText(appPrefs.getString("editTextPref", ""));
	}
	
	public void onClickModify(View v)
	{
		SharedPreferences appPrefs=getSharedPreferences("appPreferences", MODE_PRIVATE);
		SharedPreferences.Editor prefsEditor=appPrefs.edit();
		prefsEditor.putString("editTextPref", ((EditText) findViewById(R.id.editText1)).getText().toString());
		prefsEditor.commit();
	}
	
	private void DisplayText(String str)
	{
		Toast.makeText(getBaseContext(), str, 
				Toast.LENGTH_LONG).show();
	}

	}
