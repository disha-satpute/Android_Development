package com.example.aeroplanemode;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;
public class aeroplane extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (isAirplaneModeOn(context.getApplicationContext())) {
            Toast.makeText(context.getApplicationContext(), "AirPlane mode is on",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context.getApplicationContext(), "AirPlane mode is off",
                    Toast.LENGTH_LONG).show();
        }
    }
    private static boolean isAirplaneModeOn(Context context)
    {
        return Settings.System.getInt(context.getContentResolver(),
                Settings.Global.AIRPLANE_MODE_ON, 0)!=0;
    }
}