package com.example.joplagne.spa;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by joplagne on 29/09/17.
 */

public class FragmentChien extends Fragment{

    private TextView nom, race, genre, poids;
    private RatingBar gentillesse;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.presentation_chien, container, false);
        nom = view.findViewById(R.id.nom);
        race = view.findViewById(R.id.race);
        genre = view.findViewById(R.id.genre);
        poids = view.findViewById(R.id.poids);
        gentillesse = view.findViewById(R.id.ratingBar);
        Doggo chien = (Doggo) getActivity().getIntent().getExtras().get("dog");
        nom.setText(chien.getNom());
        race.setText(chien.getRace());
        genre.setText(String.valueOf(chien.getGenre()));
        poids.setText(chien.getPoids());
        gentillesse.setRating(chien.getGentillesse());
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
