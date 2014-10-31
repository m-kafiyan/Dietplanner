package com.example.dietp.database;

public class StandardFoodsUnit {

	int ratioid;
	float ratio;
	int food_id;
	int unit_id;
	
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	public int getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}
	public int getRatioid() {
		return ratioid;
	}
	public void setRatioid(int ratioid) {
		this.ratioid = ratioid;
	}
	public float getRatio() {
		return ratio;
	}
	public void setRatio(float ratio) {
		this.ratio = ratio;
	}

//	constructor========================================================
	
	public StandardFoodsUnit(){
		
	}
	
	public StandardFoodsUnit(float ratio,int food_id,int unit_id) {
	super();
	this.ratio = ratio;
	this.food_id=food_id;
	this.unit_id=unit_id;
	}
	public StandardFoodsUnit(int ratioid, float ratio,int food_id,int unit_id) {
	super();
	this.ratioid = ratioid;
	this.ratio = ratio;
	this.food_id=food_id;
	this.unit_id=unit_id;
	}
	
}
