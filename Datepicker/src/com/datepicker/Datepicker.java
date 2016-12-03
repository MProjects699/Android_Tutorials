package com.datepicker;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class Datepicker extends Activity {
	TextView textview1;
	TimePicker timepicker;
	Button changetime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);

      textview1=(TextView)findViewById(R.id.textView1);
   timepicker=(TimePicker)findViewById(R.id.timePicker1);
   timepicker.setIs24HourView(true);
   changetime=(Button)findViewById(R.id.button1);
    changetime.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			textview1.setText(timepicker.getCurrentHour()+":"+timepicker.getCurrentMinute());
		
	}
    });}
    
    
    /*{
   public void Onclick(View view)
   {
	   textview1.setText(timepicker1.getCurrentHour()+":"+timepicker1.getCurrentMinute());
   }
   
   
   }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.datepicker, menu);
        return true;
    }
    
}
