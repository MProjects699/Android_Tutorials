package com.example.day5;

import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	
	ArrayList<String> al1= new ArrayList<String>();
	ArrayList<String> al2= new ArrayList<String>();
	ArrayList<Integer> al3= new ArrayList<Integer>(); 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		al1.add("A");
		al1.add("B");
		al1.add("C");
		
		al2.add("apple");
		al2.add("boy");
		al2.add("cat");
		
		al3.add(R.drawable.ic_launcher);
		al3.add(R.drawable.ic_launcher);
		al3.add(R.drawable.ic_launcher);
		
		ListView iv =(ListView)findViewById(R.id.listView1);
		Custom c= new Custom(al1,al2,al3,this);
		iv.setAdapter(c);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
