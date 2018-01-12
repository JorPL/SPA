package com.example.joplagne.spa;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by joplagne on 29/09/17.
 */

public class FragmentCode extends Fragment{

    private TextView nom, race, genre, poids;
    private RatingBar gentillesse;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.presentation_code, container, false);
        nom = view.findViewById(R.id.nom);
        race = view.findViewById(R.id.race);
        genre = view.findViewById(R.id.genre);
        poids = view.findViewById(R.id.poids);
        gentillesse = view.findViewById(R.id.ratingBar);
        Code code = (Code) getActivity().getIntent().getExtras().get("code");
        nom.setText(code.getNom());
        race.setText(code.getRace());
        genre.setText(String.valueOf(code.getGenre()));
        poids.setText(code.getPoids());
        gentillesse.setRating(code.getGentillesse());
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
