package com.a.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class updform extends Activity {
	DbConnection dbcon;
	TextView t1;
	EditText tnm;
	EditText tnum;
	Button sv;
	Button hm;
	String name,num,oname;
	Intent i;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);	
	    setContentView(R.layout.insertrec);
	    dbcon=new DbConnection(this);
	    hm=(Button)findViewById(R.id.cmdhome);
	    sv=(Button)findViewById(R.id.cmdsave);
	    tnm=(EditText)findViewById(R.id.txtnm);
	    tnum=(EditText)findViewById(R.id.txtnum);
	   oname=getIntent().getStringExtra("name");
	     num=getIntent().getStringExtra("num");
	    tnm.setText(oname);
	    tnum.setText(num);	
	    sv.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) 
			{
				name=tnm.getText().toString();
				num=tnum.getText().toString();
				int n=Integer.parseInt(num);
				dbcon.recupd(oname, name, n);
				showDialog(1);
			}
		});	
	    hm.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				i=new Intent(updform.this, DbOperation.class);
				startActivity(i);
			}
		});	
	}	
	protected Dialog onCreateDialog(int type)
	{
	switch(type)
		{
		case 1:
		return new AlertDialog.Builder(updform.this)
		.setIcon(android.R.drawable.ic_dialog_alert)		
		.setMessage("Are you sure want to update?")
		.setPositiveButton("Yes",new DialogInterface.OnClickListener() {		
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub				
				i=new Intent(updform.this, UpdateRecord.class);
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
				i=new Intent(updform.this, UpdateRecord.class);
				startActivity(i);
			}
		}).create();
		case 2:
			return new AlertDialog.Builder(updform.this)
			.setIcon(android.R.drawable.ic_menu_delete)			
			.setMessage("Record updated successfully.")
			.setPositiveButton("Ok", new DialogInterface.OnClickListener() {		
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					i=new Intent(updform.this, UpdateRecord.class);
					startActivity(i);
				}
			}).create();
		}
	return null;
}
}
