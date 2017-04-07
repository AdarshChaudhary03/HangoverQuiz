package com.example.dharamvirsingh.hangover;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import javax.microedition.khronos.opengles.GL;

public class CustomAdapter extends ArrayAdapter<String>{
    public static ImageView star1,star2,star3;

    Integer[] imageid = {
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,
            R.drawable.levelstars,


    };

    Integer[] imageid2 = {
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
            R.drawable.levelstar2,
    };


    CustomAdapter(Context context, String[] level) {
        super(context, R.layout.custom_row,level);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView  = inflater.inflate(R.layout.custom_row, parent,false);

        String singleLevelItem = getItem(position);
        TextView listText = (TextView)customView.findViewById(R.id.listText);
        star1 = (ImageView)customView.findViewById(R.id.star1);
        star2 = (ImageView)customView.findViewById(R.id.star2);
        star3 = (ImageView)customView.findViewById(R.id.star3);

        listText.setText(singleLevelItem);
        star1.setImageResource(imageid[position]);
        star2.setImageResource(imageid[position]);
        star3.setImageResource(imageid[position]);

        int getstar = Global.star;
        //star = BLevel_1.getActivityInstance().getData();
       if(getstar==1)
        {
            star1.setImageResource(imageid[position]);
            star2.setImageResource(imageid[position]);
            star3.setImageResource(imageid[position]);
        }
        else
        {



        }
        return customView;

    }


}
