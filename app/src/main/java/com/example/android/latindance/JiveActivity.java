package com.example.android.latindance;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jive);
    }
    public void join(View view) {
        Intent joinIntent = new Intent(JiveActivity.this, JoinActivity.class);
        JiveActivity.this.startActivity(joinIntent);
    }
}
