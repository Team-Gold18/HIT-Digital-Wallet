package com.hit.digitalwallethitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ContactListScreen extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Contacts> newUserArrayList;
    ContactListAdapter contactListAdapter;
    String[] userName;
    String[] accNo;
    int[] userImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list_screen);

        recyclerView = findViewById(R.id.contact_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        newUserArrayList = new ArrayList<Contacts>();

        contactListAdapter = new ContactListAdapter(this,newUserArrayList);
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
                R.drawable.korean,
                R.drawable.thomas,
                R.drawable.samantha,
                R.drawable.rose,
                R.drawable.angela,
                R.drawable.andrea,
                R.drawable.korean,
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

}