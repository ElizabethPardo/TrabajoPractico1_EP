package com.example.trabajopractico1_ep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private UsbConnected usbConnected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        usbConnected = new UsbConnected();
        registerReceiver(usbConnected, new IntentFilter("android.hardware.usb.action.USB_STATE"));

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(usbConnected);
    }
}