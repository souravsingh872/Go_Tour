package com.example.gotour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gotour.Adapters.PaymentAdapter;
import com.example.gotour.Adapters.PaymentPagerAdapter;

import me.relex.circleindicator.CircleIndicator;

public class PaymentMethodFragment extends Fragment {
View view;
CircleIndicator paymentindicator;
ViewPager paymentpager;
int [] imagesrec={R.drawable.kashmir1,R.drawable.chandighar2,R.drawable.chandighar3};
String [] paytext={"Winter in Kahmir","Winter in Chandighar","Winter in kashmir"};
PaymentPagerAdapter paymentPagerAdapter;
PaymentAdapter paymentAdapter;
RecyclerView payrec;
int[] imagespay={R.drawable.rupey,R.drawable.mastercard,R.drawable.rupey};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate ( R.layout.fragment_payment_method, container, false );
        paymentindicator=view.findViewById ( R.id.paymentindicator );
        paymentpager=view.findViewById ( R.id.viewpagerpayment );
        payrec=view.findViewById ( R.id.paymentrec );
        paymentAdapter=new PaymentAdapter ( getActivity (),imagesrec,paytext );
        payrec.setAdapter ( paymentAdapter );

        paymentPagerAdapter=new PaymentPagerAdapter ( getActivity ( ), imagespay, new PaymentPagerAdapter.Clickp ( ) {
            @Override
            public void onclick(int position) {
                Navigation.findNavController ( view ).navigate ( R.id.action_paymentMethodFragment_to_payment2Fragment );
            }
        } );
        paymentpager.setAdapter ( paymentPagerAdapter );

        paymentindicator.setViewPager ( paymentpager );

        return view;
    }
}