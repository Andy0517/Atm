package com.lin.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView city;
    int purpose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        city = (ListView) findViewById(R.id.city);
        String[] data ={"基隆市","新北市","台北市"};
        ArrayAdapter adapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
        city.setAdapter(adapter);
        city.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Intent arealayout = new Intent(this,AreaActivity.class);
            getIntent().putExtra("GO_AREA", position);
            startActivity(arealayout);
           // data = new String[]{"暖暖區","八堵區","中正區"};

            //data = new String[]{"永和區","新莊區","板橋區"};

           // data = new String[]{"大安區","士林區","信義區"};

       // ArrayAdapter adapter = new ArrayAdapter(CityActivity.this,android.R.layout.simple_list_item_1,data);

    }
}
