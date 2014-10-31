package com.example.dietp.database;

public class Foods {
	int foodid;
	String foodname;
	int breakfast;
	int lunch;
	int snack;
	int appetizers;
	int dinner;
	int mainfood;
	int secondary;
	
	

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public int getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(int breakfast) {
		this.breakfast = breakfast;
	}

	public int getLunch() {
		return lunch;
	}

	public void setLunch(int lunch) {
		this.lunch = lunch;
	}

	public int getSnack() {
		return snack;
	}

	public void setSnack(int snack) {
		this.snack = snack;
	}

	public int getAppetizers() {
		return appetizers;
	}

	public void setAppetizers(int appetizers) {
		this.appetizers = appetizers;
	}

	public int getDinner() {
		return dinner;
	}

	public void setDinner(int dinner) {
		this.dinner = dinner;
	}

	public int getMainfood() {
		return mainfood;
	}

	public void setMainfood(int mainfood) {
		this.mainfood = mainfood;
	}

	public int getSecondary() {
		return secondary;
	}

	public void setSecondary(int secondary) {
		this.secondary = secondary;
	}

	
//	constructor================================================================
	
	public Foods(){
		
	}
	
	public Foods(String foodname, int breakfast, int lunch, int snack,int appetizers,
		int dinner, int mainfood, int secondary) {
	super();
	this.foodname = foodname;
	this.breakfast = breakfast;
	this.lunch = lunch;
	this.snack = snack;
	this.appetizers=appetizers;
	this.dinner = dinner;
	this.mainfood = mainfood;
	this.secondary = secondary;

	}
	public Foods(int foodid, String foodname, int breakfast, int lunch,
		int snack,int appetizers, int dinner, int mainfood, int secondary) {
	super();
	this.foodid = foodid;
	this.foodname = foodname;
	this.breakfast = breakfast;
	this.lunch = lunch;
	this.snack = snack;
	this.appetizers=appetizers;
	this.dinner = dinner;
	this.mainfood = mainfood;
	this.secondary = secondary;

	}
}
