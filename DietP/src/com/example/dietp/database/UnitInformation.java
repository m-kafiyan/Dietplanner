package com.example.dietp.database;

public class UnitInformation {
	int unitinformationid;
	int dairy;
	int vegetables;
	int fruit;
	int meat_bean_egg;
	int bread_cereals;
	int fat;
	int suger;
	int carbohydrates;
	int proteins;
	int fats;
	int calorys;
	
	
//	constructor ===============================================
	
	public int getUnitinformationid() {
		return unitinformationid;
	}

	public void setUnitinformationid(int unitinformationid) {
		this.unitinformationid = unitinformationid;
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

	public int getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(int carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public int getProteins() {
		return proteins;
	}

	public void setProteins(int proteins) {
		this.proteins = proteins;
	}

	public int getFats() {
		return fats;
	}

	public void setFats(int fats) {
		this.fats = fats;
	}

	public int getCalorys() {
		return calorys;
	}

	public void setCalorys(int calorys) {
		this.calorys = calorys;
	}

	public UnitInformation(){
		
	}
	
	public UnitInformation(int dairy, int vegetables, int fruit,
			int meat_bean_egg, int bread_cereals, int fat,
			int suger, int carbohydrates, int proteins, int fats,
			int calorys) {
		super();
		this.dairy = dairy;
		this.vegetables = vegetables;
		this.fruit = fruit;
		this.meat_bean_egg = meat_bean_egg;
		this.bread_cereals = bread_cereals;
		this.fat = fat;
		this.suger = suger;
		this.carbohydrates = carbohydrates;
		this.proteins = proteins;
		this.fats = fats;
		this.calorys = calorys;
	}
	public UnitInformation(int unitinformationid, int dairy,
			int vegetables, int fruit, int meat_bean_egg,
			int bread_cereals, int fat, int suger,
			int carbohydrates, int proteins, int fats, int calorys) {
		super();
		this.unitinformationid = unitinformationid;
		this.dairy = dairy;
		this.vegetables = vegetables;
		this.fruit = fruit;
		this.meat_bean_egg = meat_bean_egg;
		this.bread_cereals = bread_cereals;
		this.fat = fat;
		this.suger = suger;
		this.carbohydrates = carbohydrates;
		this.proteins = proteins;
		this.fats = fats;
		this.calorys = calorys;

	}
	
	
}
