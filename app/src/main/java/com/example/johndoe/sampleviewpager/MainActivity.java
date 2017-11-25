package com.example.johndoe.sampleviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;

public class MainActivity extends AppCompatActivity{

    private static final int NUM_PAGES = 15;

    private ViewPager mPager; //pager


    private PagerAdapter mAdapter; //adapter

    PagerTransformer mTransformer; //for animation



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = findViewById(R.id.pager);
        mAdapter = new SlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mAdapter);
        mTransformer = new PagerTransformer();
        mPager.setPageTransformer(true, mTransformer);
    }


    private class SlidePagerAdapter extends FragmentStatePagerAdapter {

        public SlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new ScreenSlidePageFragment();
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
