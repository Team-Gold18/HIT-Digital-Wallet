package com.hit.digitalwallethitapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.MyViewHolder> {

    Context context;
    ArrayList<Contacts> newUserArrayList;

    public ContactListAdapter(Context context, ArrayList<Contacts> newUserArrayList) {
        this.context = context;
        this.newUserArrayList = newUserArrayList;
    }

    @NonNull
    @Override
    public ContactListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.contact_list_item, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactListAdapter.MyViewHolder holder, int position) {

        Contacts contactList = newUserArrayList.get(position);
        holder.img_user.setImageResource(contactList.userImage);
        holder.tv_user_name.setText(contactList.userName);
        holder.tv_acc_no.setText(contactList.accNo);


    }

    @Override
    public int getItemCount() {
        return newUserArrayList.size();
    }

    public  static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_user_name;
        TextView tv_acc_no;
        ShapeableImageView img_user;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_user_name = itemView.findViewById(R.id.tv_user_name);
            tv_acc_no = itemView.findViewById(R.id.tv_acc_no);
            img_user = itemView.findViewById(R.id.img_user);
        }
    }
}
