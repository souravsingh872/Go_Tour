package com.example.gotour.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gotour.R;

public class Exp3Adapter extends RecyclerView.Adapter<Exp3Adapter.Exp3Class> {
    Context context;
    int [] images;
    Clicks clicks;

    public Exp3Adapter(Context context, int[] images, Clicks clicks) {
        this.context = context;
        this.images = images;
        this.clicks = clicks;
    }

    @NonNull
    @Override
    public Exp3Class onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.exp3design,parent,false );
        return new Exp3Class ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull Exp3Class holder, int position) {
   holder.exp3imge.setImageResource ( images[position] );
   holder.itemView.setOnClickListener ( new View.OnClickListener ( ) {
       @Override
       public void onClick(View v) {
           clicks.onclick ( position );
       }
   } );
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class Exp3Class extends RecyclerView.ViewHolder {
        ImageView exp3imge;
        public Exp3Class(@NonNull View itemView) {
            super ( itemView );
            exp3imge=itemView.findViewById ( R.id.exp3recimage );
        }
    }
    public interface Clicks{
        void onclick(int position);
    }
}
