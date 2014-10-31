package com.example.dietp.database;

public class User {
	// user information ================================================
	
		int id;
		double height;
		double weight;
		int age;
		String gender;
		String pa;
	// user Bmi calculated information =================================
		
		int bmivalue;
		String bmiInterpretation;
		double idealweight;
		double dailycalories;
	// user requirement unit============================================
		
		float dairy;
		float vegetables;
		float fruit;
		float meat_bean_egg;
		float bread_cereals;
		float fat;
		float suger;
		
	// setter and getter ===============================================
		

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPa() {
			return pa;
		}
		public void setPa(String pa) {
			this.pa = pa;
		}
		public int getBmivalue() {
			return bmivalue;
		}
		public void setBmivalue(int bmivalue) {
			this.bmivalue = bmivalue;
		}
		public String getBmiInterpretation() {
			return bmiInterpretation;
		}
		public void setBmiInterpretation(String bmiInterpretation) {
			this.bmiInterpretation = bmiInterpretation;
		}
		public double getIdealweight() {
			return idealweight;
		}
		public void setIdealweight(double idealweight) {
			this.idealweight = idealweight;
		}
		public double getDailycalories() {
			return dailycalories;
		}
		public void setDailycalories(double dailycalories) {
			this.dailycalories = dailycalories;
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
	// constructor 	
		public User(){
			
		}
	public User(double height, double weight, int age, String gender, String pa,
			int bmivalue, String bmiInterpretation, double idealweight,
			double dailycalories, float dairy, float vegetables, float fruit,
			float meat_bean_egg, float bread_cereals, float fat, float suger) {
		super();
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
		this.pa = pa;
		this.bmivalue = bmivalue;
		this.bmiInterpretation = bmiInterpretation;
		this.idealweight = idealweight;
		this.dailycalories = dailycalories;
		this.dairy = dairy;
		this.vegetables = vegetables;
		this.fruit = fruit;
		this.meat_bean_egg = meat_bean_egg;
		this.bread_cereals = bread_cereals;
		this.fat = fat;
		this.suger = suger;
//		foreign key


	}
	public User(int userid, double height, double weight, int age, String gender,
			String pa, int bmivalue, String bmiInterpretation, double idealweight,
			double dailycalories, float dairy, float vegetables, float fruit,
			float meat_bean_egg, float bread_cereals, float fat, float suger,int eatenfood_id){
		this.id = userid;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
		this.pa = pa;
		this.bmivalue = bmivalue;
		this.bmiInterpretation = bmiInterpretation;
		this.idealweight = idealweight;
		this.dailycalories = dailycalories;
		this.dairy = dairy;
		this.vegetables = vegetables;
		this.fruit = fruit;
		this.meat_bean_egg = meat_bean_egg;
		this.bread_cereals = bread_cereals;
		this.fat = fat;
		this.suger = suger;

	}
}
