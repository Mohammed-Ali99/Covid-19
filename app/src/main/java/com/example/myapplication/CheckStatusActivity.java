package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CheckStatusActivity extends AppCompatActivity {

    TextView question;
    Button trueButton , falseButton;
    LinearLayout linearLayout;

    int score = 0 , questionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkstatus);

        question = findViewById(R.id.question);
        trueButton = findViewById(R.id.trueButton);
        falseButton = findViewById(R.id.falseButton);
        linearLayout = findViewById(R.id.linearLayout);

        upadteQuestion();

    }

    public void yesButton(View v){
        ++score;
        if(questionNumber == Questions.qusetions.length) {
            Intent i = new Intent(getApplicationContext() , ResultActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("finalScore", score);
            i.putExtras(bundle);
            finish();
            startActivity(i);
        } else {
            upadteQuestion();
        }
    }

    public void noButton(View v){
        if(questionNumber == Questions.qusetions.length) {
            Intent i = new Intent(getApplicationContext() , ResultActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("finalScore", score);
            i.putExtras(bundle);
            finish();
            startActivity(i);
        } else {
            upadteQuestion();
        }
    }


    private void upadteQuestion(){
        linearLayout.setBackground(getDrawable(Questions.images[questionNumber]));
        question.setText(Questions.qusetions[questionNumber]);
        questionNumber++;
    }

}