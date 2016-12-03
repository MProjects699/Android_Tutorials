package com.example.spinner;

import android.os.Bundle;

import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.*;

public class Spinner extends Activity {

	String[] pd;
	Spinner s1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
	
		pd=getResources().getStringArray(R.array.pd_array);
		s1=(Spinner) findViewById(R.id.spinner1);
	
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, pd);
		
		s1.setAdapter(adapter);
	
	}

	}
