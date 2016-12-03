package com.example.app7;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn1=(Button) findViewById(R.id.button1);
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DisplayToast("You have clicked the open button");
				
			}
		});
		
		Button btn2=(Button) findViewById(R.id.button2);
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DisplayToast("Yoy have clicked the save button");
				
			}
		});
		
		ImageButton btn3=(ImageButton) findViewById(R.id.imageButton1);
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DisplayToast("Imagebutton is selected");
				
			}
		});
		
		EditText et=(EditText) findViewById(R.id.editText1);
		et.setOnClickListener(new OnClickListener()
		{
			

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				DisplayToast("Editer is clicked");
				
			}
		});
	
		
		CheckBox cb=(CheckBox) findViewById(R.id.checkBox1);
		cb.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(((CheckBox)v).isChecked())
					DisplayToast("CheckBox is Checked");
				else
					DisplayToast("CheckBox is unchecked");
				
			}
		});
		
		RadioGroup rg=(RadioGroup) findViewById(R.id.radioGroup1);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener(){
		
            @Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				RadioButton rb=(RadioButton) findViewById(R.id.radio0);
				
				if(rb.isChecked())
				{
					DisplayToast("Option1 is checked");
				}
				else
				{
					DisplayToast("Option2 is checked");
				}
				
			}

			
		});
		
		ToggleButton tb=(ToggleButton) findViewById(R.id.toggleButton1);
		tb.setOnClickListener(new OnClickListener()
		{
			
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(((ToggleButton)v).isChecked())
			{
				DisplayToast("Togglebutton is On");
			}
			else
			{
				DisplayToast("ToggleButton is OFF");
			}
			
		}
		
	});
}
	
	private void DisplayToast(String msg)
	{
		Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
	}

	}
