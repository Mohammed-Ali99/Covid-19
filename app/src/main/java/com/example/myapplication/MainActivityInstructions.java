package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivityInstructions extends AppCompatActivity {

    ImageView imageView;
    TextView instruction;

    static int instructionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_instructions);

        imageView = findViewById(R.id.instruction_img);
        instruction = findViewById(R.id.instruction);



    }

    public void nextButton(View v){
        updateNextInstruction();
        if(instructionNumber == Questions.instruction.length){
            instructionNumber = 0;
        }
    }

    public void previousButton(View v){
        updatePreviousInstruction();
    }

    private void updateNextInstruction(){
        imageView.setImageResource(Questions.imageInstruction[instructionNumber]);
        instruction.setText(Questions.instruction[instructionNumber]);
        instructionNumber++;
    }

    private void updatePreviousInstruction(){
        if(instructionNumber == 0) {
            instructionNumber = 4;
        } else {
            --instructionNumber;
        }
        imageView.setImageResource(Questions.imageInstruction[instructionNumber]);
        instruction.setText(Questions.instruction[instructionNumber]);
    }

}