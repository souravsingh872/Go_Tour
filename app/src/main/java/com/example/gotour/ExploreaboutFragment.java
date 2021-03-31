package com.example.gotour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gotour.Adapters.AboutAdapter;

import me.relex.circleindicator.CircleIndicator;


public class ExploreaboutFragment extends Fragment {
    View view;
    ViewPager aboutviewpager;
   AboutAdapter aboutAdapter;
    CircleIndicator aboutcircle;
    int [] aboutimages={R.drawable.chandighar3,R.drawable.kashmir1,R.drawable.kasmir2,R.drawable.chandighar};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate ( R.layout.fragment_exploreabout, container, false );
        aboutviewpager=view.findViewById ( R.id.viwepagerabout );
        aboutcircle=view.findViewById ( R.id.aboutindicators );
         aboutAdapter=new AboutAdapter ( getActivity (),aboutimages );
        aboutviewpager.setAdapter ( aboutAdapter );
        aboutcircle.setViewPager ( aboutviewpager );
        return  view;
    }
}