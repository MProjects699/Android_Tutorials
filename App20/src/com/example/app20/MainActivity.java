package com.example.app20;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ConnectivityManager cm=(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		TextView tv=(TextView) findViewById(R.id.textView1);
		boolean wifi=cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnectedOrConnecting();
		
		if(wifi)
		{
			tv.setText("wifi is ON");
		}
		else
		{
			tv.setText("wifi is OFF");
		}
		
	}

	}
