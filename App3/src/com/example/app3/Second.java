package com.example.app3;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.net.*;
import android.content.*;

public class Second extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		//get the data passed in using getStringExtra()
		Toast.makeText(this, getIntent().getStringExtra("str1"), 
				Toast.LENGTH_SHORT).show();
		
		//get the data passed in using getIntExtra()
		Toast.makeText(this, Integer.toString(getIntent().getIntExtra("age1", 0)), 
				Toast.LENGTH_SHORT).show();
		
		//get the Bundle object passed in
		Bundle b=getIntent().getExtras();
		
		//get the data using the getString()
		Toast.makeText(this, b.getString("str2"), 
				Toast.LENGTH_SHORT).show();
		
		//get the data using getInt() method
		Toast.makeText(this, Integer.toString(b.getInt("age2")), 
				Toast.LENGTH_SHORT).show();
		
	}
	
	public void onClick(View view)
	{
		//use the Intent object to return data
		Intent i=new Intent();
		
		//use the putExtra() method to return the some values
		i.putExtra("age3", 45);
		
		//use the setData() method to return some values
		i.setData(Uri.parse("Something passed back to main activity"));
		
		//set the result with OK and the Intent object
		setResult(RESULT_OK, i);
		
		//destroy the current activity
		finish();
	}

	}

