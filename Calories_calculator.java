package com.example.parveen.healthconsultantsandnutrition;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class Calories_calculator extends AppCompatActivity {
EditText age,height,weight;
    Spinner your_gender,your_activity;
    Button calculate,reset;
float activity_marks= (float) 1.2;
    boolean FEMALE=false;//MALE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories_calculator);

        age= (EditText) findViewById(R.id.age);
        height= (EditText) findViewById(R.id.height);
        weight= (EditText) findViewById(R.id.weight);
        your_gender= (Spinner) findViewById(R.id.gender_spin);
        your_activity= (Spinner) findViewById(R.id.activity_spin);
        calculate= (Button) findViewById(R.id.calculate_btn);
        reset= (Button) findViewById(R.id.reset_btn);


        ArrayAdapter<CharSequence> arrayAdapter=ArrayAdapter.createFromResource(this,R.array.gender_array,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        your_gender.setAdapter(arrayAdapter);

        ArrayAdapter<CharSequence> arrayAdapter1=ArrayAdapter.createFromResource(this,R.array.activity_array,android.R.layout.simple_spinner_item);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        your_activity.setAdapter(arrayAdapter1);
your_gender.setOnItemSelectedListener(new OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {
            case 0:
                FEMALE = false;
                break;
            case 1:
                FEMALE = true;
                break;
            default:
                FEMALE = false;
        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});
        your_activity.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        activity_marks = (float) 1.2;
                        break;
                    case 1:
                        activity_marks = (float) 1.375;
                        break;
                    case 2:
                        activity_marks = (float) 1.55;
                        break;
                    case 3:
                        activity_marks = (float) 1.725;
                        break;
                    case 4:
                        activity_marks = (float) 1.9;
                        break;
                    default:
                        activity_marks = (float) 1.2;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int age1;
                int weight1;

                int height1;
                if(age.getText().toString().equals("")) {
                    Toast.makeText(Calories_calculator.this, "Please Enter Your Age", Toast.LENGTH_SHORT).show();
                    return;
                }
                try{
                    age1 =Integer.parseInt(age.getText().toString());
                    if(age1<=0){
                        Toast.makeText(Calories_calculator.this, "Enter Correct Age", Toast.LENGTH_SHORT).show();
                    return;
                    }
                }
                catch (Exception io){
                    Toast.makeText(Calories_calculator.this, "Enter Correct Age", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(weight.getText().toString().equals("")) {

                    Toast.makeText(Calories_calculator.this, "Please Enter Your Weight", Toast.LENGTH_SHORT).show();
                    return;
                }
                try{
                    weight1 =Integer.parseInt(weight.getText().toString());
                    if(weight1<=0){
                        Toast.makeText(Calories_calculator.this, "Enter Correct Weight", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }catch (Exception io){
                    Toast.makeText(Calories_calculator.this, "Enter Correct Weight", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(height.getText().toString().equals("")) {
                    Toast.makeText(Calories_calculator.this, "Please Enter Your height", Toast.LENGTH_SHORT).show();
                    return;
                }
                try{
                    height1 =Integer.parseInt(height.getText().toString());//here is erorr man
                    if(height1<=0){
                        Toast.makeText(Calories_calculator.this, "Enter Correct height", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }catch (Exception io){
                    Toast.makeText(Calories_calculator.this, "Enter Correct height", Toast.LENGTH_SHORT).show();
                    return;
                }
                float result=0;
                if(!FEMALE){
                  result = (float) (activity_marks*  (66.47+ (13.75*weight1) + (5.0*height1) - (6.75*age1)));
                    Intent a= new Intent(Calories_calculator.this,Colaries_result.class);
                    a.putExtra("Calories",result);
                    startActivity(a);
                }
                if(FEMALE){
                    result= (float)( activity_marks*(665.09 + (9.56*weight1) + (1.84*height1) - (4.67*age1)));
                    Toast.makeText(Calories_calculator.this, "female"+result, Toast.LENGTH_SHORT).show();
                    Intent a= new Intent(Calories_calculator.this,Colaries_result.class);
                    a.putExtra("Calories",result);
                    startActivity(a);

                }

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                age.setText("");
                weight.setText("");
                height.setText("");
            }
        });

    }

}
