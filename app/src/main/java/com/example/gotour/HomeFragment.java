package com.example.gotour;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.gotour.Adapters.RecyclerbigAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeFragment extends Fragment {
    RecyclerView bigrecycler;
    CardView cardviewmain;
    LinearLayout maincontainerfill;
    BottomNavigationView bottonav1;
    Fragment explorefragment=new ExploreFragment ();
    RecyclerbigAdapter recyclerbigAdapter;
    int [] images={R.drawable.chandighar3,R.drawable.kashmir1,R.drawable.kasmir2,R.drawable.chandighar};
    String [] text={"Haryana","Kashmir","Shimla","Chandighar"};
    Fragment mapfragment=new MapFragment ();
    Fragment settingfragment=new SettingFragment ();
    Fragment massagefragment=new MassageFragment ();
    Fragment notificationfragment=new NotificationFragment ();
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

                view=inflater.inflate ( R.layout.fragment_home, container, false );

        bigrecycler=view.findViewById ( R.id.recyclerbig );
        cardviewmain=view.findViewById ( R.id.cardview1 );
//        maincontainerfill=view.findViewById ( R.id.maincontainer );
        bottonav1=view.findViewById ( R.id.bottomnav );
        recyclerbigAdapter=new RecyclerbigAdapter (getActivity (),images,text);
        bigrecycler.setAdapter ( recyclerbigAdapter );

        cardviewmain.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Navigation.findNavController ( view ).navigate ( R.id.action_homeFragment2_to_exploreFragment );

            }
        } );
//        bottonav1.setOnNavigationItemSelectedListener ( new BottomNavigationView.OnNavigationItemSelectedListener ( ) {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                Fragment fragment1=mapfragment;
//                switch (item.getItemId ()){
//                    case R.id.home_menu:
//                        Intent intent=new Intent ( getActivity (),MainActivity.class );
//                        startActivity ( intent );
//                        break;
//
//                    case  R.id.location_menu:
//                        fragment1=mapfragment;
//                        break;
//
//                    case R.id.setting_menu:
//                        fragment1=settingfragment;
//                        break;
//                    case R.id.massage_menu:
//                        fragment1=massagefragment;
//                        break;
//                    case R.id.notification_menu:
//                        fragment1=notificationfragment;
//                        break;
//                }
//
//                return true;
//            }
//        } );


        return view;
    }
}