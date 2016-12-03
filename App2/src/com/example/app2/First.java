package com.example.app2;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.content.*;
import android.widget.*;

public class First extends Activity {
	
	int request_Code=1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
	}

	public void onClick(View view)
	{
		startActivityForResult(new Intent(this, Second.class),
				request_Code);
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent i)
	{
		if(requestCode==request_Code)
		{
			if(resultCode==RESULT_OK)
			{
				Toast.makeText(this, i.getData().toString(), 
						Toast.LENGTH_SHORT).show();
			}
		}
	}
	
}
