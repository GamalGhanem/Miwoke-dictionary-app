package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gamal Ghanem on 7/8/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    private int activityColorID;
    public WordAdapter(Activity context, ArrayList<Word> list, int color) {
        super(context, 0, list);
        this.activityColorID = color;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItem = convertView;
        if(listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Word currentWord = getItem(position);


        ImageView img = (ImageView)listViewItem.findViewById(R.id.img);
        if (!currentWord.hasImage())
            img.setVisibility(View.GONE);
        else
            img.setImageResource(currentWord.getImageSource());

        TextView text1 = (TextView)listViewItem.findViewById(R.id.defaultTextView);
        text1.setText(currentWord.getDefaultTranslation());

        TextView text2 = (TextView)listViewItem.findViewById(R.id.miwokTextView);
        text2.setText(currentWord.getMiwokTranslation());

        View wordText = listViewItem.findViewById(R.id.word_text);
        int color = ContextCompat.getColor(getContext(), activityColorID);
        wordText.setBackgroundColor(color);


        return listViewItem;

    }


}
