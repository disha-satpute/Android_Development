package com.example.a5checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox1 = findViewById(R.id.checkbox1);
        checkbox2 = findViewById(R.id.checkbox2);
        checkbox3 = findViewById(R.id.checkbox3);
        checkbox4 = findViewById(R.id.checkbox4);
        checkbox5 = findViewById(R.id.checkbox5);
        submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSelectedCheckboxes();
            }
        });
    }

    private void showSelectedCheckboxes() {
        StringBuilder message = new StringBuilder("Selected Checkboxes:\n");

        if (checkbox1.isChecked()) {
            message.append("Checkbox 1\n");
        }
        if (checkbox2.isChecked()) {
            message.append("Checkbox 2\n");
        }
        if (checkbox3.isChecked()) {
            message.append("Checkbox 3\n");
        }
        if (checkbox4.isChecked()) {
            message.append("Checkbox 4\n");
        }
        if (checkbox5.isChecked()) {
            message.append("Checkbox 5\n");
        }

        Toast.makeText(this, message.toString(), Toast.LENGTH_LONG).show();
    }
}