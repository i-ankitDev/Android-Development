package com.example.workingwithdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        SharedPreferences SP = getSharedPreferences("MyPref",MODE_PRIVATE);
        String editVal = SP.getString("Name", "No value as of now");
        textView.setText(editVal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = editText.getText().toString();
                SharedPreferences SP = getSharedPreferences("MyPref",MODE_PRIVATE);
                SharedPreferences.Editor ED = SP.edit();
                ED.putString("Name",val);
                ED.apply();textView.setText(val);
            }
        });
    }
}