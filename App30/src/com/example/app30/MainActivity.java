package com.example.app30;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn=(Button) findViewById(R.id.button1);
		registerForContextMenu(btn);
		
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuinfo) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateContextMenu(menu, v, menuinfo);
		MenuInflater mi=getMenuInflater();
		mi.inflate(R.menu.main, menu);
	}
	
	public boolean onContextItemSelected(MenuItem item)
	{
		if(item.getItemId()==R.id.item1)
		{
		ToastDisplay("Option1 was selected");
		}
		
		else if(item.getItemId()==R.id.item2)
		{
		ToastDisplay("Option2 was selected");
		}
		
		return super.onContextItemSelected(item);
		
	}

	private void ToastDisplay(String msg) {
		// TODO Auto-generated method stub
		Toast tst=Toast.makeText(this, msg, Toast.LENGTH_SHORT);
		tst.setGravity(Gravity.CENTER, 0, 0);
		tst.show();
		
	}

}
