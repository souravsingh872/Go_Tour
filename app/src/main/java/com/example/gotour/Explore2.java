package com.example.gotour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gotour.Adapters.Exp2RecyclerAdapter;

public class Explore2 extends Fragment {
    int[] imagesexp={R.drawable.kashmir4,R.drawable.chandighar,R.drawable.kashmir1,R.drawable.chandighar2};
    String[] cityexp={"Winter In Kashmir","Winter In Chandighar","Winter In Kashmir","Winter In Chandighar"};
    RecyclerView exprec;
    Exp2RecyclerAdapter exp2RecyclerAdapter;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate ( R.layout.fragment_explore2, container, false );
        exprec=view.findViewById ( R.id.exp2recycler );

        exp2RecyclerAdapter=new Exp2RecyclerAdapter ( getActivity ( ), imagesexp, cityexp, new Exp2RecyclerAdapter.Click ( ) {
            @Override
            public void onclick(int position) {
                Navigation.findNavController (view ).navigate ( R.id.action_explore2_to_explore3 );
            }

            @Override
            public void onclick2(int position) {
                 Navigation.findNavController ( view ).navigate ( R.id.action_explore2_to_paymentMethodFragment );
            }


    } );
        exprec.setAdapter ( exp2RecyclerAdapter );


        return view;
    }
}