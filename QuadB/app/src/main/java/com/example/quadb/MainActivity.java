package com.example.quadb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner mCuisine;

    ImageView mPizza;
    ImageView mBurger;
    ImageView mFries;
    ImageView mHealthy;
    ImageView mSandwich;
    ImageView mCake;
    ImageView mChaat;
    ImageView mChinese;
    ImageView mPaypal;
    ImageView mPaytm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCuisine = (Spinner) findViewById(R.id.s_cuisine);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,
                getResources().getStringArray(R.array.cuisines));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mCuisine.setAdapter(adapter);
        mBurger = (ImageView) findViewById(R.id.iv_burger);
        mPaypal = (ImageView) findViewById(R.id.offer_paypal);
        mCake = (ImageView) findViewById(R.id.iv_cake);
        mChaat = (ImageView) findViewById(R.id.iv_chaat);
        mChinese = (ImageView) findViewById(R.id.iv_chinese);
        mPaytm = (ImageView) findViewById(R.id.offer_paytm);
        mPizza = (ImageView) findViewById(R.id.iv_pizza);
        mHealthy = (ImageView) findViewById(R.id.iv_healthy);
        mFries = (ImageView) findViewById(R.id.iv_fries);
        mSandwich = (ImageView) findViewById(R.id.iv_sandwich);
    }
}