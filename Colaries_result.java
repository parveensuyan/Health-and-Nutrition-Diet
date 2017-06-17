package com.example.parveen.healthconsultantsandnutrition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Colaries_result extends AppCompatActivity {
TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colaries_result);
        result= (TextView) findViewById(R.id.result_main);
        float result1=getIntent().getExtras().getFloat("Calories");
        result.setText(""+result1);
    }
}
