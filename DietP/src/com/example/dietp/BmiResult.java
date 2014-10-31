package com.example.dietp;



import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;

public class BmiResult extends ActionBarActivity {
	int Bmivalue;
	String bmiInterpretation;
	Double idealweight;
	Double dailycalories;
	TextView showBmivalueresult;
	TextView showIdealweightresult;
	TextView showDailycaloryresult;
	TextView showBmiinterpretationresult;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bmi_result);
		
		Bmivalue=getIntent().getExtras().getInt("Bmivalue");
		bmiInterpretation=getIntent().getExtras().getString("bmiInterpretation");
		idealweight=getIntent().getExtras().getDouble("idealweight");
		dailycalories=getIntent().getExtras().getDouble("dailycalories");
		
		showBmivalueresult=(TextView) findViewById(R.id.showBmivalueresult);
		showIdealweightresult=(TextView) findViewById(R.id.showIdealweightresult);
		showDailycaloryresult=(TextView) findViewById(R.id.showDailycaloryresult);
		showBmiinterpretationresult=(TextView) findViewById(R.id.showBmiinterpretationresult);
		
		showBmivalueresult.setText(String.valueOf(Bmivalue));
		showBmiinterpretationresult.setText(bmiInterpretation);		
		showDailycaloryresult.setText(String.valueOf(dailycalories));
		showIdealweightresult.setText(String.valueOf(idealweight));


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bmi_result, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}



}
