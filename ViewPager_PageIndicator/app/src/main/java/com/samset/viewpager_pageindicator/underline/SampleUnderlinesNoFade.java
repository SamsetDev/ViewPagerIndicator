package com.samset.viewpager_pageindicator.underline;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.samset.viewpager_pageindicator.R;
import com.samset.viewpager_pageindicator.circle.BaseSampleActivity;
import com.samset.viewpager_pageindicator.circleAdapter.TestFragmentAdapter;
import com.samset.viewpager_pageindicator.pageindicator.UnderlinePageIndicator;

public class SampleUnderlinesNoFade extends BaseSampleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_underlines);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        UnderlinePageIndicator indicator = (UnderlinePageIndicator)findViewById(R.id.indicator);
        indicator.setViewPager(mPager);
        indicator.setFades(false);
        mIndicator = indicator;
    }
}