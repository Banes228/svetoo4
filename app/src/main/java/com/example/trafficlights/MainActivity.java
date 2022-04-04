package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setBackgroundDrawableResource(R.color.ser);
    }
    public void greenn(View view) {
        getWindow().setBackgroundDrawableResource(R.color.green);
    }
    public void redd(View view) {
        getWindow().setBackgroundDrawableResource(R.color.red);
    }
    public void yelloww(View view) {
        getWindow().setBackgroundDrawableResource(R.color.yellow);
    }
}