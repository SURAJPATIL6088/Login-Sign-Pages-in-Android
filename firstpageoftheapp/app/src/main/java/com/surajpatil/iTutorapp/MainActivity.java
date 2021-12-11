package com.surajpatil.iTutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.surajpatil.iTutorapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Login(View view)
    {
        Intent intent = new Intent(this,loginactivity.class);
        startActivity(intent);
    }

    public void Sign(View view)
    {
        Intent intent = new Intent(this,signactivity.class);
        startActivity(intent);
    }
}