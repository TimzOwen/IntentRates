package com.owen.intentrates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //step 1. define the submit rates method
    public void submitRates(View view)
    {
        //step 2. get the rates and toast a message
        RatingBar mRating = findViewById(R.id.ratingBar);
        float ratingResults = mRating.getRating();
        Toast.makeText(getApplicationContext(),ratingResults + "stars" ,Toast.LENGTH_SHORT).show();
    }
}