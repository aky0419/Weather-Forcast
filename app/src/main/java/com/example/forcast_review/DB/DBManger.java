package com.example.forcast_review.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DBManger {

    public static SQLiteDatabase database;

    public static void initDB(Context context){
        DBHelper dbHelper = new DBHelper(context);
        database = dbHelper.getWritableDatabase();
    }

    public static List<String> queryAllCityName(){

        Cursor cursor = database.query("info", null, null, null, null, null, null, null);
        List<String> cityList = new ArrayList<>();

        while(cursor.moveToNext()){
            String city = cursor.getString(cursor.getColumnIndex("city"));
            cityList.add(city);
        }
        return cityList;

    }

    //根据城市名称，替换信息内容
    public static int updateInfoByCity(String city, String content){
        ContentValues contentValues = new ContentValues();
        contentValues.put("content",content);
        return database.update("info", contentValues, "city=?", new String[]{city});
    }

    public static long addCityInfo(String city, String content){
        ContentValues values = new ContentValues();
        values.put("city", city);
        values.put("content", content);
        return database.insert("info", null, values);
    }

    public static String getCityInfo(String city){
        Cursor cursor = database.query("info", null, "city=?", new String[]{city}, null, null, null);
        if (cursor.getCount() > 0){
            cursor.moveToFirst();
            String content = cursor.getString(cursor.getColumnIndex("content"));
            return content;

        }
        return null;
    }

    //存储城市天气， 要求最多存储五个城市，一旦超过五个城市，就不能存储了
    public static int getCityCount(){
        Cursor cursor = database.query("info", null, null, null, null, null, null);
        return cursor.getCount();
    }

    public static List<DataBaseBean> queryAllInfo(){
        Cursor cursor = database.query("info", null, null, null, null, null, null);
        List<DataBaseBean> mData = new ArrayList<>();
        while(cursor.moveToNext()){
            int id = cursor.getInt(cursor.getColumnIndex("_id"));
            String city = cursor.getString(cursor.getColumnIndex("city"));
            String content = cursor.getString(cursor.getColumnIndex("content"));

            DataBaseBean dataBaseBean = new DataBaseBean(id, city, content);
            mData.add(dataBaseBean);
        }
        return mData;



    }

    public static int deleteCity(String city){
        return database.delete("info", "city=?", new String[]{city});
    }

    public static void deleteAllInfo(){
        String sql = "delete from info";
        database.execSQL(sql);
    }

}
