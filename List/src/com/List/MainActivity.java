package com.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
	
	String[] a={"oioi","ksjk"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	

	ListView lv=(ListView) findViewById(R.id.listView1);
	ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_1, a);
	lv.setAdapter(ad);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
