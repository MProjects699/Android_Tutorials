package com.example.app15;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import android.content.*;

public class MainActivity extends Activity {
	
	GridView gv;

	Integer[] img={R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		gv=(GridView) findViewById(R.id.gridView1);
		gv.setAdapter(new ImageAdapter(this));
		
		gv.setOnItemClickListener(new OnItemClickListener()
		{
			public void onItemClick(AdapterView parent, View v, 
					int position, long id)
			{
				Toast.makeText(getBaseContext(), "pic"+(position+1)+"selected", 
						Toast.LENGTH_SHORT).show();
			}
		});
		
	}
	
	public class ImageAdapter extends BaseAdapter
	{
		private Context context;
		
		public ImageAdapter(Context c)
		{
			context=c;
		}
		
		//return the number of images
		public int getCount()
		{
			return img.length;
		}
		
		//returns the item
		public Object getItem(int position)
		{
			return position;
			
		}
		
		//return the ID of an item
		public long getItemId(int position)
		{
			return position;
		}
		
		//returns an ImageView view
		public View getView(int position, View convertView,
				ViewGroup parent)
		{
			ImageView imageView;
			if(convertView == null)
			{
				imageView=new ImageView(context);
				imageView.setLayoutParams(new GridView.LayoutParams(85,85));
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setPadding(5, 5, 5, 5);
			}
			else
			{
				imageView=(ImageView) convertView;
			}
			
			imageView.setImageResource(img[position]);
			return imageView;
		}

		
	}
}
