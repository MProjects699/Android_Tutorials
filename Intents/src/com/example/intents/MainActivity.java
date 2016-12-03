package com.example.intents;

import android.os.Bundle;
import android.app.Activity;

import android.content.*;
import android.view.*;
import android.net.*;

public class MainActivity extends Activity {
	
	int request_Code=1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onClickWebBrowser(View view){
		Intent i=new Intent(android.content.Intent.ACTION_VIEW,
				Uri.parse("http://www.google.com"));
		startActivity(i);
	}
	
	public void onClickMakeCalls(View view)
	{
		Intent i=new Intent(android.content.Intent.ACTION_VIEW,
			Uri.parse("tel:+917696345395"));
		startActivity(i);
	}
	
	public void onClickShowMap(View view)
	{
		Intent i=new Intent(android.content.Intent.ACTION_VIEW,
			Uri.parse("geo:37.927500,-122.491670"));
		startActivity(i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
