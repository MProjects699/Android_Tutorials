package com.example.app14;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.content.res.TypedArray;
import android.content.Context;

public class MainActivity extends Activity {

	//the image to display
	Integer[] img={R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Gallery gry=(Gallery) findViewById(R.id.gallery1);
		gry.setAdapter(new ImageAdapter(this));
		gry.setOnItemClickListener(new OnItemClickListener()
		{
			public void onItemClick(AdapterView parent, View v,
					int position, long id)
			{
				Toast.makeText(getBaseContext(), "pic"+(position+1)+"selected", 
						Toast.LENGTH_SHORT).show();
				
				//display the images selected
				ImageView imageView=(ImageView) findViewById(R.id.imageView1);
				imageView.setImageResource(img[position]);
				
			}
		});
		
	}
	
	public class ImageAdapter extends BaseAdapter
	{
		Context context;
		int itemBackground;
		
		public ImageAdapter(Context c)
		{
			context=c;
			//setting the style
			TypedArray a=obtainStyledAttributes(R.styleable.Gallery1);
			itemBackground=a.getResourceId(R.styleable.Gallery1_android_galleryItemBackground, 0);
			a.recycle();
		}
		
		//return the number of images
		public int getCount()
		{
			return img.length;
		}
		
		//return the items
		public Object getItem(int position)
		{
			return position;
		}
		
		//return the ID of an item
		public long getItemId(int position)
		{
			return position;
		}
		
		//return the ImageView view
		public View getView(int position, View convertView,
				ViewGroup parent)
		{
			ImageView imageView;
			if(convertView == null)
			{
				imageView = new ImageView(context);
				imageView.setImageResource(img[position]);
				imageView.setScaleType(ImageView.ScaleType.FIT_XY);
				imageView.setLayoutParams(new Gallery.LayoutParams(150,120));
			}
			else
			{
				imageView=(ImageView) convertView;
			}
			
			imageView.setBackgroundResource(itemBackground);
			return imageView;
		}
	}
}
