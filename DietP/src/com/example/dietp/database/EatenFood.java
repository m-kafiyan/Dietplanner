package com.example.dietp.database;

import android.provider.ContactsContract.Contacts.Data;

public class EatenFood {
	
	int eatenfoodid;
	int breakfast;
	int lunch;
	int snack;
	int appetizers;
	int dinner;
	Data day;
	String equivalent;
	int dairy;
	int vegetables;
	int fruit;
	int meat_bean_egg;
	int bread_cereals;
	int fat;
	int suger;
	int unitsum;
	int food_id;

	
	
	
public int getEatenfoodid() {
		return eatenfoodid;
	}
	public void setEatenfoodid(int eatenfoodid) {
		this.eatenfoodid = eatenfoodid;
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
	public Data getDay() {
		return day;
	}
	public void setDay(Data day) {
		this.day = day;
	}
	public String getEquivalent() {
		return equivalent;
	}
	public void setEquivalent(String equivalent) {
		this.equivalent = equivalent;
	}
	public int getDairy() {
		return dairy;
	}
	public void setDairy(int dairy) {
		this.dairy = dairy;
	}
	public int getVegetables() {
		return vegetables;
	}
	public void setVegetables(int vegetables) {
		this.vegetables = vegetables;
	}
	public int getFruit() {
		return fruit;
	}
	public void setFruit(int fruit) {
		this.fruit = fruit;
	}
	public int getMeat_bean_egg() {
		return meat_bean_egg;
	}
	public void setMeat_bean_egg(int meat_bean_egg) {
		this.meat_bean_egg = meat_bean_egg;
	}
	public int getBread_cereals() {
		return bread_cereals;
	}
	public void setBread_cereals(int bread_cereals) {
		this.bread_cereals = bread_cereals;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getSuger() {
		return suger;
	}
	public void setSuger(int suger) {
		this.suger = suger;
	}
	public int getUnitsum() {
		return unitsum;
	}
	public void setUnitsum(int unitsum) {
		this.unitsum = unitsum;
	}
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	//	constructor ====================================================
	public EatenFood(){
		
	}
public EatenFood(int breakfast, int lunch, int snack,
		int appetizers, int dinner, Data day, String equivalent,
		int dairy, int vegetables, int fruit,
		int meat_bean_egg, int bread_cereals, int fat,
		int suger, int unitsum, int food_id) {
	super();
	this.breakfast = breakfast;
	this.lunch = lunch;
	this.snack = snack;
	this.appetizers = appetizers;
	this.dinner = dinner;
	this.day = day;
	this.equivalent = equivalent;
	this.dairy = dairy;
	this.vegetables = vegetables;
	this.fruit = fruit;
	this.meat_bean_egg = meat_bean_egg;
	this.bread_cereals = bread_cereals;
	this.fat = fat;
	this.suger = suger;
	this.unitsum = unitsum;
	this.food_id = food_id;

}
public EatenFood(int eatenfoodid, int breakfast, int lunch,
		int snack, int appetizers, int dinner, Data day,
		String equivalent, int dairy, int vegetables, int fruit,
		int meat_bean_egg, int bread_cereals, int fat,
		int suger, int unitsum, int food_id) {
	super();
	this.eatenfoodid = eatenfoodid;
	this.breakfast = breakfast;
	this.lunch = lunch;
	this.snack = snack;
	this.appetizers = appetizers;
	this.dinner = dinner;
	this.day = day;
	this.equivalent = equivalent;
	this.dairy = dairy;
	this.vegetables = vegetables;
	this.fruit = fruit;
	this.meat_bean_egg = meat_bean_egg;
	this.bread_cereals = bread_cereals;
	this.fat = fat;
	this.suger = suger;
	this.unitsum = unitsum;
	this.food_id = food_id;

}
	

}
