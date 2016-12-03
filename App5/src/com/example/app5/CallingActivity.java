package com.example.app5;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.content.*;
import android.net.*;

public class CallingActivity extends Activity {

	int request_Code=1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calling);
	
	}
	
	public void wb(View view)
	{
		startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
	}
	
	public void mc(View view)
	{
		startActivity(new Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel:+917696345395")));
	}
	
	public void sm(View view)
	{
		startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:37.827500,-122.481670")));
	}
	
	public void lb(View view)
	{
		startActivity(new Intent(this, Second.class).setData(Uri.parse("http://www.amazon.com")));
	}

	}
