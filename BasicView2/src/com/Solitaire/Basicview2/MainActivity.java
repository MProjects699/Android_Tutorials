package com.Solitaire.Basicview2;

import android.os.*;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

	static int progress;
	ProgressBar progressBar;
	int progressStatus=0;
	Handler handler=new Handler();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	progress=0;
	progressBar=(ProgressBar) findViewById(R.id.progressBar1);
	progressBar.setMax(200);
	
	//--do some work in background thread--
	new Thread(new Runnable()
	{

		@Override
		public void run() {
			//do some work here
			while(progressStatus<100)
			{
				progressStatus=doSomeWork();
			}
			
			//--Update the progress bar--
			handler.post(new Runnable()
			{
				public void run()
				{
					progressBar.setProgress(progressStatus);
				}
			});
			
			//hide the progressBar
			handler.post(new Runnable()
			{
				public void run()
				{
					//--0 VISIBLE, 4 -INVISIBLE, 8 -GONE--
					progressBar.setVisibility(View.GONE);
				}
			});
		}
		
		//--do some long running work here--
		private int doSomeWork()
		{
			try
			{
				//-simulate doing some work--
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
