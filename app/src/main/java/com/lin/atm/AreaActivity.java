package com.lin.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.lin.atm.CityActivity.GO_KEELUNG;

public class AreaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView area;

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case GO_KEELUNG:
                String[] rang = {"暖暖區", "八堵區", "中正區"};
                ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, rang);
                area.setAdapter(adapter);
                area.setOnItemClickListener(this);
                break;
        }
      /*  if(position == 1){
            data = new String[]{"永和區","新莊區","板橋區"};
        }
        if(position == 2){
            data = new String[]{"大安區","士林區","信義區"};

        }*/
        //  ArrayAdapter adapter = new ArrayAdapter(AddrActivity.this,android.R.layout.simple_list_item_1,data);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        area = (ListView) findViewById(R.id.area);
        String[] data = {"基隆市", "新北市", "台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        area.setAdapter(adapter);
        area.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        }
    }
}
