package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] arr = {"List1","List2","List3","List4","List5","List6","List7","List8","List9","List10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        //Using ArrayAdapter
//        ArrayAdapter <String> ad=new ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,arr);
//        listView.setAdapter(ad);
        //Using Custom Adaptor
        MyActivity ad = new MyActivity(this,R.layout.my_layout,arr);
        listView.setAdapter(ad);
    }
}