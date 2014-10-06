package database;

public class UserMealUnit {
	int mealid;
	boolean breakfast;
	boolean lunch;
	boolean snack;
	boolean appetizers;
	boolean dinner;
	float dairy;
	float vegetables;
	float fruit;
	float meat_bean_egg;
	float bread_cereals;
	float fat;
	float suger;
	int food_id;
	int user_id;
	
	
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getMealid() {
		return mealid;
	}
	public void setMealid(int mealid) {
		this.mealid = mealid;
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
	public boolean isAppetizers() {
		return appetizers;
	}
	public void setAppetizers(boolean appetizers) {
		this.appetizers = appetizers;
	}
	public boolean isDinner() {
		return dinner;
	}
	public void setDinner(boolean dinner) {
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
	
//constructor ================================================================

	public UserMealUnit(){
		
	}
	
	public UserMealUnit(boolean breakfast, boolean lunch, boolean snack,
			boolean appetizers, boolean dinner, float dairy, float vegetables,
			float fruit, float meat_bean_egg, float bread_cereals, float fat,
			float suger,int food_id,int user_id) {
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
		this.food_id=food_id;
		this.user_id=user_id;
	}
	public UserMealUnit(int mealid, boolean breakfast, boolean lunch,
			boolean snack, boolean appetizers, boolean dinner, float dairy,
			float vegetables, float fruit, float meat_bean_egg,
			float bread_cereals, float fat, float suger,int food_id,int user_id) {
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
		this.food_id=food_id;
		this.user_id=user_id;
	}
	
	
}
