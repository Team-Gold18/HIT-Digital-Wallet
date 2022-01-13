package com.hit.digitalwallethitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;


import com.hit.digitalwallethitapp.ContactMembers.Data;


public class SendMoneyScreen extends AppCompatActivity  {


    private Spinner spinner_members;


    private MembersAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money_screen);

        //create to Kasun


        adapter = new MembersAdapter(SendMoneyScreen.this, Data.getMembersList());
        spinner_members.setAdapter(adapter);



    }
}