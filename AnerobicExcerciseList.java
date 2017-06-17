package com.example.parveen.healthconsultantsandnutrition;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class AnerobicExcerciseList extends AppCompatActivity {
    ListView anerobiclist;
    ArrayList list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anerobic_excercise_list);
        anerobiclist= (ListView) findViewById(R.id.listView);
        list=new ArrayList();

        list.add("Chin Ups");
        list.add("Jumping Rope");
        list.add("Isometrics");
        list.add("Push Ups");
        list.add("Sprinting Activities");
        list.add("Sit-Ups");
        list.add("Squats");
        list.add("Tug of War");
        list.add("Weight Training");
        fetch_list();
       ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        anerobiclist.setAdapter(arrayAdapter);

        anerobiclist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

      if(position==0){


          Intent myint=new Intent(AnerobicExcerciseList.this,AnerobicActivityVideo.class);
          myint.putExtra("myvideo", position);

             startActivity(myint);
               }

                if(position==1){


                    Intent myint=new Intent(AnerobicExcerciseList.this,AnerobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==2){


                    Intent myint=new Intent(AnerobicExcerciseList.this,AnerobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==3){


                    Intent myint=new Intent(AnerobicExcerciseList.this,AnerobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==4){


                    Intent myint=new Intent(AnerobicExcerciseList.this,AnerobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==6){


                    Intent myint=new Intent(AnerobicExcerciseList.this,AnerobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==8){


                    Intent myint=new Intent(AnerobicExcerciseList.this,AnerobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==5){


                    Intent myint=new Intent(AnerobicExcerciseList.this,AnerobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==7){


                    Intent myint=new Intent(AnerobicExcerciseList.this,AnerobicActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
            }
        });
        this.registerForContextMenu(anerobiclist);

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
    void fetch_list(){

        mydbhelper obj1=new mydbhelper(this);
        obj1.open();
        Cursor myresult;
        myresult = obj1.mydb.rawQuery("select * from anerobicexcer",null);
        while(myresult.moveToNext())
        {
            list.add(myresult.getString(myresult.getColumnIndex("name3")));
        }
        myresult.close();
        obj1.close1();
    }


}
