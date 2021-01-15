package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import com.example.yfaceapi.GPIOManager;

public class MainActivity extends AppCompatActivity {

    private GPIOManager gpioManager = GPIOManager.getInstance(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openButton = findViewById(R.id.openButton);
        Button closeButton = findViewById(R.id.closeButton);

        openButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                gpioManager.pullUpGreenLight();
            }
        });

        closeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                gpioManager.pullDownGreenLight();
            }
        });

    }
}