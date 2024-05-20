package Slot5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Demo5SqlLite extends SQLiteOpenHelper {
    public static final String DB_name="PHA";
    public static final String SQl_crete_product="CREATE TABLE Product(\n" +
            "id text PRIMARY KEY,\n" +
            "name text,\n" +
            "price double,\n" +
            "image text)";

    public Demo5SqlLite(Context context){
        super(context,DB_name,null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL(SQl_crete_product);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Product;");

    }
}
