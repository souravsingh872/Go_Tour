package com.example.gotour.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gotour.R;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatClass> {
    Context context;

    public ChatAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ChatClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.chatrecyclerdesign,parent,false );
        return new ChatClass ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ChatClass holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ChatClass extends RecyclerView.ViewHolder {
        public ChatClass(@NonNull View itemView) {
            super ( itemView );
        }
    }
}
