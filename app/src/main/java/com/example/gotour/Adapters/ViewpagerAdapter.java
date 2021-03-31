package com.example.gotour.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.gotour.R;

public class ViewpagerAdapter extends PagerAdapter {
    Context context;
    int[] imagesback;
    int[] imagesfront;
    String[] textTop;
    String[] textbottom;

    public ViewpagerAdapter(Context context, int[] imagesback, int[] imagesfront, String[] textTop, String[] textbottom) {
        this.context = context;
        this.imagesback = imagesback;
        this.imagesfront = imagesfront;
        this.textTop = textTop;
        this.textbottom = textbottom;
    }

    @Override
    public int getCount() {
        return imagesback.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.viewerpagerdesign,container,false );
        ImageView imagebacks=view.findViewById ( R.id.imageback );
        ImageView imagefronts=view.findViewById ( R.id.imagefront );
        imagebacks.setImageResource ( imagesback[position] );
        imagefronts.setImageResource ( imagesfront[position] );
        TextView texttops=view.findViewById ( R.id.explore );
        TextView textbottoms=view.findViewById ( R.id.exploreline );
        texttops.setText ( textTop[position] );
        textbottoms.setText ( textbottom[position] );
        container.addView ( view,0 );
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView ( (View)object);
    }
}
