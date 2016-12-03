package com.example.app33;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText et;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		et=(EditText) findViewById(R.id.editText1);
		
		SharedPreferences setting=getSharedPreferences("MYPREF", 0);
		et.setText(setting.getString("tvalue", ""));
	}
	
	protected void onStop()
	{
		super.onStop();
		SharedPreferences setting=getSharedPreferences("MYPREF", 0);
		SharedPreferences.Editor editor=setting.edit();
		editor.putString("tvalue", et.getText().toString());
		editor.commit();
		
	}

	}
