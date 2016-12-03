package com.a.a;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DeleteRecord extends Activity {
	SQLiteDatabase db;
	DbConnection dbcon;
	List<String> nm;
	//Spinner spList;
	ListView lv;
	TextView tv;
	String strId;
	String val;
	Intent i;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);	
	    setContentView(R.layout.delrec);
	   // spList=(Spinner)findViewById(R.id.sp1);
	    tv=(TextView)findViewById(R.id.txt1);
	    lv=(ListView)findViewById(R.id.lv1);
	    dbcon=new DbConnection(this);
	     nm = new ArrayList<String>();
	    nm=dbcon.selectAll(this);
	    ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, nm);
	lv.setAdapter(adapter);
	
		
	
	lv.setOnItemClickListener(new OnItemClickListener()
	{
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				String item=arg0.getItemAtPosition(arg2).toString();
				int n=item.indexOf(' ');
			 val=item.substring(0,n);
				tv.setText(val);
				showDialog(1);
			}
		});	
	}
	protected Dialog onCreateDialog(int type)
	{
	switch(type)
		{
		case 1:
		return new AlertDialog.Builder(DeleteRecord.this)
		.setIcon(android.R.drawable.ic_dialog_alert)		
		.setMessage("Are you sure want to delete?")
		.setPositiveButton("Yes",new DialogInterface.OnClickListener() {			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				tv.setText("in yes");
				dbcon.recdel(val);			
				i=new Intent(DeleteRecord.this, DeleteRecord.class);
				startActivity(i);
				/*nm=dbcon.selectAll(DeleteRecord.this);
			    ArrayAdapter<String> adapter=new ArrayAdapter<String>(DeleteRecord.this,android.R.layout.simple_list_item_1, nm);
			lv.setAdapter(adapter);
				showDialog(2);*/
			}
		}).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {	
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				i=new Intent(DeleteRecord.this, DeleteRecord.class);
				startActivity(i);
			}
		}).create();
		case 2:
			return new AlertDialog.Builder(DeleteRecord.this)
			.setIcon(android.R.drawable.ic_menu_delete)			
			.setMessage("Record deleted successfully.")
			.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
				}
			}).create();
		}
	return null;		
	}	
	public void setId(String item)
	{
		for(int i=0;i<item.length();i++)
		{
			char c=item.charAt(i);
			//char c1=(char)c;
			char s = ' ';
			if(c==s)
			{
				
				break;
			}
			else
			{
				strId=strId+c;
	
			}
			tv.setText(item);
		}	
	}
}

