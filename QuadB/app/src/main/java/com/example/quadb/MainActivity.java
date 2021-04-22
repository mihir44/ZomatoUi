package com.example.quadb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner mCuisine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCuisine = (Spinner) findViewById(R.id.s_cuisine);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,
                getResources().getStringArray(R.array.cuisines));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mCuisine.setAdapter(adapter);
    }
}