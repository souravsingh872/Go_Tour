package com.example.gotour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gotour.Adapters.Exp3Adapter;


public class Explore3 extends Fragment {

   View view;
   RecyclerView exp3rec;
   Exp3Adapter exp3Adapter;
   Button exp3btn;
    int[] images={R.drawable.chandighar3,R.drawable.chandighar2,R.drawable.kashmir1,
            R.drawable.chandighar,R.drawable.kashmir4,R.drawable.chandighar3,
            R.drawable.chandighar2,R.drawable.kashmir1,R.drawable.chandighar};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view=inflater.inflate ( R.layout.fragment_explore3, container, false );
       exp3rec=view.findViewById ( R.id.exp3recycler );
       exp3btn=view.findViewById ( R.id.exp3button );
       exp3Adapter=new Exp3Adapter ( getActivity ( ), images, new Exp3Adapter.Clicks ( ) {
           @Override
           public void onclick(int position) {
               Navigation.findNavController ( view ).navigate ( R.id.action_explore3_to_exploreaboutFragment );
           }
       } );
       exp3rec.setAdapter ( exp3Adapter );
       exp3btn.setOnClickListener ( new View.OnClickListener ( ) {
           @Override
           public void onClick(View v) {
               Navigation.findNavController ( view ).navigate ( R.id.action_explore3_to_paymentMethodFragment );
           }
       } );

        return view;
    }
}