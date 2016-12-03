package com.example.sirvala;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.*;

import java.util.*;

import com.example.day5.R;

public class Second extends BaseAdapter {

     TextView txt;
     Button dlt;
     Context context;
     ArrayList<String>al;
     
     public Second(ArrayList<String>al,Context context)
     {
    this.al=al;
    this.context=context;
     }
     

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return al.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int i, View view, ViewGroup arg2) {
		
		View v=view;
		
		if(v==null)
		{
			LayoutInflater li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v=li.inflate(R.layout.activity_second,null);
		}
  txt=(TextView)v.findViewById(R.id.textView1);
  txt.setText(al.get(i));
  dlt=(Button)v.findViewById(R.id.btn);
  notifyDatasetChange();
  
		
		// TODO Auto-generated method stub
		return v;
	}

}
