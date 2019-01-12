package com.example.ademar.cursodeingls.activity;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ademar.cursodeingls.R;
import com.example.ademar.cursodeingls.fragments.BichosFragment;
import com.example.ademar.cursodeingls.fragments.NumerosFragment;
import com.example.ademar.cursodeingls.fragments.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.ViewPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {
    private SmartTabLayout stl_principal;
    private ViewPager vp_principal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stl_principal = findViewById(R.id.stl_principal);
        vp_principal = findViewById(R.id.vp_principal);
        getSupportActionBar().setTitle("Aprendendo Ingles");
        getSupportActionBar().setElevation(5);

     FragmentPagerItemAdapter fpAdapter = new FragmentPagerItemAdapter(getSupportFragmentManager(),
             FragmentPagerItems.with(this)
                     .add("Bichos",BichosFragment.class)
                     .add("Números",NumerosFragment.class)
                     .add("Vogais",VogaisFragment.class)
                     .create());
     vp_principal.setAdapter(fpAdapter);
     stl_principal.setViewPager(vp_principal);
    }
}
