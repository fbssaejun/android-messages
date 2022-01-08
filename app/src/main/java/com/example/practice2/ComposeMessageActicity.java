package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ComposeMessageActicity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_message_acticity);
        Intent i = getIntent();
        String name = i.getStringExtra("NAME");
        if(name == null) {
            ((TextView)findViewById(R.id.textView)).setText("Composing Message...");
        }
        ((TextView)findViewById(R.id.textView)).setText(name);
    }
}