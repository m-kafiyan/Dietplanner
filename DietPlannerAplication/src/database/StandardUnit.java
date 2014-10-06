package database;

public class StandardUnit {
	int unitid;
	float unitratio;
	String unit;
	String foodname;
	float calory;
	float foodweight;
	boolean dairy;
	boolean vegetables;
	boolean fruit;
	boolean meat_bean_egg;
	boolean bread_cereals;
	boolean fat;
	boolean suger;
	int ratio_id;
	
	public int getRatio_id() {
		return ratio_id;
	}
	public void setRatio_id(int ratio_id) {
		this.ratio_id = ratio_id;
	}
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
	
// constructor================================================================
	public StandardUnit(){
		
	}
public StandardUnit(float unitratio, String unit, String foodname,
		float calory, float foodweight, boolean dairy, boolean vegetables,
		boolean fruit, boolean meat_bean_egg, boolean bread_cereals,
		boolean fat, boolean suger,int ratio_id) {
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
	this.ratio_id=ratio_id;
}
public StandardUnit(int unitid, float unitratio, String unit, String foodname,
		float calory, float foodweight, boolean dairy, boolean vegetables,
		boolean fruit, boolean meat_bean_egg, boolean bread_cereals,
		boolean fat, boolean suger,int ratio_id) {
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
	this.ratio_id=ratio_id;
}
	
	
	
}
