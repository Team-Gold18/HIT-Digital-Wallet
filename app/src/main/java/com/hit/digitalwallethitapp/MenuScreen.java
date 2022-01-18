package com.hit.digitalwallethitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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
        menu_items.add(new MenuModelClass(R.drawable.shapes1, R.drawable.ic_baseline_archive_24,"Top up wallet"));
        menu_items.add(new MenuModelClass(R.drawable.shapes2, R.drawable.ic_baseline_payments_24,"Bill Payment"));
        menu_items.add(new MenuModelClass(R.drawable.shapes3, R.drawable.ic_baseline_sim_card_download_24,"Withdraw"));
        menu_items.add(new MenuModelClass(R.drawable.shapes4, R.drawable.ic_baseline_compare_arrows_24,"History Transaction"));
        menu_items.add(new MenuModelClass(R.drawable.shapes5, R.drawable.ic_baseline_group_24,"Request Payment"));
        menu_items.add(new MenuModelClass(R.drawable.shapes6, R.drawable.ic_baseline_settings_24,"Settings"));
        menu_items.add(new MenuModelClass(R.drawable.shapes7, R.drawable.ic_baseline_text_snippet_24,"Help"));
    }



}