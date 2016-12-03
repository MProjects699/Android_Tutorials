package com.dynamicviews;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
 
public class DynamicViews extends Activity implements OnClickListener{
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_views);
        
        View buttonAdd = findViewById(R.id.add);
        buttonAdd.setOnClickListener(this);
        int i=0;
        for(i=0; i<4; i++)
        {
        	 LinearLayout hiddenLayout = (LinearLayout)findViewById(R.id.hiddenLayout);
             
             //Inflate the Hidden Layout Information View 
             LinearLayout myLayout = (LinearLayout)findViewById(R.id.linearLayout2);
             View hiddenInfo = getLayoutInflater().inflate(R.layout.hidden, myLayout, false);
             myLayout.addView(hiddenInfo);
             TextView myTextView = (TextView) findViewById(R.id.textView1);
             // Update the TextView Text
             myTextView.setText("This is not the original Text defined in the XML layout !");
        }
 
        View buttonRemove = findViewById(R.id.remove);
        buttonRemove.setOnClickListener(this);
    }
    
    public void onClick(View v) {
        switch (v.getId()) {
        
        case R.id.add:
            //Check if the Layout already exists
        	
            LinearLayout hiddenLayout = (LinearLayout)findViewById(R.id.hiddenLayout);
            
                //Inflate the Hidden Layout Information View 
                LinearLayout myLayout = (LinearLayout)findViewById(R.id.linearLayout2);
                View hiddenInfo = getLayoutInflater().inflate(R.layout.hidden, myLayout, false);
                myLayout.addView(hiddenInfo);
            
 
            //Get References to the TextView 
            TextView myTextView = (TextView) findViewById(R.id.textView1);
            // Update the TextView Text
            myTextView.setText("This is not the original Text defined in the XML layout !");
            break;
        
        case R.id.remove:
            View myView = findViewById(R.id.hiddenLayout);
            ViewGroup parent = (ViewGroup) myView.getParent();
            parent.removeView(myView);
 
            
            break;
            // More buttons go here (if any) ...
 
        }
    }
    
}