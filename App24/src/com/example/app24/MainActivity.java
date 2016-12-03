package com.example.app24;

import java.util.List;

import android.os.Bundle;
import android.app.*;
import android.content.Context;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ListView lst=(ListView) findViewById(R.id.listView1);
		MyAdapter ad=new MyAdapter(this, android.R.layout.simple_list_item_1, R.id.textView1,
			getResources().getStringArray(R.array.countries));	
		lst.setAdapter(ad);
		
	}
	
	private class MyAdapter extends ArrayAdapter<String>
	{

		public MyAdapter(Context context, int resource, int textViewResourceId,
				String[] strings) {
			super(context, resource, textViewResourceId, strings);
			// TODO Auto-generated constructor stub
		}
		
		public View getView(int position, View convertView, ViewGroup parent)
		{
			LayoutInflater li=(LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View row=li.inflate(R.layout.list_item, parent, false);
			String[] items=getResources().getStringArray(R.array.countries);
			
			ImageView iv=(ImageView) row.findViewById(R.id.imageView1);
			TextView tv=(TextView) row.findViewById(R.id.textView1);
			
			tv.setText(items[position]);
			
			if(items[position].equals("India"))
			{
				iv.setImageResource(R.drawable.ic_launcher);
			}
			
			else if(items[position].equals("Japan"))
			{
				iv.setImageResource(R.drawable.ic_launcher);
			}
			
			else if(items[position].equals("United States"))
			{
				iv.setImageResource(R.drawable.ic_launcher);
			}
			
			else if(items[position].equals("South Africa"))
			{
				iv.setImageResource(R.drawable.ic_launcher);
			}
			
			else if(items[position].equals("England"))
			{
				iv.setImageResource(R.drawable.ic_launcher);
			}
			
			else if(items[position].equals("Pakistan"))
			{
				iv.setImageResource(R.drawable.ic_launcher);
			}
			
			else if(items[position].equals("Australia"))
			{
				iv.setImageResource(R.drawable.ic_launcher);
			}
			
			return row;
		}
	
}
}