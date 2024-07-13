package com.example.sensor;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private SensorManager mgr;
    private TextView txtList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mgr = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        txtList = (TextView) findViewById(R.id.sensorslist);
        List<Sensor> sensorlist = mgr.getSensorList(Sensor.TYPE_ALL);
        StringBuilder strBuilder = new StringBuilder();
        for (Sensor i : sensorlist)
        {
            strBuilder.append(i.getName()+"\n");
        }
        txtList.setVisibility(View.VISIBLE);
        txtList.setText(strBuilder);
    }
}