package com.example.gotour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gotour.Adapters.ChatAdapter;

public class MassageFragment extends Fragment {
    RecyclerView chatrecyclerview;
    ChatAdapter chatAdapter;
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate ( R.layout.fragment_massage, container, false );

        chatrecyclerview=view.findViewById ( R.id.recyclerchat );

        chatAdapter=new ChatAdapter (getActivity ());
        chatrecyclerview.setAdapter ( chatAdapter  );

        return view;

    }
}