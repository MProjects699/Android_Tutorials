package com.example.app5;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.net.*;
import android.webkit.*;

public class Second extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		Uri url=getIntent().getData();
		WebView wv=(WebView) findViewById(R.id.view1);
		wv.setWebViewClient(new Callback());
		wv.loadUrl(url.toString());
		
	}
	
	private class Callback extends WebViewClient
	{
		public boolean shouldOverrideUrlLoading(WebView view, String url)
		{
			return(false);
		}
	}

	}
