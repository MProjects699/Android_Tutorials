package com.example.basicview6;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

	String[] ps={"abc","def","ghi","jkl"};
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setListAdapter(new ArrayAdapter<String>(this,
			android.R.layout.simple_list_item_1, ps));
		
	}
	
	public void onListItemClick(
		ListView parent, View v, int position, long id)
	{
		Toast.makeText(this, "You have slected"+ps[position], 
				Toast.LENGTH_SHORT).show();
	}

	}
