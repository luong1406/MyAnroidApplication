package Slot5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class Demo5ProductDAO {
    private  Demo5SqlLite dbHelper;
    private SQLiteDatabase db;
    private Context context;
    //create db and table
    public Demo5ProductDAO(Context context){
        this.context=context;
        dbHelper=new Demo5SqlLite(context);
        db=dbHelper.getWritableDatabase();
    }
    //insert
    public int insertProduct(Demo5Product p){
        ContentValues values=new ContentValues();//data for insert
        //put data
        values.put("id",p.getId());
        values.put("name",p.getName());
        values.put("price",p.getPrice());
        //insert
        if(db.insert("Product",null,values)<0){
            return -1;//unsuccessful
        }
        return 1;//successful
    }
    //get data
    public List<Demo5Product> getAll(){
        List<Demo5Product> list=new ArrayList<>();
        //cursor read data
        Cursor c=db.query("Product",null,null,null,null,null,null,null);
        c.moveToFirst();
        while (c.isAfterLast()==false){
            Demo5Product product=new Demo5Product();
            product.setId(c.getString(0));
            product.setName(c.getString(1));
            product.setPrice(c.getDouble(2));
            list.add(product);
            c.moveToNext();
        }
        c.close();
        return list;
    }

}
