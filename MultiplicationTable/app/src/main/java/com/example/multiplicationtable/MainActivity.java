package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText n1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        n1 = findViewById(R.id.n1);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int j;
                int num = Integer.parseInt(n1.getText().toString());
                for (int i=0;i<=10;i++){
                    j = i+1;
                    textView.setText(num+"*"+j+"="+num*j);
                }
            }
        });
    }
}