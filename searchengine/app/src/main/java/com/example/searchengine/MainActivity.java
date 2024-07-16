package com.example.searchengine;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] suggestions = {"Apple", "actors", "books", "butterfly", "cat", "camel","fruits", "flowers","images","movies","songs"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.search_auto_complete_text_view);
        Button searchButton = findViewById(R.id.search_button);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, suggestions);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

        searchButton.setOnClickListener(v -> {
            String query = autoCompleteTextView.getText().toString().trim();
            // Perform search operation here using the query
        });
    }
}