package com.example.Adlstvw;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.view.View.OnClickListener;

import android.widget.*;
import java.util.ArrayList;
import android.content.*;

public class Second extends BaseAdapter {
	
	TextView tv1;
	Button btn1;
	Context ct;
	ArrayList<String> al1;
	//ArrayList<Integer> al2;
	
	public Second(ArrayList<String> al1,Context ct)
	{
		this.al1=al1;
		//this.al2=al2;
		this.ct=ct;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return al1.size();
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
			LayoutInflater li = (LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v=li.inflate(R.layout.activity_second,null);
		}
		tv1= (TextView)v.findViewById(R.id.textView1);
		tv1.setText(al1.get(i));
		btn1= (Button)v.findViewById(R.id.button1);
		
		
		btn1.setOnClickListener(new OnClickListener() {
			
			final int var=0;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				al1.remove(var);
				notifyDataSetChanged();
			
		}
		});
    	
		// TODO Auto-generated method stub
		return v;
	}
	
	}
	
	


