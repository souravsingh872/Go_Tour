package com.example.gotour;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;


public class OpenSettingFragment extends Fragment {
    View view;
  Button logoutbtn;
  RelativeLayout paymentrelative;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
             view=inflater.inflate ( R.layout.fragment_open_setting, container, false );

             logoutbtn=view.findViewById ( R.id.logout );
             paymentrelative=view.findViewById ( R.id.paymentrelative );

             logoutbtn.setOnClickListener ( new View.OnClickListener ( ) {
                 @Override
                 public void onClick(View v) {
                     Intent intent=new Intent ( getActivity (),LoginActivity.class );
                     getActivity ().finish ();
                    startActivity ( intent );

                 }
             } );
             paymentrelative.setOnClickListener ( new View.OnClickListener ( ) {
                 @Override
                 public void onClick(View v) {
                     Navigation.findNavController ( view ).navigate ( R.id.action_openSettingFragment_to_paymentMethodFragment );
                 }
             } );



             return view;
    }
}