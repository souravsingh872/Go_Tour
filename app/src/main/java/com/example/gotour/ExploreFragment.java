package com.example.gotour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gotour.Adapters.ExploreBigAdapter;
import com.example.gotour.Adapters.ExploreSmallerAdapter;


public class ExploreFragment extends Fragment {
    RecyclerView explorebig,exploresmall;
    View view;
    TextView mylocationexp;
    ExploreSmallerAdapter exploreSmallerAdapter;
    Fragment aboutfragment=new ExploreaboutFragment ();
    ExploreBigAdapter exploreBigAdapter;
    int [] smallimages={R.drawable.chandighar3,R.drawable.kashmir1,R.drawable.kasmir2,R.drawable.chandighar,R.drawable.kashmir3,R.drawable.kashmir4,R.drawable.chandighar2,R.drawable.chandighar3};
    int [] bigimages={R.drawable.kashmir3,R.drawable.kashmir1,R.drawable.kasmir2,R.drawable.chandighar,R.drawable.kashmir3,R.drawable.chandighar3,R.drawable.chandighar2,R.drawable.chandighar3};
//    String [] linetext={"Haryana there so much more to deserve Read \\nabout the haryana to new wave of eco travel","Kashmir there so much more to deserve Read \\nabout the Kashmir tonew wave of eco travel","Kashmir there so much more to deserve Read \\nabout the Kashmir tonew wave of eco travel","Chandighar there so much more to deserve Read \\nabout the Chandighar to new wave of eco travel","Kashmir there so much more to deserve Read \\nabout the Kashmir tonew wave of eco travel","Kashmir there so much more to deserve Read \\nabout the Kashmir tonew wave of eco travel","Chandighar there so much more to deserve Read \\nabout the Chandighar to new wave of eco travel","Chandighar there so much more to deserve Read \\nabout the Chandighar to new wave of eco travel"};
   String[] explorelocation={"Chandighar","Kashmir","Kashmir","Chandighar","Kashmir","kashmir","Chandighar","Chandighar"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate ( R.layout.fragment_explore, container, false );
        explorebig=view.findViewById ( R.id.explorebigrecycler );
        exploresmall=view.findViewById ( R.id.exploresmallrecycler );
      mylocationexp=view.findViewById ( R.id.mylocationexplore );
        exploreSmallerAdapter=new ExploreSmallerAdapter ( getActivity (),smallimages );
        exploresmall.setAdapter ( exploreSmallerAdapter );
   exploreBigAdapter=new ExploreBigAdapter ( getActivity ( ), bigimages, explorelocation, new ExploreBigAdapter.onclick ( ) {
       @Override
       public void click(int position) {
           Navigation.findNavController ( view ).navigate ( R.id.action_exploreFragment_to_explore2 );
       }

       @Override
       public void click2(int position) {
          Navigation.findNavController ( view ).navigate ( R.id.action_exploreFragment_to_paymentMethodFragment );
       }
   }
   );
   explorebig.setAdapter ( exploreBigAdapter );



        return view;
    }
}