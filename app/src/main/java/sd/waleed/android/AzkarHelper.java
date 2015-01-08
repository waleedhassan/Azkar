package sd.waleed.android;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.app.TabActivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class AzkarHelper extends SQLiteOpenHelper {
    private static final String DATABASE_PATH = "/data/data/sd.waleed.android/databases/";
	private static final String DATABASE_NAME = "azkardb.db";
	private static final int SCHEMA_VERSION = 1 ;
	private static final String ALZEKER_TABLE = "zekerdata" ; 
	private Context context ;
	
	public AzkarHelper(Context context){
		super(context, DATABASE_NAME, null, SCHEMA_VERSION);
		this.context = context ;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		//db.execSQL("CREATE TABLE "+ALZEKER_TABLE+" (_id INTEGER PRIMARY KEY AUTOINCREMENT,alzeker TEXT,category TEXT);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}
	
	/*public void insert(String alzeker , String category){
		ContentValues cv = new ContentValues();
		
		cv.put("alzeker", alzeker);
		cv.put("category", category);
		
		getWritableDatabase().insert(ALZEKER_TABLE, null, cv);
	}*/
	
	public Cursor getAll() {
		return getReadableDatabase().rawQuery("SELECT _id,zeker,category FROM "+ALZEKER_TABLE+"", null);
	}
	
	public Cursor getAllAzkarInCategory(String category){
		String [] args = {category};
		return getReadableDatabase().rawQuery("SELECT _id,zeker,category FROM "+ALZEKER_TABLE+" WHERE category=?", args);
	}
	
	public String getZekr(Cursor c){
		return c.getString(1);
	}
	
	private boolean checkDataBase(){
	    
        SQLiteDatabase checkDB = null;
 
        try{
            String myPath = DATABASE_PATH + DATABASE_NAME;
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
	    
        //Open your local db as the input stream
        InputStream myInput = this.context.getAssets().open(DATABASE_NAME);
 
        // Path to the just created empty db
        String outFileName = DATABASE_PATH + DATABASE_NAME;
 
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

}
