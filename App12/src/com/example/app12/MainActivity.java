package com.example.app12;

import android.os.Bundle;
import android.app.*;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends ListActivity {
	
	String[] fn={"Indu","Neetu","Reetu","Deepu","Rohit",
			"Rohini","Rahul","Rishu","Sourav","Dhuruv"};
	
	ListView lv;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fn));
		//lv=(ListView) findViewById(R.id.listView1);
		//lv.setAdapter(ad);
		//lv.setOnItemClickListener(new setOnItemClickListener(){
	}
            public void onListItemClick(ListView parent, View v, int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(this, "You have selected: "+fn[position], 
						Toast.LENGTH_SHORT).show();
				
			}

		
	}
	
	
	
