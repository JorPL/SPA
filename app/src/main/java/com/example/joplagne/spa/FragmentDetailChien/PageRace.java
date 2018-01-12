package com.example.joplagne.spa.FragmentDetailChien;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.joplagne.spa.Doggo;
import com.example.joplagne.spa.R;

/**
 * Created by jorda on 06/10/2017.
 */

public class PageRace extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Doggo chien = (Doggo) getActivity().getIntent().getSerializableExtra("dog");
        View view = inflater.inflate(R.layout.page_race, container, false);
        TextView race = (TextView) view.findViewById(R.id.race);
        race.setText(chien.getRace());
        return view;
    }
}
