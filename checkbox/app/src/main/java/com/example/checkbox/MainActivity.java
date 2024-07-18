package com.example.checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CheckBox checkbox1, checkbox2, checkbox3;
    Button submitButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox1 = findViewById(R.id.checkbox1);
        checkbox2 = findViewById(R.id.checkbox2);
        checkbox3 = findViewById(R.id.checkbox3);
        submitButton = findViewById(R.id.submit_button);
        resultText = findViewById(R.id.result_text);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evaluateCheckboxes();
            }
        });
    }

    private void evaluateCheckboxes() {
        List<String> selectedCheckboxes = new ArrayList<>();

        if (checkbox1.isChecked()) {
            selectedCheckboxes.add("Checkbox 1");
        }
        if (checkbox2.isChecked()) {
            selectedCheckboxes.add("Checkbox 2");
        }
        if (checkbox3.isChecked()) {
            selectedCheckboxes.add("Checkbox 3");
        }

        if (!selectedCheckboxes.isEmpty()) {
            StringBuilder result = new StringBuilder("You selected: ");
            for (String checkbox : selectedCheckboxes) {
                result.append(checkbox).append(", ");
            }
            result.delete(result.length() - 2, result.length());
            resultText.setText(result.toString());
        } else {
            resultText.setText("No checkboxes were selected.");
        }
    }
}