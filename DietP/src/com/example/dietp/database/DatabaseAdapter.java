package com.example.dietp.database;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseAdapter {

	private final String TAG = "DatabaseAdapter";
	private DatabaseOpenHelper openHelper;

	// for User table ==================================================

	public static final String TABLE_USER = "User";
	public static final String TABLE_USER_ID = "_id";
	public static final String TABLE_USER_HEIGHT = "_height";
	public static final String TABLE_USER_WEIGHT = "_weight";
	public static final String TABLE_USER_AGE = "_age";
	public static final String TABLE_USER_GENDER = "_gender";
	public static final String TABLE_USER_PA = "_pa";
	public static final String TABLE_USER_BMIVALUE = "_bmivalue";
	public static final String TABLE_USER_BMIINTERPRETATION = "_bmiInterpretation";
	public static final String TABLE_USER_IDEALWEIGHT = "_idealweight";
	public static final String TABLE_USER_DAILYCALORIES = "_dailycalories";
	public static final String TABLE_USER_DAIRY = "_dairy";
	public static final String TABLE_USER_VEGETABLES = "_vegetables";
	public static final String TABLE_USER_FRUIT = "_fruit";
	public static final String TABLE_USER_MEAT_BEAN_EGG = "_meat_bean_egg";
	public static final String TABLE_USER_BREAD_CEREALS = "_bread_cereals";
	public static final String TABLE_USER_FAT = "_fat";
	public static final String TABLE_USER_SUGER = "_suger";
	public static final String TABLE_USER_F_EATENFOODID = "_eatenfood_id";

	// for UserMealUnit table =============================================

	public static final String TABLE_USERMEALUNIT = "UserMealUnit";
	public static final String TABLE_USERMEALUNIT_ID = "_mealid";
	public static final String TABLE_USERMEALUNIT_BREAKFAST = "_breakfast";
	public static final String TABLE_USERMEALUNIT_LUNCH = "_lunch";
	public static final String TABLE_USERMEALUNIT_SNACK = "_snack";
	public static final String TABLE_USERMEALUNIT_APPETIZERS = "_appetizers";
	public static final String TABLE_USERMEALUNIT_DINNER = "_dinner";
	public static final String TABLE_USERMEALUNIT_DAIRY = "_dairy";
	public static final String TABLE_USERMEALUNIT_VEGETABLES = "_vegetables";
	public static final String TABLE_USERMEALUNIT_FRUIT = "_fruit";
	public static final String TABLE_USERMEALUNIT_MEAT_BEAN_EGG = "_meat_bean_egg";
	public static final String TABLE_USERMEALUNIT_BREAD_CEREALS = "_bread_cereals";
	public static final String TABLE_USERMEALUNIT_FAT = "_fat";
	public static final String TABLE_USERMEALUNIT_SUGER = "_suger";

	// for UNITINFORMATION table==========================================

	public static final String TABLE_UNITINFORMATION = "UnitInformation";
	public static final String TABLE_UNITINFORMATION_ID = "_unitinformationid";
	public static final String TABLE_UNITINFORMATION_DAIRY = "_dairy";
	public static final String TABLE_UNITINFORMATION_VEGETABLES = "_vegetables";
	public static final String TABLE_UNITINFORMATION_FRUIT = "_fruit";
	public static final String TABLE_UNITINFORMATION_MEAT_BEAN_EGG = "_meat_bean_egg";
	public static final String TABLE_UNITINFORMATION_BREAD_CEREALS = "_bread_cereals";
	public static final String TABLE_UNITINFORMATION_FAT = "_fat";
	public static final String TABLE_UNITINFORMATION_SUGER = "_suger";
	public static final String TABLE_UNITINFORMATION_CARBOHYDRATES = "_carbohydrates";
	public static final String TABLE_UNITINFORMATION_PROTEINS = "_proteins";
	public static final String TABLE_UNITINFORMATION_FATS = "_fats";
	public static final String TABLE_UNITINFORMATION_CALORYS = "_calorys";

	// for STANDARDUNIT table=============================================

	public static final String TABLE_STANDARDUNIT = "StandardUnit";
	public static final String TABLE_STANDARDUNIT_ID = "_unitid";
	public static final String TABLE_STANDARDUNIT_UNITRATIO = "_unitratio";
	public static final String TABLE_STANDARDUNIT_UNIT = "_unit";
	public static final String TABLE_STANDARDUNIT_FOODNAME = "_foodname";
	public static final String TABLE_STANDARDUNIT_CALORY = "_calory";
	public static final String TABLE_STANDARDUNIT_FOODWEIGHT = "_foodweight";
	public static final String TABLE_STANDARDUNIT_DAIRY = "_dairy";
	public static final String TABLE_STANDARDUNIT_VEGETABLES = "_vegetables";
	public static final String TABLE_STANDARDUNIT_FRUIT = "_fruit";
	public static final String TABLE_STANDARDUNIT_MEAT_BEAN_EGG = "_meat_bean_egg";
	public static final String TABLE_STANDARDUNIT_BREAD_CEREALS = "_bread_cereals";
	public static final String TABLE_STANDARDUNIT_FAT = "_fat";
	public static final String TABLE_STANDARDUNIT_SUGER = "_suger";

	// for STANDARDFOODSUNIT table=========================================

	public static final String TABLE_STANDARDFOODSUNIT = "StandardFoodsUnit";
	public static final String TABLE_STANDARDFOODSUNIT_ID = "_ratioid";
	public static final String TABLE_STANDARDFOODSUNIT_RATIO = "_ratio";
	public static final String TABLE_STANDARDFOODSUNIT_F_FOODID = "_food_id";
	public static final String TABLE_STANDARDFOODSUNIT_F_UNITID = "_unit_id";

	// for FOODS table====================================================

	public static final String TABLE_FOODS = "Foods";
	public static final String TABLE_FOODS_ID = "_foodid";
	public static final String TABLE_FOODS_FOODNAME = "_foodname";
	public static final String TABLE_FOODS_BREAKFAST = "_breakfast";
	public static final String TABLE_FOODS_LUNCH = "_lunch";
	public static final String TABLE_FOODS_SNACK = "_snack";
	public static final String TABLE_FOODS_APPETIZERS = "_appetizers";
	public static final String TABLE_FOODS_DINNER = "_dinner";
	public static final String TABLE_FOODS_MAINFOOD = "_mainfood";
	public static final String TABLE_FOODS_SECONDARY = "_secondary";

	// for EATENFOOD table ================================================

	public static final String TABLE_EATENFOOD = "EatenFood";
	public static final String TABLE_EATENFOOD_ID = "_eatenfoodid";
	public static final String TABLE_EATENFOOD_BREAKFAST = "_breakfast";
	public static final String TABLE_EATENFOOD_LUNCH = "_lunch";
	public static final String TABLE_EATENFOOD_SNACK = "_snack";
	public static final String TABLE_EATENFOOD_APPETIZERS = "_appetizers";
	public static final String TABLE_EATENFOOD_DINNER = "_dinner";
	public static final String TABLE_EATENFOOD_DATA = "_day";
	public static final String TABLE_EATENFOOD_EQUIVALENT = "_equivalent";
	public static final String TABLE_EATENFOOD_DAIRY = "_dairy";
	public static final String TABLE_EATENFOOD_VEGETABLES = "_vegetables";
	public static final String TABLE_EATENFOOD_FRUIT = "_fruit";
	public static final String TABLE_EATENFOOD_MEAT_BEAN_EGG = "_meat_bean_egg";
	public static final String TABLE_EATENFOOD_BREAD_CEREALS = "_bread_cereals";
	public static final String TABLE_EATENFOOD_FAT = "_fat";
	public static final String TABLE_EATENFOOD_SUGER = "_suger";
	public static final String TABLE_EATENFOOD_UNITSUM = "_unitsum";
	public static final String TABLE_EATENFOOD_F_FOODID = "_food_id";

	// constructor ============================================================
	public DatabaseAdapter(Context context) {
		openHelper = new DatabaseOpenHelper(context, "DietDatabase1.s3db",
				null, 1);
	}

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< UserMealUnit>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	//insert in to usermealunit table ====================================================
	
	public Long insertUserMealUnit(UserMealUnit usermealunit) {
		SQLiteDatabase myDataBase = null;
		Long id = -1L;
		try {
			ContentValues values = new ContentValues();
			values.put(TABLE_USERMEALUNIT_BREAKFAST, usermealunit.getBreakfast());
			values.put(TABLE_USERMEALUNIT_LUNCH, usermealunit.getLunch());
			values.put(TABLE_USERMEALUNIT_SNACK, usermealunit.getSnack());
			values.put(TABLE_USERMEALUNIT_APPETIZERS,
					usermealunit.getAppetizers());
			values.put(TABLE_USERMEALUNIT_DINNER, usermealunit.getDinner());
			values.put(TABLE_USERMEALUNIT_DAIRY, usermealunit.getDairy());
			values.put(TABLE_USERMEALUNIT_VEGETABLES,
					usermealunit.getVegetables());
			values.put(TABLE_USERMEALUNIT_FRUIT, usermealunit.getFruit());
			values.put(TABLE_USERMEALUNIT_MEAT_BEAN_EGG,
					usermealunit.meat_bean_egg);
			values.put(TABLE_USER_BREAD_CEREALS,
					usermealunit.getBread_cereals());
			values.put(TABLE_USER_FAT, usermealunit.getFat());
			values.put(TABLE_USER_SUGER, usermealunit.getSuger());


			myDataBase = openHelper.getWritableDatabase();
			id = myDataBase.insert(TABLE_USERMEALUNIT, null, values);

		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} finally {
			if (myDataBase != null && myDataBase.isOpen())
				myDataBase.close();
		}
		return id;
	}

	//update UserMealUnit============================================================

	public int updateUserMealUnit(UserMealUnit usermealunit) {
		SQLiteDatabase myDataBase = null;
		int count = -1;
		try {
			myDataBase = openHelper.getWritableDatabase();
			ContentValues values = new ContentValues();
			values.put(TABLE_USERMEALUNIT_BREAKFAST, usermealunit.getBreakfast());
			values.put(TABLE_USERMEALUNIT_LUNCH, usermealunit.getLunch());
			values.put(TABLE_USERMEALUNIT_SNACK, usermealunit.getSnack());
			values.put(TABLE_USERMEALUNIT_APPETIZERS,
					usermealunit.getAppetizers());
			values.put(TABLE_USERMEALUNIT_DINNER, usermealunit.getDinner());
			values.put(TABLE_USERMEALUNIT_DAIRY, usermealunit.getDairy());
			values.put(TABLE_USERMEALUNIT_VEGETABLES,
					usermealunit.getVegetables());
			values.put(TABLE_USERMEALUNIT_FRUIT, usermealunit.getFruit());
			values.put(TABLE_USERMEALUNIT_MEAT_BEAN_EGG,
					usermealunit.getMeat_bean_egg());
			values.put(TABLE_USERMEALUNIT_BREAD_CEREALS,
					usermealunit.getBread_cereals());
			values.put(TABLE_USERMEALUNIT_FAT, usermealunit.getFat());
			values.put(TABLE_USERMEALUNIT_SUGER, usermealunit.getSuger());

			count = myDataBase.update(TABLE_USERMEALUNIT, values,
					TABLE_USERMEALUNIT_ID + "=?",
					new String[] { String.valueOf(usermealunit.getMealid()) });
		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} finally {
			myDataBase.close();
		}
		return count;
	}
 
	//getting single UsearMealUnit=================================================

	UserMealUnit getsingleusermealunit(int mealid){
		 SQLiteDatabase myDataBase = null;
		 myDataBase = openHelper.getWritableDatabase();

		    String selectQuery = "SELECT  * FROM " + TABLE_USERMEALUNIT + " WHERE "
		            + TABLE_USERMEALUNIT_ID + " = " + mealid;



		    Cursor cursor = myDataBase.rawQuery(selectQuery, null);

		    if (cursor != null)
		    	cursor.moveToFirst();

		    UserMealUnit mealunit = new UserMealUnit();
		    mealunit.setMealid(cursor.getInt(cursor.getColumnIndex(TABLE_USERMEALUNIT_ID)));//KEY_ID key for fetching id
		    mealunit.setBreakfast((cursor.getInt(cursor.getColumnIndex(TABLE_USERMEALUNIT_BREAKFAST))));//KEY_BREAKFAST key for fetching isBreakfast
		    mealunit.setLunch((cursor.getInt(cursor.getColumnIndex(TABLE_USERMEALUNIT_LUNCH))));
		    mealunit.setSnack((cursor.getInt(cursor.getColumnIndex(TABLE_USERMEALUNIT_SNACK))));
		    mealunit.setDinner((cursor.getInt(cursor.getColumnIndex(TABLE_USERMEALUNIT_DINNER))));
		    mealunit.setDairy((cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_DAIRY))));
		    mealunit.setVegetables((cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_VEGETABLES))));
		    mealunit.setFruit((cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_FRUIT))));
		    mealunit.setMeat_bean_egg((cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_MEAT_BEAN_EGG))));
		    mealunit.setBread_cereals((cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_BREAD_CEREALS))));
		    mealunit.setFat((cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_FAT))));
		    mealunit.setSuger((cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_SUGER))));

		    return mealunit;
			
		}
	
	//	Getting All usermealunit ================================================
	
	public ArrayList<UserMealUnit> getUserMealUnit() {
		
		ArrayList<UserMealUnit> result = null;
		SQLiteDatabase myDataBase = null;
		Cursor cursor = null;
		try {
			myDataBase = openHelper.getWritableDatabase();
			cursor = myDataBase.query(TABLE_USERMEALUNIT, new String[] { "*" }, null, null,
					null, null, null);
			if (cursor.moveToFirst()) {
				result = new ArrayList<UserMealUnit>();
				do {
					result.add(extractUserMealUnit(cursor));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} 
		finally {
			if (cursor != null) {
				cursor.close();
			}
			myDataBase.close();
		}
		return result;		
	}
	
	//	---------->> extractUserMealUnit=============================================
	private UserMealUnit extractUserMealUnit(Cursor cursor) {
		UserMealUnit usermealunit = new UserMealUnit();
		usermealunit.setMealid(cursor.getInt(cursor.getColumnIndex(TABLE_USERMEALUNIT_ID)));
		usermealunit.setBreakfast(cursor.getInt(cursor.getColumnIndex(TABLE_USERMEALUNIT_BREAKFAST)));
		usermealunit.setLunch(cursor.getInt(cursor.getColumnIndex(TABLE_USERMEALUNIT_LUNCH)));
		usermealunit.setSnack(cursor.getInt(cursor.getColumnIndex(TABLE_USERMEALUNIT_SNACK)));
		usermealunit.setAppetizers(cursor.getInt(cursor.getColumnIndex(TABLE_USERMEALUNIT_APPETIZERS)));
		usermealunit.setDinner(cursor.getInt(cursor.getColumnIndex(TABLE_USERMEALUNIT_DINNER)));
		usermealunit.setDairy(cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_DAIRY)));
		usermealunit.setVegetables(cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_VEGETABLES)));
		usermealunit.setFruit(cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_FRUIT)));
		usermealunit.setMeat_bean_egg(cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_MEAT_BEAN_EGG)));
		usermealunit.setBread_cereals(cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_BREAD_CEREALS)));
		usermealunit.setFat(cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_FAT)));
		usermealunit.setSuger(cursor.getFloat(cursor.getColumnIndex(TABLE_USERMEALUNIT_SUGER)));
		

		return usermealunit;
	}
	
	
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<USER>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	// insert into user table======================================================
	public Long insertUser(User user) {
		SQLiteDatabase myDataBase = null;
		Long id = -1L;
		try {
			ContentValues values = new ContentValues();
			values.put(TABLE_USER_HEIGHT, user.getHeight());
			values.put(TABLE_USER_WEIGHT, user.getWeight());
			values.put(TABLE_USER_AGE, user.getAge());
			values.put(TABLE_USER_GENDER, user.getGender());
			values.put(TABLE_USER_PA, user.getPa());
			values.put(TABLE_USER_BMIVALUE, user.getBmivalue());
			values.put(TABLE_USER_BMIINTERPRETATION,
					user.getBmiInterpretation());
			values.put(TABLE_USER_IDEALWEIGHT, user.getIdealweight());
			values.put(TABLE_USER_DAILYCALORIES, user.getDailycalories());
			values.put(TABLE_USER_DAIRY, user.getDairy());
			values.put(TABLE_USER_VEGETABLES, user.getVegetables());
			values.put(TABLE_USER_FRUIT, user.getFruit());
			values.put(TABLE_USER_MEAT_BEAN_EGG, user.getMeat_bean_egg());
			values.put(TABLE_USER_BREAD_CEREALS, user.getBread_cereals());
			values.put(TABLE_USER_FAT, user.getFat());
			values.put(TABLE_USER_SUGER, user.getSuger());

			myDataBase = openHelper.getWritableDatabase();
			id = myDataBase.insert(TABLE_USER, null, values);

		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} finally {
			if (myDataBase != null && myDataBase.isOpen())
				myDataBase.close();
		}
		return id;
	}

	//update user table==========================================================

	public int updateUser(User user) {
		SQLiteDatabase myDataBase = null;
		int count = -1;
		try {
			myDataBase = openHelper.getWritableDatabase();
			ContentValues values = new ContentValues();
			values.put(TABLE_USER_HEIGHT, user.getHeight());
			values.put(TABLE_USER_WEIGHT, user.getWeight());
			values.put(TABLE_USER_AGE, user.getAge());
			values.put(TABLE_USER_GENDER, user.getGender());
			values.put(TABLE_USER_PA, user.getPa());
			values.put(TABLE_USER_BMIVALUE, user.getBmivalue());
			values.put(TABLE_USER_BMIINTERPRETATION,
					user.getBmiInterpretation());
			values.put(TABLE_USER_IDEALWEIGHT, user.getIdealweight());
			values.put(TABLE_USER_DAILYCALORIES, user.getDailycalories());
			values.put(TABLE_USER_DAIRY, user.getDairy());
			values.put(TABLE_USER_VEGETABLES, user.getVegetables());
			values.put(TABLE_USER_FRUIT, user.getFruit());
			values.put(TABLE_USER_MEAT_BEAN_EGG, user.getMeat_bean_egg());
			values.put(TABLE_USER_BREAD_CEREALS, user.getBread_cereals());
			values.put(TABLE_USER_FAT, user.getFat());
			values.put(TABLE_USER_SUGER, user.getSuger());

			count = myDataBase.update(TABLE_USER, values, TABLE_USER_ID + "=?",
					new String[] { String.valueOf(user.getId()) });
		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} finally {
			myDataBase.close();
		}
		return count;
	}
	
	//getting single User=================================================

	public User getsingleuser(int userid){
		 SQLiteDatabase myDataBase = null;
		 myDataBase = openHelper.getWritableDatabase();

		    String selectQuery = "SELECT  * FROM " + TABLE_USER + " WHERE "
		            + TABLE_USER_ID + " = " + userid;



		    Cursor cursor = myDataBase.rawQuery(selectQuery, null);

		    if (cursor != null)
		    	cursor.moveToFirst();

		    User user = new User();
		    user.setId(cursor.getInt(cursor.getColumnIndex(TABLE_USER_ID)));//KEY_ID key for fetching id
		    user.setHeight((cursor.getDouble(cursor.getColumnIndex(TABLE_USER_HEIGHT))));//KEY_BREAKFAST key for fetching isBreakfast
		    user.setWeight((cursor.getDouble(cursor.getColumnIndex(TABLE_USER_WEIGHT))));
		    user.setAge((cursor.getInt(cursor.getColumnIndex(TABLE_USER_AGE))));
		    user.setGender((cursor.getString(cursor.getColumnIndex(TABLE_USER_GENDER))));
		    user.setPa((cursor.getString(cursor.getColumnIndex(TABLE_USER_PA))));
		    user.setBmivalue((cursor.getInt(cursor.getColumnIndex(TABLE_USER_BMIVALUE))));
		    user.setIdealweight((cursor.getDouble(cursor.getColumnIndex(TABLE_USER_IDEALWEIGHT))));
		    user.setDailycalories((cursor.getDouble(cursor.getColumnIndex(TABLE_USER_DAILYCALORIES))));
		    user.setBmiInterpretation((cursor.getString(cursor.getColumnIndex(TABLE_USER_BMIINTERPRETATION))));
		    user.setDairy((cursor.getFloat(cursor.getColumnIndex(TABLE_USER_DAIRY))));
		    user.setVegetables((cursor.getFloat(cursor.getColumnIndex(TABLE_USER_VEGETABLES))));
		    user.setFruit((cursor.getFloat(cursor.getColumnIndex(TABLE_USER_FRUIT))));
		    user.setMeat_bean_egg((cursor.getFloat(cursor.getColumnIndex(TABLE_USER_MEAT_BEAN_EGG))));
		    user.setBread_cereals((cursor.getFloat(cursor.getColumnIndex(TABLE_USER_BREAD_CEREALS))));
		    user.setFat((cursor.getFloat(cursor.getColumnIndex(TABLE_USER_FAT))));
		    user.setSuger((cursor.getFloat(cursor.getColumnIndex(TABLE_USER_SUGER))));

		    return user;
			
		}
	
	//	Getting All user ================================================
	
