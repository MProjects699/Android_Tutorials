package com.Soliaire.Usingintent2;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.content.*;
import android.widget.*;
import android.net.*;

public class Second extends Activity {

	TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
	
		tv=(TextView) findViewById(R.id.textView1);
		String name=getIntent().getStringExtra("key");
		
		tv.setText(name);
		
		}
}
