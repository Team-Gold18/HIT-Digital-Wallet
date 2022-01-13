package com.hit.digitalwallethitapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BalanceListAdapter extends RecyclerView.Adapter<BalanceListAdapter.BalanceViewHolder>{
    Context context;
    List<BalanceModel> bData;
    private BalanceViewHolder.RecycleViewClickListener clickListener;

    public BalanceListAdapter(Context context, List<BalanceModel> bData, BalanceViewHolder.RecycleViewClickListener clickListener) {
        this.context = context;
        this.bData = bData;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public BalanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout;
        layout = LayoutInflater.from(context).inflate(R.layout.balancelist_layout, parent, false);
    }

    @Override
    public void onBindViewHolder(@NonNull BalanceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class BalanceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tv_topic, tv_date, tv_balance, tv_description;
        ImageView img_photo;

        public BalanceViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_topic = itemView.findViewById(R.id.textTopic);
            tv_date = itemView.findViewById(R.id.textDate);
            tv_balance = itemView.findViewById(R.id.textBalance);
            tv_description = itemView.findViewById(R.id.textDescription);
            img_photo = itemView.findViewById(R.id.balanceImage);
        }

        @Override
        public void onClick(View v) {

        }
        public interface RecycleViewClickListener{

        }
    }
}
