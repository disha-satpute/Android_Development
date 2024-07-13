package com.example.aeroplanemode;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity
{
    aeroplane a1 = new aeroplane();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(a1, filter);
    }
    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(a1);
    }
}
