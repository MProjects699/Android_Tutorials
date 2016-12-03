package com.example.app29;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item)
	{
		if(item.getItemId()==R.id.item1)
		{
			ToastDisplay("Optio1 was clicked");
		}
		
		else if(item.getItemId()==R.id.item2)
		{
			ToastDisplay("Optio2 was clicked");
		}
		
		else if(item.getItemId()==R.id.item3)
		{
			ToastDisplay("Optio3 was clicked");
		}
		
		return super.onOptionsItemSelected(item);
		
	}

	private void ToastDisplay(String msg) {
		// TODO Auto-generated method stub
		Toast tst=Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT);
		tst.setGravity(Gravity.CENTER, 0, 0);
		tst.show();
		
		
	}

}
