package com.example.dietp;

import com.example.dietp.database.DatabaseAdapter;
import com.example.dietp.database.User;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class DietResult extends ActionBarActivity {
	double userweight;
	double useridealweight ;
	double useridealcalory ;
	String[][] exportcalory;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diet_result);
		
		User user=new User();
		userweight = user.getWeight();
		useridealweight = user.getIdealweight();
		useridealcalory = user.getDailycalories();
		
		DatabaseAdapter dbadapter=dbadapter.getsingleuser();
		
		exportcalory=new String[7][1];
		
		if (useridealweight<userweight) {
			exportcalory=SlimmingDiet(useridealcalory);
			
		}
		
	}
	private String[][] SlimmingDiet(double useridealcalory) {
		int total=0;//
		String [][] totalexportcalory=new String[7][];
		int unit=0;
		int vegetables;
		int dairy;
		int fruit;
		int meat_bean_egg;
		int bread_cereals;
		int fat;
		int suger;
		
		return totalexportcalory;
	}
	
}
