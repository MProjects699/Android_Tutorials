package com.example.app19;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.*;
import android.widget.MediaController.MediaPlayerControl;
import android.content.*;
import android.net.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		MediaController iv=(MediaController) findViewById(R.id.mediaController1);
		iv.setMediaPlayer((MediaPlayerControl) getIntent().getExtras().get(Intent.EXTRA_STREAM));
	
	
		
	}

	}
