package com.example.gotour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.gotour.Adapters.ViewpagerAdapter;

import me.relex.circleindicator.CircleIndicator;

public class ScrollerFragment extends Fragment {
    View view;
    ViewPager viewscroler;
    CircleIndicator indicator;
    ImageView buttonleft,buttonright;
    FragmentManager fragmentManager;
   int  tabCount;
    Fragment Loginfragment=new Loginfragment ();

    ViewpagerAdapter viewpagerAdapter;
    int[] imagesback={R.drawable.viwerpagerback,R.drawable.viwerpagerback2,R.drawable.viwerpagerback3};
    int[] imagesfront={R.drawable.viwerpagerscreen1,R.drawable.viwerpagerscreen2,R.drawable.viwerpagerscreen3};
    String[] textTop={"Explore","Easy peasy","Enjoy tour"};
    String[] textbottom={"Explore your favourite destination \narround the world ","Make your travel experince very \neasy and peasy","Enjoy your Favourite destination with \nyour love one"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate ( R.layout.fragment_scroller, container, false );
        viewscroler=view.findViewById ( R.id.scroller );
        buttonleft=view.findViewById ( R.id.leftbutton );
        buttonright=view.findViewById ( R.id.rightbutton );
        indicator=view.findViewById ( R.id.circleindicator );
     viewpagerAdapter=new ViewpagerAdapter ( getActivity (),imagesback,imagesfront,textTop,textbottom );
     viewscroler.setAdapter (  viewpagerAdapter);
     indicator.setViewPager ( viewscroler );
tabCount=viewpagerAdapter.getCount ();

        buttonright.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if (viewscroler.getCurrentItem ()<tabCount-1){
                    viewscroler.setCurrentItem ( viewscroler.getCurrentItem ()+1,true);
                }
                else {
                    Navigation.findNavController (view ).navigate ( R.id.action_scrollerFragment_to_loginfragment );
                }

            }
        } );

        buttonleft.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if (viewscroler.getCurrentItem ()<tabCount){
                    viewscroler.setCurrentItem ( viewscroler.getCurrentItem ()-1,true );
                }
                else{
                    getActivity ().finish ();
                }
            }
        } );



//
//viewscroler.addOnPageChangeListener ( new ViewPager.OnPageChangeListener ( ) {
//    @Override
//    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//    }
//
//    @Override
//    public void onPageSelected(int position) {
//    }
//
//    @Override
//    public void onPageScrollStateChanged(int state) {
//
//    }
//} );

        return view;
    }
    

}