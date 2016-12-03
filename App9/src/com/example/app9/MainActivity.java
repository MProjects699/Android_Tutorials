package com.example.app9;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
	
	String[] pd={"Barak Obama", "Narendra Modi", "Pranav Mukharji",
			"Bill Clinton", "John F. Kennedy"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayAdapter<String> ad=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, pd);
		
		AutoCompleteTextView ac=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		
		ac.setThreshold(3);
		ac.setAdapter(ad);
		
	}

	}
