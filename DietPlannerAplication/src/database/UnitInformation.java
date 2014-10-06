package database;

public class UnitInformation {
	int unitinformationid;
	boolean dairy;
	boolean vegetables;
	boolean fruit;
	boolean meat_bean_egg;
	boolean bread_cereals;
	boolean fat;
	boolean suger;
	int carbohydrates;
	int proteins;
	int fats;
	int calorys;
	int user_id;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getUnitinformationid() {
		return unitinformationid;
	}
	public void setUnitinformationid(int unitinformationid) {
		this.unitinformationid = unitinformationid;
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

	
//	constructor ===============================================
	
	public UnitInformation(){
		
	}
	
	public UnitInformation(boolean dairy, boolean vegetables, boolean fruit,
			boolean meat_bean_egg, boolean bread_cereals, boolean fat,
			boolean suger, int carbohydrates, int proteins, int fats,
			int calorys,int user_id) {
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
		this.user_id=user_id;
	}
	public UnitInformation(int unitinformationid, boolean dairy,
			boolean vegetables, boolean fruit, boolean meat_bean_egg,
			boolean bread_cereals, boolean fat, boolean suger,
			int carbohydrates, int proteins, int fats, int calorys,int user_id) {
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
		this.user_id=user_id;
	}
	
	
}
