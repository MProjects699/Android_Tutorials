package com.a.a;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class DbOperation extends ListActivity {

	DbConnection dbcon;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    dbcon=new DbConnection(this);
	    String[] items={"Select", "Insert", "Update", "Delete"};
	    ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        getListView().setAdapter(adapter);
        
        
        getListView().setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				String item=arg0.getItemAtPosition(arg2).toString();
				Intent i=new Intent();
				if(item.equals("Select"))
				{
					i.setClass(DbOperation.this, SelectRecord.class);
					startActivity(i);
				}
				else if(item.equals("Insert"))
				{
					i.setClass(DbOperation.this, InsertRecord.class);
					startActivity(i);					
				}
				else if(item.equals("Update"))
				{
					i.setClass(DbOperation.this, UpdateRecord.class);
					startActivity(i);
				}
				else if(item.equals("Delete"))
				{
					i.setClass(DbOperation.this, DeleteRecord.class);
					startActivity(i);
				}
				
			}
		});

	}

}

