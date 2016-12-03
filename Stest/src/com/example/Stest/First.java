
package com.example.Stest;

import android.os.Bundle;
import android.app.Activity;

import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.*;
import java.util.*;

public class First extends Activity implements OnClickListener {
	
	TextView tv;
	Button btn2;
	ListView lv1;
	Third t;
	ArrayList<String> al1=new ArrayList<String>();
	//ArrayList<Integer> al2=new ArrayList<Integer>();

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		tv=(TextView)findViewById(R.id.textView1);
		String name= getIntent().getStringExtra("key");

		tv.setText(name);
		
		btn2=(Button) findViewById(R.id.button1);
		lv1=(ListView) findViewById(R.id.listView1);
		t=new Third(al1, this);
		lv1.setAdapter(t);
	
		btn2.setOnClickListener(this);
		
	    }		
		
      public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String v=tv.getText().toString();
		al1.add(v);
		tv.setText("");
	    t.notifyDataSetChanged();
	
}
}
