package com.samset.viewpager_pageindicator.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.samset.viewpager_pageindicator.R;


/**
 * Created by karamjeetsingh on 13/01/16.
 */
public class PagerIndicatorAdapter extends PagerAdapter {
    private String ITEM_1[]={"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7"};
   // private String ITEM_2[]={"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7"};
    LinearLayout layout,layoutTeam_A,layoutTeam_B;

    Context mContext;
    LayoutInflater mLayoutInflater;

    public PagerIndicatorAdapter(Context ctx) {
        this.mContext=ctx;
        mLayoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Log.e("Adapter", "Adapter Step 1");
    }


    @Override
    public int getCount() {
        return ITEM_1.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);
        Log.e("Adapter", "Adapter Step 2");
        TextView teamA_name = (TextView) itemView.findViewById(R.id.item1);
        TextView teamB_name = (TextView) itemView.findViewById(R.id.item2);

        teamA_name.setText(ITEM_1[position]);
        teamB_name.setText(ITEM_1[position]);




        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(View arg0, int arg1, Object arg2) {
        ((ViewPager) arg0).removeView((View) arg2);
        Log.e("Adapter", "Adapter Step 3");
    }


}
