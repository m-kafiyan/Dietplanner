package com.example.dietp.database;

public class UserMealUnit {
	int mealid;
	int breakfast;
	int lunch;
	int snack;
	int appetizers;
	int dinner;
	float dairy;
	float vegetables;
	float fruit;
	float meat_bean_egg;
	float bread_cereals;
	float fat;
	float suger;

	
	
//constructor ================================================================

	public int getMealid() {
		return mealid;
	}

	public void setMealid(int mealid) {
		this.mealid = mealid;
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

	public float getDairy() {
		return dairy;
	}

	public void setDairy(float dairy) {
		this.dairy = dairy;
	}

	public float getVegetables() {
		return vegetables;
	}

	public void setVegetables(float vegetables) {
		this.vegetables = vegetables;
	}

	public float getFruit() {
		return fruit;
	}

	public void setFruit(float fruit) {
		this.fruit = fruit;
	}

	public float getMeat_bean_egg() {
		return meat_bean_egg;
	}

	public void setMeat_bean_egg(float meat_bean_egg) {
		this.meat_bean_egg = meat_bean_egg;
	}

	public float getBread_cereals() {
		return bread_cereals;
	}

	public void setBread_cereals(float bread_cereals) {
		this.bread_cereals = bread_cereals;
	}

	public float getFat() {
		return fat;
	}

	public void setFat(float fat) {
		this.fat = fat;
	}

	public float getSuger() {
		return suger;
	}

	public void setSuger(float suger) {
		this.suger = suger;
	}

	public UserMealUnit(){
		
	}
	
	public UserMealUnit(int breakfast, int lunch, int snack,
			int appetizers, int dinner, float dairy, float vegetables,
			float fruit, float meat_bean_egg, float bread_cereals, float fat,
			float suger) {
		super();
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.snack = snack;
		this.appetizers = appetizers;
		this.dinner = dinner;
		this.dairy = dairy;
		this.vegetables = vegetables;
		this.fruit = fruit;
		this.meat_bean_egg = meat_bean_egg;
		this.bread_cereals = bread_cereals;
		this.fat = fat;
		this.suger = suger;
	}
	public UserMealUnit(int mealid, int breakfast, int lunch,
			int snack, int appetizers, int dinner, float dairy,
			float vegetables, float fruit, float meat_bean_egg,
			float bread_cereals, float fat, float suger) {
		super();
		this.mealid = mealid;
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.snack = snack;
		this.appetizers = appetizers;
		this.dinner = dinner;
		this.dairy = dairy;
		this.vegetables = vegetables;
		this.fruit = fruit;
		this.meat_bean_egg = meat_bean_egg;
		this.bread_cereals = bread_cereals;
		this.fat = fat;
		this.suger = suger;

	}
	
	
}
