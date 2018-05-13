package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    public int score  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        score = 0;
        Intent submitQuiz = getIntent();
        score = submitQuiz.getIntExtra("Score", 0);

        TextView showResult = findViewById(R.id.resultScore);
        String value = "" + score;
        showResult.setText(value);
    }
}
