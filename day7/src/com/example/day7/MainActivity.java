package com.example.day7;

import android.os.Bundle;
import android.app.Activity;

import android.content.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity implements OnClickListener {
	EditText  et;
	Button   btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et=(EditText)findViewById(R.id.editText1);
		btn=(Button)findViewById(R.id.send);
		btn.setOnClickListener(this);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void onClick(View args0)
	{
	
	String name=et.getText().toString();
	Intent i=new Intent(this,Reciever.class);
	i.putExtra("key",name);
	startActivity(i);
	}
	
	String name=et.getText().toString();
	Intent i=new Intent(this, Reciever.class);
	i.putExtra("key",name);
	startActivity(i);
	
	String name=et.getText().toString();
	Intent i=new Intent(this, Reciever.class);
	i.putExtra("key",name);
	startActivity(i);
	
	
	TextView tv=(TextView) findViewById(R.id.textview1);
	EditText et=(EditText) findViewById(R.id.edittext1);
	Button btn=(Button) findViewById(R.id.button);
	btn.setOnClickListener(new View.onClickListener()
	
	{
		public void onClick(View args0)
		{
		  String day=dp.getDayOfMonth();
          String month=dp.getMonth();
          String year=dp.getYear();

          String date={day+"/"+month+"/"+year};        
		
		
		
	    }
	
	)
}
