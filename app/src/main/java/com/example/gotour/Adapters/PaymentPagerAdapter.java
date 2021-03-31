package com.example.gotour.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.gotour.R;

public class PaymentPagerAdapter extends PagerAdapter {
    Context context;
    int[] imagespay;
    Clickp click;

    public PaymentPagerAdapter(Context context, int[] imagespay, Clickp click) {
        this.context = context;
        this.imagespay = imagespay;
        this.click = click;
    }

    @Override
    public int getCount() {
        return imagespay.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
       View view= LayoutInflater.from ( context ).inflate ( R.layout.paymentpagerdesign,container,false );
        ImageView paymentimage=view.findViewById ( R.id.paymentimage );
        paymentimage.setImageResource ( imagespay[position] );
        container.addView ( view,0 );
        paymentimage.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                click.onclick ( position );
            }
        } );
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView (( View)object );
    }
    public interface Clickp{
        void onclick(int position);
    }
}
