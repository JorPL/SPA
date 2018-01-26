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

    private TextView image, type, date, informations, code;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.presentation_code, container, false);
        image = view.findViewById(R.id.nom);
        type = view.findViewById(R.id.race);
        date = view.findViewById(R.id.genre);
        code = view.findViewById(R.id.poids);
        informations = view.findViewById(R.id.poids);

        Code code = (Code) getActivity().getIntent().getExtras().get("code");
        //        gentillesse.set(code.getImage());

        image.setText(code.getCode());
        type.setText(code.getType());
        date.setText(String.valueOf(code.getDate()));
        informations.setText(code.getCode());
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
