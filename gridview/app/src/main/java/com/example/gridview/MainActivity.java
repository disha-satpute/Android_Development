package com.example.gridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of button labels
        List<String> buttonLabels = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            buttonLabels.add("Button " + i);
        }

        // Create an adapter for the GridView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, buttonLabels);

        // Get a reference to the GridView
        GridView gridView = findViewById(R.id.gridView);

        // Set the adapter for the GridView
        gridView.setAdapter(adapter);

        // Set item click listener for the GridView
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String buttonText = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, buttonText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}