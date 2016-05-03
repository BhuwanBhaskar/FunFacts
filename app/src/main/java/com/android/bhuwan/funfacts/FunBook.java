package com.android.bhuwan.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by bhuwan on 9/27/15.
 */
public class FunBook {
    private String[] mFacts = {"Tigers can run faster than lions !!", "i am hero", "wtf !!!"};
    private String[] mColor = {"#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
             };

    public String getFacts()
    {
        Random rid = new Random();
        int id = rid.nextInt(mFacts.length);
        
        return mFacts[id];
    }

    public int getColor()
    {
        Random rid = new Random();
        int id = rid.nextInt(mColor.length);
        String color = mColor[id];
        int col = Color.parseColor(color);

        return col;
    }
}

