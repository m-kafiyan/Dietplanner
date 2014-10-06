package database;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseAdapter{
	
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
		public static final String TABLE_USER_F_UNITINFOID = "_unitinformation_id";
		public static final String TABLE_USER_F_MEALID = "_meal_id";

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
		public static final String TABLE_USERMEALUNIT_F_FOODID = "_food_id";
		public static final String TABLE_USERMEALUNIT_F_USERID = "_user_id";
		
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
		public static final String TABLE_UNITINFORMATION_F_USERID = "_user_id";
		
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
		public static final String TABLE_STANDARDUNIT_F_RATIOID = "_ratio_id";

		// for STANDARDFOODSUNIT table=========================================
		

		public static final String TABLE_STANDARDFOODSUNIT = "StandardFoodsUnit";
		public static final String TABLE_STANDARDFOODSUNIT_ID = "_ratioid";
		public static final String TABLE_STANDARDFOODSUNIT_RATIO = "_ratio";
		public static final String TABLE_STANDARDFOODSUNIT_F_EATENFOODID = "_eatenfood_id";
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
		public static final String TABLE_FOODS_F_EATENFOODID = "_eatenfood_id";
		public static final String TABLE_FOODS_F_RATIOID = "_ratio_id";
		public static final String TABLE_FOODS_F_MEALID = "_meal_id";

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
		public static final String TABLE_EATENFOOD_F_RATIOID = "_ratio_id";
		
//		constructor ============================================================
		public DatabaseAdapter(Context context) {
			openHelper = new DatabaseOpenHelper(context, "Persons.db", null, 1);
		}
		

		
// insert in to UserMealUnit ====================================================
		
		public Long insertUserMealUnit(UserMealUnit UserMealUnit) {
			SQLiteDatabase myDataBase = null;
			Long id = -1L;
			try {
				ContentValues values = new ContentValues();
				values.put(TABLE_USERMEALUNIT_BREAKFAST,UserMealUnit.isBreakfast() );
				values.put(TABLE_USERMEALUNIT_LUNCH, UserMealUnit.isLunch());
				values.put(TABLE_USERMEALUNIT_SNACK, UserMealUnit.isSnack());
				values.put(TABLE_USERMEALUNIT_APPETIZERS,UserMealUnit.isAppetizers());
				values.put(TABLE_USERMEALUNIT_DINNER, UserMealUnit.isDinner());
				values.put(TABLE_USERMEALUNIT_DAIRY,UserMealUnit.getDairy());
				values.put(TABLE_USERMEALUNIT_VEGETABLES, UserMealUnit.getVegetables());
				values.put(TABLE_USERMEALUNIT_FRUIT , UserMealUnit.getFruit());
				values.put(TABLE_USERMEALUNIT_MEAT_BEAN_EGG, UserMealUnit.meat_bean_egg);
				values.put(TABLE_USER_BREAD_CEREALS,UserMealUnit.getBread_cereals());
				values.put(TABLE_USER_FAT,UserMealUnit.getFat());
				values.put(TABLE_USER_SUGER, UserMealUnit.getSuger());

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
		
		
		
		
//	insert into user table ======================================================
		
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
				values.put(TABLE_USER_BMIINTERPRETATION, user.getBmiInterpretation());
				values.put(TABLE_USER_IDEALWEIGHT , user.getIdealweight());
				values.put(TABLE_USER_DAILYCALORIES, user.getDailycalories());
				values.put(TABLE_USER_DAIRY, user.getDairy());
				values.put(TABLE_USER_VEGETABLES, user.getVegetables());
				values.put(TABLE_USER_FRUIT, user.getFruit());
				values.put(TABLE_USER_MEAT_BEAN_EGG, user.getMeat_bean_egg());
				values.put(TABLE_USER_BREAD_CEREALS, user.getBread_cereals());
				values.put(TABLE_USER_FAT,user.getFat());
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
		
//		update user table==========================================================
		
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
				values.put(TABLE_USER_BMIINTERPRETATION, user.getBmiInterpretation());
				values.put(TABLE_USER_IDEALWEIGHT , user.getIdealweight());
				values.put(TABLE_USER_DAILYCALORIES, user.getDailycalories());
				values.put(TABLE_USER_DAIRY, user.getDairy());
				values.put(TABLE_USER_VEGETABLES, user.getVegetables());
				values.put(TABLE_USER_FRUIT, user.getFruit());
				values.put(TABLE_USER_MEAT_BEAN_EGG, user.getMeat_bean_egg());
				values.put(TABLE_USER_BREAD_CEREALS, user.getBread_cereals());
				values.put(TABLE_USER_FAT,user.getFat());
				values.put(TABLE_USER_SUGER, user.getSuger());

				count = myDataBase.update(TABLE_USER, values, TABLE_USER_ID + "=?",
						new String[] { String.valueOf(user.getid()) });
			} catch (Exception e) {
				Log.e(TAG, "Exception: " + e.getMessage());
			} finally {
				myDataBase.close();
			}
			return count;
		}
		


		
		
		
	
	

  static class DatabaseOpenHelper extends SQLiteOpenHelper {
	
	private static String DB_PATH = "/data/data/Database/databases/";
	 
    private static String DB_NAME = "DataBase";
 
    private SQLiteDatabase myDataBase; 
 
    private final Context myContext;

	public DatabaseOpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, DB_NAME, null, 1);
		
		
		this.myContext=context;

	}

	public void createDataBase() throws IOException{
		 
    	boolean dbExist = checkDataBase();
    	if(dbExist){
    		//do nothing - database already exist
    	}else{
 
    		//By calling this method and empty database will be created into the default system path
               //of your application so we are gonna be able to overwrite that database with our database.
        	this.getReadableDatabase();
 
        	try {
 
    			copyDataBase();
 
    		} catch (IOException e) {
 
        		throw new Error("Error copying database");
 
        	}
    	}
    	
	}
	
	/**
     * Check if the database already exist to avoid re-copying the file each time you open the application.
     * @return true if it exists, false if it doesn't
     */
    private boolean checkDataBase(){
 
    	SQLiteDatabase checkDB = null;
 
    	try{
    		String myPath = DB_PATH + DB_NAME;
    		checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
 
    	}catch(SQLiteException e){
    		
    		//database does't exist yet.
    	}
    	if(checkDB != null){
 
    		checkDB.close();
    	}
 
    	return checkDB != null ? true : false;
    }
    
    private void copyDataBase() throws IOException{
    	
    	//Open local db as the input stream
    	
    	InputStream myInput = myContext.getAssets().open(DB_NAME);
    	
    	// Path to the just created empty db
    	
    	String outFileName = DB_PATH + DB_NAME;
    	
    	//Open the empty db as the output stream
    	
    	OutputStream myOutput = new FileOutputStream(outFileName);
    	
    	//transfer bytes from the inputfile to the outputfile
    	
    	byte[] buffer = new byte[1024];
    	int length;
    	while ((length = myInput.read(buffer))>0){
    		myOutput.write(buffer, 0, length);
    	}
 
    	//Close the streams
    	myOutput.flush();
    	myOutput.close();
    	myInput.close();
    	
    }
    
    public void openDataBase() throws SQLException{
    	 
    	//Open the database
        String myPath = DB_PATH + DB_NAME;
    	myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
 
    }
    
    @Override
	public synchronized void close() {
 
    	    if(myDataBase != null)
    		    myDataBase.close();
 
    	    super.close();
 
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
 
	}
 
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
 
	}
	

	
	
    // Add your public helper methods to access and get content from the database.
   // You could return cursors by doing "return myDataBase.query(....)" so it'd be easy
   // to you to create adapters for your views.


 }
}