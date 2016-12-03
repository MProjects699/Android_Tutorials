package com.example.app2;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.net.*;

public class Second extends Activity {
	
	EditText et;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}

	public void onClick(View view)
	{
		Intent i=new Intent();
		
		//get the edit EditView
		et=(EditText) findViewById(R.id.editText1);
		
		//set the data to pass back
		i.setData(Uri.parse(et.getText().toString()));
		setResult(RESULT_OK, i);
		
		//close the activity
		finish();
		
	}

}
