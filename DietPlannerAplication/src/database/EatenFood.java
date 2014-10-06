package database;

import android.provider.ContactsContract.Contacts.Data;

public class EatenFood {
	
	int eatenfoodid;
	boolean breakfast;
	boolean lunch;
	boolean snack;
	boolean appetizers;
	boolean dinner;
	Data day;
	String equivalent;
	boolean dairy;
	boolean vegetables;
	boolean fruit;
	boolean meat_bean_egg;
	boolean bread_cereals;
	boolean fat;
	boolean suger;
	double unitsum;
	int food_id;
	int ratio_id;
	
	
	
	public boolean isAppetizers() {
		return appetizers;
	}
	public void setAppetizers(boolean appetizers) {
		this.appetizers = appetizers;
	}
	public Data getDay() {
		return day;
	}
	public void setDay(Data day) {
		this.day = day;
	}
	public double getUnitsum() {
		return unitsum;
	}
	public void setUnitsum(double unitsum) {
		this.unitsum = unitsum;
	}
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	public int getRatio_id() {
		return ratio_id;
	}
	public void setRatio_id(int ratio_id) {
		this.ratio_id = ratio_id;
	}
	public int getEatenfoodid() {
		return eatenfoodid;
	}
	public void setEatenfoodid(int eatenfoodid) {
		this.eatenfoodid = eatenfoodid;
	}
	public boolean isBreakfast() {
		return breakfast;
	}
	public void setBreakfast(boolean breakfast) {
		this.breakfast = breakfast;
	}
	public boolean isLunch() {
		return lunch;
	}
	public void setLunch(boolean lunch) {
		this.lunch = lunch;
	}
	public boolean isSnack() {
		return snack;
	}
	public void setSnack(boolean snack) {
		this.snack = snack;
	}
	public boolean isDinner() {
		return dinner;
	}
	public void setDinner(boolean dinner) {
		this.dinner = dinner;
	}
	public String getEquivalent() {
		return equivalent;
	}
	public void setEquivalent(String equivalent) {
		this.equivalent = equivalent;
	}
	public boolean isDairy() {
		return dairy;
	}
	public void setDairy(boolean dairy) {
		this.dairy = dairy;
	}
	public boolean isVegetables() {
		return vegetables;
	}
	public void setVegetables(boolean vegetables) {
		this.vegetables = vegetables;
	}
	public boolean isFruit() {
		return fruit;
	}
	public void setFruit(boolean fruit) {
		this.fruit = fruit;
	}
	public boolean isMeat_bean_egg() {
		return meat_bean_egg;
	}
	public void setMeat_bean_egg(boolean meat_bean_egg) {
		this.meat_bean_egg = meat_bean_egg;
	}
	public boolean isBread_cereals() {
		return bread_cereals;
	}
	public void setBread_cereals(boolean bread_cereals) {
		this.bread_cereals = bread_cereals;
	}
	public boolean isFat() {
		return fat;
	}
	public void setFat(boolean fat) {
		this.fat = fat;
	}
	public boolean isSuger() {
		return suger;
	}
	public void setSuger(boolean suger) {
		this.suger = suger;
	}

//	constructor ====================================================
	public EatenFood(){
		
	}
public EatenFood(boolean breakfast, boolean lunch, boolean snack,
		boolean appetizers, boolean dinner, Data day, String equivalent,
		boolean dairy, boolean vegetables, boolean fruit,
		boolean meat_bean_egg, boolean bread_cereals, boolean fat,
		boolean suger, double unitsum, int food_id, int ratio_id) {
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
	this.ratio_id = ratio_id;
}
public EatenFood(int eatenfoodid, boolean breakfast, boolean lunch,
		boolean snack, boolean appetizers, boolean dinner, Data day,
		String equivalent, boolean dairy, boolean vegetables, boolean fruit,
		boolean meat_bean_egg, boolean bread_cereals, boolean fat,
		boolean suger, double unitsum, int food_id, int ratio_id) {
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
	this.ratio_id = ratio_id;
}
	

}
