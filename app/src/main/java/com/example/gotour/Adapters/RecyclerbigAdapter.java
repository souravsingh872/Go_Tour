package com.example.gotour.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gotour.R;

public class RecyclerbigAdapter extends RecyclerView.Adapter<RecyclerbigAdapter.Bigclass> {
    Context context;
    int [] images;
    String [] text;

    public RecyclerbigAdapter(Context context, int[] images, String[] text) {
        this.context = context;
        this.images = images;
        this.text = text;
    }

    @NonNull
    @Override
    public Bigclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from ( context ).inflate ( R.layout.bigrecyclerdesign,parent,false );
        return new Bigclass ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull Bigclass holder, int position) {
      holder.recylerimage1.setImageResource ( images[position] );
      holder.locationrecyclertext1.setText ( text[position] );
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class Bigclass extends RecyclerView.ViewHolder {
        ImageView recylerimage1;
        TextView recyclertext1,locationrecyclertext1;
        public Bigclass(@NonNull View itemView) {
            super ( itemView );
            recylerimage1=itemView.findViewById ( R.id.recyclerimage );
            recyclertext1=itemView.findViewById ( R.id.recyclertext );
            locationrecyclertext1=itemView.findViewById ( R.id.locationrecyclertext );
        }
    }
}
