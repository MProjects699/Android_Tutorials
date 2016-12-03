package com.Solitaire.Dialog;

import android.os.Bundle;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.view.*;
import android.content.DialogInterface;
import android.widget.*;

public class DialogActivity extends Activity {
	
	CharSequence[] items={"Google","Apple","Microsoft"};
	boolean[] itemChecked=new boolean [items.length];

	ProgressDialog progressDialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialogactivity);
	}
	
	public void onClick(View v)
	{
		showDialog(0);
	}

	public void onClick2(View v)
	{
		showDialog(0);
	}
	
	public void onClick3(View v)
	{
		showDialog(1);
		progressDialog.setProgress(0);
	
	
     new Thread(new Runnable(){
    	 public void run(){
    		 for(int i=1;i<=15;i++){
    			 try{
    				 
    				 Thread.sleep(1000);
    				 
    				 progressDialog.incrementProgressBy((int)(100/15));
    				 
    			 }
    			 
    			 catch(InterruptedException e)
    			 {
    				 e.printStackTrace();
    				 
    			 }
    		 }
    		 
    		 progressDialog.dismiss();
    	 }
     }).start();		
		
	}
	
	@Override
	protected Dialog onCreateDialog(int id){
		switch(id){
		
		case 0:
			return (new AlertDialog.Builder(this)
		).create();
		
		case 1:
			progressDialog=new ProgressDialog(this);
			progressDialog.setIcon(R.drawable.ic_launcher);
			progressDialog.setTitle("Downloading files...");
			progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			progressDialog.setButton(DialogInterface.BUTTON_POSITIVE,"OK",
				new DialogInterface.onClickListener(){
				public void onClick(DialogInterface dialog,
				int whichButton)
				
				{
					Toast.makeText(getBaseContext(),
							"OK clicked!", Toast.LENGTH_SHORT).show();
				}
			});
			
			progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel",
					new DialogInterface.onClickListener(){
				public void onClick(DialogInterface dialog,
					int whichButton)
				{
					Toast.makeText(getBaseContext(),
						"Cancel clicked!", Toast.LENGTH_SHORT).show();
				}
			});
			
			return progressDialog;
		
		}
		
		return null;
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dialog, menu);
		return true;

	}

}
