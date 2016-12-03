package com.a.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InsertRecord extends Activity {
	DbConnection dbcon;
	TextView t1;
	EditText tnm;
	EditText tnum;
	Button sv;
	Button hm;
	String nm;
	int num;
	Intent i;

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.insertrec);
	    dbcon=new DbConnection(this);
	    hm=(Button)findViewById(R.id.cmdhome);
	    sv=(Button)findViewById(R.id.cmdsave);
	    tnm=(EditText)findViewById(R.id.txtnm);
	    tnum=(EditText)findViewById(R.id.txtnum);
	    sv.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {			
				nm=tnm.getText().toString();
				num=Integer.parseInt(tnum.getText().toString());
				dbcon.newrec(nm, num);
				tnm.setText("");
				tnum.setText("");
			}
		});
	   hm.setOnClickListener(new OnClickListener() {	
		@Override
		public void onClick(View v) {
			i=new Intent(InsertRecord.this, DbOperation.class);
			startActivity(i);
		}
	});
	}
}