//	public ArrayList<User> getUser() {
//		
//		ArrayList<User> result = null;
//		SQLiteDatabase myDataBase = null;
//		Cursor cursor = null;
//		try {
//			myDataBase = openHelper.getWritableDatabase();
//			cursor = myDataBase.query(TABLE_USER, new String[] { "*" }, null, null,
//					null, null, null);
//			if (cursor.moveToFirst()) {
//				result = new ArrayList<User>();
//				do {
//					result.add(extractUser(cursor));
//				} while (cursor.moveToNext());
//			}
//		} catch (Exception e) {
//			Log.e(TAG, "Exception: " + e.getMessage());
//		} 
//		finally {
//			if (cursor != null) {
//				cursor.close();
//			}
//			myDataBase.close();
//		}
//		return result;		
//	}
//	
//	// extractUser=============================================================
//	private User extractUser(Cursor cursor){
//		User user = new User();
//		user.setId(cursor.getInt(cursor.getColumnIndex(TABLE_USER_ID)));
//		user.setHeight(cursor.getDouble(cursor.getColumnIndex(TABLE_USER_HEIGHT)));
//		user.setWeight(cursor.getDouble(cursor.getColumnIndex(TABLE_USER_WEIGHT)));
//		user.setAge(cursor.getInt(cursor.getColumnIndex(TABLE_USER_AGE)));
//		user.setGender(cursor.getString(cursor.getColumnIndex(TABLE_USER_GENDER)));
//		user.setPa(cursor.getString(cursor.getColumnIndex(TABLE_USER_PA)));
//		user.setBmivalue(cursor.getInt(cursor.getColumnIndex(TABLE_USER_BMIVALUE)));
//		user.setBmiInterpretation(cursor.getString(cursor.getColumnIndex(TABLE_USER_BMIINTERPRETATION)));
//		user.setIdealweight(cursor.getDouble(cursor.getColumnIndex(TABLE_USER_IDEALWEIGHT)));
//		user.setDailycalories(cursor.getDouble(cursor.getColumnIndex(TABLE_USER_DAILYCALORIES)));
//		user.setDairy(cursor.getFloat(cursor.getColumnIndex(TABLE_USER_DAIRY)));
//		user.setVegetables(cursor.getFloat(cursor.getColumnIndex(TABLE_USER_VEGETABLES)));
//		user.setFruit(cursor.getFloat(cursor.getColumnIndex(TABLE_USER_FRUIT)));
//		user.setBread_cereals(cursor.getFloat(cursor.getColumnIndex(TABLE_USER_BREAD_CEREALS)));
//		user.setFat(cursor.getFloat(cursor.getColumnIndex(TABLE_USER_FAT)));
//		user.setSuger(cursor.getFloat(cursor.getColumnIndex(TABLE_USER_SUGER)));
//		
//
//		return user ;
//	}
//	
	

// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<EATENFOOD>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	// insert in to EatenFood table=========================================================

	public Long insertEatenFood(EatenFood eatenfood) {
		SQLiteDatabase myDataBase = null;
		Long id = -1L;
		try {
			ContentValues values = new ContentValues();
			values.put(TABLE_EATENFOOD_BREAKFAST, eatenfood.getBreakfast());
			values.put(TABLE_EATENFOOD_LUNCH, eatenfood.getLunch());
			values.put(TABLE_EATENFOOD_SNACK, eatenfood.getSnack());
			values.put(TABLE_EATENFOOD_APPETIZERS, eatenfood.getAppetizers());
			values.put(TABLE_EATENFOOD_DINNER, eatenfood.getDinner());
			// values.put(TABLE_EATENFOOD_DATA, eatenfood.getDay().getClass());
			values.put(TABLE_EATENFOOD_EQUIVALENT, eatenfood.getEquivalent());
			values.put(TABLE_EATENFOOD_DAIRY, eatenfood.getDairy());
			values.put(TABLE_EATENFOOD_VEGETABLES, eatenfood.getVegetables());
			values.put(TABLE_EATENFOOD_FRUIT, eatenfood.getFruit());
			values.put(TABLE_EATENFOOD_MEAT_BEAN_EGG,
					eatenfood.getMeat_bean_egg());
			values.put(TABLE_EATENFOOD_BREAD_CEREALS,
					eatenfood.getBread_cereals());
			values.put(TABLE_EATENFOOD_FAT, eatenfood.getFat());
			values.put(TABLE_EATENFOOD_SUGER, eatenfood.getSuger());
			values.put(TABLE_EATENFOOD_UNITSUM, eatenfood.getUnitsum());
			values.put(TABLE_EATENFOOD_F_FOODID, eatenfood.getFood_id());

			myDataBase = openHelper.getWritableDatabase();
			id = myDataBase.insert(TABLE_EATENFOOD, null, values);

		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} finally {
			if (myDataBase != null && myDataBase.isOpen())
				myDataBase.close();
		}
		return id;
	}

	// update EateanFood table =====================================================
	public int updateEatenFood(EatenFood eatenfood) {
		SQLiteDatabase myDataBase = null;
		int count = -1;
		try {
			myDataBase = openHelper.getWritableDatabase();
			ContentValues values = new ContentValues();
			values.put(TABLE_EATENFOOD_BREAKFAST, eatenfood.getBreakfast());
			values.put(TABLE_EATENFOOD_LUNCH, eatenfood.getLunch());
			values.put(TABLE_EATENFOOD_SNACK, eatenfood.getSnack());
			values.put(TABLE_EATENFOOD_APPETIZERS, eatenfood.getAppetizers());
			values.put(TABLE_EATENFOOD_DINNER, eatenfood.getDinner());
			// values.put(TABLE_EATENFOOD_DATA, eatenfood.getDay().getClass());
			values.put(TABLE_EATENFOOD_EQUIVALENT, eatenfood.getEquivalent());
			values.put(TABLE_EATENFOOD_DAIRY, eatenfood.getDairy());
			values.put(TABLE_EATENFOOD_VEGETABLES, eatenfood.getVegetables());
			values.put(TABLE_EATENFOOD_FRUIT, eatenfood.getFruit());
			values.put(TABLE_EATENFOOD_MEAT_BEAN_EGG,
					eatenfood.getMeat_bean_egg());
			values.put(TABLE_EATENFOOD_BREAD_CEREALS,
					eatenfood.getBread_cereals());
			values.put(TABLE_EATENFOOD_FAT, eatenfood.getFat());
			values.put(TABLE_EATENFOOD_SUGER, eatenfood.getSuger());
			values.put(TABLE_EATENFOOD_UNITSUM, eatenfood.getUnitsum());
			values.put(TABLE_EATENFOOD_F_FOODID, eatenfood.getFood_id());

			count = myDataBase
					.update(TABLE_EATENFOOD, values, TABLE_EATENFOOD_ID + "=?",
							new String[] { String.valueOf(eatenfood
									.getEatenfoodid()) });
		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} finally {
			myDataBase.close();
		}
		return count;
	}
	
	//getting single eatenfood=================================================

	EatenFood getsingleeatenfood(int eatenfoodid){
		 SQLiteDatabase myDataBase = null;
		 myDataBase = openHelper.getWritableDatabase();

		    String selectQuery = "SELECT  * FROM " + TABLE_EATENFOOD + " WHERE "
		            + TABLE_EATENFOOD_ID + " = " + eatenfoodid;



		    Cursor cursor = myDataBase.rawQuery(selectQuery, null);

		    if (cursor != null)
		    	cursor.moveToFirst();

		    EatenFood eatenfood = new EatenFood();
		    eatenfood.setEatenfoodid(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_ID)));//KEY_ID key for fetching id
		    eatenfood.setBreakfast(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_BREAKFAST)));
		    eatenfood.setLunch(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_LUNCH)));
		    eatenfood.setSnack(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_SNACK)));
		    eatenfood.setAppetizers(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_APPETIZERS)));
		    eatenfood.setDinner(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_DINNER)));
