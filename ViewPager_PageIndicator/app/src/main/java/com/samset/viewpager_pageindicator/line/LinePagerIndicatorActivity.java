package com.samset.viewpager_pageindicator.line;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.samset.viewpager_pageindicator.R;
import com.samset.viewpager_pageindicator.pageindicator.LinePageIndicator;
import com.samset.viewpager_pageindicator.adapter.PagerIndicatorAdapter;

public class LinePagerIndicatorActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private LinearLayout pagerLayout;
    private PagerIndicatorAdapter homeLiveMatches_adapter;
    private String data1[]={"RCB","RCB","RCB","RCB","RCB","RCB","RCB"};
    private String data2[]={"CSK","CSK","CSK","CSK","CSK","CSK","CSK"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_pager_indicator);
        init();
    }

    private void init() {
        pagerLayout= (LinearLayout) findViewById(R.id.pagerLayout);
        viewPager = (ViewPager) findViewById(R.id.homelive_pager1);
        homeLiveMatches_adapter=new PagerIndicatorAdapter(this);
        viewPager.setAdapter(homeLiveMatches_adapter);

        LinePageIndicator indicator = (LinePageIndicator) findViewById(R.id.line_indicate);
        indicator.setViewPager(viewPager);

        /*set pager indiactor*/
        final float density = getResources().getDisplayMetrics().density;
        indicator.setSelectedColor(getResources().getColor(R.color.white));
        indicator.setUnselectedColor(0xFF727272);
        indicator.setStrokeWidth(2 * density);
        indicator.setLineWidth(25 * density);
    }
}
