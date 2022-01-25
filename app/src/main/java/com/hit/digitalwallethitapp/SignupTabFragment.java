package com.hit.digitalwallethitapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SignupTabFragment extends Fragment {

    Button login;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);


        login = root.findViewById(R.id.SignUp);

        login.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ( (LoginActivity)getActivity()).setCurrentItem(0);
            }
        });
        return root;

    }
}
