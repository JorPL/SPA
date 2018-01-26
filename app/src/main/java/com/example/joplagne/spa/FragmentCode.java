package com.example.joplagne.spa;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by joplagne on 29/09/17.
 */

public class FragmentCode extends Fragment{

    private TextView type, date, informations, code;
    private ImageView img;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.presentation_code, container, false);
        img = view.findViewById(R.id.img);
        type = view.findViewById(R.id.type);
        date = view.findViewById(R.id.date);
        code = view.findViewById(R.id.code);
        informations = view.findViewById(R.id.infos);

        Code code = (Code) getActivity().getIntent().getExtras().get("code");

        if (code.getImage() != null)
            img.setImageBitmap(code.getImage());
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
