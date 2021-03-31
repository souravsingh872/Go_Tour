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

public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.PaymentClass> {
    Context context;
    int [] imagesrec;
    String [] paytext;

    public PaymentAdapter(Context context, int[] imagesrec, String[] paytext) {
        this.context = context;
        this.imagesrec = imagesrec;
        this.paytext = paytext;
    }

    @NonNull
    @Override
    public PaymentClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.paymentrecyclerdesign,parent,false );
        return new PaymentClass ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentClass holder, int position) {
  holder.recpayimg.setImageResource ( imagesrec[position] );
  holder.textpayrec.setText ( paytext[position] );
    }

    @Override
    public int getItemCount() {
        return imagesrec.length;
    }

    public class PaymentClass extends RecyclerView.ViewHolder {
        ImageView recpayimg;
        TextView textpayrec;
        public PaymentClass(@NonNull View itemView) {
            super ( itemView );
            recpayimg=itemView.findViewById ( R.id.recpayimage );
            textpayrec=itemView.findViewById ( R.id.paytext );
        }
    }
}
