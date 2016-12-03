package com.example.day7;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Reciever extends Activity {
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reciever);
		tv=(TextView)findViewById(R.id.textView1);
		String name= getIntent().getStringExtra("key");

		tv.setText(name);

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.reciever, menu);
		return true;	
	}
		
	
	}

	
	


