package com.example.app11;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
	
	DatePicker dp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		dp=(DatePicker) findViewById(R.id.datePicker1);
		
	}
	
	public void onClick(View v)
	{
		Toast.makeText(getBaseContext(), "Date Selected: "+dp.getDayOfMonth()+"/"+dp.getMonth()+"/"+dp.getYear(), 
				Toast.LENGTH_SHORT).show();
	}

	}
