package com.Soliatire.Basicview3;

import android.os.Bundle;
import android.app.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
	
	String[] ps={"Sagar","Sonia","Samar","Chandan","Ashok","Baljinder"};
			
	
@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
		android.R.layout.simple_dropdown_item_1line, ps);
	
	AutoCompleteTextView tv=(AutoCompleteTextView) findViewById(R.id.txtCountries);
	
	tv.setThreshold(3);
	tv.setAdapter(adapter);
	
	}

}
