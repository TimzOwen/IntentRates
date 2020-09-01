package com.owen.intentrates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RatingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);
        //step 5 .Retreive the intent
        Intent summaryIntent = getIntent();
        float results = summaryIntent.getFloatExtra("rating",0);
        //get the Textview on activity 2 and set the text to the co-responding rating
        TextView tvRating = findViewById(R.id.tvRating);
        tvRating.setText(String.format("You rating on Activity 2 is: %s", results));

    }
}