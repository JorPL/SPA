package com.example.joplagne.spa;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Doggo> listeDeDoggos = new ArrayList<Doggo>();
        final Random rand = new Random();
        for(int i=0; i<200; i++){
            listeDeDoggos.add(new Doggo("MoonMoon", "Berger allemand", new java.text.DecimalFormat("0.##").format(rand.nextDouble() * 30) + " kg", rand.nextInt(4), 0));
        }

        mRecyclerView = (RecyclerView) findViewById(R.id.liste_doggo);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView

        // use a linear layout manager
        mLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MonAdapteur(listeDeDoggos,getApplicationContext());
        mRecyclerView.setAdapter(mAdapter);

        FloatingActionButton bouton_ajouter = (FloatingActionButton) findViewById(R.id.bouton_ajouter);
        bouton_ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listeDeDoggos.add(new Doggo("Nouveau", "chiot", String.valueOf(rand.nextInt(20)) + " kg", rand.nextInt(4), 0));
                mAdapter.notifyDataSetChanged();
            }
        });


    }
}
