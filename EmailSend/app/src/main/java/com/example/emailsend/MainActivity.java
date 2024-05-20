package com.example.emailsend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText gmailAddress;
    EditText subject;
    EditText message;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gmailAddress = findViewById(R.id.gmailAddress);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.message);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gmailID = gmailAddress.getText().toString();
                String Subject = subject.getText().toString();
                String Message = message.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, gmailID);
                intent.putExtra(Intent.EXTRA_SUBJECT, Subject);
                intent.putExtra(Intent.EXTRA_STREAM, Message);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}