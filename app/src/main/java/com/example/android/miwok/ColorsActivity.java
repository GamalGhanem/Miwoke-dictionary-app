package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    /*
    contains the colors words in the dictionary
     */
    ArrayList<Word> colorsWords = new ArrayList<Word>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        colorsWords.add(new Word("red", "weṭeṭṭi"));
        colorsWords.add(new Word("green", "chokokki"));
        colorsWords.add(new Word("brown", "ṭakaakki"));
        colorsWords.add(new Word("gray", "ṭopoppi"));
        colorsWords.add(new Word("black", "kululli"));
        colorsWords.add(new Word("white", "kelelli"));
        colorsWords.add(new Word("dusty yellow", "ṭopiisә"));
        colorsWords.add(new Word("mustard yellow", "chiwiiṭә"));

        WordAdapter itemsAdapter = new WordAdapter(this, colorsWords);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
