package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    /*
    contains the numbers words in the dictionary
     */
    ArrayList<Word> numbers = new ArrayList<Word>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        numbers.add(new Word("one", "lutti"));
        numbers.add(new Word("two", "otiiko"));
        numbers.add(new Word("three", "tolookosu"));
        numbers.add(new Word("four", "oyissa"));
        numbers.add(new Word("five", "massokka"));
        numbers.add(new Word("six", "temmokka"));
        numbers.add(new Word("seven", "kenekaku"));
        numbers.add(new Word("eight", "kawinta"));
        numbers.add(new Word("nine", "wo'e"));
        numbers.add(new Word("ten", "na'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this,numbers);
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
