package com.example.app18;

import android.os.Bundle;
import android.app.Activity;
//import android.view.*;
import android.widget.*;
import android.content.*;
import android.net.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageView iv=(ImageView) findViewById(R.id.imageView1);
		iv.setImageResource(R.drawable.ic_launcher);
		iv.setImageURI((Uri) getIntent().getExtras().get(Intent.EXTRA_STREAM));
		
	}

	}