//		    date mimune :|
		    eatenfood.setEquivalent((cursor.getString(cursor.getColumnIndex(TABLE_EATENFOOD_EQUIVALENT))));
		    eatenfood.setDairy((cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_DAIRY))));
		    eatenfood.setVegetables((cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_VEGETABLES))));
		    eatenfood.setFruit((cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_FRUIT))));
		    eatenfood.setMeat_bean_egg((cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_MEAT_BEAN_EGG))));
		    eatenfood.setBread_cereals((cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_BREAD_CEREALS))));
		    eatenfood.setFat((cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_FAT))));
		    eatenfood.setSuger((cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_SUGER))));
		    eatenfood.setUnitsum((cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_UNITSUM))));
		    eatenfood.setFood_id(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_F_FOODID)));

		    return eatenfood;
			
		}
	
//	Getting All EatenFood ================================================
	
	public ArrayList<EatenFood> getEatenfoods() {
		
		ArrayList<EatenFood> result = null;
		SQLiteDatabase myDataBase = null;
		Cursor cursor = null;
		try {
			myDataBase = openHelper.getWritableDatabase();
			cursor = myDataBase.query(TABLE_EATENFOOD, new String[] { "*" }, null, null,
					null, null, null);
			if (cursor.moveToFirst()) {
				result = new ArrayList<EatenFood>();
				do {
					result.add(extractEatenFood(cursor));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} 
		finally {
			if (cursor != null) {
				cursor.close();
			}
			myDataBase.close();
		}
		return result;		
	}
	
	// extractEatenFood=============================================================
	private EatenFood extractEatenFood(Cursor cursor){
		EatenFood eatenfood = new EatenFood();
		eatenfood.setEatenfoodid(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_ID)));
		eatenfood.setBreakfast(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_BREAKFAST)));
		eatenfood.setLunch(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_LUNCH)));
		eatenfood.setSnack(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_SNACK)));
		eatenfood.setAppetizers(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_APPETIZERS)));
		eatenfood.setDinner(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_DINNER)));
		//		???????????????????????? baraye day k sabt beshe
		eatenfood.setEquivalent(cursor.getString(cursor.getColumnIndex(TABLE_EATENFOOD_EQUIVALENT)));
		eatenfood.setDairy(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_DAIRY)));
		eatenfood.setVegetables(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_VEGETABLES)));
		eatenfood.setFruit(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_FRUIT)));
		eatenfood.setMeat_bean_egg(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_MEAT_BEAN_EGG)));
		eatenfood.setBread_cereals(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_BREAD_CEREALS)));
		eatenfood.setFat(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_FAT)));
		eatenfood.setSuger(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_SUGER)));
		eatenfood.setFood_id(cursor.getInt(cursor.getColumnIndex(TABLE_EATENFOOD_F_FOODID)));

		return eatenfood ;
	}
	
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Foods>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
//	Getting All Foods ================================================
	
	public ArrayList<Foods> getFoods() {
		
		ArrayList<Foods> result = null;
		SQLiteDatabase myDataBase = null;
		Cursor cursor = null;
		try {
			myDataBase = openHelper.getWritableDatabase();
			cursor = myDataBase.query(TABLE_FOODS, new String[] { "*" }, null, null,
					null, null, null);
			if (cursor.moveToFirst()) {
				result = new ArrayList<Foods>();
				do {

					result.add(extractFoods(cursor));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} 
		finally {
			if (cursor != null) {
				cursor.close();
			}
			myDataBase.close();
		}
		return result;		
	}
	
	// extractFood=============================================================
	private Foods extractFoods(Cursor cursor){
		Foods foods = new Foods();
		foods.setFoodid(cursor.getInt(cursor.getColumnIndex(TABLE_FOODS_ID)));
		foods.setFoodname(cursor.getString(cursor.getColumnIndex(TABLE_FOODS_FOODNAME)));
		foods.setBreakfast(cursor.getInt(cursor.getColumnIndex(TABLE_FOODS_BREAKFAST)));
		foods.setLunch(cursor.getInt(cursor.getColumnIndex(TABLE_FOODS_LUNCH)));
		foods.setSnack(cursor.getInt(cursor.getColumnIndex(TABLE_FOODS_SNACK)));
		foods.setAppetizers(cursor.getInt(cursor.getColumnIndex(TABLE_FOODS_APPETIZERS)));
		foods.setDinner(cursor.getInt(cursor.getColumnIndex(TABLE_FOODS_DINNER)));
		foods.setMainfood(cursor.getInt(cursor.getColumnIndex(TABLE_FOODS_MAINFOOD)));
		foods.setSecondary(cursor.getInt(cursor.getColumnIndex(TABLE_FOODS_SECONDARY)));

		return foods ;
	}
	
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<StandardFoodsUnit>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
//	Getting All standardFoodunit ================================================
	
	public ArrayList<StandardFoodsUnit> getStandardFoodUnit() {
		
		ArrayList<StandardFoodsUnit> result = null;
		SQLiteDatabase myDataBase = null;
		Cursor cursor = null;
		try {
			myDataBase = openHelper.getWritableDatabase();
			cursor = myDataBase.query(TABLE_STANDARDFOODSUNIT, new String[] { "*" }, null, null,
					null, null, null);
			if (cursor.moveToFirst()) {
				result = new ArrayList<StandardFoodsUnit>();
				do {

					result.add(extractStandardFoodsUnit(cursor));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} 
		finally {
			if (cursor != null) {
				cursor.close();
			}
			myDataBase.close();
		}
		return result;		
	}
	
	// extractstandardfoodunit=============================================================
	private StandardFoodsUnit extractStandardFoodsUnit(Cursor cursor){
		StandardFoodsUnit standardfoodsunit = new StandardFoodsUnit();
		standardfoodsunit.setRatioid(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDFOODSUNIT_ID)));
		standardfoodsunit.setRatio(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDFOODSUNIT_RATIO)));
		standardfoodsunit.setFood_id(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDFOODSUNIT_F_FOODID)));
		standardfoodsunit.setUnit_id(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDFOODSUNIT_F_UNITID)));


		return standardfoodsunit ;
	}
	
	
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<StandardUnit>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
//	Getting All standardunit ================================================
	
	public ArrayList<StandardUnit> getStandardUnit() {
		
		ArrayList<StandardUnit> result = null;
		SQLiteDatabase myDataBase = null;
		Cursor cursor = null;
		try {
			myDataBase = openHelper.getWritableDatabase();
			cursor = myDataBase.query(TABLE_STANDARDUNIT, new String[] { "*" }, null, null,
					null, null, null);
			if (cursor.moveToFirst()) {
				result = new ArrayList<StandardUnit>();
				do {

					result.add(extractStandardUnit(cursor));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} 
		finally {
			if (cursor != null) {
				cursor.close();
			}
			myDataBase.close();
		}
		return result;		
	}
	
	// extractstandardunit=============================================================
	private StandardUnit extractStandardUnit(Cursor cursor){
		StandardUnit standardunit = new StandardUnit();
		standardunit.setUnitid(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDUNIT_ID)));
		standardunit.setUnitratio(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDUNIT_UNITRATIO)));
		standardunit.setUnit(cursor.getString(cursor.getColumnIndex(TABLE_STANDARDUNIT_UNIT)));
		standardunit.setFoodname(cursor.getString(cursor.getColumnIndex(TABLE_STANDARDUNIT_FOODNAME)));
		standardunit.setCalory(cursor.getFloat(cursor.getColumnIndex(TABLE_STANDARDUNIT_CALORY)));
		standardunit.setFoodweight(cursor.getFloat(cursor.getColumnIndex(TABLE_STANDARDUNIT_FOODWEIGHT)));
		standardunit.setFoodname(cursor.getString(cursor.getColumnIndex(TABLE_STANDARDUNIT_FOODNAME)));
		standardunit.setDairy(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDUNIT_DAIRY)));
		standardunit.setVegetables(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDUNIT_VEGETABLES)));
		standardunit.setFruit(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDUNIT_FRUIT)));
		standardunit.setMeat_bean_egg(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDUNIT_MEAT_BEAN_EGG)));
		standardunit.setBread_cereals(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDUNIT_BREAD_CEREALS)));
		standardunit.setFat(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDUNIT_FAT)));
		standardunit.setSuger(cursor.getInt(cursor.getColumnIndex(TABLE_STANDARDUNIT_SUGER)));


		return standardunit ;
	}

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<UnitInformation>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	

	public UnitInformation getsingleunitinformation(int mealid){
		 SQLiteDatabase myDataBase = null;
		 myDataBase = openHelper.getWritableDatabase();

		    String selectQuery = "SELECT  * FROM " + TABLE_UNITINFORMATION + " WHERE "
		            + TABLE_UNITINFORMATION_ID + " = " + mealid;



		    Cursor cursor = myDataBase.rawQuery(selectQuery, null);

		    if (cursor != null)
		    	cursor.moveToFirst();

		    UnitInformation unitinformation = new UnitInformation();
		    unitinformation.setUnitinformationid(cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_ID)));//KEY_ID key for fetching id
		    unitinformation.setDairy((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_DAIRY))));
		    unitinformation.setVegetables((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_VEGETABLES))));
		    unitinformation.setFruit((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_FRUIT))));
		    unitinformation.setMeat_bean_egg((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_MEAT_BEAN_EGG))));
		    unitinformation.setBread_cereals((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_BREAD_CEREALS))));
		    unitinformation.setFat((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_FAT))));
		    unitinformation.setSuger((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_SUGER))));
		    unitinformation.setCarbohydrates((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_CARBOHYDRATES))));
		    unitinformation.setProteins((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_PROTEINS))));
		    unitinformation.setFats((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_FATS))));
		    unitinformation.setCalorys((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_CALORYS))));

		    return unitinformation;
			
		}
	
	//	Getting All unitinformation ================================================
	
	public ArrayList<UnitInformation> getUnitInformation() {
		
		ArrayList<UnitInformation> result = null;
		SQLiteDatabase myDataBase = null;
		Cursor cursor = null;
		try {
			myDataBase = openHelper.getWritableDatabase();
			cursor = myDataBase.query(TABLE_UNITINFORMATION, new String[] { "*" }, null, null,
					null, null, null);
			if (cursor.moveToFirst()) {
				result = new ArrayList<UnitInformation>();
				do {
					result.add(extractUnitInformation(cursor));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			Log.e(TAG, "Exception: " + e.getMessage());
		} 
		finally {
			if (cursor != null) {
				cursor.close();
			}
			myDataBase.close();
		}
		return result;		
	}
	
	//	---------->> extractUnitInformation=============================================
	private UnitInformation extractUnitInformation(Cursor cursor) {
		UnitInformation unitinformation = new UnitInformation();
		
		unitinformation.setUnitinformationid(cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_ID)));//KEY_ID key for fetching id
	    unitinformation.setDairy((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_DAIRY))));
	    unitinformation.setVegetables((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_VEGETABLES))));
	    unitinformation.setFruit((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_FRUIT))));
	    unitinformation.setMeat_bean_egg((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_MEAT_BEAN_EGG))));
	    unitinformation.setBread_cereals((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_BREAD_CEREALS))));
	    unitinformation.setFat((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_FAT))));
	    unitinformation.setSuger((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_SUGER))));
	    unitinformation.setCarbohydrates((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_CARBOHYDRATES))));
	    unitinformation.setProteins((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_PROTEINS))));
	    unitinformation.setFats((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_FATS))));
	    unitinformation.setCalorys((cursor.getInt(cursor.getColumnIndex(TABLE_UNITINFORMATION_CALORYS))));
		

		return unitinformation;
	}
	
		
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DATABASE COPY FROM ASSET>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	static class DatabaseOpenHelper extends SQLiteOpenHelper {

		private static String DB_PATH = "/data/data/com.example.dietp/databases/";

		private static String DB_NAME = "DietDatabase1";

		private SQLiteDatabase myDataBase;

		private final Context myContext;

		public DatabaseOpenHelper(Context context, String name,
				CursorFactory factory, int version) {
			super(context, DB_NAME, null, 1);

			this.myContext = context;

		}

		public void createDataBase() throws IOException {

			boolean dbExist = checkDataBase();
			if (dbExist) {
				// do nothing - database already exist
			} else {

				// By calling this method and empty database will be created
				// into the default system path
				// of your application so we are gonna be able to overwrite that
				// database with our database.
				this.getReadableDatabase();

				try {

					copyDataBase();

				} catch (IOException e) {

					throw new Error("Error copying database");

				}
			}

		}

		/**
		 * Check if the database already exist to avoid re-copying the file each
		 * time you open the application.
		 * 
		 * @return true if it exists, false if it doesn't
		 */
		private boolean checkDataBase() {

			SQLiteDatabase checkDB = null;

			try {
				String myPath = DB_PATH + DB_NAME;
				checkDB = SQLiteDatabase.openDatabase(myPath, null,
						SQLiteDatabase.OPEN_READONLY);

			} catch (SQLiteException e) {

				// database does't exist yet.
			}
			if (checkDB != null) {

				checkDB.close();
			}

			return checkDB != null ? true : false;
		}

		private void copyDataBase() throws IOException {

			// Open local db as the input stream

			InputStream myInput = myContext.getAssets().open(DB_NAME);

			// Path to the just created empty db

			String outFileName = DB_PATH + DB_NAME;

			// Open the empty db as the output stream

			OutputStream myOutput = new FileOutputStream(outFileName);

			// transfer bytes from the inputfile to the outputfile

			byte[] buffer = new byte[1024];
			int length;
			while ((length = myInput.read(buffer)) > 0) {
				myOutput.write(buffer, 0, length);
			}

			// Close the streams
			myOutput.flush();
			myOutput.close();
			myInput.close();

		}

		public void openDataBase() throws SQLException {

			// Open the database
			String myPath = DB_PATH + DB_NAME;
			myDataBase = SQLiteDatabase.openDatabase(myPath, null,
					SQLiteDatabase.OPEN_READONLY);

		}

		@Override
		public synchronized void close() {

			if (myDataBase != null)
				myDataBase.close();

			super.close();

		}

		@Override
		public void onCreate(SQLiteDatabase db) {

		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

		}

		// Add your public helper methods to access and get content from the
		// database.
		// You could return cursors by doing "return myDataBase.query(....)" so
		// it'd be easy
		// to you to create adapters for your views.

	}
}