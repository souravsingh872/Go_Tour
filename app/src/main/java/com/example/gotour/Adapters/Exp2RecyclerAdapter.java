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

public class Exp2RecyclerAdapter extends RecyclerView.Adapter<Exp2RecyclerAdapter.ExpClass> {
    Context context;
    int[] imagesexp;
    String[] cityexp;
    Click click;

    public Exp2RecyclerAdapter(Context context, int[] imagesexp, String[] cityexp, Click click) {
        this.context = context;
        this.imagesexp = imagesexp;
        this.cityexp = cityexp;
        this.click = click;
    }

    @NonNull
    @Override
    public ExpClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.exp2recyclerdesign,parent,false );
        return new ExpClass ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ExpClass holder, int position) {
   holder.exp2img.setImageResource ( imagesexp[position]);
   holder.exptext.setText ( cityexp[position] );
   holder.itemView.setOnClickListener ( new View.OnClickListener ( ) {
       @Override
       public void onClick(View v) {
           click.onclick ( position );
       }
   } );
   holder.exp2btn.setOnClickListener ( new View.OnClickListener ( ) {
       @Override
       public void onClick(View v) {
           click.onclick2 ( position );
       }
   } );
    }

    @Override
    public int getItemCount() {
        return imagesexp.length;
    }

    public class ExpClass extends RecyclerView.ViewHolder {
        ImageView exp2img;
        TextView exptext;
        Button exp2btn;
        public ExpClass(@NonNull View itemView) {
            super ( itemView );
            exp2img=itemView.findViewById ( R.id.imageexp2 );
            exptext=itemView.findViewById ( R.id.textexp2 );
            exp2btn=itemView.findViewById ( R.id.recyclerbuttonexp2);
        }
    }
    public interface Click{
        void  onclick(int position);
        void onclick2(int position);
    }
}
