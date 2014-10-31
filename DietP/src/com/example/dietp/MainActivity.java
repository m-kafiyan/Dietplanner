package com.example.dietp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

public class MainActivity extends ActionBarActivity implements
		AnimationListener {
	RelativeLayout screen;
	int i;
	Intent intent;
	Animation animFadeout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		screen = (RelativeLayout) findViewById(R.id.firstpage);
		animFadeout=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out );
		animFadeout.setAnimationListener(MainActivity.this);
		
		screen.post(new Runnable() {

	        @Override
	        public void run() {
	            screen.startAnimation(animFadeout); 
	            animFadeout.setFillAfter(true);
	        }
	    });	


	}

	@Override
	public void onAnimationEnd(Animation anim) {
		startActivity(new Intent(getApplicationContext(), FeatureList.class));
		overridePendingTransition(android.R.anim.fade_in,
				android.R.anim.fade_out);
		finish();

	}

	@Override
	public void onAnimationRepeat(Animation arg0) {

	}

	@Override
	public void onAnimationStart(Animation arg0) {

	}
}
