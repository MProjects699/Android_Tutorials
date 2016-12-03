package com.example.app27;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn=(Button) findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast tst=Toast.makeText(MainActivity.this, "This is some toast", Toast.LENGTH_SHORT);
				tst.setGravity(Gravity.CENTER, 0, 0);
				tst.show();
				
				
			}
		}); 
		
	}

	}
