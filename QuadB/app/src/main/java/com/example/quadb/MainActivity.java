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
        int burgerId = getResources().getIdentifier("@drawable/burger",null, this.getPackageName());
        mBurger.setImageResource(burgerId);
        mPaypal = (ImageView) findViewById(R.id.offer_paypal);
        int paypalId = getResources().getIdentifier("@drawable/offer_paypal",null, this.getPackageName());
        mPaypal.setImageResource(paypalId);
        mCake = (ImageView) findViewById(R.id.iv_cake);
        int cakeId = getResources().getIdentifier("@drawable/cake",null, this.getPackageName());
        mCake.setImageResource(cakeId);
        mChaat = (ImageView) findViewById(R.id.iv_chaat);
        int chaatId = getResources().getIdentifier("@drawable/chaat",null, this.getPackageName());
        mChaat.setImageResource(chaatId);
        mChinese = (ImageView) findViewById(R.id.iv_chinese);
        int chineseId = getResources().getIdentifier("@drawable/chinese",null, this.getPackageName());
        mChinese.setImageResource(chineseId);
        mPaytm = (ImageView) findViewById(R.id.offer_paytm);
        int paytmId = getResources().getIdentifier("@drawable/offer_paytm",null, this.getPackageName());
        mPaytm.setImageResource(paytmId);
        mPizza = (ImageView) findViewById(R.id.iv_pizza);
        int pizzaId = getResources().getIdentifier("@drawable/pizza",null, this.getPackageName());
        mPizza.setImageResource(pizzaId);
        mHealthy = (ImageView) findViewById(R.id.iv_healthy);
        int healthyId = getResources().getIdentifier("@drawable/healthy",null, this.getPackageName());
        mHealthy.setImageResource(healthyId);
        mFries = (ImageView) findViewById(R.id.iv_fries);
        int friesId = getResources().getIdentifier("@drawable/fries",null, this.getPackageName());
        mFries.setImageResource(friesId);
        mSandwich = (ImageView) findViewById(R.id.iv_sandwich);
        int sandwichId = getResources().getIdentifier("@drawable/sandwich",null, this.getPackageName());
        mSandwich.setImageResource(sandwichId);
    }
}