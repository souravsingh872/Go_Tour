package com.example.gotour.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gotour.R;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileClass> {
    Context context;
    int [] images;

    public ProfileAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public ProfileClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.profilerecycler,parent,false );
        return new ProfileClass ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileClass holder, int position) {
        holder.profileimage.setImageResource ( images[position] );
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ProfileClass extends RecyclerView.ViewHolder {
        ImageView profileimage;
        public ProfileClass(@NonNull View itemView) {
            super ( itemView );
            profileimage=itemView.findViewById ( R.id.profilerecimage );
        }
    }
}
