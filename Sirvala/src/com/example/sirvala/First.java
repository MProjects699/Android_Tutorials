package com.example.sirvala;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import java.util.*;



public class First extends Activity {
	
	EditText et;
	Button btn;
	ListView lv;
	ArrayList<String> al=new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		te=(EditText)findViewById(R.id.editText1);
		lst=(ListView)findViewById(R.id.listView1);
		add=(Button)findViewById(R.id.btn);
	
		add.setOnClickListener(new OnClickListener(){
			
			public void OnClick(View args0)
			{
				te.getText().toString();
				al.add(te);
			}
			
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first, menu);
		return true;
	}

}
