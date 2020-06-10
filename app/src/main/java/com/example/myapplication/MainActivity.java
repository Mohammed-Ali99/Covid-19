package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openLink(View v){
        Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.who.int/emergencies/diseases/novel-coronavirus-2019"));
        startActivity(i);
    }

    public void openInstruction(View v){
        Intent i = new Intent(getApplicationContext() , MainActivityInstructions.class);
        startActivity(i);
    }

    public void checkStatus(View v){
        Intent i = new Intent(getApplicationContext() , CheckStatusActivity.class);
        startActivity(i);
    }
}