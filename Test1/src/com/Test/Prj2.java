package com.Test;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class Prj2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prj2);
	}
	
	public void onLoveButtonClicked(View view)
	{
		TextView textView=(TextView) findViewById(R.id.textView1);
		textView.setVisibility(view.VISIBLE);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.prj2, menu);
		return true;
	}

}
