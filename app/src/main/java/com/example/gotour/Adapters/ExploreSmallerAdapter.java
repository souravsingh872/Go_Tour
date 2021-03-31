package com.example.gotour.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gotour.R;

public class ExploreSmallerAdapter extends RecyclerView.Adapter<ExploreSmallerAdapter.SmallClass> {
    Context context;
    int [] smallimages;

    public ExploreSmallerAdapter(Context context, int[] smallimages) {
        this.context = context;
        this.smallimages = smallimages;
    }

    @NonNull
    @Override
    public SmallClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.exploresmallrecyclerdesign,parent,false );
        return new SmallClass ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull SmallClass holder, int position) {
        holder.smallimage.setImageResource ( smallimages[position] );
    }

    @Override
    public int getItemCount() {
        return smallimages.length;
    }

    public class SmallClass extends RecyclerView.ViewHolder {
        ImageView smallimage;
        public SmallClass(@NonNull View itemView) {
            super ( itemView );
            smallimage=itemView.findViewById ( R.id.smallerrecyclerimage );
        }
    }
}
