package com.example.dietp;




import java.text.DecimalFormat;

import com.example.dietp.database.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class BmiCalculaterPage extends ActionBarActivity  {
	String gender;
	RadioButton maleRadioButton;
	RadioButton femaleRadioButton;
	Button saveinformation ;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bmi_calculater_page);
		maleRadioButton=(RadioButton) findViewById(R.id.maleselected);
		femaleRadioButton=(RadioButton) findViewById(R.id.femaleselected);
		
		final RadioGroup genderselected=(RadioGroup) findViewById(R.id.selectgender);
		genderselected.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int selectedId) {
				// TODO Auto-generated method stub
				selectedId=genderselected.getCheckedRadioButtonId();
				RadioButton genderchoosed = (RadioButton) findViewById(selectedId);
				gender= genderchoosed.getText().toString();
				
			}
		});
		saveinformation = (Button) findViewById(R.id.saveinformation);
		saveinformation.setOnClickListener(new View.OnClickListener() {
			
			EditText heighttext=(EditText) findViewById(R.id.heighttext);
			EditText weighttext=(EditText) findViewById(R.id.weighttext);
			EditText agetext=(EditText) findViewById(R.id.agetext);
			Spinner activitytext=(Spinner) findViewById(R.id.chooseactivity);
			Button saveinformation=(Button) findViewById(R.id.saveinformation);
			
			String pa=activitytext.getSelectedItem().toString();
			
			
			@Override
			public void onClick(View v) {
				if(maleRadioButton.isChecked()) {
					gender= maleRadioButton.getText().toString();
				} else {
					gender = femaleRadioButton.getText().toString();
				}
				
				int weight = (int) Float.parseFloat(weighttext.getText().toString());
				float height =  Float.parseFloat(heighttext.getText().toString());
				int age = (int) Float.parseFloat(agetext.getText().toString());
				String pa = activitytext.getSelectedItem().toString();
				
				//  CALCULATING PART ===============================================================
				
				int Bmivalue = calculateBMI(weight, height);
				String bmiInterpretation = interpretBMI(Bmivalue);
				double idealweight =idealweight(weight, height, gender, pa, age);
				double dailycalories=dailycalories(weight,height,gender,pa,age);
				
				//INSERT TO DATABASE ===============================================================
				
				User user=new User();
				user.setHeight(height);
				user.setWeight(weight);
				user.setAge(age);
				user.setGender(gender);
				user.setPa(pa);
				user.setBmivalue(Bmivalue);
				user.setBmiInterpretation(bmiInterpretation);
				user.setIdealweight(idealweight);
				user.setDailycalories(dailycalories);
				
				com.example.dietp.database.DatabaseAdapter dbAdapter = new com.example.dietp.database.DatabaseAdapter(BmiCalculaterPage.this);
				dbAdapter.insertUser(user);
				
				 
				Intent intent= new Intent(getApplicationContext(),BmiResult.class);
				intent.putExtra("Bmivalue", Bmivalue);
				intent.putExtra("bmiInterpretation", bmiInterpretation);
				intent.putExtra("idealweight", idealweight);
				intent.putExtra("dailycalories", dailycalories);
				
				
				startActivity(intent);
				
				
				
			}
		});

	}	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.bmi_calculater_page, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
        case R.id.action_back:
            Intent intent=new Intent(getApplicationContext(),FeatureList.class);
            startActivity(intent);
            break;
            case R.id.action_help:
            	Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT)
                .show();
            return true;
        
        default:
        	break;
            
	}
		return super.onOptionsItemSelected(item);

	}


private int calculateBMI(int weight, float height) {

	return (int) (weight / (height * height));
};

private String interpretBMI(int Bmivalue) {

	if (Bmivalue <= 18.5) {
		return "لاغر";
	} else if (18.5 < Bmivalue && Bmivalue <= 25) {
		return "نرمال";
	} else if (25 < Bmivalue && Bmivalue <= 30) {
		return "اضافه وزن";
	} else if (30 < Bmivalue && Bmivalue <= 35) {
		return "چاقی متوسط ";
	}
	 else if (35 < Bmivalue && Bmivalue <= 40) {
			return "چاقی زیاد";
		} 
	else {
		return "Obese";
	}
}

//IDEAL WEIGHT CALCULATOR ==================================================================

private double idealweight(int weight, float height, String gender, String pa,
		int age) {
	Double x = (double) 0;
	float idealw=(float) 0.0;
	
	int bmi;

	bmi = idealbmi(age);
	idealw = bmi * (height * height);
	x=Double.parseDouble(new DecimalFormat("####.#").format(idealw));
	return x;
}
public int idealbmi(int age) {
	int bmi = 0;
	if (age >= 17 && age <= 19) {
		bmi = 21;
	}
	if (age > 19 && age <= 24) {
		bmi = 22;
	}
	if (age > 24 && age <= 34) {
		bmi = 23;
	}
	if (age > 34 && age <= 44) {
		bmi = 24;
	}
	if (age > 44 && age <= 54) {
		bmi = 25;
	}
	if (age > 54 && age <= 64) {
		bmi = 26;
	}
	if (age > 64) {
		bmi = 27;
	}

	return bmi;
}

//DAILY CALORIES ==========================================================================

public double suitablepa(String pa) {
	double suitablepa = 0;
	if (pa.equals("پرتحرک")) {
		suitablepa =  1.48;
	}
	if (pa.equals("فعال")) {
		suitablepa =  1.25;
	}
	if (pa.equals("کم فعالیت")) {
		suitablepa =  1.11;
	}
	if (pa.equals("بدون فعالیت")) {
		suitablepa =  1;
	}
	return suitablepa;

}

private double dailycalories(int weight, float height, String gender,
		String pa, int age) {
	double dailycalori = 0;
	double i=0;
	double j=0;
	double h=0;
	double k=0;
	
	if(gender.equals("زن")){
		
		i=9.36*weight;
		j=726*height;
		h=suitablepa(pa)*(i+j);
		k=6.91*age;
		dailycalori=354-k+h;
		
	}else if(gender.equals("مرد")){
		
		i=15.91*weight;
		j=539.6*height;
		h=suitablepa(pa)*(i+j);
		k=9.53*age;
		dailycalori=662-k+h;
	}
	
	dailycalori=Double.parseDouble(new DecimalFormat("####.#").format(dailycalori));
	
	return dailycalori;
}
}

