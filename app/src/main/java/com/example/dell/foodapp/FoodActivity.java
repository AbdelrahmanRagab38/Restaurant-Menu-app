package com.example.dell.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {
public static final String Extra_FoodNo="foodno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        int foodno= (Integer) getIntent().getExtras().get(Extra_FoodNo);
        Food food=Food.ourFood[foodno];
        TextView name= (TextView) findViewById(R.id.Name);
        TextView Desc= (TextView) findViewById(R.id.Desc);
        ImageView foodimage=(ImageView)findViewById(R.id.foodimage) ;

        name.setText(food.getName());
        Desc.setText(food.getDescription());
        foodimage.setImageResource(food.getImageId());
    }
}
