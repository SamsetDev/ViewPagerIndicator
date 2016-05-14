package com.samset.viewpager_pageindicator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.samset.viewpager_pageindicator.activites.LineIndicatorActivity;
import com.samset.viewpager_pageindicator.circle.SampleCirclesDefault;
import com.samset.viewpager_pageindicator.circle.SampleCirclesInitialPage;
import com.samset.viewpager_pageindicator.circle.SampleCirclesSnap;
import com.samset.viewpager_pageindicator.circle.SampleCirclesStyledLayout;
import com.samset.viewpager_pageindicator.circle.SampleCirclesStyledMethods;
import com.samset.viewpager_pageindicator.circle.SampleCirclesStyledTheme;
import com.samset.viewpager_pageindicator.circle.SampleCirclesWithListener;
import com.samset.viewpager_pageindicator.underline.SampleUnderlinesDefault;
import com.samset.viewpager_pageindicator.underline.SampleUnderlinesNoFade;
import com.samset.viewpager_pageindicator.underline.SampleUnderlinesStyledLayout;
import com.samset.viewpager_pageindicator.underline.SampleUnderlinesStyledMethods;
import com.samset.viewpager_pageindicator.underline.SampleUnderlinesStyledTheme;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLine,btnDefaultcircle,btninitial,btnsnap,
            btnstylelayout,btnstylemethod,btnstyletheme,btnstylelisteners;
    private Button btnunderdefault,btnundernofade,btnundermethod,btnunderderlayout,btnunderdertheme;
    private AppCompatActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.activity=this;
        btnDefaultcircle= (Button) findViewById(R.id.btn_defaultcircle);
        btnLine= (Button) findViewById(R.id.btn_line);
        btninitial= (Button) findViewById(R.id.btn_initcircle);
        btnsnap= (Button) findViewById(R.id.btn_snapcircle);

        btnstylelayout= (Button) findViewById(R.id.btn_stylelayoutcircle);
        btnstylemethod= (Button) findViewById(R.id.btn_stylemethodcircle);
        btnstyletheme= (Button) findViewById(R.id.btn_styletheme);
        btnstylelisteners= (Button) findViewById(R.id.btn_circlelisteners);

        btnunderdefault= (Button) findViewById(R.id.btn_underdefault);
        btnundernofade= (Button) findViewById(R.id.btn_undernofade);
        btnunderderlayout= (Button) findViewById(R.id.btn_underlaut);
        btnunderdertheme= (Button) findViewById(R.id.btn_undertheme);
        btnundermethod= (Button) findViewById(R.id.btn_undermethod);





        //listeners
        btnDefaultcircle.setOnClickListener(this);
        btnLine.setOnClickListener(this);
        btninitial.setOnClickListener(this);
        btnsnap.setOnClickListener(this);
        btnstylelayout.setOnClickListener(this);
        btnstylemethod.setOnClickListener(this);
        btnstyletheme.setOnClickListener(this);
        btnstylelisteners.setOnClickListener(this);

        btnunderdefault.setOnClickListener(this);
        btnundernofade.setOnClickListener(this);
        btnunderderlayout.setOnClickListener(this);
        btnunderdertheme.setOnClickListener(this);
        btnundermethod.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        if (v==btnLine)
        {
            intent=new Intent(activity, LineIndicatorActivity.class);
        }else if (v==btnDefaultcircle)
        {
            intent=new Intent(activity, SampleCirclesDefault.class);
        }else if (v==btninitial)
        {
            intent=new Intent(activity, SampleCirclesInitialPage.class);
        }else if (v==btnsnap)
        {
            intent=new Intent(activity, SampleCirclesSnap.class);
        }else if (v==btnstylelayout)
        {
            intent=new Intent(activity, SampleCirclesStyledLayout.class);
        }else if (v==btnstylemethod)
        {
            intent=new Intent(activity, SampleCirclesStyledMethods.class);
        }else if (v==btnstyletheme)
        {
            intent=new Intent(activity, SampleCirclesStyledTheme.class);
        }else if (v==btnstylelisteners)
        {
            intent=new Intent(activity, SampleCirclesWithListener.class);
        }else if (v==btnunderdefault)
        {
            intent=new Intent(activity, SampleUnderlinesDefault.class);
        }else if (v==btnundernofade)
        {
            intent=new Intent(activity, SampleUnderlinesNoFade.class);
        }else if (v==btnunderderlayout)
        {
            intent=new Intent(activity, SampleUnderlinesStyledLayout.class);
        }else if (v==btnunderdertheme)
        {
            intent=new Intent(activity, SampleUnderlinesStyledTheme.class);
        }else if (v==btnundermethod)
        {
            intent=new Intent(activity, SampleUnderlinesStyledMethods.class);
        }

        startActivity(intent);

    }
}
