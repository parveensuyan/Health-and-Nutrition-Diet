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

public class BalancingActivityExcerciseList extends AppCompatActivity {
    ListView balancinglist;
    ArrayList list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balancing_activity_excercise_list);
        balancinglist= (ListView) findViewById(R.id.balancinglist);

            list=new ArrayList();
            list.add("Balancing on Hands ");
            list.add("Balancing on Knees");
            list.add("Twist Jumps");
            list.add("Balance Beam Exercises");
            list.add("Hopscotch");
            list.add("Heel-To-Toe Exercises");
            list.add("One-Legged Balance");
            list.add("Leg Swings");
            list.add("One-Legged Clock With Arms");
            list.add("Chair Stand");
            list.add("Leg Straightening");
            list.add("Knee Curl");
            list.add("Back Leg Raise");
            list.add("Chair Dip");
            list.add("Wall Push-Up");
            /*list.add("Seated Row with Resistance Band");
            list.add("Arm Curl");
            list.add("Side Arm Raise");
            list.add("Overhead Arm Raise");
            list.add("Wrist Curl");
*/

            fetch_list();
            ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
            balancinglist.setAdapter(arrayAdapter);
        balancinglist.setOnItemClickListener(  new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent myint=new Intent(BalancingActivityExcerciseList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==1)
                {
                    Intent myint=new Intent(BalancingActivityExcerciseList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==2)
                {
                    Intent myint=new Intent(BalancingActivityExcerciseList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==3)
                {
                    Intent myint=new Intent(BalancingActivityExcerciseList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==4)
                {
                    Intent myint=new Intent(BalancingActivityExcerciseList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==5)
                {
                    Intent myint=new Intent(BalancingActivityExcerciseList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }   if(position==6)
                {
                    Intent myint=new Intent(BalancingActivityExcerciseList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==7)
                {
                    Intent myint=new Intent(BalancingActivityExcerciseList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }
                if(position==8)
                {
                    Intent myint=new Intent(BalancingActivityExcerciseList.this,BalanceActivityVideo.class);
                    myint.putExtra("myvideo", position);

                    startActivity(myint);
                }



            }
        });
    }
        

    void fetch_list(){

        mydbhelper obj1=new mydbhelper(this);
        obj1.open();
        Cursor myresult;
        myresult = obj1.mydb.rawQuery("select * from balancingexcercise",null);
        while(myresult.moveToNext())
        {
            list.add(myresult.getString(myresult.getColumnIndex("namebal")));
        }
        myresult.close();
        obj1.close1();
    }


}

