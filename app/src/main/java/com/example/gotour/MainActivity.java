package com.example.gotour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        bottomNavigationView=findViewById ( R.id.bottomnav );


        bottomNavigationView.setOnNavigationItemSelectedListener ( new BottomNavigationView.OnNavigationItemSelectedListener ( ) {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId ()){
                    case R.id.homeFragment2:
                        Navigation.findNavController ( MainActivity.this,R.id.nav_host).navigate ( R.id.homeFragment2 );
                        break;

                    case R.id.notificationFragment:
                        Navigation.findNavController ( MainActivity.this,R.id.nav_host ).navigate ( R.id.notificationFragment );
                        break;
                    case R.id.massageFragment:
                        Navigation.findNavController ( MainActivity.this,R.id.nav_host ).navigate ( R.id.massageFragment );
                        break;
                    case R.id.settingFragment:
                        Navigation.findNavController ( MainActivity.this,R.id.nav_host ).navigate ( R.id.settingFragment );
                        break;
                    case R.id.mapFragment:
                        Navigation.findNavController ( MainActivity.this,R.id.nav_host ).navigate ( R.id.mapFragment);
                        break;
                }

                return true;
            }
        } );

    }
}