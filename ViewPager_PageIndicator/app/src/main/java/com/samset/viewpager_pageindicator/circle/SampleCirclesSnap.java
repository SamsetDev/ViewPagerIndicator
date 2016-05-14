package com.samset.viewpager_pageindicator.circle;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.samset.viewpager_pageindicator.R;
import com.samset.viewpager_pageindicator.pageindicator.CirclePageIndicator;
import com.samset.viewpager_pageindicator.circleAdapter.TestFragmentAdapter;


public class SampleCirclesSnap extends BaseSampleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_circles);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        CirclePageIndicator indicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator = indicator;
        indicator.setViewPager(mPager);
        indicator.setSnap(true);
    }
}