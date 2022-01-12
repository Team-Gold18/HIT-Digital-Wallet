package com.hit.digitalwallethitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;


import com.hit.digitalwallethitapp.ContactMembers.Data;

public class SendMoneyScreen extends AppCompatActivity implements digitalwallethitapp.OnSpinnerEventsListener {

    private Spinner spinner_members;
    private MembersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money_screen);

        //create to Kasun
        spinner_members =findViewById(R.id.spinner_members);

        spinner_members.setSpinnerEventsListener(this);

        adapter = new MembersAdapter(SendMoneyScreen.this, Data.getMembersList());
        spinner_members.setAdapter(adapter);


    }
}