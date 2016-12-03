package com.example.app8;

import android.os.*;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

	static int progress;
	ProgressBar pb;
	int progressStatus=0;
	Handler handler=new Handler();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		progress=0;
		pb=(ProgressBar) findViewById(R.id.progressBar1);
		
		//do some work in background thread
		new Thread(new Runnable()
		{

			@Override
			public void run() {
				// do some work here
				while (progressStatus<10)
				{
					progressStatus=doSomeWork();
				}
				
				//hides the progress bar
				handler.post(new Runnable()
				{

					@Override
					public void run() {
						// 0 visible, 4 invisible, 8 gone
						pb.setVisibility(View.GONE);
						
					}
					
				});
				
			}

			private int doSomeWork() {
				// TODO Auto-generated method stub
				try{
					Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				
				return ++progress;
			}
		}).start();
	}

}
