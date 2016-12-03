package com.a.a;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class UpdateRecord extends Activity {
	SQLiteDatabase db;
	DbConnection dbcon;
	List<String> nm;
	//Spinner spList;
	ListView lv;
	TextView tv;
	String strId;
	String val,val1,oval;
	Intent i;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);	
	    setContentView(R.layout.delrec);
	    tv=(TextView)findViewById(R.id.txt1);
	    lv=(ListView)findViewById(R.id.lv1);
	    dbcon=new DbConnection(this);
	     nm = new ArrayList<String>();
	    nm=dbcon.selectAll(this);
	    ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, nm);
	lv.setAdapter(adapter); 	
	
	
	
	
	lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				String item=arg0.getItemAtPosition(arg2).toString();
				int n=item.indexOf(' ');
			 val=item.substring(0,n);
			 val1=item.substring(n+1);
				i=new Intent(UpdateRecord.this, updform.class);
				i.putExtra("name",val);
				i.putExtra("num", val1);
				startActivity(i);				
			}
		});	
	}
}
