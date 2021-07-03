package com.example.wifi_togglebutton_app_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    Context context;
    WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}