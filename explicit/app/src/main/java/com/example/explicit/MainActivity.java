package com.example.explicit;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button openActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openActivityButton = findViewById(R.id.open_activity_button);
        openActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    private void openActivity() {
        // Create an explicit intent to open the SecondActivity class
        Intent intent = new Intent(this, MainActivity2.class);

        // Start the activity with the intent
        startActivity(intent);
    }
}
