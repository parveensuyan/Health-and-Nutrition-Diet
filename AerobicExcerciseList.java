package com.example.parveen.healthconsultantsandnutrition;

import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AerobicExcerciseList extends AppCompatActivity {
    ListView arobiclist;
    ArrayList list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aerobic_excercise_list);
        arobiclist = (ListView) findViewById(R.id.aerobiclist);
        list = new ArrayList();
        list.add("Walking");
        list.add("Cycling");
        list.add("Swimming ");
        list.add("Jogging");
        list.add("Aerobic Dance");
        list.add("Boxing");
        list.add("Jumping jacks");
        list.add("Kickboxing");
        list.add("Racket sports");
        fetch_list2();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        arobiclist.setAdapter(arrayAdapter);
        arobiclist.setOnItemClickListener(  new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent myint=new Intent(AerobicExcerciseList.this,ArobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==1)
                {
                    Intent myint=new Intent(AerobicExcerciseList.this,ArobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==2)
                {
                    Intent myint=new Intent(AerobicExcerciseList.this,ArobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==3)
                {
                    Intent myint=new Intent(AerobicExcerciseList.this,ArobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==4)
                {
                    Intent myint=new Intent(AerobicExcerciseList.this,ArobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==5)
                {
                    Intent myint=new Intent(AerobicExcerciseList.this,ArobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }   if(position==6)
                {
                    Intent myint=new Intent(AerobicExcerciseList.this,ArobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==7)
                {
                    Intent myint=new Intent(AerobicExcerciseList.this,ArobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==8)
                {
                    Intent myint=new Intent(AerobicExcerciseList.this,ArobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }



            }
        });


        this.registerForContextMenu(arobiclist);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.contextmenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo menuInfo=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        int position=menuInfo.position;

       Intent nextactivity=new Intent(Intent.ACTION_VIEW);
        nextactivity.setData(Uri.parse("http://google.com/?q="+list.get(position)));
        startActivity(nextactivity);

        return super.onContextItemSelected(item);

    }
    void fetch_list2() {

        mydbhelper obj1 = new mydbhelper(this);
        obj1.open();
        Cursor myresult;


        myresult = obj1.mydb.rawQuery("select * from aerobiexcercise", null);
        while (myresult.moveToNext()) {
            list.add(myresult.getString(myresult.getColumnIndex("name2")));
        }
        obj1.close1();

    }
}
