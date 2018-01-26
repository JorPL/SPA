package com.example.joplagne.spa;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by joplagne on 29/09/17.
 */

public class MonAdapteur extends RecyclerView.Adapter<MonAdapteur.ViewHolder> {

    private static ArrayList<Code> lesCodes;
    private static Context context;
    private int lastPosition = -1;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        ViewHolder vh = new ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Code code = lesCodes.get(position);

        holder.textCode.setText(code.getCode());
        holder.typeCode.setText(code.getType());
        holder.imageCode.setImageBitmap(code.getImage());

        holder.layout.setBackgroundResource(R.drawable.corners_arrounded);

        setAnimation(holder.itemView, position);
    }

    private void setAnimation(View viewToAnimate, int position) {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition) {
            ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            anim.setDuration(200);//to make duration random number between [0,501)
            viewToAnimate.startAnimation(anim);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return lesCodes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageCode;
        public TextView typeCode;
        public TextView textCode;
        public FrameLayout layout;

        public ViewHolder(View view) {
            super(view);

            imageCode = itemView.findViewById(R.id.imageCode);
            typeCode =  itemView.findViewById(R.id.typeCode);
            textCode = itemView.findViewById(R.id.textCode);

            layout = itemView.findViewById(R.id.layout_item);
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    // get position
                    int pos = getAdapterPosition();

                    // check if item still exists
                    if(pos != RecyclerView.NO_POSITION){
                        Code code = lesCodes.get(pos);
                        Intent intent = new Intent();
                        intent.setClass(context, DetailActivity.class);
                        intent.putExtra("dog", code);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }


    public MonAdapteur(ArrayList<Code> listeDeCodes, Context context){
        lesCodes = listeDeCodes;
        this.context = context;
    }

}
