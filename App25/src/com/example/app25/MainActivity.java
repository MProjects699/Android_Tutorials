package com.example.app25;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn=(Button) findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer mp=MediaPlayer.create(MainActivity.this, R.raw.windows_8_new_ad);
				mp.start();
				
			}
		});
		
	}

	}
