package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String question[] = {"1. Java was Invented in year 1995?", "2. Java has abstract classes?", "3. Java has multiple inheritance?" , "4. Can we create strings without using String keyword?" , "5. Can we create MultiScreen app without using Intent?" };
    private boolean answers[]= {true,true,false,false,false};
    private int marks=0;
    Button yes;
    Button no;
    TextView questions;
    private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        questions = findViewById(R.id.questions);
        questions.setText(question[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= question.length-1){
                    if (answers[index]){
                        marks++;
                    }
                    index++;
                    if (index <= question.length-1){
                        questions.setText(question[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Marks is "+marks+"/"+question.length, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= question.length -1){
                    if (!answers[index]){
                        marks++;
                    }
                    index++;
                    if (index <= question.length-1 ){
                        questions.setText(question[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Marks is "+marks+"/"+question.length, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}