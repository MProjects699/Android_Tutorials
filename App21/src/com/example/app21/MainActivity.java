package com.example.app21;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.*;
import android.widget.*;
import android.net.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ConnectivityManager cm=(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		TextView tv=(TextView) findViewById(R.id.textView1);
		boolean bt=cm.getNetworkInfo(ConnectivityManager.TYPE_BLUETOOTH).isConnectedOrConnecting();
		
		if(bt)
		{
			tv.setText("bluetooth is ON");
		}
		else
		{
			tv.setText("bluetooth is OFF");
		}
	
	
	
	}

	}
