package com.example.app6;

import android.os.Bundle;
import android.app.*;
import android.view.*;
import android.content.*;

public class First extends Activity {
	
	int notificationID=1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
	}
	
	public void onClick(View view)
	{
		displayNotification();
	}

	protected void displayNotification() 
	{
		// PendingIntent to launch activity if the user selects this notification
		Intent i=new Intent(this, Second.class);
		i.putExtra("notificationID", notificationID);
		
		PendingIntent pi=PendingIntent.getActivity(this, 0, i, 0);
		
		NotificationManager nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		
		Notification ntf=new Notification(R.drawable.ic_launcher,
				"Reminder: Meeting starts in 5 min", System.currentTimeMillis());
		
		CharSequence from="System Alarm";
		CharSequence message="Meeting with customer at 3pm";
		
		ntf.setLatestEventInfo(this, from, message, pi);
		
		//100ms delay vibrate for 250ms, pause for 100ms and
		//then vibrate for 500ms
		ntf.vibrate=new long[] {100, 250, 100, 500};
		nm.notify(notificationID, ntf);
		
	}

	}
