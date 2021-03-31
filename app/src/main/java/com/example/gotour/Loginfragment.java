package com.example.gotour;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.gotour.utils.App;

public class Loginfragment extends Fragment {
    TextView signup;
    Button loginbutton1;
    EditText edtenteryouremail, edtenteryourpassword;
    View view;
    String emaildata;
    String passdata;
    String maildata;
    String passworddata;

    Fragment signupfragment = new SignupFragment ( );

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate ( R.layout.fragment_loginfragment, container, false );
        signup = view.findViewById ( R.id.signup );
        loginbutton1 = view.findViewById ( R.id.loginbutton );
        edtenteryouremail = view.findViewById ( R.id.enteremail );
        edtenteryourpassword = view.findViewById ( R.id.enterpassword );

        emaildata = App.getSharedpref ( ).getString ( "mail" );
        passdata = App.getSharedpref ( ).getString ( "password" );


//        SharedPreferences getvalue= PreferenceManager.getDefaultSharedPreferences ( getActivity () );


        loginbutton1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                maildata = edtenteryouremail.getText ( ).toString ( );
                passworddata = edtenteryourpassword.getText ( ).toString ( );

                if (maildata.isEmpty ( ) && passworddata.isEmpty ( )) {
                    Toast.makeText ( getActivity ( ), "plz enter email id", Toast.LENGTH_SHORT ).show ( );
                } else if (maildata != null) {
                }
                if (maildata.matches ( emaildata ) && passworddata.matches ( passdata )) {
                    Intent intent = new Intent ( getActivity ( ), MainActivity.class );
                    startActivity ( intent );

                }
                else {
                    Toast.makeText ( getActivity (), "enter valid id password", Toast.LENGTH_SHORT ).show ( );
                }

                
            }
        } );


        signup.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Navigation.findNavController ( view ).navigate ( R.id.action_loginfragment_to_signupFragment );
            }
        } );


        return view;
    }
}