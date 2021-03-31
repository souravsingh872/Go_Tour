package com.example.gotour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.gotour.Adapters.ProfileAdapter;
import com.google.android.material.tabs.TabLayout;

public class SettingFragment extends Fragment {
    View view;
    TabLayout tabs1;
    RecyclerView profilerecycler;
    ImageView settingimage;
    ProfileAdapter profileAdapter;
    int[] images={R.drawable.chandighar3,R.drawable.chandighar2,R.drawable.kashmir1,R.drawable.chandighar,R.drawable.kashmir4,R.drawable.chandighar3,R.drawable.chandighar2,R.drawable.kashmir1,R.drawable.chandighar,R.drawable.kashmir4};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate ( R.layout.fragment_setting, container, false );
        tabs1=view.findViewById ( R.id.tablayout );
        profilerecycler=view.findViewById ( R.id.profilerecycler );
settingimage=view.findViewById ( R.id.setting );
        tabs1.addTab ( tabs1.newTab ().setText ( "Post" ).setIcon ( R.drawable.ic_iconpost ));
        tabs1.addTab ( tabs1.newTab ().setText ( "Video" ).setIcon ( R.drawable.ic_baseline_ondemand_video_24 ) );
        tabs1.addTab ( tabs1.newTab ().setText ( "Save" ).setIcon ( R.drawable.ic_baseline_bookmark_border_24 ) );

        profileAdapter=new ProfileAdapter ( getActivity (),images );
        profilerecycler.setAdapter ( profileAdapter );

       settingimage.setOnClickListener ( new View.OnClickListener ( ) {
           @Override
           public void onClick(View v) {
               Navigation.findNavController (view ).navigate ( R.id.action_settingFragment_to_openSettingFragment );
           }
       } );

        return view;
    }
}