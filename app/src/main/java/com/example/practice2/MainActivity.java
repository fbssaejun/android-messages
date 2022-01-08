package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void composeMessage(View v) {
        Intent i = new Intent(this, ComposeMessageActicity.class);
        String name = ((Button)v).getText().toString();
        i.putExtra("NAME", name);
        startActivity(i);
    }
}