package com.example.viewpagerdesde0.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpagerdesde0.R;

public class pageFragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         ViewGroup rootView = (ViewGroup)inflater
                .inflate(R.layout.view_page2,container
                        ,false);

        return rootView;
        //return super.onCreateView(inflater, container, savedInstanceState);
        //
    }
}
