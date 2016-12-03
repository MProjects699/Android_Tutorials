package com.Soliaire.Usingintent2;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.content.*;
import android.widget.*;

public class First extends Activity {

	EditText et;
	Button btn;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		et=(EditText) findViewById(R.id.editText1);
		btn=(Button) findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub

				String name=et.getText().toString();
				Intent data=new Intent("com.Soliaire.Usingintent2.First");
				data.putExtra("key", name);
				startActivity(data);

				
			}
		});
		
				}
	}



		
