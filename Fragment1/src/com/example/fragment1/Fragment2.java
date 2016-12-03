package com.example.fragment1;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;

public class Fragment2 extends Activity {

	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
			
			//---Inflate the layout for this fragment--
			return inflater.inflate(
					R.layout.activity_fragment2, container, false);
		}
		}
	
	
	
	/*@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fragment2, menu);
		return true;
	}

}*/
