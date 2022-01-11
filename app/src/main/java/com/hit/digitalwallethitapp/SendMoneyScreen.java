package com.hit.digitalwallethitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class SendMoneyScreen extends AppCompatActivity {

    String[] items = {"Samantha","Rose Hope","Angela Smith","Andrea Summer","Karen William"};
    AutoCompleteTextView autoCompleteTxt;

    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money_screen);

        //create to Kasun

        autoCompleteTxt = findViewById(R.id.autoComplete_txt);

        adapterItems =new ArrayAdapter<String >(this,R.layout.activity_send_money_screen,items);

        autoCompleteTxt.setAdapter(adapterItems);

        autoCompleteTxt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Item:" +item,Toast.LENGTH_SHORT).show();

            }
        });

    }

}