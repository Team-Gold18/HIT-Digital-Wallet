package com.hit.digitalwallethitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TransactionHistoryActivity extends AppCompatActivity {

    BalanceListAdapter balanceListAdapter;
    ArrayList<BalanceModel> bData;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_history);

        recyclerView = findViewById(R.id.rv_transactionHistory);
        getData();
        setDataAdapter();

    }
    private void setDataAdapter() {
        balanceListAdapter = new BalanceListAdapter(TransactionHistoryActivity.this, bData);
        recyclerView.setAdapter(balanceListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getData() {
        bData = new ArrayList<>();
        bData.add(new BalanceModel(R.drawable.grocery_icon, "Nov 17","Grocery", "326.800", "Minimarket Anugrah" ));
        bData.add(new BalanceModel(R.drawable.entertainment_icon, "Nov 17","Entertainment", "326.800", "Football Game" ));
        bData.add(new BalanceModel(R.drawable.equipment_icon, "Nov 17","Equipment", "326.800", "DSLR Camera" ));
        bData.add(new BalanceModel(R.drawable.officeitem_icon, "Nov 17","Office Items", "326.800", "Stationary" ));
    }
}