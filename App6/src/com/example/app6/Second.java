package com.example.app6;

import android.os.Bundle;
import android.app.*;
import android.view.*;

public class Second extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		//look up the notification manager service
		NotificationManager nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		
		//cancel the notification that we started
		nm.cancel(getIntent().getExtras().getInt("notificationID"));
		
	}

	}
