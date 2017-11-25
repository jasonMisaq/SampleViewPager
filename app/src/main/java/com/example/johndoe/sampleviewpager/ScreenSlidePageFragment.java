package com.example.johndoe.sampleviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.johndoe.sampleviewpager.data.Util;

/**
 * Created by johndoe on 11/25/17.
 */

public class ScreenSlidePageFragment extends Fragment {
    private static int imgIndex = 0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page, container,false);
        ImageView img;
        if (imgIndex >= Util.Images.length) imgIndex = 0; //reset index
        img = rootView.findViewById(R.id.image);
        img.setImageResource(Util.Images[imgIndex]);
        imgIndex++;

        return rootView;
    }
}
