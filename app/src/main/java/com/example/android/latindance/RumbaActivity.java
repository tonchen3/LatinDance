package com.example.android.latindance;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RumbaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumba);
    }
    public void join(View view) {
        Intent joinIntent = new Intent(RumbaActivity.this, JoinActivity.class);
        RumbaActivity.this.startActivity(joinIntent);
    }
}
