package com.example.parveen.healthconsultantsandnutrition;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class mydbhelper extends SQLiteOpenHelper {
    static String DATABASE_NAME="healthdbjiii";
    static int DB_VERSION=1;
    Context mycontext;
    SQLiteDatabase mydb;
    public mydbhelper(Context context)
    {
        super(context,DATABASE_NAME,null,DB_VERSION);
        mycontext=context;
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String q="create table if not exists " +
                "anerobicexcer(name text primary key);";
        String qq="create table if not exists aerobiexcercise(namean text primary key);";
        String q3="create table if not exists balancingexcercise(namebal text primary key);";
        String q4="create table if not exists flexibilityexcercise(nameflex text primary key);";
        String q5="create table if not exists anerobicvideo(video text primary key);";
        db.execSQL(q5);

        db.execSQL(q4);
        db.execSQL(q3);
        db.execSQL(qq);
        db.execSQL(q);
        Toast.makeText(mycontext, "created", Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
    public void open() throws SQLException
    {
        mydb=this.getReadableDatabase();
    }
    public void close1(){
        mydb.close();

    }
    public long insertdata_contact(String name){
        ContentValues myvalues=new ContentValues();
        myvalues.put("name",name);
        return mydb.insert("anerobicexcer",null,myvalues);
    }
    public long insertdata_2(String name2){
        ContentValues myvalues=new ContentValues();
        myvalues.put("namean",name2);
        return mydb.insert("aerobiexcercise",null,myvalues);
    }
    public long insertdata_3(String name3){
        ContentValues myvalues=new ContentValues();
        myvalues.put("namebal",name3);
        return mydb.insert("balancingexcercise",null,myvalues);
    }
    public long insertdata_4(String name4){
        ContentValues myvalues=new ContentValues();
        myvalues.put("nameflex",name4);
        return mydb.insert("flexibilityexcercise",null,myvalues);
    }
}
