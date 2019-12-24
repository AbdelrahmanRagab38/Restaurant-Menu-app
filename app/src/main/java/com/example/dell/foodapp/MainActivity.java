package com.example.dell.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View v, int i, long l) {
                if(i==0){
                    Intent intent =new Intent(MainActivity.this,FoodCategory.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent =new Intent(MainActivity.this,DrinkCategory.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.food_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
