package com.example.dell.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class Constraint extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
    }
    public void btnClicked(View view){
        EditText et_name=findViewById(R.id.editText);
      String text=  et_name.getText().toString();
      EditText et_mobile= findViewById(R.id.editText3);
      String Mobile=et_mobile.getText().toString();
        Intent intent=new Intent(Constraint.this,CheckActivty.class);
        intent.putExtra("NamE","Abdelrahman");
        intent.putExtra("phonE","01208648921");
        startActivity(intent);

    }
}
