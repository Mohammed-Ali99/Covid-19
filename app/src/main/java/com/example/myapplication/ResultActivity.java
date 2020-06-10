package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = findViewById(R.id.result);
        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");
        if(score > 0) {
            result.setText(Questions.result[0]);
        } else {
            result.setText(Questions.result[1]);
        }
    }

    public void openInstruction(View v){
        Intent i = new Intent(getApplicationContext() , MainActivityInstructions.class);
        startActivity(i);
    }

    public void retryCheck(View v){
        Intent i = new Intent(getApplicationContext() , CheckStatusActivity.class);
        startActivity(i);
    }
}