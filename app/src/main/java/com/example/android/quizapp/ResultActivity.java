package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {
    public int score  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        score = 0;
        Intent submitQuiz = getIntent();
        score = submitQuiz.getIntExtra("Score", 0);
        Toast scoreToast = Toast.makeText(this, "Your score is: " + score, Toast.LENGTH_LONG);
        scoreToast.show();
        TextView showResult = findViewById(R.id.resultScore);
        String value = "" + score;
        showResult.setText(value);
    }
}
