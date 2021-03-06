package com.example.joplagne.spa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.joplagne.spa.FragmentDetailCode.AdapteurPage;
import com.example.joplagne.spa.FragmentDetailCode.PageGenre;
import com.example.joplagne.spa.FragmentDetailCode.PageGentillesse;
import com.example.joplagne.spa.FragmentDetailCode.PageNom;
import com.example.joplagne.spa.FragmentDetailCode.PagePoids;
import com.example.joplagne.spa.FragmentDetailCode.PageRace;

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
        fragments.add(Fragment.instantiate(this, FragmentCode.class.getName()));

        this.adapteur = new AdapteurPage(super.getSupportFragmentManager(), fragments);
        ViewPager pager = (ViewPager) super.findViewById(R.id.viewpager);
        pager.setAdapter(this.adapteur);
    }
}
