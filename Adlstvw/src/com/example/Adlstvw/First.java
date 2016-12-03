package com.example.Adlstvw;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.view.View.OnClickListener;
//import android.view.View.OnClickListener;

import android.widget.*;
import java.util.ArrayList;

public class First extends Activity implements OnClickListener {
	
	EditText et1;
	Button btn2;
	ListView lv1;
	Second s;
	ArrayList<String> al1=new ArrayList<String>();
	//ArrayList<Integer> al2=new ArrayList<Integer>();

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		
		et1=(EditText) findViewById(R.id.editText1);
		btn2=(Button) findViewById(R.id.button1);
		lv1=(ListView) findViewById(R.id.listView1);
		s=new Second(al1, this);
		lv1.setAdapter(s);
	
		btn2.setOnClickListener(this);
		
	    }		
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first, menu);
		return true;
	}

		
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String v=et1.getText().toString();
		al1.add(v);
		et1.setText("");
	    s.notifyDataSetChanged();
	
}


	
}
