package com.solitaire.UsingIntent;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.content.*;

public class UsingIntentActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void onClick(View view)
	{
		startActivity(new Intent("com.solitaire.UsingIntent.SecondActivity"));
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.using_intent, menu);
		return true;
	}

*/
}
