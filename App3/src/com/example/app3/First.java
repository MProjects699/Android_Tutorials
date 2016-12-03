package com.example.app3;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.*;

public class First extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
	}
	
	public void onClick(View view)
	{
		Intent i=new Intent(this, Second.class);
		
		//use putExtra() to add new name/value pairs
		//Intent_refrence_variable.putextra_method(parameterName, TheirValue)
		i.putExtra("str1", "This is a string");
		i.putExtra("age1", 25);
		
		//use a Bundle object to add new name/value pairs
		//Similarly use Bundle object for particular dataType
		Bundle b=new Bundle();
		b.putString("str2", "This is another String");
		b.putInt("age2", 35);
		
		//attach the Bundle object to the Intent object
		i.putExtras(b);
		
		//start the activity to get a result back
		startActivityForResult(i, 1);
		
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent i)
	{
		if(requestCode==1)
		{
			if(resultCode==RESULT_OK)
			{
				Toast.makeText(this, Integer.toString(i.getIntExtra("age3", 0)), 
				Toast.LENGTH_SHORT).show();
				
				Toast.makeText(this,  i.getData().toString(), 
						Toast.LENGTH_SHORT).show();
			}
		}
	}

}
