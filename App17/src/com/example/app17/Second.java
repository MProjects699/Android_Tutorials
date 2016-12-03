package com.example.app17;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.*;

public class Second extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		TextView tv=(TextView) findViewById(R.id.textView1);
		tv.setText(getIntent().getExtras().getString("text"));
		
	}

	}
