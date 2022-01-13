package com.hit.digitalwallethitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class MenuScreen extends AppCompatActivity {

    MenuAdapterClass menuAdapterClass;
    ArrayList<MenuModelClass> menu_items;
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        recyclerView = findViewById(R.id.recyclerView);
        getData();
        setAdapter();
    }

    private void setAdapter() {
        menuAdapterClass = new MenuAdapterClass(MenuScreen.this, menu_items);
        recyclerView.setAdapter(menuAdapterClass);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getData() {
        menu_items = new ArrayList<>();
        menu_items.add(new MenuModelClass(R.drawable.shapes, R.drawable.ic_baseline_arrow_forward_24,"Send Money"));
        menu_items.add(new MenuModelClass(R.drawable.shapes, R.drawable.ic_baseline_arrow_forward_24,"Top up wallet"));
        menu_items.add(new MenuModelClass(R.drawable.shapes, R.drawable.ic_baseline_arrow_forward_24,"Bill Payment"));
        menu_items.add(new MenuModelClass(R.drawable.shapes, R.drawable.ic_baseline_arrow_forward_24,"Withdraw"));
        menu_items.add(new MenuModelClass(R.drawable.shapes, R.drawable.ic_baseline_arrow_forward_24,"History Transaction"));
        menu_items.add(new MenuModelClass(R.drawable.shapes, R.drawable.ic_baseline_arrow_forward_24,"Request Payment"));
        menu_items.add(new MenuModelClass(R.drawable.shapes, R.drawable.ic_baseline_arrow_forward_24,"Settings"));
        menu_items.add(new MenuModelClass(R.drawable.shapes, R.drawable.ic_baseline_arrow_forward_24,"Help"));
    }



}