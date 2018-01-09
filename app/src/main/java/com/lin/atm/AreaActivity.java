package com.lin.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AreaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView area;
    String[] data = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        area = (ListView) findViewById(R.id.area);
        int city = getIntent().getIntExtra("GO_AREA",0);

        switch(city){
            case 0:
                data = new String[]{"暖暖區","八堵區","中正區"};
                break;
            case 1:
                data = new String[]{"永和區","新莊區","板橋區"};
                break;
            case 2:
                data = new String[]{"大安區","士林區","信義區"};
        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        area.setAdapter(adapter);
        area.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        getIntent().putExtra("BACK_CITY", data[position]);
        setResult(RESULT_OK,getIntent());
        finish();
        }
    }

