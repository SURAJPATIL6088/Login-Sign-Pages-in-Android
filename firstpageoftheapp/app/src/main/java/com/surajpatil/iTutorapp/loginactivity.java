package com.surajpatil.iTutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginactivity extends AppCompatActivity implements View.OnClickListener {

    private NavigationbarActivity navigationbarActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

    }

    public void BackArr(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void NavBar(View view)
    {
        Intent intent = new Intent(this,NavigationbarActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

    }
}