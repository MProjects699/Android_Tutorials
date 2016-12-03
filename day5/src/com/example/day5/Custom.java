package com.example.day5;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class Custom extends BaseAdapter
{
	
	TextView name,detail;
	ImageView img;
	ArrayList<String> al1,al2;
	ArrayList<Integer> al3;
	Context context;
	
	public Custom(ArrayList<String> al1,ArrayList<String> al2,ArrayList<Integer> al3,Context context)
	{
		this.al1=al1;
		this.al2=al2;
		this.al3=al3;
		this.context=context;
	}

@Override
public int getCount() {
	// TODO Auto-generated method stub
	return  al1.size();
}
@Override
public Object getItem(int arg0) {
	
	return null;
}

public long getItemId(int arg0) {
	
	return 0;
}

public View getView(int i,View view,ViewGroup arg2)
{
	View v=view;
	if(v==null)
	{
		LayoutInflater li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		v=li.inflate(R.layout.activity_custom,null);
	}
	name = (TextView)v.findViewById(R.id.textView1);
	name.setText(al1.get(i));
	detail = (TextView)v.findViewById(R.id.textView2);
	detail.setText(al2.get(i));
	img  = (ImageView)v.findViewById(R.id.imageView1);
	img.setImageResource(al3.get(i));
	return v;
    }


}
