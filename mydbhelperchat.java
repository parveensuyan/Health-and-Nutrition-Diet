package com.example.parveen.healthconsultantsandnutrition;
import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class mydbhelperchat extends SQLiteOpenHelper
{


 static String DATABASE_NAME="new_bas2e";
    static int DB_VERSION=1;
    Context mycontext;
    SQLiteDatabase mydb;
   public mydbhelperchat(Context context)
   {
       super(context,DATABASE_NAME,null,DB_VERSION);
       mycontext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String q111="create table if not exists delivery_key_table(" +
                    "delivery_key text" +
                    ",id_key Integer primary key"+
                ")";
        String qq="create table if not exists chat_whatsapp(" +
                "phonenumber text" +
                ",message text" +
                ",name text," +
                "from_number text" +
                ",mytime_msg text" +
                ",message_by text," +
                "sent text," +
                "message_id text primary key);";
        db.execSQL(qq);
        db.execSQL(q111);
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
    public long insertdelivery_key(String delivery_key)
    {
        ContentValues myvalues2=new ContentValues();
        myvalues2.clear();

        myvalues2.put("id_key",1);
         myvalues2.put("delivery_key",delivery_key);
        long a1= mydb.insertWithOnConflict("delivery_key_table",null,myvalues2, SQLiteDatabase.CONFLICT_IGNORE);
        if(a1<0)mydb.update("delivery_key_table",myvalues2, "id_key = 1", null);
       // Log.d("chat","dilvery report "+a1);
        return a1;

    }

    public long insertdata_chat(String phonenumber, String message, String from_number, String time_msg, String msg_by, String sent_time, String message_id)
    {
        ContentValues myvalues2=new ContentValues();
        myvalues2.clear();
        if(phonenumber!=null) myvalues2.put("phonenumber",phonenumber);
        if(message!=null) myvalues2.put("message",message);
        if(from_number!=null)  myvalues2.put("from_number",from_number);
        if(time_msg!=null) myvalues2.put("mytime_msg",time_msg);
        if(msg_by!=null) myvalues2.put("message_by",msg_by);
        if(sent_time!=null)myvalues2.put("sent",sent_time);
        if(message_id!=null) myvalues2.put("message_id",message_id);
        long a= mydb.insertWithOnConflict("chat_whatsapp",null,myvalues2, SQLiteDatabase.CONFLICT_IGNORE);

//Log.d("chat",""+a);
        if(a<0)mydb.update("chat_whatsapp",myvalues2, "message_id =?", new String[]{message_id});
        return a;
    
    }

    public long deletedata_chat(String phonenumber)
    {
        return mydb.delete("chat_whatsapp","phonenumber"+phonenumber,null);
    }
}
