package com.example.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.Set;
public class MainActivity extends AppCompatActivity {
    private BluetoothAdapter bluetoothAdapter;
    ListView listViewDevices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        Button btnTurnOn = findViewById(R.id.btnTurnOn);
        Button btnTurnOff = findViewById(R.id.btnTurnOff);
        Button listdevice = findViewById(R.id.buttonList);
        Button visible = findViewById(R.id.visible);
        listViewDevices=findViewById(R.id.listViewDevices);
        btnTurnOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turnOnBluetooth();
            }
        });
        btnTurnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turnOffBluetooth();
            }
        });
        listdevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPairedDevices();
            }
        });
        visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visiblebluetooth();
            }
        });
    }
    private void turnOnBluetooth() {
        if (bluetoothAdapter != null && !bluetoothAdapter.isEnabled()) {
            Intent enableBluetoothIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivity(enableBluetoothIntent);
            Toast.makeText(this, "bluetooth is on successfully", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "bluetooth is already on ", Toast.LENGTH_SHORT).show();
        }
    }
    private void turnOffBluetooth() {
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            bluetoothAdapter.disable();
            Toast.makeText(this, "bluetooth is off successfully", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "bluetooth is already off ", Toast.LENGTH_SHORT).show();
        }
    }
    private void showPairedDevices() {
        Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
        if (pairedDevices.size() > 0) {
            String[] deviceNames = new String[pairedDevices.size()];
            int i = 0;
            for (BluetoothDevice device : pairedDevices) {
                deviceNames[i] = device.getName() + "\n" + device.getAddress();
                i++;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                    deviceNames);
            listViewDevices.setAdapter(arrayAdapter);
        }
    }
    public void visiblebluetooth()
    {
        Intent getVisible = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivity(getVisible);
        Toast.makeText(this, "bluetooth is visible successfully", Toast.LENGTH_SHORT).show();
    }
}