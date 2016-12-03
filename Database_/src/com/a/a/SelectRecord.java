package com.a.a;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class SelectRecord extends ListActivity {
	DbConnection dbcon;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    dbcon=new DbConnection(this);
	    List<String> nm = new ArrayList<String>();
	    nm=dbcon.selectAll(this);
	    ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, nm);
	getListView().setAdapter(adapter);
	}
}
