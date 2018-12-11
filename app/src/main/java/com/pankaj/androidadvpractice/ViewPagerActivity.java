package com.pankaj.androidadvpractice;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pankaj.androidadvpractice.adapters.ViewPagerAdapter;
import com.pankaj.androidadvpractice.adapters.ViewPagerImageAdapter;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {
    private static final String TAG = "ViewPagerActivity";
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("c");
//        list.add("D");
//        list.add("e");
//        ViewPagerAdapter adapter = new ViewPagerAdapter(this, list);
        ViewPagerImageAdapter adapter = new ViewPagerImageAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
