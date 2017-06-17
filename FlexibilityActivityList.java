package com.example.parveen.healthconsultantsandnutrition;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FlexibilityActivityList extends AppCompatActivity {
    ListView flexibilitylist;
    ArrayList list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexibility_activity_list);

           flexibilitylist = (ListView) findViewById(R.id.flexiblitylist);
            list=new ArrayList();
            list.add("Dynamic stretching");
            list.add("Ballistic stretching");
            list.add("Isometric stretching");
            list.add("PNF stretching");
            list.add("Shoulder & Chest");
        //    list.add("Arm Across Chest");
            list.add("Triceps Stretch");
            list.add("Glute Stretch");
            list.add("Single Leg Hamstring");
            list.add("Standing Quadriceps");
            list.add(" Standing Calf");
            list.add(" Ankle Bounces");
            list.add(" Heel Raise");
            list.add(" Smith Machine Pushups");
            list.add(" Bench Dip");
            list.add(" Die Bomber Pushups");
            list.add("Alternative Toe Touch");
            list.add("Double Crunch");
            list.add("FOREARMS");

            ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
          flexibilitylist.setAdapter(arrayAdapter);
     flexibilitylist.setOnItemClickListener(  new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent myint=new Intent(FlexibilityActivityList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==1)
                {
                    Intent myint=new Intent(FlexibilityActivityList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==2)
                {
                    Intent myint=new Intent(FlexibilityActivityList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==3)
                {
                    Intent myint=new Intent(FlexibilityActivityList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==4)
                {
                    Intent myint=new Intent(FlexibilityActivityList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==5)
                {
                    Intent myint=new Intent(FlexibilityActivityList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }   if(position==6)
                {
                    Intent myint=new Intent(FlexibilityActivityList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==7)
                {
                    Intent myint=new Intent(FlexibilityActivityList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==8)
                {
                    Intent myint=new Intent(FlexibilityActivityList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }



            }
        });
    }


    void fetch_list2(){

        mydbhelper obj1=new mydbhelper(this);
        obj1.open();
        Cursor myresult;

        myresult = obj1.mydb.rawQuery("select * from flexibilityexcercise",null);
        while(myresult.moveToNext())
        {
            list.add(myresult.getString(myresult.getColumnIndex("name4")));
        }
        obj1.close1();

    }
    }
