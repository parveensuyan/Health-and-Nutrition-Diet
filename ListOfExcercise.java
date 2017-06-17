package com.example.parveen.healthconsultantsandnutrition;

import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class ListOfExcercise extends AppCompatActivity {
        String excerciselist[]={"Aerobic","Anaerobic","Balance","Flexibility","others"};
        ListView excercises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_exercise_activity);
        excercises= (ListView) findViewById(R.id.listofexcercises);



        excercises.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,excerciselist));
        excercises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==1){
                    Intent myint=new Intent(ListOfExcercise.this,AnerobicExcerciseList.class);
                    startActivity(myint);
                }
                if(position==0){
                    Intent myint=new Intent(ListOfExcercise.this,AerobicExcerciseList.class);
                    startActivity(myint);
                }
                if(position==2){
                    Intent myint=new Intent(ListOfExcercise.this,BalancingActivityExcerciseList.class);
                    startActivity(myint);
                }
                if(position==3){
                    Intent myint=new Intent(ListOfExcercise.this,FlexibilityActivityList.class);
                    startActivity(myint);
                }
                if(position==4){
                    Intent myint=new Intent(ListOfExcercise.this,DietToBeFollowActivity.class);
                    startActivity(myint);
                }


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       Intent m = null;
        if(item.getItemId()==R.id.chat_with_doctor)
        {

            m= new Intent(ListOfExcercise.this,ChatActivity.class);

        }
        if(item.getItemId()==R.id.calories_activity){
            m= new Intent(ListOfExcercise.this,Calories_calculator.class);

        }
        if(item.getItemId()==R.id.diet){
            m= new Intent(ListOfExcercise.this,Calories_calculator.class);

        }
        if (m!=null) startActivity(m);
        return super.onOptionsItemSelected(item);
    }
}
