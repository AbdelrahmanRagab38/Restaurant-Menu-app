package com.example.dell.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {
    public static final String Extra_DrinkNo="drinkno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        int drinkno= (Integer) getIntent().getExtras().get(Extra_DrinkNo);
        Drink drink = Drink.ourDrink[drinkno];
        TextView name =(TextView) findViewById(R.id.name1);
        TextView desc =(TextView) findViewById(R.id.desc1);
        ImageView drinkimage =(ImageView) findViewById(R.id.drinkimage);

        name.setText(drink.getName());
        desc.setText(drink.getDescription());
        drinkimage.setImageResource(drink.getImageId());


    }
}
