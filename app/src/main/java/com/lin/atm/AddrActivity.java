package com.lin.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddrActivity extends AppCompatActivity {
    Spinner citychoose;
    Spinner areachoose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);
        citychoose = (Spinner) findViewById(R.id.sp_city);
        areachoose = (Spinner) findViewById(R.id.sp_city);
        String data[]= {"基隆市","新北市","台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
        citychoose.setAdapter(adapter);
        citychoose.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String[] data = null;
                if(position == 0){
                    data = new String[]{"暖暖區"};
                }
                if(position == 1){
                    data = new String[]{"中和區","新莊區 "};
                }
                if(position == 2){
                    data = new String[]{"大安區"};

                }
                ArrayAdapter adapter = new ArrayAdapter(AddrActivity.this,android.R.layout.simple_list_item_1,data);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
