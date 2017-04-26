package com.app.techmnfc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


class Splash extends Activity{
	public static int SPLASH_DURATION=5000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		Handler handle = new Handler();
		handle.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				finish();
				Intent i =new Intent(Splash.this,MainActivity.class);
				Splash.this.startActivity(i);
				finish();
				
			}
		}, SPLASH_DURATION);
		
	}
	
}