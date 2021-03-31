package com.example.gotour.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.gotour.R;

public class AboutAdapter extends PagerAdapter {
    Context context;
    int [] aboutimages;

    public AboutAdapter(Context context, int[] aboutimages) {
        this.context = context;
        this.aboutimages = aboutimages;
    }

    @Override
    public int getCount() {
        return aboutimages.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.aboutviewpagerdesign,container,false );
        ImageView image=view.findViewById ( R.id.aboutviewpagerimage );
        image.setImageResource ( aboutimages[position]);
        container.addView ( view,0 );
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView ( (View)object );
    }
}
