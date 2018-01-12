package com.example.joplagne.spa.FragmentDetailChien;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.joplagne.spa.Code;
import com.example.joplagne.spa.R;

/**
 * Created by jorda on 06/10/2017.
 */

public class PageNom extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Code chien = (Code) getActivity().getIntent().getSerializableExtra("dog");
        View view = inflater.inflate(R.layout.page_nom, container, false);
        TextView nom = (TextView) view.findViewById(R.id.nom);
        nom.setText(chien.getNom());
        return view;
    }
}
