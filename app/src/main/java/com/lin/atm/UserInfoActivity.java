package com.lin.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {
    EditText edname;
    EditText edphone;
    Spinner agechoose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
       ArrayList<String> data = new ArrayList<>();
        for(int i=16;i<=40;i++){
            data.add(i+"");
        }
        edname = (EditText) findViewById(R.id.ed＿name);
        edphone = (EditText) findViewById(R.id.ed_phone);
       agechoose = (Spinner) findViewById(R.id.sp_age);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
        agechoose.setAdapter(adapter);
        edname.setText(getSharedPreferences("atm", MODE_PRIVATE)
                .getString("Name", ""));
        edphone.setText(getSharedPreferences("atm", MODE_PRIVATE)
                .getString("Phone", ""));
    }
    public void ok(View view){
        String name = edname.getText().toString();
        String phone = edphone.getText().toString();
        getIntent().putExtra("USER_NAME", name);
        getIntent().putExtra("USER_PHONE", phone);
        setResult(RESULT_OK, getIntent());
        finish();


    }
    public void address(View view){
        Intent addresslayout = new Intent(this,CityActivity.class);
        startActivity(addresslayout);
    }
}
