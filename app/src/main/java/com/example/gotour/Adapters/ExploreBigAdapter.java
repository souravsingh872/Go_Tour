package com.example.gotour.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gotour.R;

public class ExploreBigAdapter extends RecyclerView.Adapter<ExploreBigAdapter.ExploreBigclass> {
    Context context;
    int [] bigimages;
//    String [] linetext;
    String[] explorelocation;
    onclick onclick;

    public ExploreBigAdapter(Context context, int[] bigimages, String[] explorelocation, ExploreBigAdapter.onclick onclick) {
        this.context = context;
        this.bigimages = bigimages;
        this.explorelocation = explorelocation;
        this.onclick = onclick;
    }

    @NonNull
    @Override
    public ExploreBigclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.explorebigrecyclerdesign,parent,false );
        return new ExploreBigclass ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ExploreBigclass holder, int position) {
      holder.bigimage.setImageResource ( bigimages[position] );
//      holder.explorelinetext.setText ( linetext[position] );
      holder.locationexploretext.setText ( explorelocation[position] );

      holder.bigimage.setOnClickListener ( new View.OnClickListener ( ) {
          @Override
          public void onClick(View v) {
              onclick.click ( position );
          }
      } );
      holder.expbutton.setOnClickListener ( new View.OnClickListener ( ) {
          @Override
          public void onClick(View v) {
              onclick.click2 ( position);

          }
      } );
    }

    @Override
    public int getItemCount() {
        return bigimages.length;
    }

    public class ExploreBigclass extends RecyclerView.ViewHolder {
        ImageView bigimage;
        TextView explorelinetext,locationexploretext;
        Button expbutton;
        public ExploreBigclass(@NonNull View itemView) {
            super ( itemView );
            bigimage=itemView.findViewById ( R.id.explorebigimage );
            explorelinetext=itemView.findViewById ( R.id.exploreline );
            locationexploretext=itemView.findViewById ( R.id.locationexploretext );
            expbutton=itemView.findViewById ( R.id.recyclerbutton );
        }
    }
    public interface onclick{
        void click(int position);
        void click2(int position);
    }
}
