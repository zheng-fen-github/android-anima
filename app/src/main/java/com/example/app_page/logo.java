package com.example.app_page;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class logo extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         final View rootView =  inflater.inflate(R.layout.fragment_logo, container, false);

        // start animation
        ImageView logo_svg = (ImageView) rootView.findViewById(R.id.logo_svg);
        LinearLayout  logo_bg = (LinearLayout) rootView.findViewById(R.id.logo_bg);

        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(getActivity(),
                R.animator.logo);
        set.setTarget(logo_svg);

        AnimatorSet set2 = (AnimatorSet) AnimatorInflater.loadAnimator(getActivity(),
                R.animator.logo_bg);
        set2.setTarget(logo_bg);

        set.start();
        set2.start();

        return rootView;
    }
}