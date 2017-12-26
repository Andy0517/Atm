package com.lin.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        city = (ListView) findViewById(R.id.city);
        String[] data ={"基隆市","新北市","台北市"};
        ArrayAdapter adapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
        city.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

    }
}
