package com.example.dietp.database;

public class StandardUnit {
	int unitid;
	float unitratio;
	String unit;
	String foodname;
	float calory;
	float foodweight;
	int dairy;
	int vegetables;
	int fruit;
	int meat_bean_egg;
	int bread_cereals;
	int fat;
	int suger;
	
	
public int getUnitid() {
		return unitid;
	}
	public void setUnitid(int unitid) {
		this.unitid = unitid;
	}
	public float getUnitratio() {
		return unitratio;
	}
	public void setUnitratio(float unitratio) {
		this.unitratio = unitratio;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public float getCalory() {
		return calory;
	}
	public void setCalory(float calory) {
		this.calory = calory;
	}
	public float getFoodweight() {
		return foodweight;
	}
	public void setFoodweight(float foodweight) {
		this.foodweight = foodweight;
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
	// constructor================================================================
	public StandardUnit(){
		
	}
public StandardUnit(float unitratio, String unit, String foodname,
		float calory, float foodweight, int dairy, int vegetables,
		int fruit, int meat_bean_egg, int bread_cereals,
		int fat, int suger) {
	super();
	this.unitratio = unitratio;
	this.unit = unit;
	this.foodname = foodname;
	this.calory = calory;
	this.foodweight = foodweight;
	this.dairy = dairy;
	this.vegetables = vegetables;
	this.fruit = fruit;
	this.meat_bean_egg = meat_bean_egg;
	this.bread_cereals = bread_cereals;
	this.fat = fat;
	this.suger = suger;
}
public StandardUnit(int unitid, float unitratio, String unit, String foodname,
		float calory, float foodweight, int dairy, int vegetables,
		int fruit, int meat_bean_egg, int bread_cereals,
		int fat, int suger) {
	super();
	this.unitid = unitid;
	this.unitratio = unitratio;
	this.unit = unit;
	this.foodname = foodname;
	this.calory = calory;
	this.foodweight = foodweight;
	this.dairy = dairy;
	this.vegetables = vegetables;
	this.fruit = fruit;
	this.meat_bean_egg = meat_bean_egg;
	this.bread_cereals = bread_cereals;
	this.fat = fat;
	this.suger = suger;

}
	
	
	
}
