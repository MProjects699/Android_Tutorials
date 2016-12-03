package com.Solitaire.Basicview5;

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
	
	public void onClick(View view)
	{
		Toast.makeText(getBaseContext(), "Date Selected: "+dp.getMonth()+"/"+dp.getDayOfMonth()+"/"+dp.getYear(), 
				Toast.LENGTH_SHORT).show();
		
		
		/*
		 int day=dp.getMonthDay;
		 int month=dp.getMonth;
		 int year=dp.getYear;
		 tv.setText(day+"/"+month+"/"+year");
		 */
		
	}

	}
