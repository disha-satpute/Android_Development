package com.example.radiogroup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = findViewById(R.id.radio_button1);
        radioButton2 = findViewById(R.id.radio_button2);
        radioButton3 = findViewById(R.id.radio_button3);
        radioButton4 = findViewById(R.id.radio_button4);
        submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displaySelectedOption();
            }
        });
    }

    private void displaySelectedOption() {
        String selectedOption = "";

        if (radioButton1.isChecked()) {
            selectedOption = "Option 1";
        } else if (radioButton2.isChecked()) {
            selectedOption = "Option 2";
        } else if (radioButton3.isChecked()) {
            selectedOption = "Option 3";
        } else if (radioButton4.isChecked()) {
            selectedOption = "Option 4";
        }

        if (!selectedOption.isEmpty()) {
            Toast.makeText(this, "Selected option: " + selectedOption, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show();
        }
    }
}