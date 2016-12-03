package com.example.app26;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		VideoView v=(VideoView) findViewById(R.id.videoView1);
		v.setVideoPath("/sdcard/Dhoom Machale Dhoom.mp4");
		v.setMediaController(new MediaController(this));
		v.start();
		v.requestFocus();
		
	}

	}
