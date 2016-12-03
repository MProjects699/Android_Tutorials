package com.Solitaire.Basicview;

import android.os.Bundle;
import android.app.Activity;

import android.view.*;
import android.widget.*;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	//--Button view--
		Button btn1=(Button) findViewById(R.id.button1);
		btn1.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v)
			{
				DisplayToast("You have clicked the open button");
			}
			
		});
		
	
	//--Button view--
			Button btn2=(Button) findViewById(R.id.button2);
			btn2.setOnClickListener(new View.OnClickListener() 
			{
				public void onClick(View v)
				{
					DisplayToast("You have clicked the save button");
				}
				
			});
	
			//--CheckBox--
			CheckBox chk=(CheckBox) findViewById(R.id.checkBox1);
			chk.setOnClickListener(new View.OnClickListener() 
			{
				public void onClick(View v)
				{
				    if(((CheckBox)v).isChecked())
				    	DisplayToast("CheckBox is Checked");
				    else
				    	DisplayToast("CheckBox is Unchecked");
				}
			});
			
			
			//--RadioButton--
			RadioGroup rgp=(RadioGroup) findViewById(R.id.Option);
			rgp.setOnCheckedChangeListener(new OnCheckedChangeListener()
			
			{
				
                @Override
				public void onCheckedChanged(RadioGroup arg0, int arg1) {
                RadioButton rbtn=(RadioButton) findViewById(R.id.radio1);
					
					if(rbtn.isChecked())
					{
						DisplayToast("Option1 is checked");
					}
					else
					{
						DisplayToast("Option2 is checked");
					}
					
				}
			}
					);
				
				
			
			//--Toggle Button--
			ToggleButton tbtn=(ToggleButton) findViewById(R.id.toggleButton1);
			tbtn.setOnClickListener(new View.OnClickListener() 
			{
				
				@Override
				public void onClick(View v) 
				{
					if(((ToggleButton)v).isChecked())
					    DisplayToast("Toggle button is On");
					else
						DisplayToast("Toggle Button is Off");
					
				}
			});
				
	}
	
				private void DisplayToast(String msg) {
				Toast.makeText(getBaseContext(), msg,
					Toast.LENGTH_SHORT).show();
				
			}
	
}