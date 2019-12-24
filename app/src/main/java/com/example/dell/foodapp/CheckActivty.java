package com.example.dell.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CheckActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_activty);

        String name =getIntent().getStringExtra("NamE");
        String Mobile =getIntent().getStringExtra("phonE");
        TextView tv=findViewById(R.id.textViewFirst);
        tv.setText(name);
        TextView tv2=findViewById(R.id.textViewsecond);
        tv2.setText(Mobile);

    }

}
