package com.pankaj.androidadvpractice.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pankaj.androidadvpractice.R;

public class ViewPagerImageAdapter extends PagerAdapter {
    private static final String TAG = "ViewPagerImageAdapter";
    private Context mContext;
    private int images[] = {R.drawable.ic_account_balance,
            R.drawable.ic_adb_black, R.drawable.ic_album, R.drawable.ic_attach_money, R.drawable.ic_vpn_lock, R.drawable.ic_wb_auto,
            R.drawable.ic_wb_sunny};

    public ViewPagerImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        //Log.d(TAG, "isViewFromObject: is view RelativeLayout: " + (view == (RelativeLayout) o));
        return (view == (RelativeLayout) o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        Log.d(TAG, "instantiateItem: item: " + images[position]);
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.viewpager_item, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.viewPagerImageView);
        imageView.setImageResource(images[position]);
        TextView viewPagerTextView = (TextView) view.findViewById(R.id.viewPagerTextView);
        viewPagerTextView.setText(images[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        Log.d(TAG, "destroyItem: distroying item position: " + position);
        container.removeView((RelativeLayout) object);
    }
}
