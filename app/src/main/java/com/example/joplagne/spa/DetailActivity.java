package com.example.joplagne.spa;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.joplagne.spa.FragmentDetailChien.AdapteurPage;
import com.example.joplagne.spa.FragmentDetailChien.PageGenre;
import com.example.joplagne.spa.FragmentDetailChien.PageGentillesse;
import com.example.joplagne.spa.FragmentDetailChien.PageNom;
import com.example.joplagne.spa.FragmentDetailChien.PagePoids;
import com.example.joplagne.spa.FragmentDetailChien.PageRace;

import java.util.List;
import java.util.Vector;

/**
 * Created by joplagne on 05/10/17.
 */

public class DetailActivity extends AppCompatActivity {

    private PagerAdapter adapteur;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List fragments = new Vector();
        fragments.add(Fragment.instantiate(this, PageNom.class.getName()));
        fragments.add(Fragment.instantiate(this, PageRace.class.getName()));
        fragments.add(Fragment.instantiate(this, PageGenre.class.getName()));
        fragments.add(Fragment.instantiate(this, PagePoids.class.getName()));
        fragments.add(Fragment.instantiate(this, PageGentillesse.class.getName()));

        this.adapteur = new AdapteurPage(super.getSupportFragmentManager(), fragments);
        ViewPager pager = (ViewPager) super.findViewById(R.id.viewpager);
        pager.setAdapter(this.adapteur);
    }
}
