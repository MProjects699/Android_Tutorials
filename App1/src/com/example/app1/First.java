package com.example.app1;

import android.os.Bundle;

import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.*;

public class First extends Activity {
	
	Button btn;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);

	}
		public void onClick(View view)
		{
			startActivity(new Intent(this, Second.class));
		}
	
	}
