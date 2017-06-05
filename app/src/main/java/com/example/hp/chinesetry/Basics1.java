package com.example.hp.chinesetry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Basics1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics1);}

    public void gototips(View view) {
        Intent intenttip = new Intent(this, Tipsnotes.class);
        startActivity(intenttip);
    }
    public void gotolesson1(View view) {
        Intent intentls1 = new Intent(this, Blesson1.class);
        startActivity(intentls1);
    }
    public void gotolesson2 (View view) {
        Intent intentls2 = new Intent(this, Blesson2.class);
        startActivity(intentls2);
    }
}
