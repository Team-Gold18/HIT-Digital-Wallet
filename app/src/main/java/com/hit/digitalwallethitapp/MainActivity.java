package com.hit.digitalwallethitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.hit.digitalwallethitapp.ContactMembers.Data;


public class MainActivity extends AppCompatActivity {

    private Spinner spinner_members;
    private MembersAdapter adapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_members =findViewById(R.id.spinner_mambers);



        adapter = new MembersAdapter(MainActivity.this, Data.getMembersList());
        spinner_members.setAdapter(adapter);



    }
}