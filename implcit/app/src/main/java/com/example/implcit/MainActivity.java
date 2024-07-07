package com.example.implcit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button openWebsiteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openWebsiteButton = findViewById(R.id.open_website_button);
        openWebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite();
            }
        });
    }

    private void openWebsite() {
        // Specify the URL of the website to be opened
        String websiteUrl = "https://www.youtube.com";

        // Create an intent with ACTION_VIEW action and the URL
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));

        // Check if there's an activity available to handle the intent

            // Start the activity with the intent
            startActivity(intent);

    }
}
