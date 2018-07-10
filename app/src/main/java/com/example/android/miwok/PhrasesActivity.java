package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    /*
    contains the popular phrases in the dictionary
     */
    ArrayList<Word> phrases = new ArrayList<Word>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        phrases.add(new Word("Where are you going?", "minto wuksus"));
        phrases.add(new Word("What is your name?", "tinnә oyaase'nә"));
        phrases.add(new Word("My name is...", "oyaaset..."));
        phrases.add(new Word("How are you feeling?", "michәksәs?"));
        phrases.add(new Word("I’m feeling good.", "kuchi achit"));
        phrases.add(new Word("Are you coming?", "әәnәs'aa?"));
        phrases.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        phrases.add(new Word("I’m coming.", "әәnәm"));
        phrases.add(new Word("Let’s go.", "yoowutis"));
        phrases.add(new Word("Come here.", "әnni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this, phrases);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);



        /*
        LinearLayout numbersLayout = (LinearLayout)findViewById(R.id.activity_numbers);
        for (int i = 0; i <colorsWords.size(); i++) {
            TextView textView = new TextView(this);
            textView.setText(colorsWords.get(i));
            numbersLayout.addView(textView);
        }
        */
    }
}
