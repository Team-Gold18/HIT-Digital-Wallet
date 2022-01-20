package com.hit.digitalwallethitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class ContactListScreen extends AppCompatActivity implements ContactListAdapter.RecyclerViewClickListener{

    RecyclerView recyclerView;
    ArrayList<Contacts> newUserArrayList;
    ContactListAdapter contactListAdapter;
    String[] userName;
    String[] accNo;
    int[] userImg;
    private ContactListAdapter.RecyclerViewClickListener listener;
    ImageButton backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list_screen);

        //backArrow
        backArrow = findViewById(R.id.img_back_arrow_contact);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContactListScreen.this,BalanceScreen.class);
                startActivity(intent);
            }
        });

        recyclerView = findViewById(R.id.contact_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        newUserArrayList = new ArrayList<Contacts>();

        contactListAdapter = new ContactListAdapter(this,newUserArrayList,this::onClick);
        recyclerView.setAdapter(contactListAdapter);

        userName = new String[]{
                "Samantha",
                "Rose Hope",
                "Angela Smith",
                "Andrea Summer",
                "Karen William",
                "Thomas Wise",
                "Samantha",
                "Rose Hope",
                "Angela Smith",
                "Andrea Summer",
                "Karen William",
                "Thomas Wise"
        };

        accNo = new String[]{
                "Bank - 0987 3422 8756",
                "Bank - 0987 3422 8756",
                "Bank - 0987 3422 8756",
                "Bank - 0987 3422 8756",
                "Bank - 0987 3422 8756",
                "Bank - 0987 3422 8756",
                "Bank - 0987 3422 8756",
                "Bank - 0987 3422 8756",
                "Bank - 0987 3422 8756",
                "Bank - 0987 3422 8756",
                "Bank - 0987 3422 8756",
                "Bank - 0987 3422 8756"
        };

        userImg = new int[]{
                R.drawable.samantha,
                R.drawable.rose,
                R.drawable.angela,
                R.drawable.andrea,
                R.drawable.karen,
                R.drawable.thomas,
                R.drawable.samantha,
                R.drawable.rose,
                R.drawable.angela,
                R.drawable.andrea,
                R.drawable.karen,
                R.drawable.thomas
        };

        getData();
    }

    private void getData() {
        for(int i=0; i<userName.length; i++){
            Contacts contacts = new Contacts(userName[i],accNo[i],userImg[i]);
            newUserArrayList.add(contacts);
        }

        contactListAdapter.notifyDataSetChanged();
    }


    @Override
    public void onClick(int position) {
        Intent intent = new Intent(ContactListScreen.this,SendMoneyScreen.class);
        startActivity(intent);
    }
}