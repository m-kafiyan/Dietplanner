package database;

public class Foods {
	int foodid;
	String foodname;
	boolean breakfast;
	boolean lunch;
	boolean snack;
	boolean appetizers;
	boolean dinner;
	boolean mainfood;
	boolean secondary;
	int eatenfood_id;
	int ratio_id;
	int meal_id;
	
	
	public boolean isAppetizers() {
		return appetizers;
	}
	public void setAppetizers(boolean appetizers) {
		this.appetizers = appetizers;
	}
	public int getEatenfood_id() {
		return eatenfood_id;
	}
	public void setEatenfood_id(int eatenfood_id) {
		this.eatenfood_id = eatenfood_id;
	}
	public int getRatio_id() {
		return ratio_id;
	}
	public void setRatio_id(int ratio_id) {
		this.ratio_id = ratio_id;
	}
	public int getMeal_id() {
		return meal_id;
	}
	public void setMeal_id(int meal_id) {
		this.meal_id = meal_id;
	}
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
	public boolean isMainfood() {
		return mainfood;
	}
	public void setMainfood(boolean mainfood) {
		this.mainfood = mainfood;
	}
	public boolean isSecondary() {
		return secondary;
	}
	public void setSecondary(boolean secondary) {
		this.secondary = secondary;
	}
	
//	constructor================================================================
	
	public Foods(){
		
	}
	
	public Foods(String foodname, boolean breakfast, boolean lunch, boolean snack,boolean appetizers,
		boolean dinner, boolean mainfood, boolean secondary,int eatenfood_id,int ratio_id,int meal_id) {
	super();
	this.foodname = foodname;
	this.breakfast = breakfast;
	this.lunch = lunch;
	this.snack = snack;
	this.appetizers=appetizers;
	this.dinner = dinner;
	this.mainfood = mainfood;
	this.secondary = secondary;
	this.eatenfood_id=eatenfood_id;
	this.ratio_id=ratio_id;
	this.meal_id=meal_id;
	}
	public Foods(int foodid, String foodname, boolean breakfast, boolean lunch,
		boolean snack,boolean appetizers, boolean dinner, boolean mainfood, boolean secondary,int eatenfood_id,int ratio_id,int meal_id) {
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
	this.eatenfood_id=eatenfood_id;
	this.ratio_id=ratio_id;
	this.meal_id=meal_id;
	}
}
