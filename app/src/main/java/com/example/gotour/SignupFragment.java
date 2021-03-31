package com.example.gotour;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gotour.utils.App;
import com.example.gotour.utils.SharedPref;

public class SignupFragment extends Fragment {
    Button signup;
    View view;
    EditText enteremail2,enterpassword2;
    String email;
    String pass;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate ( R.layout.fragment_signup, container, false );
        signup=view.findViewById ( R.id.signupbutton );
        enteremail2=view.findViewById ( R.id.enteremail2 );
        enterpassword2=view.findViewById ( R.id.enterpassword2 );



// SharedPreferences getvalue= PreferenceManager.getDefaultSharedPreferences ( getActivity () );

        signup.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty ( enteremail2.getText ().toString () )&& TextUtils.isEmpty ( enterpassword2.getText ().toString () )){
                    Toast.makeText ( getActivity (),"plz enter your id password",Toast.LENGTH_SHORT ).show ();
                }
                else {
                    email = enteremail2.getText ( ).toString ( );
                    pass = enterpassword2.getText ( ).toString ( );
                    App.getSharedpref ( ).saveString ( "password", pass );
                    App.getSharedpref ( ).saveString ( "mail", email );
                    Navigation.findNavController ( view ).navigate ( R.id.action_signupFragment_to_loginfragment );

                }




            }
        } );



        return view;
    }
}