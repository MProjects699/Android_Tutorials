package com.example.urlmusic;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button btn;
	private boolean playPause;
	private MediaPlayer mediaPlayer;
	public boolean intialStage = true;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	    btn = (Button) findViewById(R.id.button1);
	    mediaPlayer = new MediaPlayer();
	    mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
	    btn.setOnClickListener(pausePlay);

	}
	private OnClickListener pausePlay = new OnClickListener() {

	    @Override
	    public void onClick(View v) {
	
	        if (!playPause) {
	            btn.setBackgroundResource(R.drawable.ic_launcher);
	            if (intialStage)
	                new Player()
	                        .execute("http://www.virginmegastore.me/Library/Music/CD_001214/Tracks/Track1.mp3");
	            else {
	                if (!mediaPlayer.isPlaying())
	                    mediaPlayer.start();
	            }
	            playPause = true;
	        } else {
	            btn.setBackgroundResource(R.drawable.ic_launcher);
	            if (mediaPlayer.isPlaying())
	                mediaPlayer.pause();
	            playPause = false;
	        }
	    }
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
