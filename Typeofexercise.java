package com.example.parveen.healthconsultantsandnutrition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Typeofexercise extends AppCompatActivity {

    ListView typesofexercise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        typesofexercise= (ListView) findViewById(R.id.typeofexercise);

    }
}
