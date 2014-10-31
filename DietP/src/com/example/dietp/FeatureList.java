package com.example.dietp;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class FeatureList extends ActionBarActivity {
	

	Button bmiinformation;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feature_list);
		bmiinformation = (Button) findViewById(R.id.Bmicalculater);
		bmiinformation.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent =new Intent(FeatureList.this,BmiCalculaterPage.class);
				startActivity(intent);
				finish();
				
			}
		});
		
	}

}
