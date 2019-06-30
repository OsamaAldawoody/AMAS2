package com.amas.osamaaldawoody.amas;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class SettingFragment extends Fragment {

    LinearLayout linearLayoutReach;
    LinearLayout linearLayoutSetting;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.table_setting_layout, container, false);

        // Find the view pager that will allow the user to swipe between fragments

        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);

        linearLayoutReach = (LinearLayout) rootView.findViewById(R.id.reach_linear_layout);

        linearLayoutReach.setBackgroundResource(R.drawable.not_pressed_background);

        linearLayoutSetting = (LinearLayout)rootView.findViewById(R.id.setting_linear_layout);

        linearLayoutSetting.setBackgroundResource(R.drawable.pressed_back_ground);

        linearLayoutReach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutSetting.setBackgroundResource(R.drawable.not_pressed_background);
                linearLayoutReach.setBackgroundResource(R.drawable.pressed_back_ground);
            }
        });

        linearLayoutSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutReach.setBackgroundResource(R.drawable.not_pressed_background);
                linearLayoutSetting.setBackgroundResource(R.drawable.pressed_back_ground);
            }
        });

        return rootView;
    }

    @Override
    public void onStart() {
        getActivity().setTitle("Setting");
        super.onStart();
    }
}