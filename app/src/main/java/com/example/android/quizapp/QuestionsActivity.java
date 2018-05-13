package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class QuestionsActivity extends AppCompatActivity {
    public int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        // Q1
        final CheckBox q1a1 = findViewById(R.id.q1a1);
        final CheckBox q1a2 = findViewById(R.id.q1a2);
        final CheckBox q1a3 = findViewById(R.id.q1a3);
        final CheckBox q1a4 = findViewById(R.id.q1a4);

        // Q2
        final CheckBox q2a1 = findViewById(R.id.q2a1);
        final CheckBox q2a2 = findViewById(R.id.q2a2);
        final CheckBox q2a3 = findViewById(R.id.q2a3);
        final CheckBox q2a4 = findViewById(R.id.q2a4);

        // Q3
        final RadioButton q3a1 = findViewById(R.id.q3a1);
        final RadioButton q3a2 = findViewById(R.id.q3a2);

        // Q4
        final RadioButton q4a1 = findViewById(R.id.q4a1);
        final RadioButton q4a2 = findViewById(R.id.q4a2);

        // Q5
        final EditText q5 = findViewById(R.id.q5a);
        final String q5a = q5.getText().toString().toUpperCase();


        // Q6
        final EditText q6 = findViewById(R.id.q6a);
        final String q6a = q6.getText().toString().toUpperCase();

        // Q7
        final RadioButton q7 = findViewById(R.id.q7a1);

        // Q8
        final RadioButton q8 = findViewById(R.id.q8a4);

        Button button = findViewById(R.id.submit_quiz);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                //Q1
                if ((q1a1.isChecked()) && (q1a2.isChecked()) && (!q1a3.isChecked()) && (!q1a4.isChecked()) ) {
                    score++;
                }
                //Q2
                if ((!q2a1.isChecked()) && (!q2a2.isChecked()) && (!q2a3.isChecked()) && (q2a4.isChecked()) ) {
                    score += 2;
                }
                //Q3
                if (q3a2.isChecked() && (!q3a1.isChecked())) {
                    score++;
                }
                //Q4
                if (q4a1.isChecked() && (!q4a2.isChecked())) {
                    score++;
                }
                //Q5
                String ans5 = "ANDROID PACKAGE KIT";
                if (q5a.equals(ans5)) {
                    score++;
                }
                //Q6
                String ans6 = "JAVA NATIVE INTERFACE";
                if (q6a.equals(ans6)) {
                    score++;
                }
                //Q7
                if (q7.isChecked()) {
                    score++;
                }
                //Q8
                if (q8.isChecked()) {
                    score += 2;
                }

                // Create a new intent to open the ResultActivity
                Intent submitQuiz = new Intent(QuestionsActivity.this, ResultActivity.class);
                submitQuiz.putExtra("Score", score);
                // Start the new activity
                startActivity(submitQuiz);
            }
        });
    }
}
