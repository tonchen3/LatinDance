package com.example.android.latindance;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getChacha(View view) {
        Intent chaChaIntent = new Intent(MainActivity.this, ChachachaActivity.class);
        MainActivity.this.startActivity(chaChaIntent);

    }
    public void getRumba(View view) {
        Intent rumbaIntent = new Intent(MainActivity.this, RumbaActivity.class);
        MainActivity.this.startActivity(rumbaIntent);
    }
    public void getSamba(View view) {
        Intent sambaIntent = new Intent(MainActivity.this, SambaActivity.class);
        MainActivity.this.startActivity(sambaIntent);
    }
    public void getPaso(View view) {
        Intent pasoIntent = new Intent(MainActivity.this, PasoActivity.class);
        MainActivity.this.startActivity(pasoIntent);
    }
    public void getJive(View view) {
        Intent jiveIntent = new Intent(MainActivity.this, JiveActivity.class);
        MainActivity.this.startActivity(jiveIntent);
    }

}